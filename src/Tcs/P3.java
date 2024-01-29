package Tcs;

import java.util.*;
//11
//Sachin
//10
//state
//One day
//12
//Shewag
//133
//state
//One day
//13
//Varun
//78
//State
//One day
//14
//Ashwin
//67
//State
//One day
//state
//one day
class Player {
	private int playerId;
	private String playerName;
	private int runs;
	private String playerType;
	private String matchType;

	public int getplayerId() {
		return playerId;
	}

	public void setplayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getplayerName() {
		return playerName;
	}

	public void setplayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getruns() {
		return runs;
	}

	public void setruns(int runs) {
		this.runs = runs;
	}

	public String getplayerType() {
		return playerType;
	}

	public void setplayerType(String playerType) {
		this.playerType = playerType;
	}

	public String getmatchType() {
		return matchType;
	}

	public void setmatchType(String matchType) {
		this.matchType = matchType;
	}

	Player(int playerId, String playerName, int runs, String playerType, String matchType) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.runs = runs;
		this.playerType = playerType;
		this.matchType = matchType;
	}
}

public class P3 {
	public static int findPlayerWithLowestRuns(Player[] obj, String str_playertype) {
		int min_run = Integer.MAX_VALUE;

		int flag = 0;
		for (int i = 0; i < obj.length; i++) {
			if (obj[i].getruns() < min_run & obj[i].getplayerType().equals(str_playertype)) {
				min_run = obj[i].getruns();
				flag++;
			}

		}
		if (flag == 0) {
			return 0;
		} else {
			return min_run;
		}
	}

	public static int[] findPlayerByMatchType(Player[] obj, String str_matchtype) {
		int[] temp_arr = new int[obj.length];
		int i = 0;
		int flag2 = 0;

		for (int j = 0; j < obj.length; j++) {
			for (int j2 = j + 1; j2 < obj.length; j2++) {
				if (obj[j].getplayerId() != (obj[j2].getplayerId())) {
					while (i < 4) {

						if (str_matchtype.equalsIgnoreCase(obj[i].getmatchType())) {
							temp_arr[i] = obj[i].getplayerId();
							flag2++;
						}
						i++;

					}

				}
			}
		}

		if (flag2 == 0) {
			return null;
		} else {
			Arrays.sort(temp_arr);
			return temp_arr;
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Player[] obj = new Player[4];

		for (int i = 0; i < obj.length; i++) {

			int playerid = sc.nextInt();
			sc.nextLine();
			String playername = sc.nextLine().toLowerCase();

			int run = sc.nextInt();
			sc.nextLine();

			String playertype = sc.nextLine().toLowerCase();
			String matchtype = sc.nextLine().toLowerCase();

			obj[i] = new Player(playerid, playername, run, playertype, matchtype);

		}
		String str_playertype = sc.nextLine().toLowerCase();
		String str_matchtype = sc.nextLine().toLowerCase();
		sc.close();
		int lowruns = findPlayerWithLowestRuns(obj, str_playertype);
		if (lowruns > 0) {
			System.out.println(findPlayerWithLowestRuns(obj, str_playertype));
		} else {
			System.out.println("No such player");
		}
		int[] mt = findPlayerByMatchType(obj, str_matchtype);

		if (findPlayerByMatchType(obj, str_matchtype) != null) {
			for (int i = mt.length - 1; i >= 0; i--) {
				if (mt[i] != 0) {
					System.out.println(mt[i]);
				}
			}

		} else {
			System.out.println("No player with such match type");
		}
	}
}