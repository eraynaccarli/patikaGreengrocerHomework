import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
	
		
		System.out.println("##### Welcome to Greengrocer ######\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many kilograms of pears?");
		String inputPears = sc.nextLine();
		Double parsePears = Double.parseDouble(inputPears);
		
		System.out.println("How many kilograms of apples?");
		String inputApples = sc.nextLine();
		Double parseApples = Double.parseDouble(inputApples);
		
		System.out.println("How many kilograms of tomatoes?");
		String inputTomatoes = sc.nextLine();
		Double parseTomatoes = Double.parseDouble(inputTomatoes);
		
		System.out.println("How many kilograms of bananas?");
		String inputBananas = sc.nextLine();
		Double parseBananas = Double.parseDouble(inputBananas);
		
		// Patlýcan'dan sonra bir daha input giriþi olmayacaðý için parse etmeden direk double olarak aldýk.
		System.out.println("How many kilograms of eggplants?");
		Double inputEggplant = sc.nextDouble();
		
		Greengrocer greengrocer = new Greengrocer();
		
		double kilogramsOfPears =  greengrocer.calculatePear(parsePears);
		
		double kilogramsOfApples =  greengrocer.calculateApple(parseApples);
		
		double kilogramsOfTomatoes = greengrocer.calculateTomato(parseTomatoes);
		
		double kilogramsOfBananas = greengrocer.calculateBanana(parseBananas);
		
		double kilogramsOfEggplant = greengrocer.calculateEggplant(inputEggplant);
		
		double total = kilogramsOfPears + kilogramsOfApples + kilogramsOfTomatoes + kilogramsOfBananas + kilogramsOfEggplant;
		System.out.println(
					"Price of pears -- > " + kilogramsOfPears + "\n"
					+ "Price of apples -- > " + kilogramsOfApples + "\n" 
					+ "Price of tomatoes -- > " + kilogramsOfTomatoes  + "\n"
					+ "Price of bananas -- > " + kilogramsOfBananas + "\n"
					+ "Price of eggplant -- > " + kilogramsOfEggplant+ "\n"
					+ "Total --- > " + total);
	}
	
	
	
	

}
