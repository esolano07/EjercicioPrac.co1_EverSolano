/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EjercicioPracticoEverSolano.Servicio;

import EjercicioPracticoEverSolano.Dominio.Categoria;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ever1
 */
public interface CategoriaServicio {
    
    public List<Categoria> getAll();
    
    public Optional<Categoria> getById(Long id);
    
    public Categoria save(Categoria categoria);
    
    public void delete(Long id);
}
