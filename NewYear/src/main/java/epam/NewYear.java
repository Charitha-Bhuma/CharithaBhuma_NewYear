package epam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InitSweets gulabJamun = new InitSweets();
		int n;
		gulabJamun.setWeight(10);
		InitSweets rasgulla = new InitSweets();
		gulabJamun.setWeight(20);
		Munch m = new Munch();
		FiveStar f = new FiveStar();
		Snickers s = new Snickers();
		Map <String, Integer> map = new HashMap<String, Integer>();
		map.put("Munch", 0);
		map.put("Fivestar", 0);
		map.put("Snickers", 0);
		map.put("Gulabjamun", 0);
		map.put("Rasgulla", 0);
		char need = 'y';
		while(need == 'y' ) {
			System.out.println("Choose from 1.munch, 2.fivestar, 3.snickers, 4.gulabjamun, 5.rasgulla");
			System.out.println("Enter your choice");
			n = sc.nextInt();
			switch(n) {
				case 1 : map.put("Munch", map.get("Munch")+1);
						break;
				case 2 : map.put("Fivestar", map.get("Fivestar")+1);
						break;
				case 3 : map.put("Snickers", map.get("Snickers")+1);
						break;
				case 4 : map.put("Gulabjamun", map.get("Gulabjamun")+1);
						break;
				case 5 : map.put("Rasgulla", map.get("Rasgulla")+1);
						break;	
			}
			System.out.println("Are there more sweets or chocolates? (y/n): ");
			need= sc.next().charAt(0);
		}
		double totalWeight = m.calWeight(map.get("Munch")) + f.calWeight(map.get("Fivestar")) + s.calWeight(map.get("Snickers"));
		totalWeight += gulabJamun.calcWeight(map.get("Gulabjamun")); rasgulla.calcWeight(map.get("Rasgulla"));
		System.out.println("Total gift weight: " + totalWeight);
		int quantity = 0;
		System.out.println("Total number of Candies are : ");
		for (String candy : map.keySet()) {
			System.out.println(candy + " : " + map.get(candy));
			quantity += map.get(candy);
		}
		System.out.println("Total number of candies: " + quantity);
	}	
}

