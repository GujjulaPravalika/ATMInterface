import java.util.Random;
import java.util.*;
public class NumberGuessing
{
	public static void main(String[] args)
	{
		Random rand=new Random();
		int random_num=rand.nextInt(100)+1;
		//System.out.println("random number is:"+random_num);
		int trycount=0;
		while(true){
		System.out.println("Enter your guess number(1-100):");
		Scanner sc=new Scanner(System.in);
		int guessNum=sc.nextInt();
		trycount++;
		if(guessNum==random_num)
		{
			System.out.println("You WIN! Matched the guess number");
			System.out.println("It took you "+trycount+"tries");
			break;
		}
		else if(guessNum<random_num)
		{
			System.out.println("Nope! the number is higher try again");
		}
		else{
			System.out.println("Nope! the number is lower try again");
		}
		}
	}
}

		
		
		
		