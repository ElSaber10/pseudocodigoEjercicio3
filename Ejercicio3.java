import java.util.*;
import java.util.Random;
public class Ejercicio3 {
	public static void main(String[] args){
	int fac = 1, factorialtotal = 0;
	System.out.println("Bienvenido ingrese su numero");
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	for(int i = 1; i < N+1; i++){
		fac = fac * i;
	}
			System.out.println(fac);
}
}
