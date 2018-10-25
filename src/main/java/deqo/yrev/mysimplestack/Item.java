package deqo.yrev.mysimplestack;

import java.util.EmptyStackException;
import java.util.Stack;

public class Item  {

    private String nom;
    public Item(String nom){
        this.nom=nom;
    }

    /*
     un commentaire correspondant à l'exigence, #1
     */
    public String getString(){
        return this.nom;
    }
}

