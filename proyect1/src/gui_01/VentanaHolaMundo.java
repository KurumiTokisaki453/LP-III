package gui_01;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaHolaMundo {
    public static void main(String[] args) {
        // Crear una ventana
        JFrame ventana = new JFrame("Ventana de Saludo");

        // Establecer el tamaño de la ventana
        ventana.setSize(300, 200);

        // Crear un panel para colocar componentes
        JPanel panel = new JPanel();

        // Crear una etiqueta
        JLabel etiqueta = new JLabel("Presiona el botón para ver el saludo");

        // Crear un botón
        JButton boton = new JButton("Saludar");

        // Agregar un ActionListener al botón
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("¡Hola Mundo!");
            }
        });

        // Agregar componentes al panel
        panel.add(etiqueta);
        panel.add(boton);

        // Agregar el panel a la ventana
        ventana.add(panel);

        // Definir operación de cierre
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}



// public class gui_main{
//   public static void main(String[] args){
//     System.out.println("hola");
//     JFrame theWindow = new JFrame("Grafiti");
//     theWindow.setSize(220, 100);
//     theWindow.pack();
//     theWindow.setVisible(true);
//     // theWindow.show();
//     // idem theWindw. set Visible(true);
//   }

// }