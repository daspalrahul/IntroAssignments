
class FizzBuzz {
    void fizzBuzzMethod(){
        for(int i=1;i<=100;i++){
            boolean factorThreeFive = false;
            if(i%3 == 0){
                System.out.print("Fizz");
                factorThreeFive = true;
            }
            if(i%5 == 0){
                System.out.print("Buzz");
                factorThreeFive = true;
            }
            if(!factorThreeFive)
                System.out.print(i);
            System.out.println("");
        }
    }
}
