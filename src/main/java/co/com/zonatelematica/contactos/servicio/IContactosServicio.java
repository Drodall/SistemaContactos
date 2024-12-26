package co.com.zonatelematica.contactos.servicio;

import co.com.zonatelematica.contactos.modelo.Contacto;
import java.util.List;

public interface IContactosServicio {
    public List<Contacto> listarContactos();

    public Contacto buscarContatoPorId(Integer idContacto);

    public void guardarContacto(Contacto contacto);

    public void eliminarContacto(Contacto contacto);

}
