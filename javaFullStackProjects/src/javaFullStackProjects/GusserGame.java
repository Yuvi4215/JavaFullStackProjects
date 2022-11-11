package javaFullStackProjects;
import java.util.Scanner;
class Guesser{
int guess;
	int guesser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press:1 to input the Guess from user input:"+'\n'+"Press:2 to get Computer genrated Guess:");
		byte valve= sc.nextByte();
		if(valve==1) {
			System.out.println("Guesser please input your number: "+'\n'+"Input number should be withine the range of 1 to 9");
			guess= sc.nextInt();
			if(guess<10 && guess>0) {
				return guess;
			}else {
				System.out.println("Input is invalid");
				return 0;
			}
	}else if(valve==2) {
		guess= (int)(Math.random()*10);
		if(guess==0) {
			return 1;
		}
		else {
			return guess;
		}
	}{
		System.out.println("Input is Invalid");
		return 0;
	}
}
}
class Player{
	int[] input(int i) {
		Scanner sc= new Scanner(System.in);
		int[] players = new int[i];
		for(int j=0;j<i;j++) {
			System.out.println("Player number:"+(j+1)+" input your guess.");
			players[j]= sc.nextInt();
		}
		return players;
	}
}
class Umpire{
	int gNum;
	int pnum;
	int count=0;
	
	void collection_result(int i) {
		Guesser g= new Guesser();
		gNum= g.guesser();
		if(gNum==0) {
			System.out.println("Programm is terminated.");
		}else {
			int index= i;
			Player p= new Player();
			int[] players=p.input(index);
		for(int z=0; z<players.length;z++) {
			if(gNum == players[z]) {
				System.out.println("Player number:"+(z+1)+" have Guessed number right.");
			count++;
			}
		}
		if(count==0) {
			System.out.println("Guessed number was: "+gNum);
			System.out.println("All playes lost.");
		}		
		}
	
	}
}


public class GusserGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter:1 to continue "+'\n'+"Enter:2 to Exit");
		int valve= sc.nextInt();
		switch(valve){
		case 1:{
			do {
				System.out.println();
				System.out.println();
				Umpire u= new Umpire();
				System.out.println("Input number of players");
				int i= sc.nextInt();
				u.collection_result(i);
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("Enter following command"+'\n'+"1: --> to continue"+'\n'+"2: --> to Exit");
				int condition=sc.nextInt();
				if(condition==1) {
				continue;
				}else {
				break;
				}
				
			}while(true);
		break;
		}
		case 2:
		{
			System.out.println("Program exit succesfull ");
			break;
		}
		default:
			System.out.println("Invalid Input ");
		}
	}

}
