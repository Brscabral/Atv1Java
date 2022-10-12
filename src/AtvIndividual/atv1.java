package AtvIndividual;

public class atv1 {
public static void main(String[] args) {
	System.out.println("Olá, mundo!");
	AritimeticaSoma arts = new AritimeticaSoma();
	AritimeticaMult artm = new AritimeticaMult();
	arts.setNum1(10);
	arts.setNum2(3);
	
	artm.setNum1(3);
	artm.setNum2(5);
	
	System.out.println(arts.getNum1() + arts.getNum2());
	System.out.println(arts.somaNumeros());
	System.out.println(artm.getNum1() * artm.getNum2());
	System.out.println(artm.mostrarMult());
	
	
	
}
}
