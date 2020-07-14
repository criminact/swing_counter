import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterEngine implements ActionListener {

    CounterUI ui;
    int count = 0;

    public CounterEngine(CounterUI ui) {
        this.ui = ui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
            count = Integer.parseInt(ui.getText());
            count++;
            ui.setText(String.valueOf(count));
        }
    }
}
