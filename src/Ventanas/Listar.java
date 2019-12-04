package Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listar extends JFrame {
    public static void main(String[] args) {
        Listar listar = new Listar();
        listar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Listar(){
        setSize(535,600);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Listar Vehiculos por Marca");

        //establezco icono de la ventana
        Toolkit sistema = Toolkit.getDefaultToolkit();
        Image icon = sistema.getImage("icono.png");
        setIconImage(icon);

        PanelListar panelListar = new PanelListar();
        add(panelListar);

        setVisible(true);
    }
}

class PanelListar extends JPanel implements ActionListener {

    JLabel label1, label2, marca;
    JTextArea resultado;
    JTextField tMarca;

    public PanelListar(){
        setLayout(null);

        //establezco logo del sistema
        ImageIcon logo = new ImageIcon("logoAuto.jfif");
        label1 = new JLabel(logo);
        label1.setBounds(67,5,400,130);
        add(label1);

        label2 = new JLabel("Buscar por Marca");
        label2.setBounds(190,140,150,25);
        label2.setFont(new Font("Arial",1,16));
        label2.setBackground(new Color(200, 200, 220));
        add(label2);

        marca = new JLabel("Marca:");
        marca.setBounds(5,185,50,20);
        marca.setFont(new Font("Arial",1,14));
        add(marca);

        tMarca = new JTextField();
        tMarca.setBounds(60,185,130,23);
        tMarca.setBackground(new Color(200, 200, 200));
        tMarca.setFont(new Font("Arial",1,16));
        add(tMarca);

        resultado = new JTextArea();
        resultado.setBounds(60,220,415,300);
        resultado.setEditable(false);
        resultado.setBackground(new Color(200, 200, 220));
        resultado.setFont(new Font("Arial",0,14));
        resultado.setForeground(new Color(38, 38, 38));
        resultado.setText("Resultado:\n");
        add(resultado);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
