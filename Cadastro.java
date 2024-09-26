import java.util.Scanner;

public class Cadastro {
    private String nomeCompleto;
    private String email;
    private String telefone;
    private String dataNascimento;
    private String senha;


    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome Completo: ");
        nomeCompleto = scanner.nextLine();

        System.out.print("E-mail: ");
        email = scanner.nextLine();

        System.out.print("Telefone: ");
        telefone = scanner.nextLine();

        System.out.print("Data de Nascimento (dd-mm-yyyy): ");
        dataNascimento = scanner.nextLine();

        System.out.print("Senha: ");
        senha = scanner.nextLine();

        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Senha: " + senha);
    }

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        cadastro.cadastrar();
    }
}