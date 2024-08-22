package ex01;

/**
 *
 * @author lkreuch
 */
public class Funcionario { 
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    private static final double[] ALIQUOTAS = {0.0, 7.5, 15.0, 22.5, 27.5};
    private static final double[] FAIXAS = {1903.98, 2826.65, 3751.05, 4664.68};
    private static final double[] DEDUCOES = {0.0, 142.80, 354.80, 636.13, 869.36};

    public double calcularIrpf() {
        double baseCalculo = salario;
        double imposto = 0.0;

        for (int i = FAIXAS.length - 1; i >= 0; i--) {
            if (baseCalculo > FAIXAS[i]) {
                imposto += (baseCalculo - FAIXAS[i]) * (ALIQUOTAS[i + 1] / 100);
                baseCalculo = FAIXAS[i];
            }
        }

        imposto -= calcularDeducao(baseCalculo);

        // Retorna o imposto ou 0 se o valor for negativo
        return Math.max(imposto, 0);
    }

    private double calcularDeducao(double salarioMensal) {
        for (int i = FAIXAS.length - 1; i >= 0; i--) {
            if (salarioMensal > FAIXAS[i]) {
                return DEDUCOES[i + 1];
            }
        }
        return DEDUCOES[0];
    }
    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException();
        }
        
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
