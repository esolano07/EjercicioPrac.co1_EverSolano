/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPracticoEverSolano.ServiceImpl;

import EjercicioPracticoEverSolano.Dominio.Categoria;
import EjercicioPracticoEverSolano.Repositorio.CategoriaRepositorio;
import EjercicioPracticoEverSolano.Servicio.CategoriaServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ever1
 */
@Service
public class CategoriaServicioImpl implements CategoriaServicio{
    
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;
    
    @Override
    public List<Categoria> getAll(){
        return categoriaRepositorio.findAll();
    }
    
    @Override
    public Optional<Categoria> getById(Long id){
        return categoriaRepositorio.findById(id);
    }
    
    @Override
    public Categoria save(Categoria categoria){
        return categoriaRepositorio.save(categoria);
    }
    
    @Override
    public void delete(Long id){
        categoriaRepositorio.deleteById(id);
    }
    
}
