import java.util.Scanner;
public class CarroA {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double custo,impostos = 45,distribuidor = 28,cauculoimposto,cauculodistri,custofinal;
System.out.println("Digite o custo do carro: ");
custo = scanner.nextDouble();

if(custo > 0) {
	cauculoimposto = (custo * impostos)/100;
	cauculodistri = (custo * distribuidor)/100;
	custofinal = cauculoimposto + cauculodistri;
	
	System.out.println("Seu custo final é "+custofinal);
}

	}

}
