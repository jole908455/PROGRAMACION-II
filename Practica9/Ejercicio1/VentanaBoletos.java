import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaBoletos extends JFrame {
    private JComboBox<String> comboTipo;
    private JTextField txtNumero, txtPrecio;

    public VentanaBoletos() {
        
        setTitle("Teatro Municipal");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

    
        add(new JLabel("Número de boleto:"));
        txtNumero = new JTextField();
        add(txtNumero);

        add(new JLabel("Tipo de entrada:"));
        comboTipo = new JComboBox<>(new String[]{"Palco", "Platea", "Galería"});
        add(comboTipo);

        add(new JLabel("Precio:"));
        txtPrecio = new JTextField();
        txtPrecio.setEditable(false);
        add(txtPrecio);

       
        JButton btnCalcular = new JButton("Calcular Precio");
        btnCalcular.addActionListener(e -> calcularPrecio());
        add(btnCalcular);

        JButton btnSalir = new JButton("Salir");
        btnSalir.addActionListener(e -> System.exit(0));
        add(btnSalir);
    }

    private void calcularPrecio() {
        String tipo = (String) comboTipo.getSelectedItem();
        double precio = switch (tipo) {
            case "Palco" -> 150.00;
            case "Platea" -> 100.00;
            case "Galería" -> 50.00;
            default -> 0;
        };
        txtPrecio.setText("S/ " + precio);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VentanaBoletos().setVisible(true);
        });
    }
}