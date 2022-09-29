package misClases;

import javax.swing.JOptionPane;

public class Dialogo {
  public static String Capturar(String mensaje) 
  {
    return JOptionPane.showInputDialog(mensaje);
  }

  public static void Mostrar(String mensaje) 
  {
    JOptionPane.showMessageDialog(null, mensaje);
  }
}
