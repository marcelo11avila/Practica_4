/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.EventoVentanaInicial;
import controlador.GestionDato;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Marcelo11
 */
public class VentanaInicial extends JFrame
{
    private JDesktopPane escritorio;
    private JMenuBar barraMenu;
    private JMenu menu1;
    private JMenu menu2;
    private JMenu menu3;
    private List<JMenuItem> menuItemList;
    private GestionDato gD;
    

    public VentanaInicial(GestionDato gD) {
        super("Practica 10");
        this.setSize(3000, 780);
        this.setDefaultCloseOperation(3);
        this.gD=gD;
        this.iniciaComponentes();
    }
    public void iniciaComponentes()
    {
        this.escritorio = new JDesktopPane();
        this.barraMenu = new JMenuBar();
        
        this.menu1 = new JMenu("Registro");
        this.menuItemList = new ArrayList<JMenuItem>();
        this.menuItemList.add(new JMenuItem("Registrar Rector"));
        this.menuItemList.add(new JMenuItem("Registrar Universidad"));
        this.menuItemList.add(new JMenuItem("Registrar Aspirante"));
        this.menuItemList.add(new JMenuItem("Registrar Carrera"));
       
        
        this.menu2 = new JMenu("Inscripcion");
        this.menuItemList.add(new JMenuItem("Inscribir"));
        
        
        this.menu3= new JMenu("Consultas");
        this.menuItemList.add(new JMenuItem("Aspirantes ya registrados"));
        this.menuItemList.add(new JMenuItem("Aspirantes en carrera"));
        
     
        this.setContentPane(escritorio);
        this.setJMenuBar(barraMenu);
      
        this.barraMenu.add(menu1);
        this.menu1.add(this.menuItemList.get(0));
        this.menu1.add(this.menuItemList.get(1));
        this.menu1.add(this.menuItemList.get(2));
        this.menu1.add(this.menuItemList.get(3));
        
        this.barraMenu.add(menu2);
        this.menu2.add(this.menuItemList.get(4));
        
        this.barraMenu.add(menu3);
        this.menu3.add(this.menuItemList.get(5));
        this.menu3.add(this.menuItemList.get(6));
        
        
        
        /*this.menuItemList.get(0).addActionListener(new EventoVentanaInicial(this));
        this.menuItemList.get(1).addActionListener(new EventoVentanaInicial(this));
        this.menuItemList.get(2).addActionListener(new EventoVentanaInicial(this));
        this.menuItemList.get(3).addActionListener(new EventoVentanaInicial(this));
        this.menuItemList.get(4).addActionListener(new EventoVentanaInicial(this));
        this.menuItemList.get(5).addActionListener(new EventoVentanaInicial(this));
        this.menuItemList.get(6).addActionListener(new EventoVentanaInicial(this));
        */
        
    }

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public JMenuBar getBarraMenu() {
        return barraMenu;
    }

    public void setBarraMenu(JMenuBar barraMenu) {
        this.barraMenu = barraMenu;
    }

    public JMenu getMenu1() {
        return menu1;
    }

    public void setMenu1(JMenu menu1) {
        this.menu1 = menu1;
    }

    public JMenu getMenu2() {
        return menu2;
    }

    public void setMenu2(JMenu menu2) {
        this.menu2 = menu2;
    }

    public JMenu getMenu3() {
        return menu3;
    }

    public void setMenu3(JMenu menu3) {
        this.menu3 = menu3;
    }

    public List<JMenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<JMenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }
    
    
    
}