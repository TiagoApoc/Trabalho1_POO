public class Series implements Video{
    private final String LINGUA_PORTUGUESA = "Português (Brasil)";
    private final String LINGUA_INGLESA = "Ingês (Original)";
    private int temporadas;
    private String idiomaAudio;
    private String idiomaLegenda;
    private boolean estaPausado;
    private boolean estaExecutando;
    private String nome;
    private int episodioPorTemporada;

    public Series (String nome, int temporadas, int episodioPorTemporada) {
        this.temporadas = temporadas;
        this.idiomaAudio = LINGUA_PORTUGUESA;
        this.idiomaLegenda = LINGUA_INGLESA;
        this.estaPausado = false;
        this.estaExecutando = false;
        this.nome = nome;
        this.episodioPorTemporada = episodioPorTemporada;
    }

    @Override
    public void executar(){
        System.out.println("A Serie "+nome +" começou");
        if (!estaPausado){
        System.out.println("O video está executando");

    }

}

    @Override
    public void pausar() {
        System.out.println("O video está pausado");
        estaPausado = true;
    }

    @Override
    public void mudarAudio() {
        if (idiomaAudio.equals(LINGUA_PORTUGUESA)){
            idiomaAudio = (LINGUA_INGLESA);
        }
        else{
            idiomaAudio = (LINGUA_PORTUGUESA);
        }
        System.out.println("Audio: " +idiomaAudio );
    }

    @Override
    public void mudarLegenda() {
        if (idiomaLegenda.equals(LINGUA_PORTUGUESA)){
            idiomaLegenda = (LINGUA_INGLESA);
        }
        else{
            idiomaLegenda = (LINGUA_PORTUGUESA);
        }
        System.out.println("Legenda: " +idiomaLegenda);

    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome da Série: "+nome +" | Temporadas: "+temporadas+ " | Episodio por temporada: " + episodioPorTemporada);
}

//Getters 
public int  getTemporadas(){
    return temporadas;
}
public String getIdiomaAudio(){
    return idiomaAudio;
}
public String getIdiomaLegenda(){
    return idiomaLegenda;
} 
public boolean getPausar() {
    return estaPausado;
}
public String getNome(){
    return nome;
}

//Setters
public void setTemporadas(int temporadas){
    this.temporadas = temporadas;
}

public void setIdiomaAudio (String idiomaAudio) {
    this.idiomaAudio = idiomaAudio;
}

public void setIdiomaLegenda (String idiomaLegenda) {
    this.idiomaLegenda = idiomaLegenda;
}

public void setPausar(boolean estaPausado) {
    this.estaPausado = estaPausado;
    
}
public void setNome (String nome) {
    this.nome = nome;
}
}
