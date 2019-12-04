package Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Editar extends JFrame {
    public static void main(String[] args) {
        Editar editar = new Editar();
        editar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Editar(){
        setSize(550,500);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Cargar Vehiculo");

        //establezco icono de la ventana
        Toolkit sistema = Toolkit.getDefaultToolkit();
        Image icon = sistema.getImage("icono.png");
        setIconImage(icon);

        PanelEditar panelEditar = new PanelEditar();
        add(panelEditar);

        setVisible(true);
    }
}

class PanelEditar extends JPanel implements ActionListener{

    JLabel labelLogo, label1, marca, modelo;
    JTextField tMarca, tModelo;
    JTextArea resultado;
    JButton modificar, eliminar;


    public PanelEditar(){
        setLayout(null);

        ImageIcon logo = new ImageIcon("logoAuto.jfif");
        labelLogo = new JLabel(logo);
        labelLogo.setBounds(50,5,400,130);
        add(labelLogo);

        label1 = new JLabel("Buscar Vehículo");
        label1.setBounds(200,145,150,25);
        label1.setFont(new Font("Arial",2,20));
        add(label1);

        marca = new JLabel("Marca:");
        marca.setBounds(5,185,60,25);
        marca.setFont(new Font("Arial",1,16));
        add(marca);

        tMarca = new JTextField();
        tMarca.setBounds(60,185,130,23);
        tMarca.setBackground(new Color(200, 200, 200));
        tMarca.setFont(new Font("Arial",1,16));
        add(tMarca);

        modelo = new JLabel("Modelo:");
        modelo.setBounds(280,185,65,25);
        modelo.setFont(new Font("Arial",1,16));
        add(modelo);

        tModelo = new JTextField();
        tModelo.setBounds(345,185,130,23);
        tModelo.setBackground(new Color(200, 200, 200));
        tModelo.setFont(new Font("Arial",1,16));
        add(tModelo);

        resultado = new JTextArea();
        resultado.setBounds(60,240,415,70);
        resultado.setEditable(false);
        resultado.setBackground(new Color(200, 200, 220));
        resultado.setFont(new Font("Arial",0,14));
        resultado.setForeground(new Color(38, 38, 38));
        resultado.setText("Resultado:\n");
        add(resultado);

        modificar = new JButton("Modificar");
        modificar.setBounds(60,340,100,25);
        modificar.setFont(new Font("Arial",0,14));
        modificar.addActionListener(this);
        add(modificar);

        eliminar = new JButton("Eliminar");
        eliminar.setBounds(380,340,90,25);
        eliminar.setFont(new Font("Arial",0,14));
        eliminar.addActionListener(this);
        add(eliminar);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
/*
Quiero: una ventana visible para el usuario donde se puedan cargar vehiculos y sus respectivos precios

Para: Que el usuario pueda manejar el programa de forma sencilla

Condición:
-Debera tener un boton para cargar un vehiculo
-Debera tener opciones de colores disponibles del vehiculo
-Debera tener una opcion para agregar precio
-Debera tener una opcion para modificar o eliminar
-Debera tener una opcion para buscar una lista de vehiculos por marca
-Debera tener una imagen del logo de la concesionaria visisble en la ventana principal del programa
 */