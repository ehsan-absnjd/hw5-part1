package PrimeDetector;

public class PrimeDetector {
    public static void main(String[] args) {
        for(int i=0; i<100 ; i++)
            System.out.println(i + " : " + isPrime(i));

    }
    public static boolean isPrime(int num){
        return isPrime(num,2);
    }
    public static boolean isPrime(int num,int i){
        if(num<2)
            return false;
        if(num==2 || num==3)
            return true;
        if(num%i==0)
            return false;
        if(num<i*i)
            return true;
        return isPrime(num,i+1);
    }
}
