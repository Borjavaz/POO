package Calendario1;
/**
 * Clase que representa un calendario
 */
public class Calendario {

    //Propiedades del calendario

    private int dia;
    private int mes;
    private int año;

    public Calendario(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    //set y get
    public int getDia() {return dia;}
    public int getMes() {return mes;}
    public int getAño() {return año;}
    public void setDia(int dia) {this.dia = dia;}
    public void setMes(int mes) {this.mes = mes;}
    public void setAño(int año) {this.año = año;}

    public void incrementarDia(){
        if(++this.dia > diasEnMes()){
            this.setDia(1);
            incrementarMes();
        }
    }
    public void incrementarMes(){
        if(++this.mes > 12){
            this.mes = 1;
            incrementarAño();
        }
    }
    public void incrementarAño(){
        this.año++;
    }
    private int diasEnMes(){
        switch(mes){
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return (esBisiesto() ? 29 : 28);
            default:
                return 31;
        }
    }
    public boolean esBisiesto(){
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
    public boolean dataIgual(Calendario outraData){
        return this.dia == outraData.getDia() &&
                this.mes == outraData.getMes() &&
                this.año == outraData.getAño();
    }
}
