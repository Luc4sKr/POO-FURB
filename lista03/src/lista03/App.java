package lista03;

/**
 *
 * @author lkreuch
 */
public class App {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Lcuas", 5000);
        
        System.out.println(f.calcularIrpf());
    }
    
}
