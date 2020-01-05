package chap14;

import java.util.*;

public class problem6 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		deck.shuffle();
		List<Player> list = Arrays.asList(
											 new Player("타짜",deck.pick(),deck.pick()),
											 new Player("고수",deck.pick(),deck.pick()),
											 new Player("중수",deck.pick(),deck.pick()),
											 new Player("하수",deck.pick(),deck.pick()),
											 new Player("물주",deck.pick(),deck.pick())
											 );
		
		TreeMap<Player,Integer> rank = new TreeMap<Player,Integer>(new Comparator<Player>() {
			
			
			public int compare(Player p1, Player p2) {
				int result = p1.getPoint() - p2.getPoint();
				if(result == 0) {
					result = p1.name.compareTo(p2.name);
				}
				return result;
			}
		});

		for(Player p : list) {
			rank.put(p,p.getPoint());
		}
		System.out.println(rank);
	}
}
