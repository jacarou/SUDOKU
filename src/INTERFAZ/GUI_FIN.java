package INTERFAZ;
//Autor Jhony Caro - Abril 2020

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI_FIN extends JFrame{

    private JLabel lbl_felicitaciones;
    private JButton btn_guardar;
    private String tiempo;
    private JTextField jtf_nombre;
    public String nombre;
    
    public int estado=0;
    
    public GUI_FIN(String t){
        tiempo=t;
        
        //Creacion de fuente y colores
        Color gris_o=new Color(49,49,49);
        Font fuente=new Font("Berlin Sans FB",Font.PLAIN,20);
        
        //Caracteristicas de la ventana
        this.setTitle("SUDOKU");
        this.setSize(450,230);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(gris_o);
        
        //Inicialización de los elementos
        lbl_felicitaciones = new JLabel("<html><center>¡Felicidades!   Tiempo:  "+tiempo+".<center><html>");
        btn_guardar= new JButton("OK");
        jtf_nombre = new JTextField("Sin Nombre");
        
        //Modificar la fuente de los elementos
        lbl_felicitaciones.setFont(fuente);
        btn_guardar.setFont(fuente);
        jtf_nombre.setFont(fuente);
        
        //Tamaño de los elementos
        lbl_felicitaciones.setBounds(80,20,300,50);
        btn_guardar.setBounds(350,100,70,40);
        jtf_nombre.setBounds(55,100,250,40);
        
        //Colores de los elementos
        lbl_felicitaciones.setForeground(Color.WHITE);
        
        this.add(lbl_felicitaciones);
        this.add(jtf_nombre);
        this.add(btn_guardar);
        
        btn_guardar.addActionListener(guardar);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    ActionListener guardar = new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            nombre=jtf_nombre.getText();
            dispose();
            estado=1;
        }
    };
    
}
