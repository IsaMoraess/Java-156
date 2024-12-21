package EX1;

import java.io.File;
import java.text.DateFormat;

public class Verifica {

    public void VerificaArquivo(File arq) {
        System.out.println("_________________________________________________");
        if (arq.exists()) {
            if (arq.isFile()) {
                System.out.println("Arquivo " + arq.getName() + " existe");
                System.out.println("Tamanho: " + arq.length());
                System.out.println("Caminho até o arquivo: " + arq.getPath());
                System.out.println("Qual o nome da pasta onde está o diretório? " + arq.getParent());
                System.out.println("Localização completa:\n\t" + arq.getAbsolutePath());
                System.out.println("Posso ler? " + arq.canRead());
                System.out.println("Posso escrever? " + arq.canWrite());

                System.out.println("Última modificação: " + arq.lastModified());
                DateFormat df = DateFormat.getDateTimeInstance();
                long x = arq.lastModified();
                System.out.println("Última modificação: " + df.format(x));
            }
            if (arq.isDirectory()) {
                System.out.println("\nArquivos da pasta " + arq.getName() + ":");
                String pasta[] = arq.list();
                for (String n : pasta) {
                    System.out.println("\t" + n);
                }
            }
        } else {
            System.out.println("Erro: não foi possível localizar o arquivo ou diretório informado");
        }
    }
}

