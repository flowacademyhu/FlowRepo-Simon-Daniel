import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabelFrame extends JFrame implements MouseListener, KeyListener {
    JLabel[][] labels;
    int row=14;

    public LabelFrame() throws HeadlessException {
        setSize(1080,1080);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GridLayout gridLayout = new GridLayout(row,row);
        labels = new JLabel[row][row];
        setLayout(gridLayout);
        setTitle("jó lesz");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <row ; j++) {
                labels[i][j]=new JLabel("vér");
                add(labels[i][j]);
//                labels[i][j].addMouseMotionListener(this);
                labels[i][j].addMouseListener(this);

                labels[i][j].addKeyListener(this);
                labels[i][j].setOpaque(true);
                labels[i][j].setBackground(Color.white);
            }
        }
        addKeyListener(this);
        setAndroRasszista();
//        addMouseMotionListener(this);
        setVisible(true);
    }

    private void setAndroRasszista(){
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < row; j++) {
                if(i%2==0){
                    if (j%2==0){
                        labels[i][j].setBackground(Color.black);
                        labels[i][j].setForeground(Color.pink);
                    }else {
                        labels[i][j].setBackground(Color.white);

                    }
                }else {
                    if(j%2==1){
                        labels[i][j].setBackground(Color.black);
                        labels[i][j].setForeground(Color.pink);
                    }else {
                        labels[i][j].setBackground(Color.white);

                    }
                }
            }
        }
    }


//    @Override
//    public void mouseDragged(MouseEvent e) {
//
//    }
//
//    @Override
//    public void mouseMoved(MouseEvent e) {
//
//    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar()=='r'){

            setAndroRasszista();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() instanceof JLabel){
            ((JLabel) e.getSource()).setBackground(Color.cyan);
        }

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
}
