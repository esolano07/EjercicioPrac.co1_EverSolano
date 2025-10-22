/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EjercicioPracticoEverSolano.Servicio;

import EjercicioPracticoEverSolano.Dominio.Libro;
import EjercicioPracticoEverSolano.Repositorio.LibroRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ever1
 */
public interface LibroServicio {
   
    public List<Libro> getAll();
    
    public Optional<Libro> getById(Long id);
    
    public Libro save(Libro libro);
    
    public void delete(Long id);
}


