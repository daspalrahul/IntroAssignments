
class RightTriangle {
    void printPattern(int n){
        int starCount=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<starCount;j++)
                System.out.print("*");
            System.out.println("");
            starCount+=1;
        }
    }
}
