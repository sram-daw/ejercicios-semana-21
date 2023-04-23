import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        //Ventana
        JFrame ventana = new JFrame();
        ventana.setBounds(120, 70, 1600, 900);
        ventana.setTitle("Probando la librería Swing en Java II");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GridLayout grid = new GridLayout(3, 3);
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 30, 40);
        grid.setHgap(20);
        grid.setVgap(20);
        ventana.setLayout(grid);

        //Menú superior
        JMenuBar menuBar = new JMenuBar();
        //Se crean las distintas pestañas
        JMenu archivo = new JMenu("Archivo");
        JMenu acciones = new JMenu("Acciones");
        JMenu ayuda = new JMenu("Ayuda");
        //Se crean las opciones (item) que luego aparecerán como un desplegable en cada pestaña
        JMenuItem version = new JMenuItem("Versión");
        JMenuItem about = new JMenuItem("Acerca de");
        //Se añaden los items a cada pestaña
        ayuda.add(version);
        ayuda.add(about);
        //Se añaden al menú las pestañas
        menuBar.add(archivo);
        menuBar.add(acciones);
        menuBar.add(ayuda);
        ventana.setJMenuBar(menuBar); //Se establece menuBar como el menu de la ventana
        version.addActionListener(e -> JOptionPane.showMessageDialog(ventana, "2.45.03", "Versión", JOptionPane.INFORMATION_MESSAGE));  //expresión lambda que sustituye el new Action listener y las llaves
        about.addActionListener(e -> JOptionPane.showMessageDialog(ventana,"Este programa es un simulador de ligas deportivas que permite crear y gestionar equipos, jugar jornadas y obtener resultados estadísticos.", "Acerca de", JOptionPane.INFORMATION_MESSAGE));
        //Creación de varios botones y de sus paneles
        JPanel panelBotonesMenu = new JPanel(flow);
        Button botonNLiga = new Button("Nueva liga");
        Button botonJugar = new Button("Jugar liga");
        Button botonJornada = new Button("Siguiente jornada");
        Button botonSalir = new Button("SALIR");
        panelBotonesMenu.add(botonNLiga);
        panelBotonesMenu.add(botonJugar);
        panelBotonesMenu.add(botonJornada);
        panelBotonesMenu.add(botonSalir);
        ventana.add(panelBotonesMenu);
        Button boton1;
        JPanel panelBotonesBucle = new JPanel(grid);
        for (int i = 1; i < 12; i++) {
            boton1 = new Button("Botón" + i);
            panelBotonesBucle.add(boton1);
        }
        //Se añade un listener al botón de salir para que se cierre el programa
        botonSalir.addActionListener(e -> System.exit(0));
        botonNLiga.addActionListener(e -> System.out.println("Creando nueva liga..."));
        botonJugar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Haz click para simular una liga completa.");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        botonJornada.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(ventana, "Simulando jornada...", "Proceso en curso", JOptionPane.INFORMATION_MESSAGE); //el primer parámetro hace referencia a la ventana padre
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        ventana.add(panelBotonesBucle);
        ventana.setVisible(true);
        ventana.setResizable(false); //se deshabilita la redimensión de la ventana

    }
}