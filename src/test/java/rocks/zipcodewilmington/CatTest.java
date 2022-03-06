package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;
import java.util.HashSet;
import java.util.Optional;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    Cat cat = new Cat("Meme", new Date(), 200);
    // TODO - Create tests for `void setName(String name)`
       @Test
       public void setNameTest(){
           //given
           String exp="cat1";
           //when
            cat.setName(exp);
            String actCatName=cat.getName();
            //then
            Assert.assertEquals(exp, actCatName );
       }
    // TODO - Create tests for `speak`
          @Test
          public void speakTest(){
           //given
           String expected="meow!";
           //when
           String actual=cat.speak();
           //then
              Assert.assertEquals(expected, actual);
          }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDate(){
        //given

        //when
        cat.setBirthDate(new Date());
         Date expectedDOB=new Date();
        Date actualDate=cat.getBirthDate();
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
           cat.eat(food);
           int meals =cat.getNumberOfMealsEaten();
           //then
           Assert.assertEquals(expMeal,meals);
           
       }
    // TODO - Create tests for `Integer getId()`
    @Test
      public void getIdTest() {
        //given
        Integer expId = 200;
        //when
        Integer actualId = cat.getId();
        //then
       Assert.assertEquals(expId,actualId);

    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void instanceofTest(){
           Assert.assertTrue(cat instanceof Animal);
           
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
         @Test
         public void inheritanceTest(){
           Assert.assertTrue(cat instanceof  Animal);
         }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
      Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
