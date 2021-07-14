import javax.swing.*;

public class Inicio extends JFrame {

    private JPanel jpanel;
    private JComboBox comboBox1;

    public Inicio() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        agregarCombobox();
        this.add(jpanel);
        setSize(400, 500);
    }

    public void agregarCombobox() {
        comboBox1.setVisible(true);
    }
}
