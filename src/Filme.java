public class Filme implements Video {

    private final String LINGUA_PORTUGUESA = "Português (Brasil)";
    private final String LINGUA_INGLESA = "Ingês (Original)";
    private int duracao;
    private String idiomaAudio;
    private String idiomaLegenda;
    private boolean estaPausado;
    private boolean estaExecutando;
    private String nome;
    private int anoLancamento;
    
    public Filme(String nome, int duracao, int anoLancamento){
        this.duracao = duracao;
        this.idiomaAudio = LINGUA_PORTUGUESA;
        this.idiomaLegenda = LINGUA_INGLESA;
        this.estaPausado = false;
        this.estaExecutando = false;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }
       
    
    @Override
    public void executar() {
        System.out.println("O filme "+nome +" começou");
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
    public void exibirDetalhes() {
        System.out.println("Nome do Filme: "+nome +" | Duração: "+duracao+ " min "+ ("| Ano Lançamento: ") + anoLancamento);
        

    }
//Getters 
    public int  getDuracao(){
        return duracao;
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
    public void setDuracao(int duracao){
        this.duracao = duracao;
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
