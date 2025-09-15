package lab7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction() {
		numerator = 0;
		denominator = 1;
	}
	public Fraction(int n) {
		numerator = n;
		denominator = 1;
	}
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}
	public int getNumerator(){
		return numerator;
	}
	public int getDenominator(){
		return denominator;
	}
	public double toDecimal() {
		return (((double)(numerator))/((double)(denominator)));
	}
	public Fraction simplify() {
		int a = numerator;
		int b = denominator;
		int a2 = numerator;
		int b2 = denominator;
		int count = 2;
		if(b % a == 0) {
			b2 = b/a;
			a2 = 1;
		}
		else {
			for(int i = 1; i < a; i ++) {
				if(b % i == 0 && a % i == 0) {
					b2 = b/i;
					a2 = a/i;
				}
			}
		}
		Fraction f3 = new Fraction(a2, b2);
		return f3;
	}
	@Override
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	public boolean equals(Fraction f) {
		Fraction f1 = simplify();
		Fraction f2 = f.simplify();
		if((f1.getNumerator() == f2.getNumerator()) && (f1.getDenominator() == f2.getDenominator())) {
			return true;
		}
		
		else
			return false;
	}
}
