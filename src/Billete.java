import java.util.Date;
import java.util.List;

public class Billete {
    Billete idBillete;
    Date fechaemision;
    Billete preciototal;
    Cliente cliente;
    Ciudad destino;
    Ciudad origen;
    Categoria categoria;
    List<Vuelo> vuelos;
    String nombre;

    public Billete()
    {

    }
}
