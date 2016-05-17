import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Jerry Xie on 5/14/2016.
 */
public class Game extends JPanel implements MouseMotionListener,MouseListener,KeyListener {
    Bullets bullets;
    Game game;
    int x=500;
    int y=500;
    Control c;
    Alien alien;
    JLabel jlabel;
    ImageIcon image;
    BufferedImage b;

    public Game() {
        image = new ImageIcon("C:\\Users\\Jerry Xie\\Desktop\\JAVA WORKSTATION\\resource\\back.jpg");
        jlabel = new JLabel(image);
        try {
            b = ImageIO.read(new File("C:\\Users\\Jerry Xie\\Desktop\\JAVA WORKSTATION\\irdship.gif"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        add(jlabel);





        setBackground(Color.white);
        alien= new Alien(game);
        bullets = new Bullets(x,y, game); // game object is needed for add image to main frame
        addMouseMotionListener(this);
        addMouseListener(this);
        c = new Control(this);
    }

    public void paint(Graphics g) {
        super.paint(g);


        alien.draw(g);
        g.setColor(Color.green);

        g.drawImage(b,x,y,null);
        g.fillOval(x, y, 50, 50);
       // try {
           // Thread.sleep(10);
            g.drawString("Destroyed!!!",400,400);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
      //  }

        c.tick();
        c.render(g);


    }

    public int gety(){
        return y;
    }

    public int getx(){
        return x;

    }


    public static void main(String g[]) {

        JFrame jFrame = new JFrame("SpaceJunk");
        Game game = new Game();
        jFrame.setResizable(false);
        jFrame.setSize(800, 800);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.add(game);
        jFrame.setFocusable(true);




    }
        @Override
        public void mouseClicked (MouseEvent e){




        }

        @Override
        public void mousePressed (MouseEvent e){


        }

        @Override
        public void mouseReleased (MouseEvent e){

        }

        @Override
        public void mouseEntered (MouseEvent e){

        }

        @Override
        public void mouseExited (MouseEvent e){

        }

        @Override
        public void mouseDragged (MouseEvent e){

        }

        @Override
        public void mouseMoved (MouseEvent e){

            c.addblock(new Bullets(e.getX(),e.getY(),game));
            c.tick();

            x = e.getX();
            y = e.getY();
           repaint();

            System.out.println("Bullets");

        }

    @Override
    public void keyTyped(KeyEvent e) {
        int key = e.getKeyCode();
        if(key==KeyEvent.VK_SPACE){
            //c.addblock(new Bullets(game.getx(),game.gety(),game));
            //c.tick();

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}


