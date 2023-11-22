package com.mycompany.parquimetro_app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Panel_Detener_Patente extends JFrame {
    private JLabel JLabelTitulopatente;
    private JLabel JLabelpatente;
    private JLabel JLabelTitulonombre;
    private JLabel JLabelnombre;
    private JLabel JLabelTitulorut;
    private JLabel JLabelrut;
    private JLabel JLabeLTiempoEstacionado;
    private JLabel JLabeLTiempoOcupada;
    private JButton JButtonDetener;
    private JButton JButtonAtras;

    public Panel_Detener_Patente(String patente, String nombre, String rut) {
        // Configurar la ventana
        setLayout(null);
        setTitle("Parquímetro App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabelTitulopatente = new JLabel("Patente");
        JLabelTitulopatente.setBounds(40, -40, 120, 140);
        add(JLabelTitulopatente);

        JLabelpatente = new JLabel(patente);
        JLabelpatente.setBounds(40, -20, 120, 140);
        add(JLabelpatente);

        JLabelTitulonombre = new JLabel("Nombre");
        JLabelTitulonombre.setBounds(170, -40, 120, 140);
        add(JLabelTitulonombre);

        JLabelnombre = new JLabel(nombre);
        JLabelnombre.setBounds(170, -20, 120, 140);
        add(JLabelnombre);

        JLabelTitulorut = new JLabel("Rut");
        JLabelTitulorut.setBounds(300, -40, 120, 140);
        add(JLabelTitulorut);

        JLabelrut = new JLabel(rut);
        JLabelrut.setBounds(300, -20, 120, 140);
        add(JLabelrut);

        JButtonDetener = new JButton("Detener");
        JButtonDetener.setBounds(130, 90, 120, 50);
        add(JButtonDetener);

        JLabeLTiempoEstacionado = new JLabel("Tiempo estacionado");
        JLabeLTiempoEstacionado.setBounds(135, 170, 120, 30);
        add(JLabeLTiempoEstacionado);

        JLabeLTiempoOcupada = new JLabel("00:00:00");
        JLabeLTiempoOcupada.setBounds(160, 190, 90, 30);
        add(JLabeLTiempoOcupada);

        JButtonAtras = new JButton("Atras");
        JButtonAtras.setBounds(280, 220, 90, 30);
        add(JButtonAtras);
    }
}
