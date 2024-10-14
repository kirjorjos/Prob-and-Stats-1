package chooseYourDoor;

import java.util.Random;

public class ChooseYourDoor {
	
	static final boolean changeDoorPick = true;
	static Random rand = new Random();
	public static void main(String[] args) {
		startSimulation();
	}
	
	public static void startSimulation() {
		int wins = 0;
		for (int i = 0; i<10000; i++) {
			wins += runInstance();	//add 1 if the door is found, 0 if not
		}
		System.out.printf("You won %d times with a percentage chance of %.2f%%.", wins, wins/(float)100);
	}
	
	public static int runInstance() {
		//setup the doors and initial pick
		int[] doors = {0, 0, 0};
		int winLocation = rand.nextInt(3);
		int doorToPick = rand.nextInt(3);
		int lastDoor = 0;
	
		doors[winLocation] = 1;
		if (lastDoor == doorToPick) lastDoor++;
		if (lastDoor == winLocation) lastDoor++;
		
		// reveal lastDoor
		if (changeDoorPick) {
			doorToPick = 3-(doorToPick+lastDoor);
		}
		
		return doors[doorToPick];
	}
}
