import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminForm extends JFrame {
    private JPanel adminPanel;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JTextField codigoText;
    private JTextField nombreText;
    private JTextField fechaText;
    private JTextField cantidadText;

    public AdminForm() {
        setTitle("Administrador");
        setContentPane(adminPanel);
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (codigoText.getText().equals("") || nombreText.getText().equals("") || fechaText.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "DATOS INVALIDOS ", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "DATOS VALIDOS ", "GUARDADOS", JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                codigoText.setText("");
                nombreText.setText("");
                fechaText.setText("");
                cantidadText.setText("");
            }
        });
    }
}
