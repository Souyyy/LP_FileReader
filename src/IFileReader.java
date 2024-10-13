import java.io.IOException;

public interface IFileReader {
    public void openFile() throws IOException;
    public void closeFile()throws IOException;
}
