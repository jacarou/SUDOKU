package INTERFAZ;
//Autor Jhony Caro - Abril 2020

import LOGICA.JUEGO;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class GUI_JUEGO extends JFrame{
    
    private JLabel tiempo;
    private JPanel uno;
    private JTextField uno_1;
    private JTextField uno_2;
    private JTextField uno_3;
    private JTextField uno_4;
    private JTextField uno_5;
    private JTextField uno_6;
    private JTextField uno_7;
    private JTextField uno_8;
    private JTextField uno_9;
    
    private JPanel dos;
    private JTextField dos_1;
    private JTextField dos_2;
    private JTextField dos_3;
    private JTextField dos_4;
    private JTextField dos_5;
    private JTextField dos_6;
    private JTextField dos_7;
    private JTextField dos_8;
    private JTextField dos_9;
    
    private JPanel tres;
    private JTextField tres_1;
    private JTextField tres_2;
    private JTextField tres_3;
    private JTextField tres_4;
    private JTextField tres_5;
    private JTextField tres_6;
    private JTextField tres_7;
    private JTextField tres_8;
    private JTextField tres_9;
    
    private JPanel cuatro;
    private JTextField cuatro_1;
    private JTextField cuatro_2;
    private JTextField cuatro_3;
    private JTextField cuatro_4;
    private JTextField cuatro_5;
    private JTextField cuatro_6;
    private JTextField cuatro_7;
    private JTextField cuatro_8;
    private JTextField cuatro_9;
    
    private JPanel cinco;
    private JTextField cinco_1;
    private JTextField cinco_2;
    private JTextField cinco_3;
    private JTextField cinco_4;
    private JTextField cinco_5;
    private JTextField cinco_6;
    private JTextField cinco_7;
    private JTextField cinco_8;
    private JTextField cinco_9;
    
    private JPanel seis;
    private JTextField seis_1;
    private JTextField seis_2;
    private JTextField seis_3;
    private JTextField seis_4;
    private JTextField seis_5;
    private JTextField seis_6;
    private JTextField seis_7;
    private JTextField seis_8;
    private JTextField seis_9;
    
    private JPanel siete;
    private JTextField siete_1;
    private JTextField siete_2;
    private JTextField siete_3;
    private JTextField siete_4;
    private JTextField siete_5;
    private JTextField siete_6;
    private JTextField siete_7;
    private JTextField siete_8;
    private JTextField siete_9;
    
    private JPanel ocho;
    private JTextField ocho_1;
    private JTextField ocho_2;
    private JTextField ocho_3;
    private JTextField ocho_4;
    private JTextField ocho_5;
    private JTextField ocho_6;
    private JTextField ocho_7;
    private JTextField ocho_8;
    private JTextField ocho_9;
    
    private JPanel nueve;
    private JTextField nueve_1;
    private JTextField nueve_2;
    private JTextField nueve_3;
    private JTextField nueve_4;
    private JTextField nueve_5;
    private JTextField nueve_6;
    private JTextField nueve_7;
    private JTextField nueve_8;
    private JTextField nueve_9;
    
    private JLabel numero_1;
    private JLabel numero_2;
    private JLabel numero_3;
    private JLabel numero_4;
    private JLabel numero_5;
    private JLabel numero_6;
    private JLabel numero_7;
    private JLabel numero_8;
    private JLabel numero_9;
    
    private int[] indicadores;
    private Timer t,t2,t3;
    private int h=0,m=0,s=0;
    public int[][] matriz_s;
    public int[][] matriz_v;
    public int[][] matriz_l;
    public int estado=0;
    public String time;
    
    public GUI_JUEGO(JUEGO j){
        matriz_v = j.matriz_visible;
        matriz_l = j.matriz_logica;
        indicadores= j.indicadores;
        
        //Creacion de fuente y colores
        Font fuente_p = new Font("Berlin Sans FB",Font.PLAIN,22);
        Font fuente = new Font("Berlin Sans FB",Font.PLAIN,36);
        Color gris_o=new Color(49,49,49);
        Color gris_c=new Color(111,118,121);
        
        //Propiedades de la ventana
        this.setTitle("SUDOKU");
        this.setSize(600,577);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(gris_o);
        
        tiempo = new JLabel("Tiempo: 00:00:00");
        tiempo.setFont(fuente_p);
        tiempo.setForeground(Color.WHITE);
        tiempo.setBounds(30, 30, 200, 30);
        t = new Timer(1000,acciones);
        t.start();
        
        numero_1 = new JLabel("1");
        numero_2 = new JLabel("2");
        numero_3 = new JLabel("3");
        numero_4 = new JLabel("4");
        numero_5 = new JLabel("5");
        numero_6 = new JLabel("6");
        numero_7 = new JLabel("7");
        numero_8 = new JLabel("8");
        numero_9 = new JLabel("9");
        
        numero_1.setFont(fuente);
        numero_2.setFont(fuente);
        numero_3.setFont(fuente);
        numero_4.setFont(fuente);
        numero_5.setFont(fuente);
        numero_6.setFont(fuente);
        numero_7.setFont(fuente);
        numero_8.setFont(fuente);
        numero_9.setFont(fuente);
        
        numero_1.setForeground(gris_c);
        numero_2.setForeground(gris_c);
        numero_3.setForeground(gris_c);
        numero_4.setForeground(gris_c);
        numero_5.setForeground(gris_c);
        numero_6.setForeground(gris_c);
        numero_7.setForeground(gris_c);
        numero_8.setForeground(gris_c);
        numero_9.setForeground(gris_c);

        numero_1.setBounds(530, 75, 50, 50);
        numero_2.setBounds(530, 125, 50, 50);
        numero_3.setBounds(530, 175, 50, 50);
        numero_4.setBounds(530, 225, 50, 50);
        numero_5.setBounds(530, 275, 50, 50);
        numero_6.setBounds(530, 325, 50, 50);
        numero_7.setBounds(530, 375, 50, 50);
        numero_8.setBounds(530, 425, 50, 50);
        numero_9.setBounds(530, 475, 50, 50);        
        
        //Primer cuadro
        uno_1 = new JTextField();
        uno_1.setHorizontalAlignment(JTextField.CENTER);
        uno_1.setFont(fuente);
        uno_2 = new JTextField();
        uno_2.setHorizontalAlignment(JTextField.CENTER);
        uno_2.setFont(fuente);
        uno_3 = new JTextField();
        uno_3.setHorizontalAlignment(JTextField.CENTER);
        uno_3.setFont(fuente);
        uno_4 = new JTextField();
        uno_4.setHorizontalAlignment(JTextField.CENTER);
        uno_4.setFont(fuente);
        uno_5 = new JTextField();
        uno_5.setHorizontalAlignment(JTextField.CENTER);
        uno_5.setFont(fuente);
        uno_6 = new JTextField();
        uno_6.setHorizontalAlignment(JTextField.CENTER);
        uno_6.setFont(fuente);
        uno_7 = new JTextField();
        uno_7.setHorizontalAlignment(JTextField.CENTER);
        uno_7.setFont(fuente);
        uno_8 = new JTextField();
        uno_8.setHorizontalAlignment(JTextField.CENTER);
        uno_8.setFont(fuente);
        uno_9 = new JTextField();
        uno_9.setHorizontalAlignment(JTextField.CENTER);
        uno_9.setFont(fuente);
        //Segundo cuadro
        dos_1 = new JTextField();
        dos_1.setHorizontalAlignment(JTextField.CENTER);
        dos_1.setFont(fuente);
        dos_2 = new JTextField();
        dos_2.setHorizontalAlignment(JTextField.CENTER);
        dos_2.setFont(fuente);
        dos_3 = new JTextField();
        dos_3.setHorizontalAlignment(JTextField.CENTER);
        dos_3.setFont(fuente);
        dos_4 = new JTextField();
        dos_4.setHorizontalAlignment(JTextField.CENTER);
        dos_4.setFont(fuente);
        dos_5 = new JTextField();
        dos_5.setHorizontalAlignment(JTextField.CENTER);
        dos_5.setFont(fuente);
        dos_6 = new JTextField();
        dos_6.setHorizontalAlignment(JTextField.CENTER);
        dos_6.setFont(fuente);
        dos_7 = new JTextField();
        dos_7.setHorizontalAlignment(JTextField.CENTER);
        dos_7.setFont(fuente);
        dos_8 = new JTextField();
        dos_8.setHorizontalAlignment(JTextField.CENTER);
        dos_8.setFont(fuente);
        dos_9 = new JTextField();
        dos_9.setHorizontalAlignment(JTextField.CENTER);
        dos_9.setFont(fuente);
        //Tercer cuadro
        tres_1 = new JTextField();
        tres_1.setHorizontalAlignment(JTextField.CENTER);
        tres_1.setFont(fuente);
        tres_2 = new JTextField();
        tres_2.setHorizontalAlignment(JTextField.CENTER);
        tres_2.setFont(fuente);
        tres_3 = new JTextField();
        tres_3.setHorizontalAlignment(JTextField.CENTER);
        tres_3.setFont(fuente);
        tres_4 = new JTextField();
        tres_4.setHorizontalAlignment(JTextField.CENTER);
        tres_4.setFont(fuente);
        tres_5 = new JTextField();
        tres_5.setHorizontalAlignment(JTextField.CENTER);
        tres_5.setFont(fuente);
        tres_6 = new JTextField();
        tres_6.setHorizontalAlignment(JTextField.CENTER);
        tres_6.setFont(fuente);
        tres_7 = new JTextField();
        tres_7.setHorizontalAlignment(JTextField.CENTER);
        tres_7.setFont(fuente);
        tres_8 = new JTextField();
        tres_8.setHorizontalAlignment(JTextField.CENTER);
        tres_8.setFont(fuente);
        tres_9 = new JTextField();
        tres_9.setHorizontalAlignment(JTextField.CENTER);
        tres_9.setFont(fuente);
        //Cuarto cuadro
        cuatro_1 = new JTextField();
        cuatro_1.setHorizontalAlignment(JTextField.CENTER);
        cuatro_1.setFont(fuente);
        cuatro_2 = new JTextField();
        cuatro_2.setHorizontalAlignment(JTextField.CENTER);
        cuatro_2.setFont(fuente);
        cuatro_3 = new JTextField();
        cuatro_3.setHorizontalAlignment(JTextField.CENTER);
        cuatro_3.setFont(fuente);
        cuatro_4 = new JTextField();
        cuatro_4.setHorizontalAlignment(JTextField.CENTER);
        cuatro_4.setFont(fuente);
        cuatro_5 = new JTextField();
        cuatro_5.setHorizontalAlignment(JTextField.CENTER);
        cuatro_5.setFont(fuente);
        cuatro_6 = new JTextField();
        cuatro_6.setHorizontalAlignment(JTextField.CENTER);
        cuatro_6.setFont(fuente);
        cuatro_7 = new JTextField();
        cuatro_7.setHorizontalAlignment(JTextField.CENTER);
        cuatro_7.setFont(fuente);
        cuatro_8 = new JTextField();
        cuatro_8.setHorizontalAlignment(JTextField.CENTER);
        cuatro_8.setFont(fuente);
        cuatro_9 = new JTextField();
        cuatro_9.setHorizontalAlignment(JTextField.CENTER);
        cuatro_9.setFont(fuente);
        //Quinto cuadro
        cinco_1 = new JTextField();
        cinco_1.setHorizontalAlignment(JTextField.CENTER);
        cinco_1.setFont(fuente);
        cinco_2 = new JTextField();
        cinco_2.setHorizontalAlignment(JTextField.CENTER);
        cinco_2.setFont(fuente);
        cinco_3 = new JTextField();
        cinco_3.setHorizontalAlignment(JTextField.CENTER);
        cinco_3.setFont(fuente);
        cinco_4 = new JTextField();
        cinco_4.setHorizontalAlignment(JTextField.CENTER);
        cinco_4.setFont(fuente);
        cinco_5 = new JTextField();
        cinco_5.setHorizontalAlignment(JTextField.CENTER);
        cinco_5.setFont(fuente);
        cinco_6 = new JTextField();
        cinco_6.setHorizontalAlignment(JTextField.CENTER);
        cinco_6.setFont(fuente);
        cinco_7 = new JTextField();
        cinco_7.setHorizontalAlignment(JTextField.CENTER);
        cinco_7.setFont(fuente);
        cinco_8 = new JTextField();
        cinco_8.setHorizontalAlignment(JTextField.CENTER);
        cinco_8.setFont(fuente);
        cinco_9 = new JTextField();
        cinco_9.setHorizontalAlignment(JTextField.CENTER);
        cinco_9.setFont(fuente);
        //Sexto cuadro
        seis_1 = new JTextField();
        seis_1.setHorizontalAlignment(JTextField.CENTER);
        seis_1.setFont(fuente);
        seis_2 = new JTextField();
        seis_2.setHorizontalAlignment(JTextField.CENTER);
        seis_2.setFont(fuente);
        seis_3 = new JTextField();
        seis_3.setHorizontalAlignment(JTextField.CENTER);
        seis_3.setFont(fuente);
        seis_4 = new JTextField();
        seis_4.setHorizontalAlignment(JTextField.CENTER);
        seis_4.setFont(fuente);
        seis_5 = new JTextField();
        seis_5.setHorizontalAlignment(JTextField.CENTER);
        seis_5.setFont(fuente);
        seis_6 = new JTextField();
        seis_6.setHorizontalAlignment(JTextField.CENTER);
        seis_6.setFont(fuente);
        seis_7 = new JTextField();
        seis_7.setHorizontalAlignment(JTextField.CENTER);
        seis_7.setFont(fuente);
        seis_8 = new JTextField();
        seis_8.setHorizontalAlignment(JTextField.CENTER);
        seis_8.setFont(fuente);
        seis_9 = new JTextField();
        seis_9.setHorizontalAlignment(JTextField.CENTER);
        seis_9.setFont(fuente);
        //Septimo cuadro
        siete_1 = new JTextField();
        siete_1.setHorizontalAlignment(JTextField.CENTER);
        siete_1.setFont(fuente);
        siete_2 = new JTextField();
        siete_2.setHorizontalAlignment(JTextField.CENTER);
        siete_2.setFont(fuente);
        siete_3 = new JTextField();
        siete_3.setHorizontalAlignment(JTextField.CENTER);
        siete_3.setFont(fuente);
        siete_4 = new JTextField();
        siete_4.setHorizontalAlignment(JTextField.CENTER);
        siete_4.setFont(fuente);
        siete_5 = new JTextField();
        siete_5.setHorizontalAlignment(JTextField.CENTER);
        siete_5.setFont(fuente);
        siete_6 = new JTextField();
        siete_6.setHorizontalAlignment(JTextField.CENTER);
        siete_6.setFont(fuente);
        siete_7 = new JTextField();
        siete_7.setHorizontalAlignment(JTextField.CENTER);
        siete_7.setFont(fuente);
        siete_8 = new JTextField();
        siete_8.setHorizontalAlignment(JTextField.CENTER);
        siete_8.setFont(fuente);
        siete_9 = new JTextField();
        siete_9.setHorizontalAlignment(JTextField.CENTER);
        siete_9.setFont(fuente);
        //Octavo cuadro
        ocho_1 = new JTextField();
        ocho_1.setHorizontalAlignment(JTextField.CENTER);
        ocho_1.setFont(fuente);
        ocho_2 = new JTextField();
        ocho_2.setHorizontalAlignment(JTextField.CENTER);
        ocho_2.setFont(fuente);
        ocho_3 = new JTextField();
        ocho_3.setHorizontalAlignment(JTextField.CENTER);
        ocho_3.setFont(fuente);
        ocho_4 = new JTextField();
        ocho_4.setHorizontalAlignment(JTextField.CENTER);
        ocho_4.setFont(fuente);
        ocho_5 = new JTextField();
        ocho_5.setHorizontalAlignment(JTextField.CENTER);
        ocho_5.setFont(fuente);
        ocho_6 = new JTextField();
        ocho_6.setHorizontalAlignment(JTextField.CENTER);
        ocho_6.setFont(fuente);
        ocho_7 = new JTextField();
        ocho_7.setHorizontalAlignment(JTextField.CENTER);
        ocho_7.setFont(fuente);
        ocho_8 = new JTextField();
        ocho_8.setHorizontalAlignment(JTextField.CENTER);
        ocho_8.setFont(fuente);
        ocho_9 = new JTextField();
        ocho_9.setHorizontalAlignment(JTextField.CENTER);
        ocho_9.setFont(fuente);
        //Noveno cuadro
        nueve_1 = new JTextField();
        nueve_1.setHorizontalAlignment(JTextField.CENTER);
        nueve_1.setFont(fuente);
        nueve_2 = new JTextField();
        nueve_2.setHorizontalAlignment(JTextField.CENTER);
        nueve_2.setFont(fuente);
        nueve_3 = new JTextField();
        nueve_3.setHorizontalAlignment(JTextField.CENTER);
        nueve_3.setFont(fuente);
        nueve_4 = new JTextField();
        nueve_4.setHorizontalAlignment(JTextField.CENTER);
        nueve_4.setFont(fuente);
        nueve_5 = new JTextField();
        nueve_5.setHorizontalAlignment(JTextField.CENTER);
        nueve_5.setFont(fuente);
        nueve_6 = new JTextField();
        nueve_6.setHorizontalAlignment(JTextField.CENTER);
        nueve_6.setFont(fuente);
        nueve_7 = new JTextField();
        nueve_7.setHorizontalAlignment(JTextField.CENTER);
        nueve_7.setFont(fuente);
        nueve_8 = new JTextField();
        nueve_8.setHorizontalAlignment(JTextField.CENTER);
        nueve_8.setFont(fuente);
        nueve_9 = new JTextField();
        nueve_9.setHorizontalAlignment(JTextField.CENTER);
        nueve_9.setFont(fuente);
        
        InicializarComp();
        
        //Primer cuadro
        uno = new JPanel();
        uno.setBounds(25, 75, 150, 150);
        uno.setLayout(new GridLayout (3,3));
        uno.add(uno_1);
        uno.add(uno_2);
        uno.add(uno_3);
        uno.add(uno_4);
        uno.add(uno_5);
        uno.add(uno_6);
        uno.add(uno_7);
        uno.add(uno_8);
        uno.add(uno_9);
    
        //Segundo cuadro
        dos = new JPanel();
        dos.setBounds(177, 75, 150, 150);
        dos.setLayout(new GridLayout (3,3));
        dos.add(dos_1);
        dos.add(dos_2);
        dos.add(dos_3);
        dos.add(dos_4);
        dos.add(dos_5);
        dos.add(dos_6);
        dos.add(dos_7);
        dos.add(dos_8);
        dos.add(dos_9);
        
        //Tercer cuadro
        tres = new JPanel();
        tres.setBounds(329, 75, 150, 150);
        tres.setLayout(new GridLayout (3,3));
        tres.add(tres_1);
        tres.add(tres_2);
        tres.add(tres_3);
        tres.add(tres_4);
        tres.add(tres_5);
        tres.add(tres_6);
        tres.add(tres_7);
        tres.add(tres_8);
        tres.add(tres_9);
        
        //Cuarto cuadro
        cuatro = new JPanel();
        cuatro.setBounds(25, 227, 150, 150);
        cuatro.setLayout(new GridLayout (3,3));
        cuatro.add(cuatro_1);
        cuatro.add(cuatro_2);
        cuatro.add(cuatro_3);
        cuatro.add(cuatro_4);
        cuatro.add(cuatro_5);
        cuatro.add(cuatro_6);
        cuatro.add(cuatro_7);
        cuatro.add(cuatro_8);
        cuatro.add(cuatro_9);
        
        //Quinto cuadro
        cinco = new JPanel();
        cinco.setBounds(177, 227, 150, 150);
        cinco.setLayout(new GridLayout (3,3));
        cinco.add(cinco_1);
        cinco.add(cinco_2);
        cinco.add(cinco_3);
        cinco.add(cinco_4);
        cinco.add(cinco_5);
        cinco.add(cinco_6);
        cinco.add(cinco_7);
        cinco.add(cinco_8);
        cinco.add(cinco_9);
        
        //Sexto cuadro
        seis = new JPanel();
        seis.setBounds(329, 227, 150, 150);
        seis.setLayout(new GridLayout (3,3));
        seis.add(seis_1);
        seis.add(seis_2);
        seis.add(seis_3);
        seis.add(seis_4);
        seis.add(seis_5);
        seis.add(seis_6);
        seis.add(seis_7);
        seis.add(seis_8);
        seis.add(seis_9);
        
        //Septimo cuadro
        siete = new JPanel();
        siete.setBounds(25, 379, 150, 150);
        siete.setLayout(new GridLayout (3,3));
        siete.add(siete_1);
        siete.add(siete_2);
        siete.add(siete_3);
        siete.add(siete_4);
        siete.add(siete_5);
        siete.add(siete_6);
        siete.add(siete_7);
        siete.add(siete_8);
        siete.add(siete_9);
        
        //Octavo cuadro
        ocho = new JPanel();
        ocho.setBounds(177, 379, 150, 150);
        ocho.setLayout(new GridLayout (3,3));
        ocho.add(ocho_1);
        ocho.add(ocho_2);
        ocho.add(ocho_3);
        ocho.add(ocho_4);
        ocho.add(ocho_5);
        ocho.add(ocho_6);
        ocho.add(ocho_7);
        ocho.add(ocho_8);
        ocho.add(ocho_9);
        
        //Noveno cuadro
        nueve = new JPanel();
        nueve.setBounds(329, 379, 150, 150);
        nueve.setLayout(new GridLayout (3,3));
        nueve.add(nueve_1);
        nueve.add(nueve_2);
        nueve.add(nueve_3);
        nueve.add(nueve_4);
        nueve.add(nueve_5);
        nueve.add(nueve_6);
        nueve.add(nueve_7);
        nueve.add(nueve_8);
        nueve.add(nueve_9);
        
        t2 = new Timer(10,Validaciones);
        t2.start();
        
        this.add(numero_1);
        this.add(numero_2);
        this.add(numero_3);
        this.add(numero_4);
        this.add(numero_5);
        this.add(numero_6);
        this.add(numero_7);
        this.add(numero_8);
        this.add(numero_9);
        this.add(uno);
        this.add(dos);
        this.add(tres);
        this.add(cuatro);
        this.add(cinco);
        this.add(seis);
        this.add(siete);
        this.add(ocho);
        this.add(nueve);
        this.add(tiempo);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        uno_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,uno_1.getText());
            }
        });
        uno_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,uno_2.getText());
            }
        });
        uno_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,uno_3.getText());
            }
        });
        uno_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,uno_4.getText());
            }
        });
        uno_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,uno_5.getText());
            }
        });
        uno_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,uno_6.getText());
            }
        });
        uno_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,uno_7.getText());
            }
        });
        uno_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,uno_8.getText());
            }
        });
        uno_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,uno_9.getText());
            }
        });
        dos_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,dos_1.getText());
            }
        });
        dos_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,dos_2.getText());
            }
        });
        dos_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,dos_3.getText());
            }
        });
        dos_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,dos_4.getText());
            }
        });
        dos_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,dos_5.getText());
            }
        });
        dos_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,dos_6.getText());
            }
        });
        dos_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,dos_7.getText());
            }
        });
        dos_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,dos_8.getText());
            }
        });
        dos_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,dos_9.getText());
            }
        });
        tres_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,tres_1.getText());
            }
        });
        tres_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,tres_2.getText());
            }
        });
        tres_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,tres_3.getText());
            }
        });
        tres_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,tres_4.getText());
            }
        });
        tres_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,tres_5.getText());
            }
        });
        tres_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,tres_6.getText());
            }
        });
        tres_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,tres_7.getText());
            }
        });
        tres_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,tres_8.getText());
            }
        });
        tres_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,tres_9.getText());
            }
        });
        cuatro_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,cuatro_1.getText());
            }
        });
        cuatro_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,cuatro_2.getText());
            }
        });
        cuatro_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,cuatro_3.getText());
            }
        });
        cuatro_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,cuatro_4.getText());
            }
        });
        cuatro_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,cuatro_5.getText());
            }
        });
        cuatro_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,cuatro_6.getText());
            }
        });
        cuatro_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,cuatro_7.getText());
            }
        });
        cuatro_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,cuatro_8.getText());
            }
        });
        cuatro_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,cuatro_9.getText());
            }
        });
        cinco_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,cinco_1.getText());
            }
        });
        cinco_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,cinco_2.getText());
            }
        });
        cinco_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,cinco_3.getText());
            }
        });
        cinco_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,cinco_4.getText());
            }
        });
        cinco_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,cinco_5.getText());
            }
        });
        cinco_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,cinco_6.getText());
            }
        });
        cinco_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,cinco_7.getText());
            }
        });
        cinco_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,cinco_8.getText());
            }
        });
        cinco_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,cinco_9.getText());
            }
        });
        seis_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,seis_1.getText());
            }
        });
        seis_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,seis_2.getText());
            }
        });
        seis_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,seis_3.getText());
            }
        });
        seis_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,seis_4.getText());
            }
        });
        seis_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,seis_5.getText());
            }
        });
        seis_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,seis_6.getText());
            }
        });
        seis_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,seis_7.getText());
            }
        });
        seis_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,seis_8.getText());
            }
        });
        seis_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,seis_9.getText());
            }
        });
        siete_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,siete_1.getText());
            }
        });
        siete_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,siete_2.getText());
            }
        });
        siete_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,siete_3.getText());
            }
        });
        siete_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,siete_4.getText());
            }
        });
        siete_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,siete_5.getText());
            }
        });
        siete_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,siete_6.getText());
            }
        });
        siete_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,siete_7.getText());
            }
        });
        siete_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,siete_8.getText());
            }
        });
        siete_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,siete_9.getText());
            }
        });
        ocho_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,ocho_1.getText());
            }
        });
        ocho_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,ocho_2.getText());
            }
        });
        ocho_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,ocho_3.getText());
            }
        });
        ocho_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,ocho_4.getText());
            }
        });
        ocho_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,ocho_5.getText());
            }
        });
        ocho_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,ocho_6.getText());
            }
        });
        ocho_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,ocho_7.getText());
            }
        });
        ocho_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,ocho_8.getText());
            }
        });
        ocho_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,ocho_9.getText());
            }
        });
        nueve_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,nueve_1.getText());
            }
        });
        nueve_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,nueve_2.getText());
            }
        });
        nueve_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,nueve_3.getText());
            }
        });
        nueve_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,nueve_4.getText());
            }
        });
        nueve_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,nueve_5.getText());
            }
        });
        nueve_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,nueve_6.getText());
            }
        });
        nueve_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,nueve_7.getText());
            }
        });
        nueve_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,nueve_8.getText());
            }
        });
        nueve_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarKeyTyped(evt,nueve_9.getText());
            }
        });
    }
    
    ActionListener acciones = new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            String resultado="Tiempo: ";
            time="";
            ++s;
            if(s==60){
                s=0;
                ++m;
            }
            if (m==60){
                m=0;
                ++h;
            }
            if (h<10){
                resultado+="0";
                time+="0";
            }
            resultado+=h+":";
            time+=h+":";
            if (m<10){
                resultado+="0";
                time+="0";
            }
            resultado+=m+":";
            time+=m+":";
            if (s<10){
                resultado+="0";
                time+="0";
            }
            resultado+=s+".";
            time+=s;
            tiempo.setText(resultado);
        }
    };
    
    private void validarKeyTyped(java.awt.event.KeyEvent evt,String s) {                                 
        char caracter = evt.getKeyChar();
        if(((caracter < '1') || (caracter > '9')))
            evt.consume();
        if (s.length()== 1)
            evt.consume();
    }
   
    ActionListener Validaciones = new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            if(estado==1)
                t.stop();
            if(matriz_v[0][0]==2)
                uno_1.setForeground(Color.red);
            else
                uno_1.setForeground(Color.BLACK);
            if(matriz_v[0][1]==2)
                uno_2.setForeground(Color.red);
            else
                uno_2.setForeground(Color.BLACK);
            if(matriz_v[0][2]==2)
                uno_3.setForeground(Color.red);
            else
                uno_3.setForeground(Color.BLACK);
            if(matriz_v[1][0]==2)
                uno_4.setForeground(Color.red);
            else
                uno_4.setForeground(Color.BLACK);
            if(matriz_v[1][1]==2)
                uno_5.setForeground(Color.red);
            else
                uno_5.setForeground(Color.BLACK);
            if(matriz_v[1][2]==2)
                uno_6.setForeground(Color.red);
            else
                uno_6.setForeground(Color.BLACK);
            if(matriz_v[2][0]==2)
                uno_7.setForeground(Color.red);
            else
                uno_7.setForeground(Color.BLACK);
            if(matriz_v[2][1]==2)
                uno_8.setForeground(Color.red);
            else
                uno_8.setForeground(Color.BLACK);
            if(matriz_v[2][2]==2)
                uno_9.setForeground(Color.red);
            else
                uno_9.setForeground(Color.BLACK);
            if(matriz_v[0][3]==2)
                dos_1.setForeground(Color.red);
            else
                dos_1.setForeground(Color.BLACK);
            if(matriz_v[0][4]==2)
                dos_2.setForeground(Color.red);
            else
                dos_2.setForeground(Color.BLACK);
            if(matriz_v[0][5]==2)
                dos_3.setForeground(Color.red);
            else
                dos_3.setForeground(Color.BLACK);
            if(matriz_v[1][3]==2)
                dos_4.setForeground(Color.red);
            else
                dos_4.setForeground(Color.BLACK);
            if(matriz_v[1][4]==2)
                dos_5.setForeground(Color.red);
            else
                dos_5.setForeground(Color.BLACK);
            if(matriz_v[1][5]==2)
                dos_6.setForeground(Color.red);
            else
                dos_6.setForeground(Color.BLACK);
            if(matriz_v[2][3]==2)
                dos_7.setForeground(Color.red);
            else
                dos_7.setForeground(Color.BLACK);
            if(matriz_v[2][4]==2)
                dos_8.setForeground(Color.red);
            else
                dos_8.setForeground(Color.BLACK);
            if(matriz_v[2][5]==2)
                dos_9.setForeground(Color.red);
            else
                dos_9.setForeground(Color.BLACK);
            if(matriz_v[0][6]==2)
                tres_1.setForeground(Color.red);
            else
                tres_1.setForeground(Color.BLACK);
            if(matriz_v[0][7]==2)
                tres_2.setForeground(Color.red);
            else
                tres_2.setForeground(Color.BLACK);
            if(matriz_v[0][8]==2)
                tres_3.setForeground(Color.red);
            else
                tres_3.setForeground(Color.BLACK);
            if(matriz_v[1][6]==2)
                tres_4.setForeground(Color.red);
            else
                tres_4.setForeground(Color.BLACK);
            if(matriz_v[1][7]==2)
                tres_5.setForeground(Color.red);
            else
                tres_5.setForeground(Color.BLACK);
            if(matriz_v[1][8]==2)
                tres_6.setForeground(Color.red);
            else
                tres_6.setForeground(Color.BLACK);
            if(matriz_v[2][6]==2)
                tres_7.setForeground(Color.red);
            else
                tres_7.setForeground(Color.BLACK);
            if(matriz_v[2][7]==2)
                tres_8.setForeground(Color.red);
            else
                tres_8.setForeground(Color.BLACK);
            if(matriz_v[2][8]==2)
                tres_9.setForeground(Color.red);
            else
                tres_9.setForeground(Color.BLACK);
            if(matriz_v[3][0]==2)
                cuatro_1.setForeground(Color.red);
            else
                cuatro_1.setForeground(Color.BLACK);
            if(matriz_v[3][1]==2)
                cuatro_2.setForeground(Color.red);
            else
                cuatro_2.setForeground(Color.BLACK);
            if(matriz_v[3][2]==2)
                cuatro_3.setForeground(Color.red);
            else
                cuatro_3.setForeground(Color.BLACK);
            if(matriz_v[4][0]==2)
                cuatro_4.setForeground(Color.red);
            else
                cuatro_4.setForeground(Color.BLACK);
            if(matriz_v[4][1]==2)
                cuatro_5.setForeground(Color.red);
            else
                cuatro_5.setForeground(Color.BLACK);
            if(matriz_v[4][2]==2)
                cuatro_6.setForeground(Color.red);
            else
                cuatro_6.setForeground(Color.BLACK);
            if(matriz_v[5][0]==2)
                cuatro_7.setForeground(Color.red);
            else
                cuatro_7.setForeground(Color.BLACK);
            if(matriz_v[5][1]==2)
                cuatro_8.setForeground(Color.red);
            else
                cuatro_8.setForeground(Color.BLACK);
            if(matriz_v[5][2]==2)
                cuatro_9.setForeground(Color.red);
            else
                cuatro_9.setForeground(Color.BLACK);
            if(matriz_v[3][3]==2)
                cinco_1.setForeground(Color.red);
            else
                cinco_1.setForeground(Color.BLACK);
            if(matriz_v[3][4]==2)
                cinco_2.setForeground(Color.red);
            else
                cinco_2.setForeground(Color.BLACK);
            if(matriz_v[3][5]==2)
                cinco_3.setForeground(Color.red);
            else
                cinco_3.setForeground(Color.BLACK);
            if(matriz_v[4][3]==2)
                cinco_4.setForeground(Color.red);
            else
                cinco_4.setForeground(Color.BLACK);
            if(matriz_v[4][4]==2)
                cinco_5.setForeground(Color.red);
            else
                cinco_5.setForeground(Color.BLACK);
            if(matriz_v[4][5]==2)
                cinco_6.setForeground(Color.red);
            else
                cinco_6.setForeground(Color.BLACK);
            if(matriz_v[5][3]==2)
                cinco_7.setForeground(Color.red);
            else
                cinco_7.setForeground(Color.BLACK);
            if(matriz_v[5][4]==2)
                cinco_8.setForeground(Color.red);
            else
                cinco_8.setForeground(Color.BLACK);
            if(matriz_v[5][5]==2)
                cinco_9.setForeground(Color.red);
            else
                cinco_9.setForeground(Color.BLACK);
            if(matriz_v[3][6]==2)
                seis_1.setForeground(Color.red);
            else
                seis_1.setForeground(Color.BLACK);
            if(matriz_v[3][7]==2)
                seis_2.setForeground(Color.red);
            else
                seis_2.setForeground(Color.BLACK);
            if(matriz_v[3][8]==2)
                seis_3.setForeground(Color.red);
            else
                seis_3.setForeground(Color.BLACK);
            if(matriz_v[4][6]==2)
                seis_4.setForeground(Color.red);
            else
                seis_4.setForeground(Color.BLACK);
            if(matriz_v[4][7]==2)
                seis_5.setForeground(Color.red);
            else
                seis_5.setForeground(Color.BLACK);
            if(matriz_v[4][8]==2)
                seis_6.setForeground(Color.red);
            else
                seis_6.setForeground(Color.BLACK);
            if(matriz_v[5][6]==2)
                seis_7.setForeground(Color.red);
            else
                seis_7.setForeground(Color.BLACK);
            if(matriz_v[5][7]==2)
                seis_8.setForeground(Color.red);
            else
                seis_8.setForeground(Color.BLACK);
            if(matriz_v[5][8]==2)
                seis_9.setForeground(Color.red);
            else
                seis_9.setForeground(Color.BLACK);
            if(matriz_v[6][0]==2)
                siete_1.setForeground(Color.red);
            else
                siete_1.setForeground(Color.BLACK);
            if(matriz_v[6][1]==2)
                siete_2.setForeground(Color.red);
            else
                siete_2.setForeground(Color.BLACK);
            if(matriz_v[6][2]==2)
                siete_3.setForeground(Color.red);
            else
                siete_3.setForeground(Color.BLACK);
            if(matriz_v[7][0]==2)
                siete_4.setForeground(Color.red);
            else
                siete_4.setForeground(Color.BLACK);
            if(matriz_v[7][1]==2)
                siete_5.setForeground(Color.red);
            else
                siete_5.setForeground(Color.BLACK);
            if(matriz_v[7][2]==2)
                siete_6.setForeground(Color.red);
            else
                siete_6.setForeground(Color.BLACK);
            if(matriz_v[8][0]==2)
                siete_7.setForeground(Color.red);
            else
                siete_7.setForeground(Color.BLACK);
            if(matriz_v[8][1]==2)
                siete_8.setForeground(Color.red);
            else
                siete_8.setForeground(Color.BLACK);
            if(matriz_v[8][2]==2)
                siete_9.setForeground(Color.red);
            else
                siete_9.setForeground(Color.BLACK);
            if(matriz_v[6][3]==2)
                ocho_1.setForeground(Color.red);
            else
                ocho_1.setForeground(Color.BLACK);
            if(matriz_v[6][4]==2)
                ocho_2.setForeground(Color.red);
            else
                ocho_2.setForeground(Color.BLACK);
            if(matriz_v[6][5]==2)
                ocho_3.setForeground(Color.red);
            else
                ocho_3.setForeground(Color.BLACK);
            if(matriz_v[7][3]==2)
                ocho_4.setForeground(Color.red);
            else
                ocho_4.setForeground(Color.BLACK);
            if(matriz_v[7][4]==2)
                ocho_5.setForeground(Color.red);
            else
                ocho_5.setForeground(Color.BLACK);
            if(matriz_v[7][5]==2)
                ocho_6.setForeground(Color.red);
            else
                ocho_6.setForeground(Color.BLACK);
            if(matriz_v[8][3]==2)
                ocho_7.setForeground(Color.red);
            else
                ocho_7.setForeground(Color.BLACK);
            if(matriz_v[8][4]==2)
                ocho_8.setForeground(Color.red);
            else
                ocho_8.setForeground(Color.BLACK);
            if(matriz_v[8][5]==2)
                ocho_9.setForeground(Color.red);
            else
                ocho_9.setForeground(Color.BLACK);
            if(matriz_v[6][6]==2)
                nueve_1.setForeground(Color.red);
            else
                nueve_1.setForeground(Color.BLACK);
            if(matriz_v[6][7]==2)
                nueve_2.setForeground(Color.red);
            else
                nueve_2.setForeground(Color.BLACK);
            if(matriz_v[6][8]==2)
                nueve_3.setForeground(Color.red);
            else
                nueve_3.setForeground(Color.BLACK);
            if(matriz_v[7][6]==2)
                nueve_4.setForeground(Color.red);
            else
                nueve_4.setForeground(Color.BLACK);
            if(matriz_v[7][7]==2)
                nueve_5.setForeground(Color.red);
            else
                nueve_5.setForeground(Color.BLACK);
            if(matriz_v[7][8]==2)
                nueve_6.setForeground(Color.red);
            else
                nueve_6.setForeground(Color.BLACK);
            if(matriz_v[8][6]==2)
                nueve_7.setForeground(Color.red);
            else
                nueve_7.setForeground(Color.BLACK);
            if(matriz_v[8][7]==2)
                nueve_8.setForeground(Color.red);
            else
                nueve_8.setForeground(Color.BLACK);
            if(matriz_v[8][8]==2)
                nueve_9.setForeground(Color.red);
            else
                nueve_9.setForeground(Color.BLACK);
            
            if (indicadores[0]>=9)
                numero_1.setVisible(false);
            else
                numero_1.setVisible(true);
            if (indicadores[1]>=9)
                numero_2.setVisible(false);
            else
                numero_2.setVisible(true);
            if (indicadores[2]>=9)
                numero_3.setVisible(false);
            else
                numero_3.setVisible(true);
            if (indicadores[3]>=9)
                numero_4.setVisible(false);
            else
                numero_4.setVisible(true);
            if (indicadores[4]>=9)
                numero_5.setVisible(false);
            else
                numero_5.setVisible(true);
            if (indicadores[5]>=9)
                numero_6.setVisible(false);
            else
                numero_6.setVisible(true);
            if (indicadores[6]>=9)
                numero_7.setVisible(false);
            else
                numero_7.setVisible(true);
            if (indicadores[7]>=9)
                numero_8.setVisible(false);
            else
                numero_8.setVisible(true);
            if (indicadores[8]>=9)
                numero_9.setVisible(false);
            else
                numero_9.setVisible(true);
            
            matriz_s = new int[9][9];
            if(uno_1.getText().length()==1)
                matriz_s[0][0]=Integer.parseInt(uno_1.getText());
            else
                matriz_s[0][0]=0;
            if(uno_2.getText().length()==1)
                matriz_s[0][1]=Integer.parseInt(uno_2.getText());
            else
                matriz_s[0][1]=0;
            if(uno_3.getText().length()==1)
                matriz_s[0][2]=Integer.parseInt(uno_3.getText());
            else
                matriz_s[0][2]=0;
            if(uno_4.getText().length()==1)
                matriz_s[1][0]=Integer.parseInt(uno_4.getText());
            else
                matriz_s[1][0]=0;
            if(uno_5.getText().length()==1)
                matriz_s[1][1]=Integer.parseInt(uno_5.getText());
            else
                matriz_s[1][1]=0;
            if(uno_6.getText().length()==1)
                matriz_s[1][2]=Integer.parseInt(uno_6.getText());
            else
                matriz_s[1][2]=0;
            if(uno_7.getText().length()==1)
                matriz_s[2][0]=Integer.parseInt(uno_7.getText());
            else
                matriz_s[2][0]=0;
            if(uno_8.getText().length()==1)
                matriz_s[2][1]=Integer.parseInt(uno_8.getText());
            else
                matriz_s[2][1]=0;
            if(uno_9.getText().length()==1)
                matriz_s[2][2]=Integer.parseInt(uno_9.getText());
            else
                matriz_s[2][2]=0;
            if(dos_1.getText().length()==1)
                matriz_s[0][3]=Integer.parseInt(dos_1.getText());
            else
                matriz_s[0][3]=0;
            if(dos_2.getText().length()==1)
                matriz_s[0][4]=Integer.parseInt(dos_2.getText());
            else
                matriz_s[0][4]=0;
            if(dos_3.getText().length()==1)
                matriz_s[0][5]=Integer.parseInt(dos_3.getText());
            else
                matriz_s[0][5]=0;
            if(dos_4.getText().length()==1)
                matriz_s[1][3]=Integer.parseInt(dos_4.getText());
            else
                matriz_s[1][3]=0;
            if(dos_5.getText().length()==1)
                matriz_s[1][4]=Integer.parseInt(dos_5.getText());
            else
                matriz_s[1][4]=0;
            if(dos_6.getText().length()==1)
                matriz_s[1][5]=Integer.parseInt(dos_6.getText());
            else
                matriz_s[1][5]=0;
            if(dos_7.getText().length()==1)
                matriz_s[2][3]=Integer.parseInt(dos_7.getText());
            else
                matriz_s[2][3]=0;
            if(dos_8.getText().length()==1)
                matriz_s[2][4]=Integer.parseInt(dos_8.getText());
            else
                matriz_s[2][4]=0;
            if(dos_9.getText().length()==1)
                matriz_s[2][5]=Integer.parseInt(dos_9.getText());
            else
                matriz_s[2][5]=0;
            if(tres_1.getText().length()==1)
                matriz_s[0][6]=Integer.parseInt(tres_1.getText());
            else
                matriz_s[0][6]=0;
            if(tres_2.getText().length()==1)
                matriz_s[0][7]=Integer.parseInt(tres_2.getText());
            else
                matriz_s[0][7]=0;
            if(tres_3.getText().length()==1)
                matriz_s[0][8]=Integer.parseInt(tres_3.getText());
            else
                matriz_s[0][8]=0;
            if(tres_4.getText().length()==1)
                matriz_s[1][6]=Integer.parseInt(tres_4.getText());
            else
                matriz_s[1][6]=0;
            if(tres_5.getText().length()==1)
                matriz_s[1][7]=Integer.parseInt(tres_5.getText());
            else
                matriz_s[1][7]=0;
            if(tres_6.getText().length()==1)
                matriz_s[1][8]=Integer.parseInt(tres_6.getText());
            else
                matriz_s[1][8]=0;
            if(tres_7.getText().length()==1)
                matriz_s[2][6]=Integer.parseInt(tres_7.getText());
            else
                matriz_s[2][6]=0;
            if(tres_8.getText().length()==1)
                matriz_s[2][7]=Integer.parseInt(tres_8.getText());
            else
                matriz_s[2][7]=0;
            if(tres_9.getText().length()==1)
                matriz_s[2][8]=Integer.parseInt(tres_9.getText());
            else
                matriz_s[2][8]=0;
            if(cuatro_1.getText().length()==1)
                matriz_s[3][0]=Integer.parseInt(cuatro_1.getText());
            else
                matriz_s[3][0]=0;
            if(cuatro_2.getText().length()==1)
                matriz_s[3][1]=Integer.parseInt(cuatro_2.getText());
            else
                matriz_s[3][1]=0;
            if(cuatro_3.getText().length()==1)
                matriz_s[3][2]=Integer.parseInt(cuatro_3.getText());
            else
                matriz_s[3][2]=0;
            if(cuatro_4.getText().length()==1)
                matriz_s[4][0]=Integer.parseInt(cuatro_4.getText());
            else
                matriz_s[4][0]=0;
            if(cuatro_5.getText().length()==1)
                matriz_s[4][1]=Integer.parseInt(cuatro_5.getText());
            else
                matriz_s[4][1]=0;
            if(cuatro_6.getText().length()==1)
                matriz_s[4][2]=Integer.parseInt(cuatro_6.getText());
            else
                matriz_s[4][2]=0;
            if(cuatro_7.getText().length()==1)
                matriz_s[5][0]=Integer.parseInt(cuatro_7.getText());
            else
                matriz_s[5][0]=0;
            if(cuatro_8.getText().length()==1)
                matriz_s[5][1]=Integer.parseInt(cuatro_8.getText());
            else
                matriz_s[5][1]=0;
            if(cuatro_9.getText().length()==1)
                matriz_s[5][2]=Integer.parseInt(cuatro_9.getText());
            else
                matriz_s[5][2]=0;
            if(cinco_1.getText().length()==1)
                matriz_s[3][3]=Integer.parseInt(cinco_1.getText());
            else
                matriz_s[3][3]=0;
            if(cinco_2.getText().length()==1)
                matriz_s[3][4]=Integer.parseInt(cinco_2.getText());
            else
                matriz_s[3][4]=0;
            if(cinco_3.getText().length()==1)
                matriz_s[3][5]=Integer.parseInt(cinco_3.getText());
            else
                matriz_s[3][5]=0;
            if(cinco_4.getText().length()==1)
                matriz_s[4][3]=Integer.parseInt(cinco_4.getText());
            else
                matriz_s[4][3]=0;
            if(cinco_5.getText().length()==1)
                matriz_s[4][4]=Integer.parseInt(cinco_5.getText());
            else
                matriz_s[4][4]=0;
            if(cinco_6.getText().length()==1)
                matriz_s[4][5]=Integer.parseInt(cinco_6.getText());
            else
                matriz_s[4][5]=0;
            if(cinco_7.getText().length()==1)
                matriz_s[5][3]=Integer.parseInt(cinco_7.getText());
            else
                matriz_s[5][3]=0;
            if(cinco_8.getText().length()==1)
                matriz_s[5][4]=Integer.parseInt(cinco_8.getText());
            else
                matriz_s[5][4]=0;
            if(cinco_9.getText().length()==1)
                matriz_s[5][5]=Integer.parseInt(cinco_9.getText());
            else
                matriz_s[5][5]=0;
            if(seis_1.getText().length()==1)
                matriz_s[3][6]=Integer.parseInt(seis_1.getText());
            else
                matriz_s[3][6]=0;
            if(seis_2.getText().length()==1)
                matriz_s[3][7]=Integer.parseInt(seis_2.getText());
            else
                matriz_s[3][7]=0;
            if(seis_3.getText().length()==1)
                matriz_s[3][8]=Integer.parseInt(seis_3.getText());
            else
                matriz_s[3][8]=0;
            if(seis_4.getText().length()==1)
                matriz_s[4][6]=Integer.parseInt(seis_4.getText());
            else
                matriz_s[4][6]=0;
            if(seis_5.getText().length()==1)
                matriz_s[4][7]=Integer.parseInt(seis_5.getText());
            else
                matriz_s[4][7]=0;
            if(seis_6.getText().length()==1)
                matriz_s[4][8]=Integer.parseInt(seis_6.getText());
            else
                matriz_s[4][8]=0;
            if(seis_7.getText().length()==1)
                matriz_s[5][6]=Integer.parseInt(seis_7.getText());
            else
                matriz_s[5][6]=0;
            if(seis_8.getText().length()==1)
                matriz_s[5][7]=Integer.parseInt(seis_8.getText());
            else
                matriz_s[5][7]=0;
            if(seis_9.getText().length()==1)
                matriz_s[5][8]=Integer.parseInt(seis_9.getText());
            else
                matriz_s[5][8]=0;
            if(siete_1.getText().length()==1)
                matriz_s[6][0]=Integer.parseInt(siete_1.getText());
            else
                matriz_s[6][0]=0;
            if(siete_2.getText().length()==1)
                matriz_s[6][1]=Integer.parseInt(siete_2.getText());
            else
                matriz_s[6][1]=0;
            if(siete_3.getText().length()==1)
                matriz_s[6][2]=Integer.parseInt(siete_3.getText());
            else
                matriz_s[6][2]=0;
            if(siete_4.getText().length()==1)
                matriz_s[7][0]=Integer.parseInt(siete_4.getText());
            else
                matriz_s[7][0]=0;
            if(siete_5.getText().length()==1)
                matriz_s[7][1]=Integer.parseInt(siete_5.getText());
            else
                matriz_s[7][1]=0;
            if(siete_6.getText().length()==1)
                matriz_s[7][2]=Integer.parseInt(siete_6.getText());
            else
                matriz_s[7][2]=0;
            if(siete_7.getText().length()==1)
                matriz_s[8][0]=Integer.parseInt(siete_7.getText());
            else
                matriz_s[8][0]=0;
            if(siete_8.getText().length()==1)
                matriz_s[8][1]=Integer.parseInt(siete_8.getText());
            else
                matriz_s[8][1]=0;
            if(siete_9.getText().length()==1)
                matriz_s[8][2]=Integer.parseInt(siete_9.getText());
            else
                matriz_s[8][2]=0;
            if(ocho_1.getText().length()==1)
                matriz_s[6][3]=Integer.parseInt(ocho_1.getText());
            else
                matriz_s[6][3]=0;
            if(ocho_2.getText().length()==1)
                matriz_s[6][4]=Integer.parseInt(ocho_2.getText());
            else
                matriz_s[6][4]=0;
            if(ocho_3.getText().length()==1)
                matriz_s[6][5]=Integer.parseInt(ocho_3.getText());
            else
                matriz_s[6][5]=0;
            if(ocho_4.getText().length()==1)
                matriz_s[7][3]=Integer.parseInt(ocho_4.getText());
            else
                matriz_s[7][3]=0;
            if(ocho_5.getText().length()==1)
                matriz_s[7][4]=Integer.parseInt(ocho_5.getText());
            else
                matriz_s[7][4]=0;
            if(ocho_6.getText().length()==1)
                matriz_s[7][5]=Integer.parseInt(ocho_6.getText());
            else
                matriz_s[7][5]=0;
            if(ocho_7.getText().length()==1)
                matriz_s[8][3]=Integer.parseInt(ocho_7.getText());
            else
                matriz_s[8][3]=0;
            if(ocho_8.getText().length()==1)
                matriz_s[8][4]=Integer.parseInt(ocho_8.getText());
            else
                matriz_s[8][4]=0;
            if(ocho_9.getText().length()==1)
                matriz_s[8][5]=Integer.parseInt(ocho_9.getText());
            else
                matriz_s[8][5]=0;
            if(nueve_1.getText().length()==1)
                matriz_s[6][6]=Integer.parseInt(nueve_1.getText());
            else
                matriz_s[6][6]=0;
            if(nueve_2.getText().length()==1)
                matriz_s[6][7]=Integer.parseInt(nueve_2.getText());
            else
                matriz_s[6][7]=0;
            if(nueve_3.getText().length()==1)
                matriz_s[6][8]=Integer.parseInt(nueve_3.getText());
            else
                matriz_s[6][8]=0;
            if(nueve_4.getText().length()==1)
                matriz_s[7][6]=Integer.parseInt(nueve_4.getText());
            else
                matriz_s[7][6]=0;
            if(nueve_5.getText().length()==1)
                matriz_s[7][7]=Integer.parseInt(nueve_5.getText());
            else
                matriz_s[7][7]=0;
            if(nueve_6.getText().length()==1)
                matriz_s[7][8]=Integer.parseInt(nueve_6.getText());
            else
                matriz_s[7][8]=0;
            if(nueve_7.getText().length()==1)
                matriz_s[8][6]=Integer.parseInt(nueve_7.getText());
            else
                matriz_s[8][6]=0;
            if(nueve_8.getText().length()==1)
                matriz_s[8][7]=Integer.parseInt(nueve_8.getText());
            else
                matriz_s[8][7]=0;
            if(nueve_9.getText().length()==1)
                matriz_s[8][8]=Integer.parseInt(nueve_9.getText());
            else
                matriz_s[8][8]=0;
        }
    };
    private void InicializarComp(){
        if(matriz_v[0][0]==1){
            uno_1.setEnabled(false);
            uno_1.setText(String.valueOf(matriz_l[0][0]));
        }else
            uno_1.setText("");
        if(matriz_v[0][1]==1){
            uno_2.setEnabled(false);
            uno_2.setText(String.valueOf(matriz_l[0][1]));
        }else
            uno_2.setText("");    
        if(matriz_v[0][2]==1){
            uno_3.setEnabled(false);
            uno_3.setText(String.valueOf(matriz_l[0][2]));
        }else
            uno_3.setText("");
        if(matriz_v[1][0]==1){
            uno_4.setEnabled(false);
            uno_4.setText(String.valueOf(matriz_l[1][0]));
        }else
            uno_4.setText("");
        if(matriz_v[1][1]==1){
            uno_5.setEnabled(false);
            uno_5.setText(String.valueOf(matriz_l[1][1]));
        }else
            uno_5.setText("");
        if(matriz_v[1][2]==1){
            uno_6.setEnabled(false);
            uno_6.setText(String.valueOf(matriz_l[1][2]));
        }else
            uno_6.setText("");
        if(matriz_v[2][0]==1){
            uno_7.setEnabled(false);
            uno_7.setText(String.valueOf(matriz_l[2][0]));
        }else
            uno_7.setText("");
        if(matriz_v[2][1]==1){
            uno_8.setEnabled(false);
            uno_8.setText(String.valueOf(matriz_l[2][1]));
        }else
            uno_8.setText("");
        if(matriz_v[2][2]==1){
            uno_9.setEnabled(false);
            uno_9.setText(String.valueOf(matriz_l[2][2]));
        }else
            uno_9.setText("");
        if(matriz_v[0][3]==1){
            dos_1.setEnabled(false);
            dos_1.setText(String.valueOf(matriz_l[0][3]));
        }else
            dos_1.setText("");
        if(matriz_v[0][4]==1){
            dos_2.setEnabled(false);
            dos_2.setText(String.valueOf(matriz_l[0][4]));
        }else
            dos_2.setText("");    
        if(matriz_v[0][5]==1){
            dos_3.setEnabled(false);
            dos_3.setText(String.valueOf(matriz_l[0][5]));
        }else
            dos_3.setText("");
        if(matriz_v[1][3]==1){
            dos_4.setEnabled(false);
            dos_4.setText(String.valueOf(matriz_l[1][3]));
        }else
            dos_4.setText("");
        if(matriz_v[1][4]==1){
            dos_5.setEnabled(false);
            dos_5.setText(String.valueOf(matriz_l[1][4]));
        }else
            dos_5.setText("");
        if(matriz_v[1][5]==1){
            dos_6.setEnabled(false);
            dos_6.setText(String.valueOf(matriz_l[1][5]));
        }else
            dos_6.setText("");
        if(matriz_v[2][3]==1){
            dos_7.setEnabled(false);
            dos_7.setText(String.valueOf(matriz_l[2][3]));
        }else
            dos_7.setText("");
        if(matriz_v[2][4]==1){
            dos_8.setEnabled(false);
            dos_8.setText(String.valueOf(matriz_l[2][4]));
        }else
            dos_8.setText("");
        if(matriz_v[2][5]==1){
            dos_9.setEnabled(false);
            dos_9.setText(String.valueOf(matriz_l[2][5]));
        }else
            dos_9.setText("");
        if(matriz_v[0][6]==1){
            tres_1.setEnabled(false);
            tres_1.setText(String.valueOf(matriz_l[0][6]));
        }else
            tres_1.setText("");
        if(matriz_v[0][7]==1){
            tres_2.setEnabled(false);
            tres_2.setText(String.valueOf(matriz_l[0][7]));
        }else
            tres_2.setText("");    
        if(matriz_v[0][8]==1){
            tres_3.setEnabled(false);
            tres_3.setText(String.valueOf(matriz_l[0][8]));
        }else
            tres_3.setText("");
        if(matriz_v[1][6]==1){
            tres_4.setEnabled(false);
            tres_4.setText(String.valueOf(matriz_l[1][6]));
        }else
            tres_4.setText("");
        if(matriz_v[1][7]==1){
            tres_5.setEnabled(false);
            tres_5.setText(String.valueOf(matriz_l[1][7]));
        }else
            tres_5.setText("");
        if(matriz_v[1][8]==1){
            tres_6.setEnabled(false);
            tres_6.setText(String.valueOf(matriz_l[1][8]));
        }else
            tres_6.setText("");
        if(matriz_v[2][6]==1){
            tres_7.setEnabled(false);
            tres_7.setText(String.valueOf(matriz_l[2][6]));
        }else
            tres_7.setText("");
        if(matriz_v[2][7]==1){
            tres_8.setEnabled(false);
            tres_8.setText(String.valueOf(matriz_l[2][7]));
        }else
            tres_8.setText("");
        if(matriz_v[2][8]==1){
            tres_9.setEnabled(false);
            tres_9.setText(String.valueOf(matriz_l[2][8]));
        }else
            tres_9.setText("");
        if(matriz_v[3][0]==1){
            cuatro_1.setEnabled(false);
            cuatro_1.setText(String.valueOf(matriz_l[3][0]));
        }else
            cuatro_1.setText("");
        if(matriz_v[3][1]==1){
            cuatro_2.setEnabled(false);
            cuatro_2.setText(String.valueOf(matriz_l[3][1]));
        }else
            cuatro_2.setText("");
        if(matriz_v[3][2]==1){
            cuatro_3.setEnabled(false);
            cuatro_3.setText(String.valueOf(matriz_l[3][2]));
        }else
            cuatro_3.setText("");
        if(matriz_v[4][0]==1){
            cuatro_4.setEnabled(false);
            cuatro_4.setText(String.valueOf(matriz_l[4][0]));
        }else
            cuatro_4.setText("");
        if(matriz_v[4][1]==1){
            cuatro_5.setEnabled(false);
            cuatro_5.setText(String.valueOf(matriz_l[4][1]));
        }else
            cuatro_5.setText("");
        if(matriz_v[4][2]==1){
            cuatro_6.setEnabled(false);
            cuatro_6.setText(String.valueOf(matriz_l[4][2]));
        }else
            cuatro_6.setText("");
        if(matriz_v[5][0]==1){
            cuatro_7.setEnabled(false);
            cuatro_7.setText(String.valueOf(matriz_l[5][0]));
        }else
            cuatro_7.setText("");
        if(matriz_v[5][1]==1){
            cuatro_8.setEnabled(false);
            cuatro_8.setText(String.valueOf(matriz_l[5][1]));
        }else
            cuatro_8.setText("");
        if(matriz_v[5][2]==1){
            cuatro_9.setEnabled(false);
            cuatro_9.setText(String.valueOf(matriz_l[5][2]));
        }else
            cuatro_9.setText("");
        if(matriz_v[3][3]==1){
            cinco_1.setEnabled(false);
            cinco_1.setText(String.valueOf(matriz_l[3][3]));
        }else
            cinco_1.setText("");
        if(matriz_v[3][4]==1){
            cinco_2.setEnabled(false);
            cinco_2.setText(String.valueOf(matriz_l[3][4]));
        }else
            cinco_2.setText("");
        if(matriz_v[3][5]==1){
            cinco_3.setEnabled(false);
            cinco_3.setText(String.valueOf(matriz_l[3][5]));
        }else
            cinco_3.setText("");
        if(matriz_v[4][3]==1){
            cinco_4.setEnabled(false);
            cinco_4.setText(String.valueOf(matriz_l[4][3]));
        }else
            cinco_4.setText("");
        if(matriz_v[4][4]==1){
            cinco_5.setEnabled(false);
            cinco_5.setText(String.valueOf(matriz_l[4][4]));
        }else
            cinco_5.setText("");
        if(matriz_v[4][5]==1){
            cinco_6.setEnabled(false);
            cinco_6.setText(String.valueOf(matriz_l[4][5]));
        }else
            cinco_6.setText("");
        if(matriz_v[5][3]==1){
            cinco_7.setEnabled(false);
            cinco_7.setText(String.valueOf(matriz_l[5][3]));
        }else
            cinco_7.setText("");
        if(matriz_v[5][4]==1){
            cinco_8.setEnabled(false);
            cinco_8.setText(String.valueOf(matriz_l[5][4]));
        }else
            cinco_8.setText("");
        if(matriz_v[5][5]==1){
            cinco_9.setEnabled(false);
            cinco_9.setText(String.valueOf(matriz_l[5][5]));
        }else
            cinco_9.setText("");
        if(matriz_v[3][6]==1){
            seis_1.setEnabled(false);
            seis_1.setText(String.valueOf(matriz_l[3][6]));
        }else
            seis_1.setText("");
        if(matriz_v[3][7]==1){
            seis_2.setEnabled(false);
            seis_2.setText(String.valueOf(matriz_l[3][7]));
        }else
            seis_2.setText("");
        if(matriz_v[3][8]==1){
            seis_3.setEnabled(false);
            seis_3.setText(String.valueOf(matriz_l[3][8]));
        }else
            seis_3.setText("");
        if(matriz_v[4][6]==1){
            seis_4.setEnabled(false);
            seis_4.setText(String.valueOf(matriz_l[4][6]));
        }else
            seis_4.setText("");
        if(matriz_v[4][7]==1){
            seis_5.setEnabled(false);
            seis_5.setText(String.valueOf(matriz_l[4][7]));
        }else
            seis_5.setText("");
        if(matriz_v[4][8]==1){
            seis_6.setEnabled(false);
            seis_6.setText(String.valueOf(matriz_l[4][8]));
        }else
            seis_6.setText("");
        if(matriz_v[5][6]==1){
            seis_7.setEnabled(false);
            seis_7.setText(String.valueOf(matriz_l[5][6]));
        }else
            seis_7.setText("");
        if(matriz_v[5][7]==1){
            seis_8.setEnabled(false);
            seis_8.setText(String.valueOf(matriz_l[5][7]));
        }else
            seis_8.setText("");
        if(matriz_v[5][8]==1){
            seis_9.setEnabled(false);
            seis_9.setText(String.valueOf(matriz_l[5][8]));
        }else
            seis_9.setText("");
        if(matriz_v[6][0]==1){
            siete_1.setEnabled(false);
            siete_1.setText(String.valueOf(matriz_l[6][0]));
        }else
            siete_1.setText("");
        if(matriz_v[6][1]==1){
            siete_2.setEnabled(false);
            siete_2.setText(String.valueOf(matriz_l[6][1]));
        }else
            siete_2.setText("");
        if(matriz_v[6][2]==1){
            siete_3.setEnabled(false);
            siete_3.setText(String.valueOf(matriz_l[6][2]));
        }else
            siete_3.setText("");
        if(matriz_v[7][0]==1){
            siete_4.setEnabled(false);
            siete_4.setText(String.valueOf(matriz_l[7][0]));
        }else
            siete_4.setText("");
        if(matriz_v[7][1]==1){
            siete_5.setEnabled(false);
            siete_5.setText(String.valueOf(matriz_l[7][1]));
        }else
            siete_5.setText("");
        if(matriz_v[7][2]==1){
            siete_6.setEnabled(false);
            siete_6.setText(String.valueOf(matriz_l[7][2]));
        }else
            siete_6.setText("");
        if(matriz_v[8][0]==1){
            siete_7.setEnabled(false);
            siete_7.setText(String.valueOf(matriz_l[8][0]));
        }else
            siete_7.setText("");
        if(matriz_v[8][1]==1){
            siete_8.setEnabled(false);
            siete_8.setText(String.valueOf(matriz_l[8][1]));
        }else
            siete_8.setText("");
        if(matriz_v[8][2]==1){
            siete_9.setEnabled(false);
            siete_9.setText(String.valueOf(matriz_l[8][2]));
        }else
            siete_9.setText("");
        if(matriz_v[6][3]==1){
            ocho_1.setEnabled(false);
            ocho_1.setText(String.valueOf(matriz_l[6][3]));
        }else
            ocho_1.setText("");
        if(matriz_v[6][4]==1){
            ocho_2.setEnabled(false);
            ocho_2.setText(String.valueOf(matriz_l[6][4]));
        }else
            ocho_2.setText("");
        if(matriz_v[6][5]==1){
            ocho_3.setEnabled(false);
            ocho_3.setText(String.valueOf(matriz_l[6][5]));
        }else
            ocho_3.setText("");
        if(matriz_v[7][3]==1){
            ocho_4.setEnabled(false);
            ocho_4.setText(String.valueOf(matriz_l[7][3]));
        }else
            ocho_4.setText("");
        if(matriz_v[7][4]==1){
            ocho_5.setEnabled(false);
            ocho_5.setText(String.valueOf(matriz_l[7][4]));
        }else
            ocho_5.setText("");
        if(matriz_v[7][5]==1){
            ocho_6.setEnabled(false);
            ocho_6.setText(String.valueOf(matriz_l[7][5]));
        }else
            ocho_6.setText("");
        if(matriz_v[8][3]==1){
            ocho_7.setEnabled(false);
            ocho_7.setText(String.valueOf(matriz_l[8][3]));
        }else
            ocho_7.setText("");
        if(matriz_v[8][4]==1){
            ocho_8.setEnabled(false);
            ocho_8.setText(String.valueOf(matriz_l[8][4]));
        }else
            ocho_8.setText("");
        if(matriz_v[8][5]==1){
            ocho_9.setEnabled(false);
            ocho_9.setText(String.valueOf(matriz_l[8][5]));
        }else
            ocho_9.setText("");
        if(matriz_v[6][6]==1){
            nueve_1.setEnabled(false);
            nueve_1.setText(String.valueOf(matriz_l[6][6]));
        }else
            nueve_1.setText("");
        if(matriz_v[6][7]==1){
            nueve_2.setEnabled(false);
            nueve_2.setText(String.valueOf(matriz_l[6][7]));
        }else
            nueve_2.setText("");
        if(matriz_v[6][8]==1){
            nueve_3.setEnabled(false);
            nueve_3.setText(String.valueOf(matriz_l[6][8]));
        }else
            nueve_3.setText("");
        if(matriz_v[7][6]==1){
            nueve_4.setEnabled(false);
            nueve_4.setText(String.valueOf(matriz_l[7][6]));
        }else
            nueve_4.setText("");
        if(matriz_v[7][7]==1){
            nueve_5.setEnabled(false);
            nueve_5.setText(String.valueOf(matriz_l[7][7]));
        }else
            nueve_5.setText("");
        if(matriz_v[7][8]==1){
            nueve_6.setEnabled(false);
            nueve_6.setText(String.valueOf(matriz_l[7][8]));
        }else
            nueve_6.setText("");
        if(matriz_v[8][6]==1){
            nueve_7.setEnabled(false);
            nueve_7.setText(String.valueOf(matriz_l[8][6]));
        }else
            nueve_7.setText("");
        if(matriz_v[8][7]==1){
            nueve_8.setEnabled(false);
            nueve_8.setText(String.valueOf(matriz_l[8][7]));
        }else
            nueve_8.setText("");
        if(matriz_v[8][8]==1){
            nueve_9.setEnabled(false);
            nueve_9.setText(String.valueOf(matriz_l[8][8]));
        }else
            nueve_9.setText("");
        Color gris_c=new Color(111,118,121);
        uno_1.setBackground(gris_c);
        uno_2.setBackground(gris_c);
        uno_3.setBackground(gris_c);
        uno_4.setBackground(gris_c);
        uno_5.setBackground(gris_c);
        uno_6.setBackground(gris_c);
        uno_7.setBackground(gris_c);
        uno_8.setBackground(gris_c);
        uno_9.setBackground(gris_c);

        dos_1.setBackground(gris_c);
        dos_2.setBackground(gris_c);
        dos_3.setBackground(gris_c);
        dos_4.setBackground(gris_c);
        dos_5.setBackground(gris_c);
        dos_6.setBackground(gris_c);
        dos_7.setBackground(gris_c);
        dos_8.setBackground(gris_c);
        dos_9.setBackground(gris_c);

        tres_1.setBackground(gris_c);
        tres_2.setBackground(gris_c);
        tres_3.setBackground(gris_c);
        tres_4.setBackground(gris_c);
        tres_5.setBackground(gris_c);
        tres_6.setBackground(gris_c);
        tres_7.setBackground(gris_c);
        tres_8.setBackground(gris_c);
        tres_9.setBackground(gris_c);

        cuatro_1.setBackground(gris_c);
        cuatro_2.setBackground(gris_c);
        cuatro_3.setBackground(gris_c);
        cuatro_4.setBackground(gris_c);
        cuatro_5.setBackground(gris_c);
        cuatro_6.setBackground(gris_c);
        cuatro_7.setBackground(gris_c);
        cuatro_8.setBackground(gris_c);
        cuatro_9.setBackground(gris_c);

        cinco_1.setBackground(gris_c);
        cinco_2.setBackground(gris_c);
        cinco_3.setBackground(gris_c);
        cinco_4.setBackground(gris_c);
        cinco_5.setBackground(gris_c);
        cinco_6.setBackground(gris_c);
        cinco_7.setBackground(gris_c);
        cinco_8.setBackground(gris_c);
        cinco_9.setBackground(gris_c);

        seis_1.setBackground(gris_c);
        seis_2.setBackground(gris_c);
        seis_3.setBackground(gris_c);
        seis_4.setBackground(gris_c);
        seis_5.setBackground(gris_c);
        seis_6.setBackground(gris_c);
        seis_7.setBackground(gris_c);
        seis_8.setBackground(gris_c);
        seis_9.setBackground(gris_c);

        siete_1.setBackground(gris_c);
        siete_2.setBackground(gris_c);
        siete_3.setBackground(gris_c);
        siete_4.setBackground(gris_c);
        siete_5.setBackground(gris_c);
        siete_6.setBackground(gris_c);
        siete_7.setBackground(gris_c);
        siete_8.setBackground(gris_c);
        siete_9.setBackground(gris_c);

        ocho_1.setBackground(gris_c);
        ocho_2.setBackground(gris_c);
        ocho_3.setBackground(gris_c);
        ocho_4.setBackground(gris_c);
        ocho_5.setBackground(gris_c);
        ocho_6.setBackground(gris_c);
        ocho_7.setBackground(gris_c);
        ocho_8.setBackground(gris_c);
        ocho_9.setBackground(gris_c);

        nueve_1.setBackground(gris_c);
        nueve_2.setBackground(gris_c);
        nueve_3.setBackground(gris_c);
        nueve_4.setBackground(gris_c);
        nueve_5.setBackground(gris_c);
        nueve_6.setBackground(gris_c);
        nueve_7.setBackground(gris_c);
        nueve_8.setBackground(gris_c);
        nueve_9.setBackground(gris_c);
        
        
    }
    
    
}