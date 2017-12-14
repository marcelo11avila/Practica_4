/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Estudiante
 */
public class VentanaDireccion extends JFrame {
    
     private JDesktopPane escritorio;
    private JMenuBar barraMenu;
    private JMenu menu1;
    private JMenu menu2;
    private JMenu menu3;
    private JMenu menu4;
    private JMenu menu5;
    private JMenu menu6;
    private List<JMenuItem> itemMenuList;
   /* private GestionDato gestionDato;

    public VentanaPrincipal(GestionDato gestionDato) {
        super("Gestion Inscripcion");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(3);
        this.gestionDato=gestionDato;
        this.setVisible(true);
        this.iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        this.escritorio= new JDesktopPane();
        this.barraMenu= new JMenuBar();
        this.menu1= new JMenu("Registro de Persona");
        this.menu2= new JMenu("Registro de Universidad");
        this.menu3= new JMenu("Registro de Carrera");
        this.menu4= new JMenu("Inscripcion");
        this.menu5= new JMenu("Consulta Universidad");
        this.menu6= new JMenu("Consulta Carrera");
        this.itemMenuList= new ArrayList<JMenuItem>();
        this.itemMenuList.add(new JMenuItem("Registrar Persona"));
        this.itemMenuList.add(new JMenuItem("Registrar Universidad"));
        this.itemMenuList.add(new JMenuItem("Registrar Carrera"));
        this.itemMenuList.add(new JMenuItem("Registrar Inscripcion"));
        this.itemMenuList.add(new JMenuItem("consulta listado de Estudiantes"));
        this.itemMenuList.add(new JMenuItem("Registrar Carreras Estudiante"));
        
        this.setContentPane(this.escritorio);
        this.setJMenuBar(barraMenu);
        this.barraMenu.add(menu1);
        this.barraMenu.add(menu2);
        this.barraMenu.add(menu3);
        this.barraMenu.add(menu4);
        this.barraMenu.add(menu5);
        this.barraMenu.add(menu6);
        this.menu1.add(this.itemMenuList.get(0));
        this.menu2.add(this.itemMenuList.get(1));
        this.menu3.add(this.itemMenuList.get(2));
        this.menu4.add(this.itemMenuList.get(3));
        this.menu5.add(this.itemMenuList.get(4));
        this.menu6.add(this.itemMenuList.get(5));
        
        this.itemMenuList.get(0).addActionListener(new EventoVentanaPrincipal(this));
        this.itemMenuList.get(1).addActionListener(new EventoVentanaPrincipal(this));
        this.itemMenuList.get(2).addActionListener(new EventoVentanaPrincipal(this));
        this.itemMenuList.get(3).addActionListener(new EventoVentanaPrincipal(this));
        this.itemMenuList.get(4).addActionListener(new EventoVentanaPrincipal(this));
        this.itemMenuList.get(5).addActionListener(new EventoVentanaPrincipal(this));
    }

    */
    
}
