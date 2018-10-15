
public class DiceSum 
{

	public static void main(String[] args) 
	{
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		int roll1 = die1.roll();
		int roll2 = die2.roll();
		System.out.println("Die 1: " + roll1 + "\tDie 2: " + roll2);
		int totalRoll = 1;
		while(roll1 != roll2)
		{
			roll1 = die1.roll();
			roll2 = die2.roll();
			System.out.println("Die 1: " + roll1 + "\tDie 2: " + roll2);
			totalRoll++;
		}
		
		System.out.println("The dice were rolled " + totalRoll + " times");
	}

}
