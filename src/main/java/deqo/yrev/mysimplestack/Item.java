package deqo.yrev.mysimplestack;

import java.util.EmptyStackException;
import java.util.Stack;

public class Item  {

    private String nom;
    public Item(String nom){
        this.nom=nom;
    }

    public String getString(){
        return this.nom;
    }
}

