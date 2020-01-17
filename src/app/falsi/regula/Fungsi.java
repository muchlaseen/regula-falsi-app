package app.falsi.regula;

public class Fungsi {

	private double firstInterval;
	private double secondInterval;
	private double resultFx;
	
	public Fungsi(double firstInterval, double secondInterval) {
		this.firstInterval = firstInterval;
		this.secondInterval = secondInterval;
	}

	public double getFirstInterval() {
		return firstInterval;
	}

	public double getSecondInterval() {
		return secondInterval;
	}

	public double getResultFx(double x) {
		return resultFx = 4*(Math.pow(x, 3)) - 15*(Math.pow(x, 2)) + 17*(x) - 6;
		
	}
	
	public String toStr() {
		return
				"f(" + firstInterval + ")" + " = " + getResultFx(firstInterval) + "\n"
						+ "f(" + secondInterval + ")" + " = " + getResultFx(secondInterval);
	}
	
}
