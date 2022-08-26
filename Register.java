import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register {

    DBlogic db = new DBlogic();
  
    private JButton button1;
    private JTextField textField1;
    private JLabel result;

    int num = 0;

    public Register() {
        button1.addActionListener(new ActionListener() {
          
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField1.getText();
                db.register(input);

                String n = Integer.toString(num++);
                result.setText(n);
            }
        });
    }

    public JPanel getPanel() {
        return mainPanel;
    }
}
