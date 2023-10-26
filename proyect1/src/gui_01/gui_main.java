package gui_01;

import javax.swing.JFrame;

public class gui_main{
  public static void main(String[] args){
    System.out.println("hola");
    JFrame theWindow = new JFrame("Grafiti");
    theWindow.setSize(220, 100);
    theWindow.pack();
    theWindow.setVisible(true);
    // theWindow.show();
    // idem theWindw. set Visible(true);
  }

}