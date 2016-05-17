import java.awt.*;
import java.util.LinkedList;

/**
 * Created by Jerry Xie on 5/16/2016.
 */
public class Control {

    LinkedList<Bullets> b = new LinkedList<>();
    Game game;

    Bullets temp;

    public Control(Game game){
        this.game=game;

    }

    public void tick(){

        for(int i =0; i<b.size(); i++){

            temp = b.get(i);
            if(temp.getY()<0){
                removeblock(temp);
            }
            temp.tick();

        }
    }

    public void render(Graphics g){
        for(int i = 0; i<b.size();i++){
            temp= b.get(i);
            temp.render(g);
        }
    }

    public void addblock(Bullets block){
        b.add(block);


    }

    public  void removeblock(Bullets block){
        b.remove(block);
    }


}
