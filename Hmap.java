import java.util.*;


public class Hmap {

	public static void main(String[] args) {
		HashMap<String, String> Cars = new HashMap<>();
		
		Cars.put("Honda","Civic");
		Cars.put("Nissan","Altima");
		Cars.put("Lexus","LS");
		Cars.put("Lexus","LX");
		Cars.put("Nissan","Centra");
		Cars.put ("Mazda","Millenia");
		Cars.put("Lincoln","Navigator");
		Cars.put("Toyota","Corolla");
		
		System.out.println("What car model are you looking for?");
		Scanner userInput = new Scanner(System.in);
		String car =userInput.nextLine();
	}

}
