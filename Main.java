import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Avion avion = new Avion("AV-1");

        Piloto piloto = new Piloto("Mike");

        Itinerario vuelo = new Itinerario("Chetumal", "Cancun", LocalTime.of(6, 0), LocalTime.of(7, 0));

        System.out.println("Vuelo No. X:");
        System.out.println("No. del avion: "+avion.matricula);
        System.out.println("Su piloto sera el Sr. "+piloto.nombrePiloto);
        System.out.println("Ciudad de Origen"+vuelo.ciudadOri+" Con Destino a la Ciudad de: "+vuelo.ciudadDes);
        System.out.println("Hora de Partida: "+vuelo.horaPartida+" Hora de Llegada: "+vuelo.horaLlegada);
    }
}