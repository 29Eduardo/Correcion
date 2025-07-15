import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginForm extends JFrame {
    private JPanel loginPanel;
    private JTextField userText;
    private JButton registrarButton;
    private JButton limpiarButton;
    private JPasswordField passwordField1;
    private JButton ingresarButton;

    public loginForm() {
        setTitle("LOGUIN");
        setContentPane(loginPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setLocationRelativeTo(null);
        setVisible(true);


        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = userText.getText();
                String password = new String(passwordField1.getPassword());

                if(usuario.equals("") && password.equals("")) {
                    JOptionPane.showMessageDialog(null,"LLENAR TODOS LOS CAMPOS","ERROR",JOptionPane.ERROR_MESSAGE);
                } else if (usuario.equals("admin") && password.equals("1234")){
                    AdminForm admin = new AdminForm();
                    admin.setVisible(true);
                    dispose();
                } else if(usuario.equals("cliente1") && password.equals("2345")){
                    cajeroForm cajero = new cajeroForm();
                    cajero.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "DATOS INVALIDOS ", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userText.setText("");
                passwordField1.setText("");

            }
        });
    }
}
