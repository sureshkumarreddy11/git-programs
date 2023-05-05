package Patterns;

class Animal
{
	public void drinkWater()
	{
		System.out.println("Every animal needs water to drink");
	}
	
	public void sound()
	{
		// empty
	}
	
	public void movement()
	{
		// empty
	}
}

class Lion extends Animal
{
	@Override
	public void sound()
	{
		System.out.println("Lion Roars");
	}
	
	@Override
	public void movement()
	{
		System.out.println("Lion Runs/Walks");
	}
	
	public void preyFind()
	{
		System.out.println("Hunt and eat");
	}
	
}

class Snake extends Animal
{
	@Override
	public void sound()
	{
		System.out.println("hsssshhhhhhhhhh");
	}
	
	@Override
	public void movement()
	{
		System.out.println("Nagin Dance");
	}
	
	public void venomUse()
	{
		System.out.println("Venom of snake is also a medicine "
				+ " for certain treatment");
		
		
	}
}

public class A
{
	public static void main(String[] args) 
	{
		Animal animal1 = new Lion();
		animal1.drinkWater();
		animal1.sound();
		animal1.movement();
		
		Lion lion = (Lion) animal1;
		lion.preyFind();
		
		System.out.println("*****************************");
		
		Animal animal2 = new Snake();
		animal2.drinkWater();
		animal2.sound();
		animal2.movement();
		
		((Snake)animal2).venomUse();
		

	}

}

