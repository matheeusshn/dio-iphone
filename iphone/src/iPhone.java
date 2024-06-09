public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorNaInternet navegadorNaInternet;

    public iPhone() {
        this.reprodutorMusical = new ReprodutorMusicalImpl();
        this.aparelhoTelefonico = new AparelhoTelefonicoImpl();
        this.navegadorNaInternet = new NavegadorNaInternetImpl();
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorNaInternet getNavegadorNaInternet() {
        return navegadorNaInternet;
    }

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        
        meuIphone.getReprodutorMusical().selecionarMusica("Musica Exemplo");
        meuIphone.getReprodutorMusical().tocar();
        meuIphone.getReprodutorMusical().pausar();

        
        meuIphone.getAparelhoTelefonico().ligar("123-456-7890");
        meuIphone.getAparelhoTelefonico().atender();
        meuIphone.getAparelhoTelefonico().iniciarCorreioVoz();

        // Testando o navegador na internet
        meuIphone.getNavegadorNaInternet().exibirPagina("http://www.exemplo.com");
        meuIphone.getNavegadorNaInternet().adicionarNovaAba();
        meuIphone.getNavegadorNaInternet().atualizarPagina();
    }
}
