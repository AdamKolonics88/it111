import javax.swing.*;
import java.awt.*;

public class ShowWindow2 extends JFrame {
    private JLabel bigLabel;
    private JLabel smallLabel;
    private JTextField firstField;
    private JTextField secondField;

    public ShowWindow2() {
        super("A Simple Window");
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // középre pozícionál

        // panel létrehozása, háttér piros, függőleges BoxLayout, padding
        JPanel panel = new JPanel();
        panel.setBackground(Color.RED);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        // 1) Nagy, BOLD címke
        bigLabel = new JLabel("My First Big Label!!!");
        bigLabel.setFont(bigLabel.getFont().deriveFont(Font.BOLD, 24f));
        bigLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        // 2) Első szövegmező, szélesség beállítása a címke szélességére
        firstField = new JTextField(15);
        firstField.setAlignmentX(Component.LEFT_ALIGNMENT);
        Dimension bigSize = bigLabel.getPreferredSize();
        Dimension fSize = firstField.getPreferredSize();
        firstField.setMaximumSize(new Dimension(bigSize.width, fSize.height));

        // 3) Kis, PLAIN címke
        smallLabel = new JLabel("My Second Small Label!");
        smallLabel.setFont(smallLabel.getFont().deriveFont(Font.PLAIN, 16f));
        smallLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        // 4) Második szövegmező, szélesség beállítása a címke szélességére
        secondField = new JTextField(15);
        secondField.setAlignmentX(Component.LEFT_ALIGNMENT);
        Dimension smallSize = smallLabel.getPreferredSize();
        Dimension sSize = secondField.getPreferredSize();
        secondField.setMaximumSize(new Dimension(smallSize.width, sSize.height));

        // komponensek hozzáadása és kis távolságok
        panel.add(bigLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(firstField);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(smallLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(secondField);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ShowWindow2::new);
    }
}
