
class DiamondWithName {
    void printPattern(int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++)
                System.out.print(" ");
            for(int j=0;j<2*(i+1)-1;j++)
                System.out.print("*");
            System.out.println("");
        }
        System.out.println("RAHUL");
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++)
                System.out.print(" ");
            for(int j=0;j<2*(n-i)-1;j++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
