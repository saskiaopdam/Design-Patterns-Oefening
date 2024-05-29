package demo.controller;

import demo.model.Model;
import demo.view.View;

import java.awt.*;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) throws HeadlessException {
        this.model = model;
        this.view = view;
    }
}
