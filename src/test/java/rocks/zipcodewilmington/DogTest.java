package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    Dog dog=new Dog("rocky",new Date(),12);
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void setNameTest1(){
        //given
        String exp="rocky";
        //when
        dog.setName(exp);
        String actDogName=dog.getName();
        //then
        Assert.assertEquals(exp, actDogName);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        //given
        String expected="bark!";
        //when
        String actual=dog.speak();
        //then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDate(){
        //given

        //when
        dog.setBirthDate(new Date());
        Date expectedDOB=new Date();
        Date actualDate=dog.getBirthDate();
        System.out.println("Actual date:"+actualDate);
        //given
        Assert.assertEquals(expectedDOB,actualDate);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        //given
        int expMeal=1;
        Food food=new Food();
        //when
        dog.eat(food);
        int meals =dog.getNumberOfMealsEaten();
        //then
        Assert.assertEquals(expMeal,meals);

    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {
        //given
        Integer expId = 12;
        //when
        Integer actualId = dog.getId();
        //then
        Assert.assertEquals(expId,actualId);

    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void instanceofTest(){
        Assert.assertTrue(dog instanceof Animal);

    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceTest(){
        Assert.assertTrue(dog instanceof Animal);

    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        System.out.println("set name test:"+dogName);
        Assert.assertEquals(dogName, givenName);
    }
}
