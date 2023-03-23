package com.miniproject;

import javax.swing.*;

public class frame extends JFrame {
    frame()
    {
        // new panel created
        this.add(new panel());
        //naming the frame window
        this.setTitle("SnakeGame");
        //to make sure uniform game window size
        this.setResizable(false);
        this.setVisible(true);
        this.pack();
    }
}
