
package com.EjercicioPractico1.controller;

import com.EjercicioPractico1.service.LibroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *
 * @author Jonathan
 */
@Controller
@Slf4j//es una parte de loombok, es oara que la vista entienda lo que se va a procesar, es un protocolo 
@RequestMapping("/libro")//Este es otro API
public class LibroController {
    
    @Autowired
    private LibroService libroService;

    @GetMapping("/listado") //este es el API
    public String inicio(Model model) {
        var libros = libroService.getLibros(false);//ese getCategorias se sacan los datos de la variable que se llamaba
        model.addAttribute("libros", libros);//el primero es el nombre que se le esta dando, es segundo es la variable 
        model.addAttribute("totalLibros", libros.size());//.size le dice el tamaño que trae esa lista
        return "/libro/listado";
    }
}//final de la clase
