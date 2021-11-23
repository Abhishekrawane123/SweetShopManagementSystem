package com.bridgelabz.SweetShopManagement;

import java.util.ArrayList;

public class Gulabjam extends Sweet {
	public Gulabjam(){
		name = "gulabjam";
		shape = Shape.ROUND;
		colour = Colour.ORANGE;
		ingredients = new ArrayList();
		ingredients.add("sugar");
		ingredients.add("oil");
	}
}