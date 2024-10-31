public class Pilha
{
    Elemento topo;
    int tamanho;

    public Pilha()
    {
        this.topo = null;
        this.tamanho = 0;
    }

    public char pop()
    {
        if (tamanho == 0) {
            throw new IllegalStateException("Não há objeto na pilha");
        }
        Elemento elemento = this.topo;
        char val = (char) elemento.valor;
        topo = topo.proximo;
        tamanho--;
        return val;
    }

    public void push(char elemento)
    {
        Elemento elemen = new Elemento(elemento);
        elemen.proximo = topo;
        topo = elemen;
        tamanho++;
    }
}
