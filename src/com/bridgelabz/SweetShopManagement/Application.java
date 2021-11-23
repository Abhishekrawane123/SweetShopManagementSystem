package com.bridgelabz.SweetShopManagement;

import java.util.Scanner;

//import javax.management.InvalidApplicationException;

public class Application {
	
	final static int EXIT_VALUE = 7;
	
	SweetStore sweetStore = new SweetStore();

	public static void main(String[] args) {

		System.out.println("welcome to the sweet shop");
		Application application = new Application();

		UserInterface userInterface = new UserInterface();
		while(true) {
			int input = userInterface.showUserMenu();

			application.handleUserSelection(input);
			if(input == EXIT_VALUE) {
				break;
			}
		}
		System.out.println(".......THE END .......");
	}

	private void handleUserSelection(int input) {
		
		UserInterface userInterface = new UserInterface();
		Scanner scanner = new Scanner(System.in);

		switch (input) {
			case 1:
				Laddu laddu = new Laddu();
				laddu.price = 200;
				Motichur mothichur = new Motichur();
				Motichur mothichur2 = new Motichur();
				mothichur2.price = 250;

				mothichur.price = 250;
				Gulabjam gulabJam = new Gulabjam();
				gulabJam.price = 300;
	
				sweetStore.add(gulabJam);
				sweetStore.add(laddu);
				sweetStore.add(mothichur);
				sweetStore.add(mothichur2);
				sweetStore.add(mothichur);
				break;
			case 2:
				System.out.println("enter A sweet name : ");
				String sweetName = scanner.nextLine();
				Sweet sweet = sweetStore.getSweet(sweetName);
				sweetStore.delete(sweet);
				break;
			case 3:
				System.out.println("enter A sweet name to edit : ");
				String sweetName1 = scanner.nextLine();
				Sweet sweet1 = sweetStore.getSweet(sweetName1);
				
				sweetStore.updateSweet(sweet1);
				
				break;
			case 4:
				userInterface.printAllSweets(sweetStore.getList());
				break;
			case EXIT_VALUE:
				break;
		}
	}
}