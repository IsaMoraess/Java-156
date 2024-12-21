import java.io.File;
import java.net.URI;

import EX1.Verifica;

public class Exemplo {
    public static void main(String[] args) {
        Verifica vf = new Verifica();  // A classe Verifica é chamada aqui
        
        // Caminho absoluto para o arquivo local
        File hipotese1 = new File("C:\\Users\\laboratorio\\Desktop", "Ex1.txt");
        vf.VerificaArquivo(hipotese1);

        // Caminho para um diretório
        File hipotese2 = new File("c:\\teste\\");
        vf.VerificaArquivo(hipotese2);

        // Caminho relativo para um arquivo
        File hipotese3 = new File("..\\JAVA_ONLINE\\src\\arquivos\\dados.txt");
        vf.VerificaArquivo(hipotese3);

        // URL da web (não é um arquivo local)
        String url = "https://www.kaggle.com/allen-institute-for-ai/CORD-19-research-challenge";
        try {
            URI uri = new URI(url);  // Usando URI para lidar com URLs
            System.out.println("URI: " + uri);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
