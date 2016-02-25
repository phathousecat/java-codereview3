import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;
import java.util.Arrays;

public class StylistTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void getStylist_returnsNameOfStylist_true() {
    Stylist newStylist = new Stylist("Mary");
    assertTrue(newStylist.getStylist().equals("Mary"));
  }

  @Test
  public void getId_returnsIdOfStylist_true(){
    Stylist newStylist = new Stylist("Mary");
    assertEquals(newStylist.getId(), 0);
  }

  @Test
  public void all_initalizesAsEmpty(){
    assertEquals(Stylist.all().size(), 0);
  }

  @Test
  public void save_savesIntoDatabase_true() {
    Stylist newStylist = new Stylist("Mary");
    newStylist.save();
    assertTrue(Stylist.all().get(0).equals(newStylist));
  }

  @Test
  public void equals_returnsTrueIfNamesAretheSame() {
    Stylist firstStylist = new Stylist("Mary");
    Stylist secondStylist = new Stylist("Mary");
    assertTrue(firstStylist.equals(secondStylist));
  }
}
