/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPracticoEverSolano.Controller;

import EjercicioPracticoEverSolano.Dominio.Libro;
import EjercicioPracticoEverSolano.Servicio.CategoriaServicio;
import EjercicioPracticoEverSolano.Servicio.LibroServicio;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author ever1
 */

@org.springframework.stereotype.Controller
@GetMapping("/libros")
public class LibroController {
    
    @Autowired
    private LibroServicio libroServicio;
    
    @Autowired
    private CategoriaServicio categoriaServicio;
    
    @GetMapping
    public String listar(Model model){
        model.addAttribute("libros", libroServicio.getAll());
        return "libros/lista";
    }
    
    @GetMapping("/nuevo")
    public String nuevo(Model model){
        model.addAttribute("libro", new Libro());
        model.addAttribute("categorias", categoriaServicio.getAll());
        return "libros/formulario";
    }
    
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model){
        Optional<Libro> libro = libroServicio.getById(id);
        if (libro == null) {
            return "redirect:/libros";
        }
        
        model.addAttribute("libro", libro);
        model.addAttribute("categorias", categoriaServicio.getAll());
        return "libros/formulario";
    }
    
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Libro libro){
        libroServicio.save(libro);
        return "redirect:/libros";
    }
    
    @GetMapping("eliminar/{id}")
    public String eliminar(@PathVariable Long Id){
        libroServicio.delete(Id);
        return "redirect:/libros";
    }
    
    
    
    
    
    
}
