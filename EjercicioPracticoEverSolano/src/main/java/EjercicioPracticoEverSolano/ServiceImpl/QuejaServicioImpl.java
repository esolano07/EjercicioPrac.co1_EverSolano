/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPracticoEverSolano.ServiceImpl;

import EjercicioPracticoEverSolano.Dominio.Queja;
import EjercicioPracticoEverSolano.Repositorio.QuejaRepositorio;
import EjercicioPracticoEverSolano.Servicio.QuejaServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ever1
 */
@Service
public class QuejaServicioImpl implements QuejaServicio{
    
    @Autowired
    private QuejaRepositorio quejaRepositorio;
    
    public List<Queja> getAll(){
        return quejaRepositorio.findAll();
    }
    
    public Optional<Queja> getById(Long id){
        return quejaRepositorio.findById(id);
    }
    
    public Queja save(Queja queja){
        return quejaRepositorio.save(queja);
    }
    
    public void delete(Long id){
        quejaRepositorio.deleteById(id);
    }

}
