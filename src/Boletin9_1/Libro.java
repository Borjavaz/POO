package Boletin9_1;

public class Libro {

    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

    // Construtor por defecto
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.ano = 0;
        this.numPaginas = 0;
        this.valoracion = 0.0f;
    }

    // Construtor con parámetros
    public Libro(String titulo, String autor, int ano, short numPaginas, float valoracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
        this.valoracion = valoracion;
    }

    // Constructores get y set
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}
    public int getAno() {return ano;}
    public void setAno(int ano) {this.ano = ano;}
    public short getNumPaginas() {return numPaginas;}
    public void setNumPaginas(short numPaginas) {this.numPaginas = numPaginas;}
    public float getValoracion() {return valoracion;}
    public void setValoracion(float valoracion) {this.valoracion = valoracion;}

    public void imprimir() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Numero de paginas: " + numPaginas);
        System.out.println("Valoracion: " + valoracion);
    }
}

