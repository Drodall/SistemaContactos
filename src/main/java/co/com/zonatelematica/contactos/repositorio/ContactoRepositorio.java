package co.com.zonatelematica.contactos.repositorio;

import co.com.zonatelematica.contactos.modelo.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepositorio extends JpaRepository<Contacto , Integer> {
}
