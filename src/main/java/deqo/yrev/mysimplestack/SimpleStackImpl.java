package deqo.yrev.mysimplestack;

import java.util.EmptyStackException;
import java.util.Stack;

/* created by yan revuz
   Commentaire correspondant à l'exigence #3
 */

public class SimpleStackImpl implements SimpleStack {

    private Stack<Item> pile;

    public SimpleStackImpl(){
        this.pile=new Stack<Item>();
    }

    @Override
    public boolean isEmpty() {
        return this.pile.isEmpty();
    }

    @Override
    public int getSize() {
        return this.pile.size();
    }

    @Override
    public void push(Item item) {
        pile.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return pile.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return pile.pop();
    }
}
