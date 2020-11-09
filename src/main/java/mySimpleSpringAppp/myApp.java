

package mySimpleSpringAppp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class myApp {

	public static void main(String[] args)
	{
		//Fruit f =new Fruit();
		//Vegetable v=new Vegetable();
		//ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		ApplicationContext appContext = new ClassPathXmlApplicationContext("myTestPackage/appContext.xml");
		
		Fruit myFruit=appContext.getBean("fruit",Fruit.class);
		
		Fruit myOtherFruit =appContext.getBean("fruitWithName",Fruit.class);
		
		Vegetable myVegetable=(Vegetable)appContext.getBean("vegetable"); 
		
		Vegetable myOtherVegetable=(Vegetable)appContext.getBean("vegetableWithListAndMap"); 
		
		Fruit fruitWithPName=(Fruit)appContext.getBean("fruitPName"); 
		
		System.out.println(myFruit.talkAboutYourself());
		
		System.out.println(fruitWithPName.talkAboutYourself());
		
		System.out.println(myOtherFruit.talkAboutYourself());
		
		System.out.println(myVegetable.talkAboutYourself());
		
		System.out.println(myOtherVegetable.talkAboutYourself());
		
		((ClassPathXmlApplicationContext) appContext).close();
	}

}
