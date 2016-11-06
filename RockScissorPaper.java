class RockScissorPaper{ 
	String player1, player2; 
	 
	public RockScissorPaper(String player1, String player2) { 
		this.player1 = player1; 
		this.player2 = player2; 
		 
		rspPlay(player1, player2); 
	} 
	 
 public void rspPlay(String player1, String player2) { 
		if (player1.equals("scissor")) { 
			if (player2.equals("rock")) 
				System.out.println("player2 won"); 
			else if (player2.equals("paper")) 
				System.out.println("player1 won"); 
			else 
				System.out.println("oh, draw!"); 
		} 
		else if (player1.equals("rock")) { 
			if (player2.equals("paper")) 
				System.out.println("player2 won"); 
			else if (player2.equals("scissor")) 
				System.out.println("player1 won"); 
			else 
				System.out.println("oh, draw!"); 
		} 
		else { 
			if (player2.equals("scissor")) 
				System.out.println("player2 won"); 
			else if (player2.equals("rock")) 
				System.out.println("player1 won"); 
			else 
				System.out.println("oh, draw!"); 
		} 
	} 
	 
	public static void main(String[] args) { 
		String player1 = "scissor"; 
		String player2 = "rock"; 
		 
		System.out.println("player1 = " + player1 + ", player2 = " + player2); 
		RockScissorPaper rps = new RockScissorPaper(player1, player2); 
	} 
} 
