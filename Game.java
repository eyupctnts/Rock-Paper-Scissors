package Game;

import java.util.Scanner;

public class Game {
public static String computeranswer(String[] options) {
		
		String result= options[(int) (Math.random() * options.length)];
		
		return result;
		
	}
	
	public static String Useranswer() {
		
		String result;
		Scanner input=new Scanner(System.in);
		System.out.println("Choose your weapon:");
		result=input.nextLine();
		return result;
	}
	
	public static String results(String computeranswer,String useranswer) {
		String result;
		
		if(computeranswer.equals(useranswer))
			result= "It is a draw!";
		
		else if((computeranswer.equals ("rock") && (useranswer.equals ("paper"))) ||
				(computeranswer. equals ("paper") && (useranswer.equals ("scissors"))) ||
				(computeranswer.equals ("scissors") && (useranswer.equals ("rock"))))
				result="User win";
		else
			result="Computer wins";
	
		return result;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		String[] options={"rock","paper","scissors"};
		
		String computeranswer= computeranswer(options);
		
		System.out.println(computeranswer);
		
		String useranswer= Useranswer();
		
		//System.out.println(useranswer);
		
		String results= results(computeranswer,useranswer);
		System.out.println(results);

	}

}

