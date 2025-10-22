
package EjercicioPracticoEverSolano.Controller;

import EjercicioPracticoEverSolano.Servicio.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

/**
 *
 * @author ever1
 */

@org.springframework.stereotype.Controller
public class Controller {
    
    @Autowired
    private LibroServicio libroServicio;
    
    public String inicio(Model model){
        model.addAttribute("Libros", libroServicio.getAll());
        return "index";
    }
    
}
