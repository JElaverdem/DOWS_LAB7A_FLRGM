package edu.eci.dosw.oficioya.repository;

import edu.eci.dosw.oficioya.entity.User;
import edu.eci.dosw.oficioya.entity.Worker;
import edu.eci.dosw.oficioya.model.AvailabilityModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
class UserRepositoryTest {
    @Autowired 
    private UserRepository userRepository;

    @Autowired 
    private WorkerRepository workerRepository;

    @Test 
    @DisplayName("Salva usuario sin composicion")
    void shouldSaveNormalUser() {
        User usTest = new User();
        usTest.setNombre("Alejandro");
        usTest.setCorreo("ale@gmail.com");
        usTest.setTelefono("3003003344");
        usTest.setCalificacion(4.5);
        usTest.setContrasena("123");
        
        User supuesto= userRepository.save(usTest);

        assertTrue(supuesto != null);
        assertEquals(supuesto.getNombre(),"Alejandro");
    }

    @Test 
    @DisplayName("Consultar usuario sin composicion")
    void shouldConsultNormalUser() {
        User usTest = new User();
        usTest.setNombre("Alejandro");
        usTest.setCorreo("ale@gmail.com");
        usTest.setTelefono("3003003344");
        usTest.setCalificacion(4.5);
        usTest.setContrasena("123");
        userRepository.save(usTest);

        Optional<User> supuesto= userRepository.findByCorreo("ale@gmail.com");
        assertTrue(supuesto.isPresent());
        assertEquals(supuesto.orElse(null).getCorreo(),"ale@gmail.com");
        assertEquals(supuesto.orElse(null).getNombre(),"Alejandro");
    }

    @Test
    @DisplayName("Se puede agregar un worker y se guarda")
    void shouldSaveWorkerState(){
        User usTest = new User();
        usTest.setNombre("Alejandro");
        usTest.setCorreo("ale@gmail.com");
        usTest.setTelefono("3003003344");
        usTest.setCalificacion(4.5);
        usTest.setContrasena("123");
        Worker wTest = new Worker();
        wTest.setOficioPrincipal("mecanico");
        wTest.setDisponibilidad(AvailabilityModel.ACTIVE);
        wTest.setTarifa(Long.valueOf(12345));
        wTest.setTrabajosCompletados(2);
        usTest.setWorker(wTest);

        workerRepository.save(wTest);
        userRepository.save(usTest);

        Optional<User> supuesto= userRepository.findByCorreo("ale@gmail.com");

        assertTrue(supuesto.isPresent());
        assertEquals(supuesto.orElse(null).getCorreo(),"ale@gmail.com");
        assertEquals(supuesto.orElse(null).getWorker().getOficioPrincipal(),"mecanico");
    }

    @Test 
    @DisplayName("Debe actualizar al usuario")
    void shouldUpdateUser(){
        User usTest = new User();
        usTest.setNombre("Alejandro");
        usTest.setCorreo("ale@gmail.com");
        usTest.setTelefono("3003003344");
        usTest.setCalificacion(4.5);
        usTest.setContrasena("123");
        

        User supuesto= userRepository.save(usTest);
        Optional<User> nuevo = userRepository.findById(supuesto.getId());
        assertTrue(nuevo.isPresent());

        User nuevoUser = nuevo.orElse(null);

        nuevoUser.setCalificacion(4.9);

        userRepository.save(nuevoUser);

        assertEquals(userRepository.findByCorreo("ale@gmail.com").orElse(null).getCalificacion(), 4.9);
    }
}
