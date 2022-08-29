package facade.api;

public class HotelAPI {
    public void buscarHotel (String fechaIda, String fechaVuelta,String origen, String destino) {
        System.out.println("══════════════════════════════════════════════════════════════════");
        System.out.println("Vuelos encontrados para el destino "+ origen + " desde " + destino);
        System.out.println("Fecha Ida " + fechaIda + " Fecha Vuelta " + fechaVuelta);
        System.out.println("══════════════════════════════════════════════════════════════════");
    }
}
