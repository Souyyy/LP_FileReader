import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) throws IOException{
        File file = new File("C:/Users/theod/IdeaProjects/FileReader/src/fichier.txt");


        try {
            FileType fileType;
            // Déterminer le type de fichier à partir de l'extension
            String fileName = file.getName();
            if (fileName.endsWith(".txt")) {
                fileType = new txtFile(file); // Création d'une instance de TxtFile
            } else if (fileName.endsWith(".csv")) {
                fileType = new csvFile(file); // Création d'une instance de CsvFile
            } else if (fileName.endsWith(".json")) {
                fileType = new jsonFile(file); // Création d'une instance de JsonFile
            } else {
                System.out.println("Type de fichier non pris en charge.");
                return; // Sortir si le type de fichier n'est pas pris en charge
            }

            // Exemple d'utilisation des méthodes
            System.out.println("Contenu à l'endroit:");
            fileType.printEndroit(); // Affiche le contenu à l'endroit

            System.out.println("\nContenu à l'envers:");
            fileType.printEnvers(); // Affiche le contenu à l'envers

            System.out.println("\nContenu en palindrome:");
            fileType.printPalindrome(); // Affiche le contenu en palindrome

        } catch (IOException e) {
            e.printStackTrace(); // Affiche l'erreur si quelque chose ne va pas
        }
    }
}
