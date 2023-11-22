package com.mycompany.parquimetro_app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Panel_Patente_Ingresada extends JFrame{
    private JLabel JLabeltitulo;
    private JTable JTableTablaDatos;
    private JButton JButtonAtras;
    private JButton JButtonVer;
    private ArrayList<Cliente> clientes;
    
    public Panel_Patente_Ingresada(ArrayList<Cliente> clientes){
    // Configurar la ventana
        setLayout(null);
        setTitle("Parquímetro App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
         this.clientes = clientes;
         
        JLabeltitulo = new JLabel("Patentes ingresadas");
        JLabeltitulo.setBounds(150, -40, 120, 120);
        add(JLabeltitulo);
        
        JButtonAtras = new JButton("Atras");
        JButtonAtras.setBounds(150, 220, 80, 25);
        add(JButtonAtras);
        
        JButtonVer = new JButton("Ver");
        JButtonVer.setBounds(360, 10, 80, 25);
        add(JButtonVer);
        
        // Se crea una matriz llamada Object
        Object[][] datos = {
     
        };
        
        // Object va a tener estos datos en su primera columna
        Object[] columnas = {"Patente", "Rut", "Nombre", "Ver"};
    
        DefaultTableModel model = new DefaultTableModel(datos, columnas);
        JTableTablaDatos = new JTable(model);
        JScrollPane jScrollPane = new JScrollPane(JTableTablaDatos);
        jScrollPane.setBounds(20, 50, 340, 150);
        add(jScrollPane);
        
        llenarTabla();
        
        
    }
    
      private void llenarTabla() {
        DefaultTableModel model = (DefaultTableModel) JTableTablaDatos.getModel();
        for (Cliente cliente : clientes) {
            Object[] rowData = {cliente.getPatente(), cliente.getRut(), cliente.getNombre(), "Ver"};
            model.addRow(rowData);
        }

        // Agregar ActionListener al botón "Ver"
        JButtonVer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener la fila seleccionada
                int filaSeleccionada = JTableTablaDatos.getSelectedRow();

                // Verificar si hay una fila seleccionada
                if (filaSeleccionada != -1) {
                    // Obtener los datos de la fila seleccionada
                    String patente = (String) model.getValueAt(filaSeleccionada, 0);
                    String rut = (String) model.getValueAt(filaSeleccionada, 1);
                    String nombre = (String) model.getValueAt(filaSeleccionada, 2);

                    // Realizar la acción deseada con los datos (por ejemplo, imprimirlos)
                    System.out.println("Patente: " + patente + ", Rut: " + rut + ", Nombre: " + nombre);
                }
            }
        });
    }
}