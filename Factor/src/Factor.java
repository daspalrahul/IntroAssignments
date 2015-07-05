import java.util.ArrayList;
import java.util.Collections;

class Factor {
    int [] primes = new int[1000000];
    public static final int LIMIT=1000000;
    void generatePrimes(){
        int sqLimit=(int)Math.sqrt(LIMIT);
        primes[0]=primes[1]=1;
        for(int i=2;i<=sqLimit;i++){
            if(primes[i]==0){
                for(int j=i*i;j<LIMIT;j+=i)
                    primes[j]=1;
            }
        }
    }
    boolean isPrime(int n){
        return n<LIMIT && (primes[n]==0);
    }
    public void generate(int n){
        ArrayList<Integer> factors = new ArrayList<Integer>();
        generatePrimes();
        int upper = (int)Math.sqrt(n);
        for(int i=2;i<=upper;i++){
            if(n%i == 0){
                if(isPrime(i)){
                    factors.add(i);
                }
                if(i != (n / i)){
                    if(isPrime(n/i)){
                        factors.add(n/i);
                    }
                }
            }
        }
        Collections.sort(factors);
        System.out.print("numbers: ");
        for(Integer i : factors){
            System.out.print(i+",");
        }
    }
}
