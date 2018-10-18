package deqo.yrev.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    private SimpleStackImpl pile;
    @Before
    public void start(){
        pile = new SimpleStackImpl();
    }
    @Test
    public void laPileEstVide() {

        boolean actual = pile.isEmpty();
        boolean expected = true;

        assertEquals(actual,expected);
    }

    @Test
    public void getSize() {

        int actual = pile.getSize();
        int expected = 0;

        assertEquals(actual,expected);
    }

    @Test
    public void push() {
        Item it =new Item("item 1");
        pile.push(it);
        int actual = pile.getSize();
        int expected = 1;

        assertEquals(actual,expected);

    }

    @Test
    public void peek() {
        Item it =new Item("item 1");
        pile.push(it);

        Item it2 = pile.peek();

        String actual = it2.getString();
        String expected = "item 1";

        System.out.println(actual);

        assertEquals(actual,expected);
    }

    @Test
    public void pop() {
        Item it =new Item("item 1");
        pile.push(it);

        Item it2 = pile.pop();

        String actualString = it2.getString();
        String expectedString = "item 1";

        assertEquals(actualString,expectedString);

        int actual = pile.getSize();
        int expected = 0;

        assertEquals(actual,expected);


    }
}