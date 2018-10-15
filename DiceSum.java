
public class DiceSum 
{

	public static void main(String[] args) 
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int roll1 = dice1.roll();
		int roll2 = dice2.roll();
		System.out.println("Die 1: " + roll1 + "\tDie 2: " + roll2);
		int totalRoll = 1;
		while(roll1 != roll2)
		{
			roll1 = dice1.roll();
			roll2 = dice2.roll();
			System.out.println("Die 1: " + roll1 + "\tDie 2: " + roll2);
			totalRoll++;
		}
		
		System.out.println("The dice were rolled " + totalRoll + " times");
	}

}
