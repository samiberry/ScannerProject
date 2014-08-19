import java.util.Scanner;

public class ScannerProjectClass
	{

	public static void main(String[] args)
		{
		Scanner questions = new Scanner (System.in);
		int color;
		double awesome;
		String phone;
		System.out.println("Hey, What is your height?");
		awesome = questions.nextDouble();
		System.out.println("Wow you have a good height.");
		System.out.println("What is your favorite NFL team?");
		phone = questions.nextLine();
				if (questions.equals("Broncos"))
				System.out.println("I agree good choice, I think we can become good friends.");
				else
					System.out.println("I'm sorry you opinion is invalid");
			{
			
			}

		}

	}
