public class App {
    public static void main(String[] args) throws Exception {
        Filme filme1 = new Filme("Matrix", 190, 1999);
        filme1.executar();
        filme1.pausar();
        filme1.mudarAudio();
        filme1.mudarLegenda();
        filme1.exibirDetalhes();
        filme1.mudarAudio();
        filme1.mudarLegenda();
        filme1.executar();
        System.out.println("");

        Filme filme2 = new Filme("Vingadores", 210, 2019);
        filme2.executar();
        filme2.pausar();
        filme2.mudarAudio();
        filme2.mudarLegenda();
        filme2.exibirDetalhes();
        System.out.println("");

        Series serie1 = new Series ("Game of Thrones", 9, 10);
        serie1.executar();
        serie1.pausar();
        serie1.mudarAudio();
        serie1.mudarLegenda();
        serie1.exibirDetalhes();
        serie1.mudarAudio();
        serie1.mudarLegenda();
        serie1.executar();
        System.out.println("");
        
        Series serie2 = new Series ("Mr. Robot", 5, 12);
        serie2.executar();
        serie2.pausar();
        serie2.mudarAudio();
        serie2.mudarLegenda();
        serie2.exibirDetalhes();
    }
}
