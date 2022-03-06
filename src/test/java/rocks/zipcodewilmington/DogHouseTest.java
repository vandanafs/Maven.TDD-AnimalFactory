package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;
import java.util.Optional;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

//     DogHouse doggyHouse=new DogHouse();
         Dog rocky=new Dog("rocky",new Date(),100);



    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addTest(){
        //given
        String expected="rocky";
        //when
        DogHouse.add(rocky);
        Dog  actual=DogHouse.getDogById(100);
      //  System.out.println("actual -->"+actual.getName()+actual.getId()+actual.getBirthDate());
        //then
       Assert.assertEquals(expected,actual.getName());
    }
    // TODO - Create tests for `void remove(Integer id)`
      @Test
      public void removeByIDTest(){
        //given

          //when
          Dog actual=DogHouse.remove(100);

          //then
          Assert.assertEquals(null,actual);

      }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeTest( ){
        //when
        DogHouse.remove(rocky);
       //then
        Dog  actual=DogHouse.getDogById(100);
        Assert.assertEquals(null,actual);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest(){
        //given
        String expected="rocky";
        //when
        DogHouse.add(rocky);
        Dog  actual=DogHouse.getDogById(100);
        //  System.out.println("actual -->"+actual.getName()+actual.getId()+actual.getBirthDate());
        //then
        Assert.assertEquals(expected,actual.getName());
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogsTest(){
        //given
       Integer expDog=1;
        //when
        DogHouse.add(rocky);
        Integer actual =DogHouse.getNumberOfDogs();
        System.out.println(actual);

        //then
        Assert.assertEquals(expDog, actual);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
