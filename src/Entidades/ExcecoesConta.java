package Entidades;
public class ExcecoesConta extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public ExcecoesConta(String mensagem){
        super(mensagem);
    }
}
