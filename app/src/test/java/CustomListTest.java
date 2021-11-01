import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;
import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class CustomListTest {

    static CustomList list;

    @Before
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
        list.addCity(c);
        assertTrue(list.hasCity(c));
    }
}
