package com.mycompany.parquimetro_app;

import javax.swing.SwingUtilities;

public class Parquimetro_app {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Panel_Inicio frame = new Panel_Inicio();
            frame.setVisible(true);
        });
    }
}
