
package com.EjercicioPractico1.service;

import com.EjercicioPractico1.domain.Libro;
import java.util.List;
/**
 *
 * @author Jonathan
 */
public interface LibroService {

    public List<Libro> getLibros(boolean activos);
}
