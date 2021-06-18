package game;

import java.util.Scanner;

import fixtures.fixture;
import fixtures.Interactable;
import fixtures.Room;

public class Input {
	@SuppressWarnings("unused")
	public static Object printRoom(Player player) {
		String room = null;
		if (room == "Kitchen") {
			Object[] exits = null;
			return exits[0];
		}
		else {
			return null;
		}
	}
	public static String[] collectInput() {
		    Scanner reader = new Scanner(System.in);  
		    System.out.println("Enter a room: ");
		    int n = reader.nextInt();
		    System.out.println(n);
		    reader.close();
			return null; }
	public static void parse(String[] input, Player player) {
		// TODO Auto-generated method stub
		
	}

		}