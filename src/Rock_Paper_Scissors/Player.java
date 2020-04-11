package Rock_Paper_Scissors;
import java.util.Random;
import java.util.Scanner;
public class Player {
	private String name;// Represents the Players name
	Scanner sc = new Scanner(System.in);
	Player()
	{
		askName();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void askName() {// Will let the user enter his name
		System.out.println("Please enter your name");
		name = sc.next();
	}

	public int getInput() {
		Random random = new Random();
		int input = random.nextInt(3) + 1;
		return input;
	}
}
