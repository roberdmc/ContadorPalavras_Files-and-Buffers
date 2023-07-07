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
      System.out.println("\n --- Contador de palavras com Arquivos e Buffers em Java --- \n");
      // Abrir o arquivo de entrada
      FileReader fileReader = new FileReader(inputFile);

      // Criar um buffer para otimizar a leitura
      BufferedReader bufferedReader = new BufferedReader(fileReader);

      // Exibir o conteudo e Realizar a contagem de palavras
      int wordCount = 0;
      String line;
      System.out.println("Conteudo de \"" + inputFile + "\": \n");
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
        String[] words = line.split("\\s+");
        wordCount += words.length;
      }
      System.out.println("\n");

      // Fechar o arquivo de entrada
      bufferedReader.close();

      // Gravar o resultado no arquivo de saída
      FileWriter fileWriter = new FileWriter(outputFile);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      bufferedWriter.write("Número de palavras: " + wordCount);

      // Fechar o arquivo de saída
      bufferedWriter.close();

      System.out.println("Contagem de palavras concluída. O resultado foi gravado em \"" + outputFile + "\". \n\n");

      // Ler o arquivo escrito anteriormente
      fileReader = new FileReader(outputFile);
      bufferedReader = new BufferedReader(fileReader);

      // Exibir o conteudo
      System.out.println("Conteudo de \"" + outputFile + "\": \n");
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }
      System.out.println();

      // Fechar o arquivo
      bufferedReader.close();
    } catch (IOException e) {
      System.err.println("Erro ao manipular arquivos: " + e.getMessage());
    }
  }
}
