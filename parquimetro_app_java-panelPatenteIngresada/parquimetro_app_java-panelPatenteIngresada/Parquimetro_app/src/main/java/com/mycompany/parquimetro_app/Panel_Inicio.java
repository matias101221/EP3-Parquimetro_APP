package com.mycompany.parquimetro_app;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Panel_Inicio extends JFrame {

    private JLabel JLabeltitulo;
    private JLabel JLabelpatente;
    private JLabel JLabelnombre;
    private JLabel JLabelrut;
    private JLabel JLabelhora;
    private JLabel JLabelhoraActual;
    private JTextField JTextFieldcamTextoPat;
    private JTextField JTextFieldcamTextoNom;
    private JTextField JTextFieldcamtextoRut;
    private JButton JButtonsalir;
    private JButton JButtoningresar;
    private JButton JButtonterminar;
    private JButton JButtonVerPatenteIngresada;
    private JLabel JLabelcobro;

    private ArrayList<Cliente> clientes;
    private SimpleDateFormat formatoHoraMinSeg;
    private double TARIFA_POR_MINUTO;

    public Panel_Inicio() {
        // Configurar la ventana
        setLayout(null);
        setTitle("Parquímetro App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        clientes = new ArrayList<>();
        
        JLabeltitulo = new JLabel("Parquimetro");
        JLabeltitulo.setBounds(150, -40, 120, 120);
        add(JLabeltitulo);

        JLabelpatente = new JLabel("Patente");
        JLabelpatente.setBounds(50, 5, 120, 120);
        add(JLabelpatente);

        JTextFieldcamTextoPat = new JTextField("patente");
        JTextFieldcamTextoPat.setBounds(50, 75, 90, 20);
        add(JTextFieldcamTextoPat);

        JLabelnombre = new JLabel("Nombre");
        JLabelnombre.setBounds(50, 70, 120, 120);
        add(JLabelnombre);

        JTextFieldcamTextoNom = new JTextField("nombre");
        JTextFieldcamTextoNom.setBounds(50, 140, 90, 20);
        add(JTextFieldcamTextoNom);

        JLabelrut = new JLabel("rut");
        JLabelrut.setBounds(50, 130, 120, 120);
        add(JLabelrut);

        JTextFieldcamtextoRut = new JTextField("Rut");
        JTextFieldcamtextoRut.setBounds(50, 195, 90, 20);
        add(JTextFieldcamtextoRut);

        JLabelhora = new JLabel("Hora Actual");
        JLabelhora.setBounds(260, -20, 100, 100);
        add(JLabelhora);

        JLabelhoraActual = new JLabel("00:00:00");
        JLabelhoraActual.setBounds(270, 0, 100, 100);
        add(JLabelhoraActual);

        JButtonsalir = new JButton("Salir");
        JButtonsalir.setBounds(150, 220, 80, 25);
        add(JButtonsalir);

        JButtoningresar = new JButton("Ingresar");
        JButtoningresar.setBounds(230, 80, 90, 40);
        add(JButtoningresar);
        
        JButtonVerPatenteIngresada = new JButton("Ver patente ingresada");
        JButtonVerPatenteIngresada.setBounds(190, 140, 170, 30);
        add(JButtonVerPatenteIngresada);

        JButtoningresar.addActionListener(e -> {
            // Obtener datos de los campos de texto
            String patente = JTextFieldcamTextoPat.getText();
            String nombre = JTextFieldcamTextoNom.getText();
            String rut = JTextFieldcamtextoRut.getText();
            LocalTime hora = LocalTime.now();
            DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss");
            String horaEntrada= hora.format(formateador);
          
           
            // Crear un nuevo cliente con los datos ingresados
            Cliente nuevoCliente = new Cliente(patente, nombre, rut, horaEntrada);

            // Agregar el cliente a la lista
            clientes.add(nuevoCliente);

            // Limpiar campos de texto
            JTextFieldcamTextoPat.setText("");
            JTextFieldcamTextoNom.setText("");
            JTextFieldcamtextoRut.setText("");
        });
        
        JButtonVerPatenteIngresada.addActionListener(e -> {
            // Crear y mostrar el Panel_Patente_Ingresada con la lista de clientes
            Panel_Patente_Ingresada panelPatenteIngresada = new Panel_Patente_Ingresada(clientes);
            panelPatenteIngresada.setVisible(true);
        });

        JLabelcobro = new JLabel("15$ x min");
        JLabelcobro.setBounds(250, 190, 150, 20);
        add(JLabelcobro);

        // Inicializar variables
        clientes = new ArrayList<>();
        formatoHoraMinSeg = new SimpleDateFormat("HH:mm:ss");
        TARIFA_POR_MINUTO = 15.0;

        // Manejar clic en el botón de salir
        JButtonsalir.addActionListener(e -> System.exit(0));

  
    }   


}

