import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestDrive {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("1. IsoscelesTriangle \n2. Diamond \n3. DiamondWithName \n");
        try{
            int inp = Integer.parseInt(br.readLine());
            switch(inp){
                case 1:
                    IsoscelesTriangle it = new IsoscelesTriangle();
                    try{
                        n=Integer.parseInt(br.readLine());
                        it.printPattern(n);
                    } catch (NumberFormatException ex){
                        System.out.println("Invalid Input");
                    }
                    break;
                case 2:
                    Diamond d = new Diamond();
                    try{
                        n=Integer.parseInt(br.readLine());
                        d.printPattern(n);
                    } catch (NumberFormatException ex){
                        System.out.println("Invalid Input");
                    }
                    break;
                case 3:
                    DiamondWithName dn =new DiamondWithName();
                    try{
                        n = Integer.parseInt(br.readLine());
                        dn.printPattern(n);
                    } catch (NumberFormatException ex){
                        System.out.println("Invalid input");
                    }
                    break;
                default:
                    System.out.println("You chose wrong");
            }
        } catch (NumberFormatException ex){
            System.out.println("Invalid input");
        }
    }
}
