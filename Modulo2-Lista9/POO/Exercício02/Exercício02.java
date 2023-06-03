package Exercício02;

interface Alimento {
    void comer();
}

class Liquidificador<T extends Alimento> {
    private T alimento;

    public void bater() {
        System.out.println("O imbu foi batido");
    }

    public T getAlimento() {
        return alimento;
    }

    public void setAlimento(T alimento) {
        this.alimento = alimento;
    }
}

class Imbu implements Alimento {
    public void comer() {
        System.out.println("Chupando Imbu");
    }
}

public class Exercício02 {
    public static void main(String[] args) {
        Liquidificador<Imbu> liquidificador = new Liquidificador<>();
        Imbu imbu = new Imbu();

        liquidificador.setAlimento(imbu);
        liquidificador.bater();

        imbu.comer();
    }
}
/* Novamente, não entendi o meu erro💀 */
