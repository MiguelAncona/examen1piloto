import java.time.LocalTime;
public class Itinerario {
    public String ciudadOri;
    public String ciudadDes;
    public LocalTime horaPartida;
    public LocalTime horaLlegada;
    public Itinerario(String ciudadOri, String ciudadDes, LocalTime horaPartida, LocalTime horaLlegada){
        this.ciudadOri=ciudadOri;
        this.ciudadDes=ciudadDes;
        this.horaPartida=horaPartida;
        this.horaLlegada=horaLlegada;
    }
}
