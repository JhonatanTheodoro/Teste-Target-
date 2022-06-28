import java.util.*;
public class projeto1 {
    public static void main (String args[]) {
		Scanner t = new Scanner (System.in);
		int n, num1 = 1, num2 = 0;
		System.out.print("Informe um numero: ");
		n = t.nextInt();
		t.close();
		
		for (int i = 0; i < 5000; i++) {
			num1 = num1 + num2;
            num2 = num1 - num2;
          if(n==num1) {
        	  System.out.println("O número pertence á sequência de Fibonacci.");
        	  System.exit(0);
          }
        }
      	  System.out.println("O número não pertence á sequência de Fibonacci.");
	}

}
