import java.io.*;

public class testBash {
    public static void main(String[] args) throws Exception {
        // Run command and wait till it's done
        String[] cmd = {"/home/shaun/example.sh"};
        Process p = Runtime.getRuntime().exec(cmd);
        p.waitFor();

        // Grab output and print to display
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
