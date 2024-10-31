public class Elemento
{
    
    final Object valor;
    Elemento proximo;

    public Elemento(Object valor)
    {
        this.valor = valor;
        this.proximo = null;
    }

    @Override
    public String toString()
    {
        return this.valor.toString();
    }

}
