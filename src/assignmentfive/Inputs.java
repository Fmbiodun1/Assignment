package assignmentfive;

import java.util.Random;
/**
 * @author IFEOMA LORRITA UDEAGBARA
 * ID:3065737
 * DATE: 15-FEB-2023
 */

public class Inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names =  {

				"Michael",
				"Scot",
				"John",
				"Mike",
		"Justin"};

		String[] phrases = {

				"Would I rather be feared or loved?.",
				"I'm not superstitious. But I am a little stitious.",
				"I like waking up to the smell of bacon.",
				"Wikipedia is the best thing ever.",
		"Mo' money, mo' problems."};

		Random r = new Random();
		int idx = r.nextInt(names.length);
		int ids = r.nextInt(phrases.length);

		System.out.println("As"+" "+ names[idx]+ " "+ "once said");
		System.out.println(phrases[ids]);

	}
}












