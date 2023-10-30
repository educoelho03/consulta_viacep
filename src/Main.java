import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o seu cep: ");
        var cep = leitor.nextLine();
        ConsultaCep consulta = new ConsultaCep();

        try {
            Endereco novoEndereco = consulta.consultaEndereco(cep);
            GeradorArquivo geradorArquivo = new GeradorArquivo();
            geradorArquivo.salvaArquivoJson(novoEndereco);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação;");
        }

    }
}