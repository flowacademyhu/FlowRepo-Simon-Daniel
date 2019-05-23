import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Window extends JFrame implements KeyListener, MouseListener, MouseMotionListener {
    private JButton jButton;
    private int x= 150;
    private int y= 200;
    Random random;

    public Window() throws HeadlessException{
        setTitle("window");
        setSize(400,400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.jButton = new JButton("ok");
        setLayout(null);
        jButton.setBounds(this.x,this.y,150,50);
        add(this.jButton);
        setVisible(true);
        jButton.addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        random = new Random(1);
        jButton.addMouseMotionListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

                char b = e.getKeyChar();
                if(b =='w'){
                    y-=10;
                } else if(b =='s'){
                    y+=10;
                } else if(b =='d'){
                    x+=10;
                } else if(b =='a'){
                    x-=10;
                }
        this.jButton.setBounds(x,y,150,50);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        this.jButton.setBounds(e.getX()-100,e.getY()-100,150,50);

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int mouseX  = e.getX();
        int mouseY = e.getY()-64;
        if(x <= mouseX && mouseX<x+ jButton.getWidth()) {
            if(y <= mouseY && mouseY<y+ jButton.getHeight()){

                x = random.nextInt( this.getWidth()-jButton.getWidth());
                y = random.nextInt( this.getHeight()-jButton.getHeight());
                this.jButton.setLocation(x,y);
            }
        }
    }
}
