package com.mycompany.parquimetro_app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Panel_Boleta extends JFrame {
    private JLabel JLabelTitulo;
    private JLabel JLabelTitulopatente;
    private JLabel JLabelTitulonombre;
    private JLabel JLabelTitulorut;
    private JLabel JLabelpatente;
    private JLabel JLabelnombre;
    private JLabel JLabelrut;
    private JLabel JLabelhoraIngreso;
    private JLabel JLabelhoraSalida;    
    private JLabel JLabelhoraIngresoTiempo;
    private JLabel JLabelhoraSalidaTiempo;
    private JLabel JLabelCobroPorMinuto;
    private JLabel JLabelTotalCobrotexto;
    private JLabel JLabelTotalCobro;
    private JButton JButtonAtras;
    private JButton JButtonVolverInicio;
    
    
     public Panel_Boleta() {
        // Configurar la ventana
        setLayout(null);
        setTitle("Parquímetro App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JLabelTitulo = new JLabel("============== Boleta ==============");
        JLabelTitulo.setBounds(70, -50, 250, 120);
        add(JLabelTitulo);
        
        JLabelTitulopatente = new JLabel("Patente");
        JLabelTitulopatente.setBounds(50, -20, 120, 120);
        add(JLabelTitulopatente);
        
        JLabelTitulonombre = new JLabel("Nombre");
        JLabelTitulonombre.setBounds(170, -20, 120, 120);
        add(JLabelTitulonombre);
        
        JLabelTitulorut = new JLabel("Rut");
        JLabelTitulorut.setBounds(290, -20, 120, 120);
        add(JLabelTitulorut);
        
        JLabelpatente = new JLabel("LPGFD28");
        JLabelpatente.setBounds(50, 0, 120, 120);
        add(JLabelpatente);
        
        JLabelnombre = new JLabel("Matias");
        JLabelnombre.setBounds(170, 0, 120, 120);
        add(JLabelnombre);
        
        JLabelrut = new JLabel("121212-k");
        JLabelrut.setBounds(290, 0, 120, 120);
        add(JLabelrut);
        
        JLabelhoraIngreso = new JLabel("Hora Ingreso");
        JLabelhoraIngreso.setBounds(50, 50, 120, 120);
        add(JLabelhoraIngreso);
        
        JLabelhoraIngresoTiempo = new JLabel("00:00:00");
        JLabelhoraIngresoTiempo.setBounds(50, 70, 120, 120);
        add(JLabelhoraIngresoTiempo);
        
        JLabelhoraSalida = new JLabel("Hora salida");
        JLabelhoraSalida.setBounds(50, 100, 120, 120);
        add(JLabelhoraSalida);
        
        JLabelhoraSalidaTiempo = new JLabel("00:00:00");
        JLabelhoraSalidaTiempo.setBounds(50, 120, 120, 120);
        add(JLabelhoraSalidaTiempo);
        
        JLabelCobroPorMinuto = new JLabel("15$ x min");
        JLabelCobroPorMinuto.setBounds(250, 70, 120, 120);
        add(JLabelCobroPorMinuto);
        
        JLabelTotalCobrotexto = new JLabel("Total Cobro");
        JLabelTotalCobrotexto.setBounds(250, 100, 120, 120);
        add(JLabelTotalCobrotexto);
        
        JLabelTotalCobro = new JLabel("2000$");
        JLabelTotalCobro.setBounds(250, 120, 120, 120);
        add(JLabelTotalCobro);
        
        JButtonVolverInicio = new JButton("Volver inicio");
        JButtonVolverInicio.setBounds(200, 220, 120, 30);
        add(JButtonVolverInicio);
        
        JButtonAtras = new JButton("Atras");
        JButtonAtras.setBounds(50, 220, 120, 30);
        add(JButtonAtras);
        
        
        
        
    } 
    
    
    
    
}
