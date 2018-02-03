import animal.Animal;
import animal.Cat;
import animal.Dog;

public class TestingAnimal {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		a1.getType(); a1.getSound();
		a2.getType(); a2.getSound();

	}

}
