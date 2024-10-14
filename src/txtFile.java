import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Collections;

public class txtFile extends FileType {

    // Constructeur pour initialiser l'objet fichier
    public txtFile(File file) {
        super(file); // Appelle le constructeur de la classe parente
    }

    // Affiche le contenu du fichier à l'endroit
    @Override
    public void printEndroit() throws IOException {
        openFile();
        List<String> lines = readAllLines(); // Lis toutes les lignes du fichier
        for (String line : lines) {
            System.out.println(line); // Affiche chaque ligne
        }
        closeFile();
    }

    // Affiche le contenu du fichier à l'envers
    @Override
    public void printEnvers() throws IOException {
        openFile();
        List<String> lines = readAllLines();
        Collections.reverse(lines); // Inverse l'ordre des lignes
        for (String line : lines) {
            System.out.println(line); // Affiche chaque ligne
        }
        closeFile();
    }

    // Affiche le contenu du fichier de manière palindromique
    @Override
    public void printPalindrome() throws IOException {
        openFile();
        List<String> lines = readAllLines();
        for (String line : lines) {
            System.out.println(new StringBuilder(line).reverse().toString()); // Inverse les caractères de chaque ligne
        }
        closeFile();
    }
}
