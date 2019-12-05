package Ventanas;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Cargar extends JFrame implements ActionListener{

    public static void main(String[] args) {
        Cargar cargar = new Cargar();
        cargar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    JLabel marca, modelo, precio, patente, label1, label2;
    JTextField tMarca, tModelo, tPrecio, tPatente;
    JButton button1, button2;
    public static String sMarca,sModelo,sPatente;
    public static double dPrecio;
    JFormattedTextField fPrecio;

    public Cargar() {
        setSize(500,400);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Cargar Vehiculo");

        //establezco icono de la ventana
        Toolkit sistema = Toolkit.getDefaultToolkit();
        Image icon = sistema.getImage("icono.png");
        setIconImage(icon);


            setLayout(null);

            //establezco logo del sistema
            ImageIcon logo = new ImageIcon("logoAuto.jfif");
            label1 = new JLabel(logo);
            label1.setBounds(50,5,400,130);
            add(label1);

            label2 = new JLabel("Cargar vehículo nuevo");
            label2.setBounds(130,145,200,25);
            label2.setFont(new Font("Arial",2,18));
            add(label2);

            marca = new JLabel("Marca:");
            marca.setBounds(5,175,60,25);
            marca.setFont(new Font("Arial",1,16));
            add(marca);

            tMarca = new JTextField();
            tMarca.setBounds(60,175,130,23);
            tMarca.setBackground(new Color(200, 200, 200));
            tMarca.setFont(new Font("Arial",1,16));
            add(tMarca);

            modelo = new JLabel("Modelo:");
            modelo.setBounds(280,175,65,25);
            modelo.setFont(new Font("Arial",1,16));
            add(modelo);

            tModelo = new JTextField();
            tModelo.setBounds(345,175,130,23);
            tModelo.setBackground(new Color(200, 200, 200));
            tModelo.setFont(new Font("Arial",1,16));
            add(tModelo);

            precio = new JLabel("Precio:");
            precio.setBounds(5,220,60,25);
            precio.setFont(new Font("Arial",1,16));
            add(precio);

            tPrecio = new JTextField();
            tPrecio.setBounds(62,220,128,23);
            tPrecio.setBackground(new Color(200, 200, 200));
            tPrecio.setFont(new Font("Arial",1,16));
            add(tPrecio);

            patente = new JLabel("Patente:");
            patente.setBounds(280,220,70,25);
            patente.setFont(new Font("Arial",1,16));
            add(patente);

            tPatente = new JTextField();
            tPatente.setBounds(343,220,132,23);
            tPatente.setBackground(new Color(200, 200, 200));
            tPatente.setFont(new Font("Arial",1,16));
            add(tPatente);

            button1 = new JButton("Volver");
            button1.setBounds(35,265,85,25);
            button1.setFont(new Font("Arial",1,14));
            button1.addActionListener(this);
            add(button1);

            button2 = new JButton("Cargar");
            button2.setBounds(300,265,85,25);
            button2.setFont(new Font("Arial",1,14));
            button2.addActionListener(this);
            add(button2);

            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource()==button1){
                Inicio iniciiar = new Inicio();
                iniciiar.setVisible(true);
                this.dispose();
            }
            if (e.getSource()==button2){
                sMarca = this.tMarca.getText().trim();
                sModelo = this.tModelo.getText().trim();
                sPatente = this.tPatente.getText().trim();
                String precio="";
                try{
                    precio = tPrecio.getText().trim();
                    dPrecio = Double.parseDouble(precio);
                }catch (Exception ex){
                    System.out.println("Ingresar solo numeros");
                }
                if (sMarca != ("")){
                    if (sModelo != ("")){
                        if (sPatente != ("")){
                            if (tPrecio.getText().trim().equals("")){
                                JOptionPane.showMessageDialog(null,"Debe rellenar todos los campos","Aviso",0);
                            }else JOptionPane.showMessageDialog(null,"Carga exitosa","Aviso",0);
                        }else JOptionPane.showMessageDialog(null,"Debe rellenar todos los campos","Aviso",0);
                    }else JOptionPane.showMessageDialog(null,"Debe rellenar todos los campos","Aviso",0);
                }else JOptionPane.showMessageDialog(null,"Debe rellenar todos los campos","Aviso",0);

            }


        }
}