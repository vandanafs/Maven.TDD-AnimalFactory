package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;
import java.util.Optional;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    //     CatHouse CatgyHouse=new CatHouse();
    Cat meme=new Cat("meme",new Date(),100);



    // TODO - Create tests for `void add(Cat Cat)`
    @Test
    public void addTest(){
        //given
        String expected="meme";
        //when
        CatHouse.add(meme);
        Cat  actual=CatHouse.getCatById(100);
        //  System.out.println("actual -->"+actual.getName()+actual.getId()+actual.getBirthDate());
        //then
        Assert.assertEquals(expected,actual.getName());
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeByIDTest(){
        //given

        //when
        Cat actual=CatHouse.remove(100);

        //then
        Assert.assertEquals(null,actual);

    }
    // TODO - Create tests for `void remove(Cat Cat)`
    @Test
    public void removeTest( ){
        //when
        CatHouse.remove(meme);
        //then
        Cat  actual=CatHouse.getCatById(100);
        Assert.assertEquals(null,actual);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest(){
        //given
        String expected="meme";
        //when
        CatHouse.add(meme);
        Cat  actual=CatHouse.getCatById(100);
        //  System.out.println("actual -->"+actual.getName()+actual.getId()+actual.getBirthDate());
        //then
        Assert.assertEquals(expected,actual.getName());
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest(){
        //given
        Integer expCat=2;
        //when
        CatHouse.add(meme);
        Integer actual =CatHouse.getNumberOfCats();
        System.out.println(actual);

        //then
        Assert.assertEquals(expCat, actual);
    }

    @Test
    public void testGetNumberOfCats() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        CatHouse.getNumberOfCats();
    }
}
