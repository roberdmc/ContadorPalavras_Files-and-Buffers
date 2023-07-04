import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ContadorPalavras {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            // Abrir o arquivo de entrada
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            // Criar um buffer para otimizar a leitura
            BufferedReader bufferedReader = new BufferedReader(reader);

            // Realizar a contagem de palavras
            int wordCount = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            // Fechar o arquivo de entrada
            bufferedReader.close();

            // Gravar o resultado no arquivo de saída
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write("Número de palavras: " + wordCount);

            // Fechar o arquivo de saída
            writer.close();

            System.out.println("Contagem de palavras concluída. O resultado foi gravado em \"" + outputFile + "\".");
        } catch (IOException e) {
            System.err.println("Erro ao manipular arquivos: " + e.getMessage());
        }
    }
}
