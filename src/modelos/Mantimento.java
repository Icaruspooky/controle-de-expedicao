package modelos;

public class Mantimento extends Item {
    private String nome;
    private double peso;
    private double volume;

    public Mantimento(String nome, double peso, double volume) {
        this.nome = nome;
        this.peso = peso;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
