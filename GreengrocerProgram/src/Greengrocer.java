
public class Greengrocer {
	
	// deðiþkenlerimizi private tanýmlayarak dýþarýdan eriþime kapadýk
	private double pear = 2.14;
	
	private double apple = 3.67;
	
	private double tomato = 1.11;
	
	private double banana = 0.95;
	
	private double eggplant = 5.0;

	
	
	public double calculatePear(double kilogram) {
		return pear * kilogram;
	}
	
	public double calculateApple(double kilogram) {
		return apple * kilogram;
	}
	
	public double calculateTomato(double kilogram) {
		return tomato * kilogram;
	}
	
	public double calculateBanana(double kilogram) {
		return banana * kilogram;
	}
	
	public double calculateEggplant(double kilogram) {
		return eggplant * kilogram;
	}
	
	
	// dýþarýdan eriþime ihtiyaç duyulmasý halinde getter ve setter yoluyla dýþarýdan eriþime izin verdik  (BU UYGULAMADA ÖYLE BÝR ÝHTÝYAÇ DUYULMAMAKTADIR O YÜZDEN DEÐÝÞKENLERÝ static ve final þeklinde sabit olarak tanýmlayabilirdik.)
	
	public double getPear() {
		return pear;
	}


	public void setPear(double pear) {
		this.pear = pear;
	}

	public double getApple() {
		return apple;
	}

	public void setApple(double apple) {
		this.apple = apple;
	}

	public double getTomato() {
		return tomato;
	}

	public void setTomato(double tomato) {
		this.tomato = tomato;
	}

	public double getBanana() {
		return banana;
	}

	public void setBanana(double banana) {
		this.banana = banana;
	}

	public double getEggplant() {
		return eggplant;
	}

	public void setEggplant(double eggplant) {
		this.eggplant = eggplant;
	}
	
	
	
	
	
	
	
}
