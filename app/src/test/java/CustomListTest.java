import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CustomListTest {

    static CustomList list;

    @BeforeEach
    public void setup(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        City c = new City("Edmonton","AB");
        int size = list.getCount();
        list.addCity(c);
        assertEquals(size+1,list.getCount());
    }

    @Test
    public void hasCityTest(){
        City c = new City("Edmonton","AB");
        assertFalse(list.hasCity(c));
        list.addCity(c);
        assertTrue(list.hasCity(c));
    }

    @Test
    public void deleteCityTest(){
        City c = new City("Edmonton","AB");
        list.addCity(c);
        list.deleteCity(c);
        assertFalse(list.hasCity(c));
        assertThrows(IllegalArgumentException.class,
                ()->{list.deleteCity(c);});
    }

    @Test
    public void countCitiesTest(){
        City c = new City("Edmonton","AB");
        assertEquals(0,list.countCities());
        list.addCity(c);
        assertEquals(1,list.countCities());
    }
}
