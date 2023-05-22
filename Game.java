package Game;

import java.util.Scanner;

public class Game {
public static String ComputerAnswer(String[] options) {
		
		String result= options[(int) (Math.random() * options.length)];
		
		return result;
		
	}
	
	public static String UserAnswer() {
		
		String result;
		Scanner input=new Scanner(System.in);
		System.out.println("Choose your weapon:");
		result=input.nextLine();
		return result;
	}
	
	public static String results(String ComputerAnswer,String UserAnswer) {
		String result;
		
		if(ComputerAnswer.equals(UserAnswer))
			result= "It is a draw!";
		
		else if((ComputerAnswer.equals ("rock") && (UserAnswer.equals ("paper"))) ||
				(ComputerAnswer. equals ("paper") && (UserAnswer.equals ("scissors"))) ||
				(ComputerAnswer.equals ("scissors") && (UserAnswer.equals ("rock"))))
				result="User win";
		else
			result="Computer wins";
	
		return result;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		String[] options={"rock","paper","scissors"};
		
		String ComputerAnswer= ComputerAnswer(options);
		
		System.out.println(ComputerAnswer);
		
		String UserAnswer= UserAnswer();
		
		//System.out.println(useranswer);
		
		String results= results(ComputerAnswer,UserAnswer);
		System.out.println(results);

	}

}

