import java.io.*;

public class FactorTestDrive{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Factor f = new Factor();
        try {
            int n = Integer.parseInt(br.readLine());
            f.generate(n);
        } catch (NumberFormatException ex){
            System.out.println("Invalid input");
        }
    }
}