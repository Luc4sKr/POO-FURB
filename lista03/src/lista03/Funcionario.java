package lista03;

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
    
    public double calcularIrpf() {
        double imposto = 0;
        double limite = 0;
        
        // 2 faixa
        if (this.salario >= 1903.99) {
            limite = 2826.65;
            
            if (salario > limite) {
                imposto += ((limite - 1903.98f) / 100) * 7.5;
            } else {
                imposto += ((this.salario - 1903.98f) / 100) * 7.5;
            }
        }
        
        // 3 faixa
        if (this.salario >= 2826.66) {
            limite = 3751.05;
            
            if (salario > limite) {
                imposto += ((limite - 2826.66f) / 100) * 15;
            } else {
                imposto += ((this.salario - 2826.65) / 100) * 15;
            }
        }
        
        // 4 faixa
        if (this.salario >=  3751.06) {
            limite = 4664.68;
            
            if (salario > limite) {
                imposto += ((limite - 3751.06) / 100) * 22.5;
            } else {
                imposto += ((this.salario - 3751.06) / 100) * 22.5;
            }
        }
        
        // 5 faixa
        if (this.salario >=  4664.69) {
            imposto += ((this.salario - 3751.06) / 100) * 27.5;
        }
        
        return imposto;
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
