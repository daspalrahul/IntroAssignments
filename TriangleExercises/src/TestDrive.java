import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestDrive {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("1. Easiest Exercise Ever \n2. Horizontal Line \n3. Vertical Line \n4. Right Triangle");
        try{
            int inp = Integer.parseInt(br.readLine());
            switch(inp){
                case 1:
                    EasiestExerciseEver e = new EasiestExerciseEver();
                    e.printPattern();
                    break;
                case 2:
                    HorizontalLine h = new HorizontalLine();
                    try{
                        n=Integer.parseInt(br.readLine());
                        h.printPattern(n);
                    } catch (NumberFormatException ex){
                        System.out.println("Invalid Input");
                    }
                    break;
                case 3:
                    VerticalLine r =new VerticalLine();
                    try{
                        n = Integer.parseInt(br.readLine());
                        r.printPattern(n);
                    } catch (NumberFormatException ex){
                        System.out.println("Invalid input");
                    }
                    break;
                case 4:
                    RightTriangle v =new RightTriangle();
                    try{
                        n = Integer.parseInt(br.readLine());
                        v.printPattern(n);
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
