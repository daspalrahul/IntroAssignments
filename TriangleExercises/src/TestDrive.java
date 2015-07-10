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
        System.out.println("1. Easiest Exercise Ever \n2. Horizontal Line \n3. Vertical Line \n4. Right Triangle");
        int inp = readInput();
        switch(inp){
            case 1:
                EasiestExerciseEver e = new EasiestExerciseEver();
                e.printPattern();
                break;
            case 2:
                HorizontalLine h = new HorizontalLine();
                n=readInput();
                h.printPattern(n);
                break;
            case 3:
                VerticalLine r =new VerticalLine();
                n = readInput();
                r.printPattern(n);
                break;
            case 4:
                RightTriangle v =new RightTriangle();
                n = readInput();
                v.printPattern(n);
                break;
            default:
                System.out.println("You chose wrong");
        }
    }
}
