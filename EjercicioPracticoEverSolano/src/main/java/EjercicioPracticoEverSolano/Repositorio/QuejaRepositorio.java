/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EjercicioPracticoEverSolano.Repositorio;

import EjercicioPracticoEverSolano.Dominio.Queja;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ever1
 */

@Repository
public interface QuejaRepositorio extends JpaRepository<Queja, Long> {
    
}
