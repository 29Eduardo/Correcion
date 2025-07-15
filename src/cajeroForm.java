import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cajeroForm extends JFrame {
    private JPanel cajeroPanel;
    private JTextField nombreText;
    private JTextField celularText;
    private JTextField correoText;
    private JButton limpiarButton;
    private JButton guardarButton;
    private JTextField apellidoText;
    private JTextField edadText;

    public cajeroForm() {
        setTitle("Resgistro de Clientes");
        setContentPane(cajeroPanel);
        setSize(500,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombreText.setText("");
                celularText.setText("");
                apellidoText.setText("");
                correoText.setText("");
                edadText.setText("");
            }
        });
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int edad = Integer.parseInt(edadText.getText());
                 if (edad >= 18 ){
                     JOptionPane.showMessageDialog(null,"Datos Guardados.", "GUARDADOS", JOptionPane.INFORMATION_MESSAGE);
                     nombreText.getText();
                     celularText.getText();
                     apellidoText.getText();
                     correoText.getText();
                     edadText.getText();
                 } else {
                     JOptionPane.showMessageDialog(null,"CLIENTE MENOR DE EDAD", "ERROR", JOptionPane.ERROR_MESSAGE);
                 }
                 String nombre = nombreText.getText();
                 String celular = celularText.getText();
                 String apellido = apellidoText.getText();
                 String correo = correoText.getText();
                  if (nombre.isEmpty() || celular.isEmpty() || apellido.isEmpty() || correo.isEmpty()) {
                      JOptionPane.showMessageDialog(null, "Datos Vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
                  }

            }
        });
    }
}
