package uff.ic.lleme.tic10002.provas.s20171.P120171Q5;

public class FilaEstaticaDeInt extends ListaEstatica {

    public FilaEstaticaDeInt(int tamanho) {
        super(tamanho);
    }

    public Integer enfileirar(int elemento) {
        return super.incluir(elemento);
    }

    public Integer desenfileirar() {
        return super.excluir(0);
    }

}
