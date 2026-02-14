import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String cep = "";
        int menu = 1;
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Bem vindo ao sistema de consulta de CEP \nDigite um CEP para buscar o endereço correspondente ou digite '0' para encerrar o programa.");

        while (menu != 0) {
            cep = leitura.nextLine();

            if(cep.equals("0")) {
                menu = 0;
                System.out.println("Programa encerrado.");
            } else {
                try {
                    Endereco endereco = consultaCep.buscaEndereco(cep);
                    System.out.println(endereco);
                    GeradorDeArquivo gerador = new GeradorDeArquivo();
                    gerador.salvaJson(endereco);
                    System.out.println("Programa encerrado.");
                    break;
                } catch (RuntimeException | IOException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Digite um CEP válido para buscar o endereço correspondente ou digite '0' para encerrar o programa.");
                }
            }
        }
    }
}
