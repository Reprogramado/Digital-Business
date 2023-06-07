package conective.food.api.ong;

public record DadosListagemOng() {
    public DadosListagemOng(Ongs ong){
        this(ong.getUsuario(),ong.getSenha());
    }
}
