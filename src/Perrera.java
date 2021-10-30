import java.time.Year;

public class Perrera {

    private boolean adopcion;
    private String raza;
    private int anio;
    private double peso;
    private boolean chip;
    private boolean lastimado;
    private String nombre;

    public boolean isAdopcion() {
        return adopcion;
    }

    public void setAdopcion(boolean adopcion) {
        this.adopcion = adopcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public boolean isLastimado() {
        return lastimado;
    }

    public void setLastimado(boolean lastimado) {
        this.lastimado = lastimado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public Perrera( String raza, int anio, double peso, boolean chip, boolean lastimado, String nombre) {
        this.adopcion = adopcion;
        this.raza = raza;
        this.anio = anio;
        this.peso = peso;
        this.chip = chip;
        this.lastimado = lastimado;
        this.nombre = nombre;
        this.adopcion = false;
    }

    public int edadPerro() {
        int year = Year.now().getValue();
        return year - this.getAnio();
    }

    public boolean factiblePerderse() {


        return this.chip;
    }

    public String sePuedeAdoppar() {
        if(!this.lastimado || this.peso>5) {
             this.setAdopcion(true);
        }
         String mensaje = "se puede adoptar" ;
          if(this.adopcion){

              return mensaje;
          } else {
              return "no se puede adoptar";
          }
    }






}
