public class Pessoa {
    private double altura;
    private double peso;
    private String nome;

    public double calcularImc() {
        return this.peso / Math.pow(this.altura, 2);
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double newAltura) {
        if (newAltura < 0) {
            throw new IllegalArgumentException();
        }

        this.altura = newAltura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double newPeso) {
        if (newPeso < 0) {
            throw new IllegalArgumentException();
        }

        this.peso = newPeso;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }
}