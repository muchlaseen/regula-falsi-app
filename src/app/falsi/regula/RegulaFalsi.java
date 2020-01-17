package app.falsi.regula;

import java.text.DecimalFormat;

public class RegulaFalsi {

	private Fungsi fungsi;
	private double x0;
	private double x1;
	
	public RegulaFalsi(Fungsi fungsi) {
		this.fungsi = fungsi;
	}
	
	public void solveFx() {
		
		DecimalFormat df = new DecimalFormat("#0.00000");
		
		x0 = fungsi.getFirstInterval();
		x1 = fungsi.getSecondInterval();

		for (int i = 0; i < 10; i++) {
			System.out.println("# Iterasi: " + (i+1));
			double x2 =  x1 - fungsi.getResultFx(x1)*(x1-x0) / (fungsi.getResultFx(x1) - fungsi.getResultFx(x0));
			if (fungsi.getResultFx(x1) * fungsi.getResultFx(x2) < 0) {
				x0 = x2;
				System.out.println("f" + "(" + df.format(x0) + ")" + " = " + df.format(fungsi.getResultFx(x0)) + "\n");
			} else {
				x1 = x2;
				System.out.println("f" + "(" + df.format(x1) + ")" + " = " + df.format(fungsi.getResultFx(x1))+ "\n");
			}

		}
			
	}
		
		
}