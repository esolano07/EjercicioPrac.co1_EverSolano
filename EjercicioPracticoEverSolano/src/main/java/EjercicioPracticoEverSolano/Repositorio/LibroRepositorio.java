package EjercicioPracticoEverSolano.Repositorio;



import EjercicioPracticoEverSolano.Dominio.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ever1
 */

@Repository
public interface LibroRepositorio extends JpaRepository<Libro, Long> {
   
}
