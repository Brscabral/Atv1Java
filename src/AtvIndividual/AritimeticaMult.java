package AtvIndividual;

public class AritimeticaMult {
private float num1=0;
private float num2=0;

public float getNum1() {
	return this.num1;
}
public void setNum1(float num1) {
	this.num1 = num1;
}

public float getNum2() {
	return this.num2;
}
public void setNum2(float num2) {
	this.num2 = num2;
}

public float mostrarMult() {
	float result = (this.num1 * this.num2);
	return result;
}
}
