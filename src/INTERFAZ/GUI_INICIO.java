package INTERFAZ;
//Autor Jhony Caro - Abril 2020

import LOGICA.RECORDS;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI_INICIO extends JFrame{

    private RECORDS[] records;
    private JLabel lbl_bienvenida;
    private JLabel lbl_record;
    private JButton btn_jugar;
    private JComboBox jcb_dificultad;
    public int estado=0;
    public int cantidad;
    
    public GUI_INICIO(RECORDS[] r){
        records=r;
        //Creacion de fuente y colores
        Color gris_o=new Color(49,49,49);
        Font fuente=new Font("Berlin Sans FB",Font.PLAIN,18);
        
        //Caracteristicas de la ventana
        this.setTitle("SUDOKU");
        this.setSize(440,450);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(gris_o);
        
        //Inicialización de los elementos
        lbl_bienvenida = new JLabel("<html><center>¿Bueno para los sudokus? Demuestralo... Selecciona un nivel de dificultad: <center><html>");
        lbl_record = new JLabel("MEJORES TIEMPOS: ");
        btn_jugar = new JButton("A jugar");
        jcb_dificultad = new JComboBox();
        
        jcb_dificultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Facil","Medio","Dificil"}));     

        //Modificar la fuente de los elementos
        lbl_bienvenida.setFont(new Font("Berlin Sans FB",Font.PLAIN,20));
        lbl_record.setFont(fuente);
        btn_jugar.setFont(fuente);
        jcb_dificultad.setFont(fuente);
        
        //Tamaño de los elementos
        btn_jugar.setBounds(250,130,115,40);
        jcb_dificultad.setBounds(70,130,130,40);
        lbl_bienvenida.setBounds(20,35,400,50);
        lbl_record.setBounds(120,200,200,50);
        
        //Colores de los elementos
        lbl_bienvenida.setForeground(Color.WHITE);
        lbl_record.setForeground(Color.GRAY);
        
        int y=220;
        for (int i=records.length-1;i>=0;i--){
            JLabel lbl_podio = new JLabel(),lbl_categoria = new JLabel();
            y=y+40;
            switch (i){
                case 0:
                    lbl_categoria.setText("Facil:   ");
                break;
                case 1:
                    lbl_categoria.setText("Medio:   ");
                break;
                case 2:
                    lbl_categoria.setText("Dificil:  ");
                break;
            }
            lbl_categoria.setFont(fuente);
            lbl_podio.setText(records[i].nombre+", "+records[i].record+".");
            lbl_podio.setFont(new Font("Berlin Sans FB",Font.HANGING_BASELINE,18));
            lbl_categoria.setBounds(50, y, 100, 30);
            lbl_podio.setBounds(120, y, 300, 30);
            lbl_categoria.setForeground(Color.GRAY);
            lbl_podio.setForeground(Color.WHITE);
            this.add(lbl_categoria);
            this.add(lbl_podio);
        }
        
        this.add(lbl_bienvenida);
        this.add(lbl_record);
        this.add(btn_jugar);
        this.add(jcb_dificultad);
        
        btn_jugar.addActionListener(siguiente);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    ActionListener siguiente = new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            dispose();
            String opcion=(String)jcb_dificultad.getSelectedItem();
            switch (opcion){
                case "Facil":
                    cantidad=41;
                break;
                case "Medio":
                    cantidad=33;
                break;
                case "Dificil":
                    cantidad=25;
                break;
            }
            estado=1;
        }
    };
    
}
