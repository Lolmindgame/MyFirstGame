import java.awt.*;
import java.util.Random;

/**
 * Created by Jerry Xie on 5/16/2016.
 */
public class Alien {
    int first = 100;
    int second = 200;
    int third = 300;
    int fourt = 400;

    int y = 100;

    Game game;

    public Alien(Game game) {
        this.game = game;
    }


    public void draw(Graphics g) {

        Random random = new Random();

        first = random.nextInt(770)+1 ;
        y = random.nextInt(100)+1 ;
        g.setColor(Color.green);
        g.fillOval(first, y, 50, 50);
        second = random.nextInt(770)+1 ;
        y = random.nextInt(100)+1 ;
        g.setColor(Color.green);
        g.fillOval(second,y,50,50);
        third = random.nextInt(770)+1 ;
        y = random.nextInt(100)+1 ;
        g.setColor(Color.green);
        g.fillOval(third,y,50,50);



    }

    public void randonspawn() {
        Random random = new Random();

        first = random.nextInt() * 50;
        y = random.nextInt() * 40;
    }
}














