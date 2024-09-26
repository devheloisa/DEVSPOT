import java.util.Scanner;

public class Curriculo {
    private String endereco;
    private String estadoCivil;
    private String cpf;
    private String empresa;
    private String cargo;
    private String inicioContrato;
    private String fimContrato;
    private String responsabilidades;
    private String escolaridade;
    private String instituicaoEnsino;
    private String curso;
    private String anoConclusao;

    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Endereço: ");
        endereco = scanner.nextLine();

        System.out.print("Estado Civil: ");
        estadoCivil = scanner.nextLine();

        System.out.print("CPF: ");
        cpf = scanner.nextLine();

        System.out.print("Empresa: ");
        empresa = scanner.nextLine();

        System.out.print("Cargo: ");
        cargo = scanner.nextLine();

        System.out.print("Início de Contrato (dd-mm-yyyy): ");
        inicioContrato = scanner.nextLine();

        System.out.print("Fim de Contrato (dd-mm-yyyy): ");
        fimContrato = scanner.nextLine();

        System.out.print("Responsabilidades e Conquistas: ");
        responsabilidades = scanner.nextLine();

        System.out.print("Escolaridade: ");
        escolaridade = scanner.nextLine();

        System.out.print("Instituição de Ensino: ");
        instituicaoEnsino = scanner.nextLine();

        System.out.print("Curso: ");
        curso = scanner.nextLine();

        System.out.print("Ano de Conclusão: ");
        anoConclusao = scanner.nextLine();

        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("Endereço: " + endereco);
        System.out.println("Estado Civil: " + estadoCivil);
        System.out.println("CPF: " + cpf);
        System.out.println("Empresa: " + empresa);
        System.out.println("Cargo: " + cargo);
        System.out.println("Início de Contrato: " + inicioContrato);
        System.out.println("Fim de Contrato: " + fimContrato);
        System.out.println("Responsabilidades e Conquistas: " + responsabilidades);
        System.out.println("Escolaridade: " + escolaridade);
        System.out.println("Instituição de Ensino: " + instituicaoEnsino);
        System.out.println("Curso: " + curso);
        System.out.println("Ano de Conclusão: " + anoConclusao);
    }

    public static void main(String[] args) {
        Curriculo curriculo = new Curriculo();
        curriculo.cadastrar();
    }
}