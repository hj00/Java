package oop.exam3;

public class AnimalLover extends Human {
	private String animalType;
	private int aYear;
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	public int getaYear() {
		return aYear;
	}
	public void setaYear(int aYear) {
		this.aYear = aYear;
	}
	@Override
	public String toString() {
		return super.toString() + "\n" + 
	           "키우는 동물은 " + animalType + "이며\n" + 
				aYear + "생 입니다.";
	}

}
