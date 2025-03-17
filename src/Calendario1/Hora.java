package Calendario1;

public class Hora {
    enum Formato {DOCE, VEINTICUATRO};
    private int hora;
    private int minuto;
    private int segundo;
    private Formato formato;

    public Hora(int hora, int minuto, int segundo, Formato formato) {
        this.formato = formato;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public void setFormato(String formato){
        if (formato.toUpperCase().equals("DOCE") || formato.toUpperCase().equals("VEINTICUATRO")) {
            this.formato = Formato.valueOf(formato.toUpperCase());
        }
        else{
            if (formato.equals("12")){
                this.formato = Formato.DOCE;
            }
            else {this.formato = Formato.VEINTICUATRO;}
        }
    }
    public int getHora() {return hora;}
    public int getMinuto() {return minuto;}
    public int getSegundo() {return segundo;}

    public Formato getFormato() { return formato; }

    public void setHora(int hora) {this.hora = hora;}
    public void setMinuto(int minuto){this.minuto = minuto;}
    public void setSegundo(int segundo){this.segundo = segundo;}

    public void avanzarSegundo(){
        if(++this.segundo > 59){
            this.segundo = 0;
            avanzarMinuto();
        }
    }
    public void avanzarMinuto(){
        if(++this.minuto > 59){
            this.minuto = 0;
            avanzarHora();
        }
    }
    public void avanzarHora(){
        if(++this.hora > 23){
            this.hora = 0;
        }
    }
    public String toString(){
        return hora + ":" + minuto + ":" + segundo;
    }

    public static void main(String[] args) {
        Hora h = new Hora(12,59,59,Formato.VEINTICUATRO);
       if (h.getFormato() == Formato.DOCE){
           System.out.println("La hora es: " + h.toString());
           System.out.println("Formato 12 horas");
       }
       else if (h.getFormato() == Formato.VEINTICUATRO){
           System.out.println("La hora es: " + h.toString());
           System.out.println("Formato 24 horas");

         }
    }
}
