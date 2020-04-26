import java.io.*;
import java.util.*;
class sortByComparator {
	public static void main(String[] args) {
		int[] playerId = new int[] {1,2,3};
		int[] goals = new int[] {2,1,4};
		String[] name = new String[] {"Mane", "Salah", "Bobby"};
		ArrayList<PlayerStats> list = new ArrayList<>();
		for (int i=0; i<playerId.length; i++) {
			list.add(new PlayerStats(playerId[i], goals[i], name[i]));
			System.out.println(list.get(i));
			
			
		}
		Collections.sort(list,new Comparator<PlayerStats>() {
			public int compare(PlayerStats player1, PlayerStats player2) {
				return player2.goals - player1.goals;
			}
		});
		
		for (int i=0; i<playerId.length; i++) {
			System.out.println(list.get(i).goals);
			
			
		}
		
		
		
		
		
	}
	
	static class PlayerStats {
		int playerId ;
		int goals;
		String playerName;
		public PlayerStats(int playerId, int goals, String playerName) {
			this.playerId = playerId;
			this.goals = goals;
			this.playerName = playerName;
		}
		public String toString() {
			return this.playerId+" "+this.goals+" "+this.playerName;
		}
	}
}
