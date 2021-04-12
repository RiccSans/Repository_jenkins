package geometria;

public class Aree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// calcolare l'area di un triangolo
		System.out.print("L'area del triangolo è: ");
		int altezza=2;
		int base=4;
		System.out.println(triangolo(altezza, base));
		// calcolare l'area di un quadrato
		System.out.print("L'area del quadrato è: ");
		int lato=2;
		System.out.println(quadrato(lato));
		// calcolare l'area di un rombo
	    System.out.print("L'area del rombo è: ");
	    int diagMag=2;
	    int diagMin=5;	    
	    System.out.println(rombo(diagMag, diagMin));
		}
	public static int triangolo(int altezza, int base) {
	  return base*altezza /2;
	}

	public static int quadrato(int lato) {
		return lato*lato;
	}

	public static int rombo(int diagMag,int diagMin) {
		return diagMag*diagMin;
	}
}

