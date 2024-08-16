import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numCadastros = 3;
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>(numCadastros);  

        for (int i = 0; i < numCadastros; i++) {
            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Peso: ");
            double peso = sc.nextDouble();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            Pessoa pessoa = new Pessoa();
            pessoa.setNome(nome);
            pessoa.setPeso(peso);
            pessoa.setAltura(altura);

            listaPessoas.add(pessoa);
        }

        for (Pessoa pessoaItem : listaPessoas) {
            System.out.println("Nome: " + pessoaItem.getNome() + " - Peso: " + pessoaItem.getPeso() + " - Altura: " + pessoaItem.getAltura() + " - IMC: " + pessoaItem.calcularImc());
        }

        sc.close();
    }
}
