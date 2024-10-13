import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Collections;
import java.nio.file.Files;
import java.nio.file.Paths;

public class jsonFile extends FileType {

    // Constructeur pour initialiser l'objet fichier
    public jsonFile(File file) {
        super(file); // Appelle le constructeur de la classe parente
    }

    // Affiche le contenu du fichier JSON à l'endroit (ordre des lignes normal)
    @Override
    public void printEndroit() throws IOException {
        openFile();
        List<String> lines = readAllLines(); // Lis toutes les lignes du fichier
        for (String line : lines) {
            System.out.println(line); // Affiche chaque ligne
        }
        closeFile();
    }

    // Affiche le contenu du fichier JSON à l'envers (ordre des lignes inversé)
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

    // Affiche le contenu du fichier JSON de manière palindromique (inverser les caractères de chaque ligne)
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