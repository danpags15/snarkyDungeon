import java.util.*;
public class snarkyDungeon {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random dice = new Random();
		String charName = "";
		String race = "";
		String className = "";
		int strength = 0;
		int dexterity = 0;
		int constitution = 0;
		int intelligence = 0;
		int wisdom = 0;
		int charisma = 0;

		System.out.println("You enter a dungeon to slay a dragon. What is your name?");
		charName = input.nextLine();
		System.out.println("Hello, " + charName + ".");
		Boolean correct = false;
		while (!correct) {
			System.out.println("What is your race?");
			race = input.nextLine();
			correct = raceRoast(race);
		}
		correct = false;
		while (!correct) {
			System.out.println("What is your class?");
			className = input.nextLine();
			correct = classRoast(className);
		}
		System.out.println("Now that we know your character, we can start rolling your stats.");
		int[] rolls = new int[6];
		rolls = statRoll(rolls, dice);
		int[] choosen = new int[5];
		//Here the player choose which scores they want for each ability, but they can't choose the same roll twice.
		choosen[0] = chooseScores(strength, input, choosen);
		strength = rolls[choosen[0]];
		choosen[1] = chooseScores(dexterity, input, choosen);
		dexterity = rolls[choosen[2]];
		choosen[2] = chooseScores(constitution, input, choosen);
		constitution = rolls[choosen[2]];
		choosen[3] = chooseScores(intelligence, input, choosen);
		intelligence = rolls[choosen[3]];
		choosen[4] = chooseScores(wisdom, input, choosen);
		wisdom = rolls[choosen[4]];
		charisma = rolls[chooseScores(charisma, input, choosen)];
		//TODO: Finish the program!
		input.close();
	}
	public static Boolean raceRoast(String race) { //Roasts player based on race
		switch (race) {
			case "human":
				System.out.println("Vanilla thot.");
				return true;
			case "elf":
				System.out.println("Pretty boy bitch.");
				return true;
			case "dwarf":
				System.out.println("You have the proportions of a chode.");
				return true;
			case "halfling":
				System.out.println("If you have half the height of a man, do you also have half the dick?");
				return true;
			case "dragonborn":
				System.out.println("You would make a good pair of boots.");
				return true;
			case "Gnome":
				System.out.print("You should get a stick shoved up your ass and tied down in a garden somewhere.");
				return true;
			case "tiefling":
				System.out.println("Your mum such a whore that she fooked a demon, huh?");
				return true;
			case "half orc":
				System.out.println("Go see an orthodonist, greenskin. Christ...");
				return true;
			case "half elf":
				System.out.println("Half elf, half man, all gay.");
				return true;
			default:
				System.out.println("That's not a race, tit head.");
				return false;
		}
	}
	public static Boolean classRoast(String className) { //Roasts player based on class
		switch (className) {
			case "barbarian":
				System.out.println("How are you even playing this? You can't read!");
				return true;
			case "bard":
				System.out.println("Serenade me. Bitch.");
				return true;
			case "cleric":
				System.out.println("Molested any boys recently?");
				return true;
			case "druid":
				System.out.println("Try to take enough breaks from smoking shrooms to actually finish the quest, okay?");
				return true;
			case "fighter":
				System.out.println("Is that giant weapon supposed to make up for your tiny penis?");
				return true;
			case "monk":
				System.out.println("Do you beat your enemies as hard as you beat your meat?");
				return true;
			case "paladin":
				System.out.println("Damn, the fun police have arrived.");
			case "ranger":
				System.out.println("We all know you picked ranger because you want to be the next Aaragon from freaking Lord of the Rings.");
				return true;
			case "rogue":
				System.out.println("Do you hide in the closet too?");
				return true;
			case "sorcerer":
				System.out.println("Your grandfather was a toad.");
				return true;
			case "warlock":
				System.out.println("More like warcock! Hahaha... ha.");
				return true;
			case "wizard":
				System.out.println("Ah, a 30 year old virgin. I see.");
				return true;
			default:
				System.out.println("That's not a class, tit head.");
				return false;
		}
	}
	public static int[] statRoll(int[] rolls, Random dice) { //A roll is equal to 4 d6's, removing the lowest
		int r1;
		int r2;
		int r3;
		int r4;
		for (int i = 0; i < rolls.length; i++) {
			r1 = (dice.nextInt(6) + 1);
			r2 = (dice.nextInt(6) + 1);
			r3 = (dice.nextInt(6) + 1);
			r4 = (dice.nextInt(6) + 1);
			if (r1 <= r2 && r1 <= r3 && r1 <= r4) {
				rolls[i] = r2 + r3 + r4;
			} else if (r2 <= r1 && r2 <= r3 && r2 <= r4) {
				rolls[i] = r1 + r3 + r4;
			} else if (r3 <= r1 && r3 <= r2 && r3 <= r4) {
				rolls[i] = r1 + r2 + r4;
			} else {
				rolls[i] = r1 + r2 + r3;
			}
			System.out.println("Roll " + (i + 1) + ": " + rolls[i]);
		}
		return rolls;
	}
	public static int chooseScores(int strength, Scanner input, int[] choosen) {
		int choice = 10;
		Boolean repick = true; //TODO: broken code
		while (repick = true) {
			System.out.println("Which roll do you want to use for " + strength + "? (Enter in only the number of the roll");
			int choice = input.nextInt();
		}
		return choice;
	}
	public static void characterSheet(String name, String race, String className, int str, int dex, int con, int intl, int wis, int cha) {
		//TODO: Make it so that if the player wants to, they can see their character sheet printed out.
	}
}
