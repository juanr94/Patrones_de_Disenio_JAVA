package facade.myFacade;

import facade.api.AvionAPI;
import facade.api.HotelAPI;

public class CheckFacade {
    private AvionAPI avionAPI;
    private HotelAPI hotelAPI;

    public CheckFacade() {
        this.avionAPI = new AvionAPI();
        this.hotelAPI = new HotelAPI();
    }

    public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
        this.avionAPI.buscarHotel(fechaIda, fechaVuelta, origen, destino);
        this.hotelAPI.buscarHotel(fechaIda, fechaVuelta, origen, destino);
    }

}
