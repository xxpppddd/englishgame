package Quiz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestartListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            new Game1();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
