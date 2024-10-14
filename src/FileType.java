import java.io.File;
import java.io.IOException;
import java.util.List;

public abstract class FileType implements IFileReader {
    protected File file;

    // Constructeur pour initialiser l'objet fichier
    public FileType(File file) {
        this.file = file;
    }

    // Méthode pour ouvrir le fichier
    @Override
    public void openFile() {
    }

    // Méthode pour fermer le fichier
    @Override
    public void closeFile() {
    }

    // Méthode pour afficher le contenu du fichier à l'endroit
    public abstract void printEndroit() throws IOException;

    // Méthode pour afficher le contenu du fichier à l'envers
    public abstract void printEnvers() throws IOException;

    // Méthode pour afficher le contenu du fichier de manière palindromique
    public abstract void printPalindrome() throws IOException;

    // Méthode pour lire toutes les lignes d'un fichier
    protected List<String> readAllLines() throws IOException {
        return java.nio.file.Files.readAllLines(file.toPath());
    }
}
