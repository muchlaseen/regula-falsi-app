package app.falsi.regula;

public class App {

	public static void main(String[] args) {
		
		Fungsi fungsi = new Fungsi(-1, 3);
		RegulaFalsi regulaFalsi = new RegulaFalsi(fungsi);
		
		regulaFalsi.solveFx();
		
		
	}
}
