package com.company;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
public class game_ui {
    JFrame frame = new JFrame("Game ");
    JPanel panel = new JPanel(new FlowLayout());
    JTextArea text = new JTextArea(10, 50);


    JButton tombol1 = new JButton("A");
    JButton tombol2 = new JButton("B");
    JButton tombol42 = new JButton("C");
    JButton tombol4 = new JButton("D");
    JButton tombol5 = new JButton("E");
    JButton tombol6 = new JButton("F");
    JButton tombol7 = new JButton("G");
    JButton tombol8 = new JButton("H");
    JButton tombol9 = new JButton("I");
    JButton tombol10 = new JButton("J");
    JButton tombol11 = new JButton("K");
    JButton tombol12 = new JButton("L");
    JButton tombol14 = new JButton("M");
    JButton tombol15 = new JButton("N");
    JButton tombol16 = new JButton("O");
    JButton tombol17 = new JButton("P");
    JButton tombol18 = new JButton("Q");
    JButton tombol19 = new JButton("R");
    JButton tombol20 = new JButton("S");
    JButton tombol22 = new JButton("T");
    JButton tombol24 = new JButton("U");
    JButton tombol25 = new JButton("P");
    JButton tombol26 = new JButton("w");
    JButton tombol27 = new JButton("X");
    JButton tombol28 = new JButton("Y");
    JButton tombol30 = new JButton("z");
    JButton tomboldelete = new JButton("DELETE");
    JButton tombolenter = new JButton("ENTER");
    JButton tombolspace = new JButton("SPASI");
    JButton tombolpass=new JButton ("PASS");
    JButton tombolmulai=new JButton ("\n\tSTART GAME\t\n");

    public void ui() {
        frame.setVisible(true);
        frame.setSize(470, 360);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.add(text);
        panel.add(tombol1);
        panel.add(tombol2);
        panel.add(tombol42);
        panel.add(tombol4);
        panel.add(tombol5);
        panel.add(tombol6);
        panel.add(tombol7);
        panel.add(tomboldelete);
        panel.add(tombol8);
        panel.add(tombol9);
        panel.add(tombol10);
        panel.add(tombol11);
        panel.add(tombol12);
        panel.add(tombol14);
        panel.add(tombol15);
        panel.add(tombol16);
        panel.add(tombolenter);
        panel.add(tombol17);
        panel.add(tombol18);
        panel.add(tombol19);
        panel.add(tombol20);
        panel.add(tombol22);
        panel.add(tombol24);
        panel.add(tombol25);
        panel.add(tombol26);
        panel.add (tombolpass);
        panel.add(tombol27);
        panel.add(tombolspace);
        panel.add(tombol28);
        panel.add(tombol30);
        panel.add (tombolmulai);



    }

}
