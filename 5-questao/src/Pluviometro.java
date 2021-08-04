public class Pluviometro {

    protected String tipo;
    protected int peso;
    protected int Capacidade;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;

        if(this.tipo.equals("A")){
            setCapacidade(1);
            setPeso(2);
        }
        if(this.tipo.equals("B")){
            setCapacidade(2);
            setPeso(3);
        }

        if(this.tipo .equals("C")){
            setPeso(5);
            setCapacidade(3);
        }

    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(int capacidade) {
        Capacidade = capacidade;
    }



}
