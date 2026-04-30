import java.io.*;

public class pra26 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java pra26 <filename>");
            return;
        }
        int charCount = 0, wordCount = 0, lineCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) wordCount += words.length;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }
        System.out.println("Characters: " + charCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Lines: " + lineCount);
    }
}
