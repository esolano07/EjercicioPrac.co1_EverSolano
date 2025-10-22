
package EjercicioPracticoEverSolano.Controller;

import EjercicioPracticoEverSolano.Dominio.Queja;
import EjercicioPracticoEverSolano.Servicio.QuejaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ever1
 */

@org.springframework.stereotype.Controller
@RequestMapping("/contacto")
public class QuejaController {
    
    @Autowired
    private QuejaServicio quejaServicio;
    
    @GetMapping
    public String mostrarForm(Model model){
       model.addAttribute("queja", new Queja());
       return "contacto";
    }
    
    @PostMapping("/enviar")
    public String enviar(@ModelAttribute Queja queja, Model model){
        quejaServicio.save(queja);
        model.addAttribute("queja", new Queja());
        return "contacto";
    }
}
