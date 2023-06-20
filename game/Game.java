package game;

import java.util.*;

public class Game {
	
	//int user,computer;
	void fun(int number, int random) {
		if(number == 0 || random == 0) {
			System.out.println("tay");
		} else if(number == 1 || random == 1) {
			System.out.println("tay");
		} else if(number == 2 || random == 2) {
			System.out.println("tay");
		} else if(number == 1 || random == 0) {
			System.out.println("You Win");
		} else if(number == 1 || random == 2) {
			System.out.println("You Lose");
		} else if(number == 2 || random == 0) {
			System.out.println("You lose");
		} else if(number == 2 || random == 1) {
			System.out.println("You Win");
		} else if(number == 0 || random == 1) {
			System.out.println("You lose");
		} else if(number == 0 || random == 2) {
			System.out.println("You Win");
		}
		
//		if(user>computer) {
//			return user;
//		} else {
//			return computer;
//		}
	}
	
	public static void main(String[] args) {
		
		Game g = new Game();
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		int ran = random.nextInt(3);
		
		System.out.println("\t \3Hello! Lets Play The Game\3");
		System.out.println("\t ============================");
		
		System.out.println("\n\n What you want (rock, paper, scissor) : ");
		String str = sc.next();
		
		String s1 = "rock";
		String s2 = "paper";
		String s3 = "scissor";
		
		if(str.equals(s1)) {
			g.fun(0, ran);
		} else if(str.equals(s2)) {
			g.fun(1, ran);
		} else if(str.equals(s3)) {
			g.fun(2, ran);
		} else {
			System.out.println("WORNNING : Please Check your Input\n thanyou! play again ");
		}
		
				
	}
}
