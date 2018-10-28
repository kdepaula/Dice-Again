
public class DiceArray 
{

	public static void main(String[] args) 
	{
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		int[] value = new int[13];
		for(int i = 0; i<1000; i++)
		{
			int roll1 = die1.roll();
			int roll2  = die2.roll();
			int sumRolls = roll1 + roll2;
			
			for(int a = 2; a<13; a++)
			{
				if(sumRolls == a)
				{
				value[a] += 1;
				}
			}
			
		}
			
		System.out.println("Number of times each number was rolled:" + "\n2:" + value[2] + " \n3:" + value[3] + " \n4:" + value[4] + " \n5:" + value[5] + 
		" \n6:" + value[6] + " \n7:" + value[7] + " \n8:" + value[8] + " \n9:" + value[9] + " \n10:" + value[10] + " \n11:" + value[11] + " \n12:" + value[12]);
	}
}


