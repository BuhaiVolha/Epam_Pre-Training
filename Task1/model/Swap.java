public class Swap {

    public static void main(String[] args) {
    
        int a = 3;
        int b = 14;
        
        System.out.printf("The first number was %d, and the second was %d.\n", a, b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.printf("Now the first number is %d, and the second is %d.", a, b);
        
        // works as well:
        // a = b + a;
        // b = a - b;
        // a = a - b;
    }
}
