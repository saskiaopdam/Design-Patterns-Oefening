package demo.view;

import javax.swing.JFrame;
import java.awt.HeadlessException;
import demo.model.Model;

public class View extends JFrame {
    private Model model;

    public View(Model model) throws HeadlessException {
        this.model = model;
    }
}
