import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main {

    public static void main(String[] args) {
        Cliente Cliente=new Cliente();
        Cliente.idCliente=new Cliente();
        Cliente.nombre= new String();
        Cliente.primerApellido= new String();
        Cliente.segundoApellido= new String();

        Ciudad Ciudad=new Ciudad();
        Ciudad.idCiudad = new Ciudad();
        Ciudad.nombre = new String();

        Categoria Categoria=new Categoria();
        Categoria.idCategoria = new Categoria();
        Categoria.nombre= new String();

        Aeropuerto Aeropuerto=new Aeropuerto();
        Aeropuerto.codigoAeropuerto= new String();
        Aeropuerto.nombre= new String();
        Aeropuerto.ciudad= new Ciudad();

        Plaza Plaza=new Plaza();
        Plaza.idPasaje=new Plaza();
        Plaza.vuelo= new Vuelo();
        Plaza.categoria= new Categoria();
        Plaza.numeroplazas=new Plaza();
        Plaza.tarifa=new Plaza();

        Billete Billete=new Billete();
        Billete.idBillete=new Billete();
        Billete.fechaemision= new Date();
        Billete.preciototal=new Billete();
        Billete.cliente= new Cliente();
        Billete.origen=new Ciudad();
        Billete.destino=new Ciudad();
        Billete.categoria=new Categoria();
        List<Vuelo> vuelos=new ArrayList<>();

        Vuelo Vuelo=new Vuelo();
        Vuelo.codigoVuelo=new String();
        Vuelo.salida=new Date();
        List<Billete> billetes=new ArrayList<>();
        Vuelo.origen=new Aeropuerto();
        Vuelo.destino=new Aeropuerto();

    }
}
