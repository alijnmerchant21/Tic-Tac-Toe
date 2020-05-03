/*board1 = bd.substring(0,3);
		board2 = bd.substring(3,6);
		board3 = bd.substring(6,9);
		m = board1.compareTo(x);
		if(m == 0) {
		System.out.println("\n\nWinner is X");	
		return true;
		}*/

import java.util.*;

class tic_tac_toe {

public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";

	public static void clearScreen() {  
	System.out.print("\033[H\033[2J");  
	System.out.flush();  
}

	Scanner sc = new Scanner(System.in);

	boolean b = false;
	boolean b1 = false;
	String board = "123456789";
	String bod;
	String board1;
	String name1,name2;
	char ch = 'X';
	char chx = '0';
	int n,m;

	boolean checkWinner(String bd){
		
		if(bd.charAt(0)==ch && bd.charAt(1)==ch && bd.charAt(2)==ch) {
		System.out.println(ANSI_GREEN + "\n\n\nWinner is " + name1 + "\n\n" + ANSI_RESET);		
		return true;	
		}

		else if(bd.charAt(0)==ch && bd.charAt(4)==ch && bd.charAt(8)==ch) {
		System.out.println(ANSI_GREEN + "\n\n\nWinner is " + name1 + "\n\n" + ANSI_RESET);		
		return true;	
		}

		else if(bd.charAt(0)==ch && bd.charAt(3)==ch && bd.charAt(6)==ch) {
		System.out.println(ANSI_GREEN + "\n\n\nWinner is " + name1 + "\n\n" + ANSI_RESET);	
		return true;	
		}

		else if(bd.charAt(1)==ch && bd.charAt(4)==ch && bd.charAt(7)==ch) {
		System.out.println(ANSI_GREEN + "\n\n\nWinner is " + name1 + "\n\n" + ANSI_RESET);		
		return true;	
		}

		else if(bd.charAt(2)==ch && bd.charAt(5)==ch && bd.charAt(8)==ch) {
		System.out.println(ANSI_GREEN + "\n\n\nWinner is " + name1 + "\n\n" + ANSI_RESET);		
		return true;	
		}

		else if(bd.charAt(2)==ch && bd.charAt(4)==ch && bd.charAt(6)==ch) {
		System.out.println(ANSI_GREEN + "\n\n\nWinner is " + name1 + "\n\n" + ANSI_RESET);
		return true;	
		}

		//X ends here

		else if(bd.charAt(0)==chx && bd.charAt(1)==chx && bd.charAt(2)==chx) {
		System.out.println(ANSI_GREEN + "\n\n\nWinner is " + name2 + "\n\n" + ANSI_RESET);	
		return true;	
		}

		else if(bd.charAt(0)==chx && bd.charAt(4)==chx && bd.charAt(8)==chx) {
		System.out.println(ANSI_GREEN + "\n\n\nWinner is " + name2 + "\n\n" + ANSI_RESET);
		return true;	
		}

		else if(bd.charAt(0)==chx && bd.charAt(3)==chx && bd.charAt(6)==chx) {
		System.out.println(ANSI_GREEN + "\n\n\nWinner is " + name2 + "\n\n" + ANSI_RESET);	
		return true;	
		}

		else if(bd.charAt(1)==chx && bd.charAt(4)==chx && bd.charAt(7)==chx) {
		System.out.println(ANSI_GREEN + "\n\n\nWinner is " + name2 + "\n\n" + ANSI_RESET);	
		return true;	
		}

		else if(bd.charAt(2)==chx && bd.charAt(5)==chx && bd.charAt(8)==chx) {
		System.out.println(ANSI_GREEN + "\n\n\nWinner is " + name2 + "\n\n" + ANSI_RESET);	
		return true;	
		}

		else if(bd.charAt(2)==chx && bd.charAt(4)==chx && bd.charAt(6)==chx) {
		System.out.println(ANSI_GREEN + "\n\n\nWinner is " + name2 + "\n\n" + ANSI_RESET);	
		return true;	
		}

	return false;
	}

	boolean user1() {
		//clearScreen();
		StringBuilder boardx = new StringBuilder(board);

		System.out.println(ANSI_YELLOW + "\n\n\n" + name1 + " enter a position to insert X\n" + ANSI_RESET);
		n = sc.nextInt();

				boardx.setCharAt(n-1, ch); 
				bod = boardx.toString();
				clearScreen();
				board = createBoard(bod);
				b = checkWinner(board);
				if(b == true) {
					return true;
				}

		//clearScreen();		
		return false;		
	}

	boolean user2() {

		//clearScreen();
		StringBuilder boardx = new StringBuilder(board);

			System.out.println(ANSI_BLUE + "\n\n\n" + name2 + " enter a position to insert 0\n" + ANSI_RESET);
			n = sc.nextInt();

				boardx.setCharAt(n-1, chx); 
				bod = boardx.toString();
				clearScreen();
				board = createBoard(bod);
				b = checkWinner(board);
				if(b == true) {
					return true;
				}

		//clearScreen();		
		return false;
	}

	String createBoard(String s) {
	System.out.println("\n");
	System.out.println("\n");
	int i = 0;

		System.out.print("\t\t\t\t\t");
		while(i!=3) {
			if(s.charAt(i)==ch) {
				System.out.print(ANSI_YELLOW + s.charAt(i) + ANSI_RESET);
				System.out.print("\t");
			}
			else if(s.charAt(i)==chx) {
				System.out.print(ANSI_BLUE + s.charAt(i) + ANSI_RESET);
				System.out.print("\t");
			}
			else {
			System.out.print(s.charAt(i));
			System.out.print("\t");
			}
		i++;
		}
	System.out.println("\n");
	System.out.print("\t\t\t\t\t");
		while(i!=6) {
			if(s.charAt(i)==ch) {
				System.out.print(ANSI_YELLOW + s.charAt(i) + ANSI_RESET);
				System.out.print("\t");
			}
			else if(s.charAt(i)==chx) {
				System.out.print(ANSI_BLUE + s.charAt(i) + ANSI_RESET);
				System.out.print("\t");
			}
			else {
			System.out.print(s.charAt(i));
			System.out.print("\t");
			}
		i++;
		}
	System.out.println("\n");
	System.out.print("\t\t\t\t\t");
		while(i!=9) {
			if(s.charAt(i)==ch) {
				System.out.print(ANSI_YELLOW + s.charAt(i) + ANSI_RESET);
				System.out.print("\t");
			}
			else if(s.charAt(i)==chx) {
				System.out.print(ANSI_BLUE + s.charAt(i) + ANSI_RESET);
				System.out.print("\t");
			}
			else {
			System.out.print(s.charAt(i));
			System.out.print("\t");
			}
		i++;
		}
		return s;
	}	


	public static void main(String a[]) {

	tic_tac_toe t = new tic_tac_toe();
	

		clearScreen();
		System.out.println(ANSI_CYAN + "Welcome to Tic - Tac - Toe" + ANSI_RESET);

		System.out.println(ANSI_YELLOW + "\n\nUser 1 enter your name\n" + ANSI_RESET);
		t.name1 = t.sc.nextLine();

		System.out.println(ANSI_BLUE + "\n\nUser 2 enter your name\n" + ANSI_RESET);
		t.name2 = t.sc.nextLine();

		clearScreen();

		System.out.println("Welcome " + ANSI_YELLOW + t.name1 + ANSI_RESET + " & " + ANSI_BLUE + t.name2 + ANSI_RESET);

	System.out.println("\n");
	System.out.println("\n");

	t.createBoard(t.board);

		for(int i=0; i<9; i++) {

			if(t.b1 == true) {
				break;
			}

			if(i==0||i==2||i==4||i==6) {
				t.b1 = t.user1();
				
			}

			if(i==1||i==3||i==5||i==7) {
				t.b1 = t.user2();
			}

			if(i==8) {
			System.out.println("\n\n\n Game is draw.");
			}
		}	

	}		
}

/*class tic_tac_toe{
	public static void main(String a[]) {
		String bd = "123456789";

		if(bd.charAt(0)==1 && bd.charAt(4)==5 && bd.charAt(8)==9 || bd.charAt(0)==6 && bd.charAt(4)==5 && bd.charAt(8)==9) {
			System.out.println("This works!!");
		}

		else {
			System.out.println("FO");
		}
	}
}*/







