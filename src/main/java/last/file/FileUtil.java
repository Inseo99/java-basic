package last.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {

    public void save(String content, String filename) {
        Path filePath = Paths.get(filename);

        try {
            Files.write(filePath, content.getBytes());
            System.out.println("파일 작성 완료: " + filePath.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String load(String filename) {
        Path filePath = Paths.get(filename);

        try {
            String contect = Files.readString(filePath);
            return contect;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
