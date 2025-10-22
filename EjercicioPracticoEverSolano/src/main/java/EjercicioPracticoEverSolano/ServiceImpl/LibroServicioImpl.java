/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPracticoEverSolano.ServiceImpl;

import EjercicioPracticoEverSolano.Dominio.Libro;
import EjercicioPracticoEverSolano.Repositorio.LibroRepositorio;
import EjercicioPracticoEverSolano.Servicio.LibroServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ever1
 */
@Service
public class LibroServicioImpl implements LibroServicio{
    
    @Autowired
    private LibroRepositorio libroRepositorio;
    
    public List<Libro> getAll(){
        return libroRepositorio.findAll();
    }
    
    public Optional<Libro> getById(Long id){
        return libroRepositorio.findById(id);
    }
    
    public Libro save(Libro libro){
        return libroRepositorio.save(libro);
    }
    
    public void delete(Long id){
        libroRepositorio.deleteById(id);
    }

    
}


    
