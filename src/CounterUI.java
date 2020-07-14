import javax.swing.*;
import java.awt.*;

public class CounterUI{

    private JTextField textField;
    private JButton button;
    private JLabel label;

    private JPanel windowContent;
    private FlowLayout flowLayout;
    private JFrame frame;

    public CounterUI(){

        CounterEngine engine = new CounterEngine(this);

        windowContent = new JPanel();
        flowLayout = new FlowLayout();

        windowContent.setLayout(flowLayout);

        label = new JLabel("Counter");
        textField = new JTextField(10);
        textField.setText("0");
        textField.setEditable(false);
        button = new JButton("Count");

        button.addActionListener(engine);

        windowContent.add(label);
        windowContent.add(textField);
        windowContent.add(button);

        frame = new JFrame("Swing Counter");
        frame.setSize(new Dimension(300,80));
        frame.setContentPane(windowContent);

        frame.setVisible(true);
    }

    public String getText(){
        return this.textField.getText();
    }

    public void setText(String _text){
        this.textField.setText(_text);
    }

}
