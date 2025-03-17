public class Personaxe {
    private String nome;
    private int vida;
    private int resistencia;
    private int forza;
    private int velocidade;
    private int experiencia;
    private String apariencia;
    private String[] habilidades;
    private String[] equipamento;

    public Personaxe() {
        nome = "Invitado";
        vida = 3;
        resistencia = 3;
        forza = 3;
        velocidade = 3;
        experiencia = 1;
        apariencia = "Soldado raso";
        habilidades = new String[5];
        equipamento = new String[5];
    }

    public Personaxe(String nom, int vida, int rest, int forza, int vel, int exp, String apar, String[] habilidades, String[] equipamento){
        nome = nom;
        this.vida = vida;
        resistencia = rest;
        this.forza = forza;
        velocidade = vel;
        experiencia = exp;
        apariencia = apar;
        this.habilidades = new String[5];
        setHabilidades  (habilidades);
        this.equipamento = new String[5];
        setEquipamento (equipamento);
    }
    public void setHabilidades(String [] habilidades){
        int numHabilidades = habilidades.length;
        if(numHabilidades > 5) numHabilidades=5;
        for (int i =0; i<numHabilidades;i++){
            this.habilidades[i] = habilidades[i];
        }
    }
    public void setEquipamento(String [] equipamento){
        int numEquipamento = equipamento.length;
        if(numEquipamento > 5) numEquipamento=5;
        for (int i =0; i<numEquipamento;i++){
            this.equipamento[i] = equipamento[i];
        }
    }
    public static void main(String[] args) {
        String [] hab = {"Saltar","X-Ray","Transformarse"};
        String [] equip = {"Pistola","Katana","Lanzallamas","Ballesta","Piedra","Palo"};
        Personaxe mario = new Personaxe("Mario Bros", 5,6,9,10,1, "Gorra e mono rojo",hab,equip);
    }
}