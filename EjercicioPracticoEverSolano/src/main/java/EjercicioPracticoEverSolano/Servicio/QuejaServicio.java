/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EjercicioPracticoEverSolano.Servicio;

import EjercicioPracticoEverSolano.Dominio.Queja;
import EjercicioPracticoEverSolano.Repositorio.QuejaRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ever1
 */
public interface QuejaServicio {
    
    public List<Queja> getAll();
    public Optional<Queja> getById(Long id);
    public Queja save(Queja queja);
    public void delete(Long id);

    
}
