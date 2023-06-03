import java.util.HashMap;
import java.util.Map;

public class Exercício01 {
    private String codigoIdentificador;
    private String nome;
    private String tipo;

    public Exercício01(String codigoIdentificador, String nome, String tipo) {
        this.codigoIdentificador = codigoIdentificador;
        this.nome = nome;
        this.tipo = tipo;
    }

    public static void main(String[] args) {
        Map<String, Exercicio01> pokedex = new HashMap<>();

        pokedex.put("001", new Exercicio01("001", "Bulbasaur", "Planta/Venenoso"));
        pokedex.put("004", new Exercicio01("004", "Charmander", "Fogo"));
        pokedex.put("007", new Exercicio01("007", "Squirtle", "Água"));

        //Não sei oq eu errei no HashMap, e nem as dicas do intellij ajudaram
    }
}

