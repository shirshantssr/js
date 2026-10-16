import java.util.Scanner;
public class isPrime {
    public static void main (String[] args){
  Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to check if it is prime or not: ");
    int num=  sc.nextInt();

    int count = 0;

    for(int i = 2 ; i <= num/2 ; i++){
        
        if(num%i==0){
            count++;
        }
    }
    if(count==0){
            System.out.println(num + " is a prime rohit ");
        }else{
            System.out.println(num + " is not a prime number");
        }

    }
}





