package JSwing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcoAplicacion extends JFrame {
    private JTextField cadroTexto;

    public EcoAplicacion() {
        super();
        setTitle("Primeira aplicacion con Swing");

        JComponent botoneira = creaBotons();
        JComponent panelCadroTexto = creaPanelCadro();
        cadroTexto = (JTextField) panelCadroTexto;


        JSplitPane panelPrincipal = new JSplitPane(JSplitPane.VERTICAL_SPLIT, botoneira, panelCadroTexto);
        getContentPane().add(panelPrincipal);

        pack();
        setVisible(true);
    }

    private JComponent creaBotons() {
        JButton btnHola = new JButton("Holaa!");

        btnHola.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    cadroTexto.setText("Hola a todos!");
                }
            }
        );
        return btnHola;
    }

    private JComponent creaPanelCadro() {
        JTextField txtCadro = new JTextField();
        return txtCadro;
    }

}
