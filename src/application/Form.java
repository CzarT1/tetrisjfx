package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Form {

    Rectangle a;
    Rectangle b;
    Rectangle c;
    Rectangle d;
    Color color;
    private String name;
    public int form = 1;
    //^ this will be the varables that will form the shapes for the game

    public Form (Rectangle a, Rectangle b, Rectangle c, Rectangle d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    } //^ assigning abcd to each distinct tile

    public Form (Rectangle a, Rectangle b, Rectangle c, Rectangle d, String name){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.name = name;
        //^ combining it into a specific name

    //v organize color of tiles
    switch (name){
        case "j":
            color = Color.BLUE;
            break;
        case "l":
            color = Color.ORANGE;
            break;
        case "o":
            color = Color.GOLD;
            break;
        case "s":
            color = Color.LIME;
            break;
        case "t":
            color = Color.MEDIUMPURPLE;
            break;
        case "z":
            color = Color.RED;
            break;
        case "i":
            color = Color.AQUA;
            break;
    }

this.a.setFill(color);
this.b.setFill(color);
this.c.setFill(color);
this.d.setFill(color);
} //^ coloring each tile

public String getName(){
    return name;
}

public void changeForm(){
    if (form !=4){
        form++;
    }else{
        form = 1;
    }
} //^ forming each shape

    
}
