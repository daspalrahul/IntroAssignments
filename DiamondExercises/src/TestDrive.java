import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestDrive {

    static int readInput(){
        int inp = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            inp = Integer.parseInt(br.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("Invalid Input");
        } catch (IOException ex) {
            System.out.println("IO Error");
        }
        return inp;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("1. IsoscelesTriangle \n2. Diamond \n3. DiamondWithName \n");
        int inp = readInput();
        switch(inp){
            case 1:
                IsoscelesTriangle it = new IsoscelesTriangle();
                n=readInput();
                it.printPattern(n);
                break;
            case 2:
                Diamond d = new Diamond();
                n=readInput();
                d.printPattern(n);
                break;
            case 3:
                DiamondWithName dn =new DiamondWithName();
                n = readInput();
                dn.printPattern(n);
                break;
            default:
                System.out.println("You chose wrong");
        }
    }
}
