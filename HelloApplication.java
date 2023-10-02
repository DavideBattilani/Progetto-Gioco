package com.example.provaintelljfx;

import java.util.Arrays;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
//import javafx.scene.Group;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override

    public void start(Stage primaryStage) {
        Region g = creaSemaforo(50);

        Text t1 = new Text("Ciao");
        t1.setFont(Font.font(50));
        t1.setFill(Color.BLUE);

        Text t2 = new Text("A tutti");
        t2.setFont(Font.font(50));
        t2.setFill(Color.GREEN);

        HBox h2 = new HBox();

        h2.getChildren().addAll(Arrays.asList(g,t1,t2));

        Scene s1 = new Scene(h2);

        primaryStage.setTitle("Semaforo");
        primaryStage.setScene(s1);
        primaryStage.show();
    }

    private Circle creaLuce(int r, int x, int y, Color c) {
        Circle c1 = new Circle(r);
        //c1.setCenterX(x);
        //c1.setCenterY(y);
        c1.setFill(c);
        return c1;
    }

    private Region creaSemaforo(int r) {

        //Group g = new Group();

        Circle c1 = creaLuce(r,r,r,Color.RED);
        Circle c2 = creaLuce(r,r,r*3, Color.YELLOW);
        Circle c3 = creaLuce(r,r,r*5, Color.GREEN);

        VBox g = new VBox();

        g.getChildren().addAll(Arrays.asList(c1,c2,c3));

        return g;

    }

    public static void main(String[] args) {
        launch(args);
    }

}