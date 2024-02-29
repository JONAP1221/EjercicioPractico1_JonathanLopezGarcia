
package com.EjercicioPractico1.service.impl;

import com.EjercicioPractico1.dao.LibroDao;
import com.EjercicioPractico1.domain.Libro;
import com.EjercicioPractico1.service.LibroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Jonathan
 */

@Service
public class LibroServiceImpl implements LibroService{
    @Autowired
    private LibroDao libroDao;

    @Override
    @Transactional(readOnly=true)//dimplemente se lee lo que hay en la base de datos
    public List<Libro> getLibros(boolean activos) {
        var lista=libroDao.findAll();//obtenemos todos los objetos de la categoria de la base de datos
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
}

