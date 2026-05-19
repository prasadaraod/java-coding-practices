import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class IOExample {
    public static void main(String[] args) {
        Path filePath = Paths.get("sample.txt");

        try {
            // 1. Write to a file (NIO.2)
            String content = "Hello, NIO.2 File Handling!\nLine 2...";
            Files.writeString(filePath, content, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Successfully wrote to file.");

            // 2. Read from a file
            List<String> lines = Files.readAllLines(filePath);
            System.out.println("--- File Contents ---");
            lines.forEach(System.out::println);

            // 3. Delete the file after reading (Clean up)
            Files.deleteIfExists(filePath);
            System.out.println("File deleted successfully.");

        } catch (IOException e) {
            System.err.println("An I/O Error occurred: " + e.getMessage());
        }
    }
}
