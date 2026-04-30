import java.io.*;

public class pra27 {
    public static void main(String[] args) {
        String filename = "students.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write("101 Alice 85"); bw.newLine();
            bw.write("102 Bob 72"); bw.newLine();
            bw.write("103 Charlie 90"); bw.newLine();
            System.out.println("Student records written to " + filename);
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        } finally {
            System.out.println("Write operation completed.");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("\nStudent Records:");
            System.out.println("RollNo | Name | Marks");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        } finally {
            System.out.println("Read operation completed.");
        }
    }
}
