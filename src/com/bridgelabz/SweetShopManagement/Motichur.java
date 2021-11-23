package com.bridgelabz.SweetShopManagement;

import java.util.ArrayList;

public class Motichur extends Sweet {
	public Motichur() {
		name = "mothichur";
		shape = Shape.SQUARE;
		colour = Colour.RED;
		ingredients = new ArrayList();
		ingredients.add("sugar");
		ingredients.add("oil");
	}
}