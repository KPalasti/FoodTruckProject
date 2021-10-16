package com.skilldistillery.foodtruck;

public class FoodTruck {
	//This foodTruck class has data
	//including the id
	//which will be generated in a constructor from static field
	//that is incremented as each truck is created
	private static int nextId = 1;
	private int numericId;
	private String name;
	private String type;
	private int rating;
	
	public FoodTruck(String name, String type, int rating) {
		this.numericId = nextId++;
		this.name = name;
		this.type = type;
		this.rating = rating;
	}
	
	public int getNumericId() {
		return numericId;
	}

	public void setNumericId(int numericId) {
		this.numericId = numericId;
	}

	public String getNames() {
		return name;
	}

	public void setNames(String names) {
		this.name = names;
	}

	public String getFoodTypes() {
		return type;
	}

	public void setFoodTypes(String type) {
		this.type = type;
	}

	public int getNumericRating() {
		return rating;
	}

	public void setNumericRating(int rating) {
		this.rating = rating;
	}

	public String toString() {
		String output = "FoodTruck numericId =" + numericId + ", Name=" + name + ", Types=" + type
				+ ", Rating=" + rating + "]";
		return output;
	}
	
//	  public String displayTruck(String truckData) {
//		    truckData = this.toString();
//		    System.out.println(truckData);
//		    return truckData;
//		  }
//		numericId[] numericIdCopy;
//		numericIdCopy = new numericId[num];
		
//	return numericIdCopy;
	
	
}
