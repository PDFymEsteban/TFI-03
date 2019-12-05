package Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

class Inicio extends JFrame implements ActionListener{

    public static void main(String[] args) {
        Inicio iniciar = new Inicio();
        iniciar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    JButton button1, button2, button3, button4;
    JLabel label1, label2, label3, label4, label5;
    public Inicio(){
        //inicio frame
        setSize(400,400);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        setTitle("Iincio");
        //establezco icono de la ventana
        Toolkit sistema = Toolkit.getDefaultToolkit();
        Image icon = sistema.getImage("icono.png");
        setIconImage(icon);

        //establezco logo del sistema
        ImageIcon logo = new ImageIcon("logoAuto.jfif");
        label1 = new JLabel(logo);
        label1.setBounds(75,0,250,100);
        add(label1);

        //agrego boton1 para cargar nuevo vehiculo
        button1 = new JButton("Cargar");
        button1.setBounds(20,120,75,30);
        button1.setFont(new Font("Arial",0,12));
        button1.addActionListener(this);
        add(button1);

        label2 = new JLabel("Cargar un nuevo Vehículo");
        label2.setBounds(120,123,150,20);
        label2.setFont(new Font("Arial",0,12));
        add(label2);

        //agrego boton2 para elegir el color del vehiculo
        button2 = new JButton("Color");
        button2.setBounds(20,165,75,30);
        button2.setFont(new Font("Arial",0,14));
        button2.addActionListener(this);
        add(button2);

        label2 = new JLabel("Ver los colores diponibles");
        label2.setBounds(120,168,150,20);
        label2.setFont(new Font("Arial",0,12));
        add(label2);

        //agrego boton3 para que me de la opcion de editar precio, modificar vehiculo o elimiar
        button3 = new JButton("Editar");
        button3.setBounds(20,210,75,30);
        button3.setFont(new Font("Arial",0,14));
        button3.addActionListener(this);
        add(button3);

        label2 = new JLabel("Modificar o eliminar un vehículo");
        label2.setBounds(120,213,200,20);
        label2.setFont(new Font("Arial",0,12));
        add(label2);

        //agrego botno4 para listar los vehiculos segun la marca
        button4 = new JButton("Listar");
        button4.setBounds(20,255,75,30);
        button4.setFont(new Font("Arial",0,14));
        button4.addActionListener(this);
        add(button4);

        label2 = new JLabel("Listar todos los vehúclos por marca");
        label2.setBounds(120,258,200,20);
        label2.setFont(new Font("Arial",0,12));
        add(label2);

        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1){
            this.setVisible(false);
            Cargar cargar = new Cargar();
            cargar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        if (e.getSource()==button2){

        }
        if (e.getSource()==button3){
            Editar editar = new Editar();
            editar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        if (e.getSource()==button4){
            Listar listar = new Listar();
            listar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
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