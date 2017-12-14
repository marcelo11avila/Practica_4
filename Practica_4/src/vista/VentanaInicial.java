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

public class VentanaInicial extends JFrame{
    private JDesktopPane escritorio;
    private JMenuBar barraMenu;
    private JMenu menu1;
    private JMenu menu2;
    private JMenu menu3;
    private JMenu menu4;
    private JMenu menu5;
    private JMenu menu6;
    private List<JMenuItem> menuItemList;
    private GestionDato gD;
    

    public VentanaInicial(GestionDato gD) throws HeadlessException {
        super("Practica_4");
        this.setSize(1366, 730);
        this.setDefaultCloseOperation(3);
        this.gD=gD;
        this.iniciaComponentes();
    }
    public void iniciaComponentes()
    {
        this.escritorio = new JDesktopPane();
        this.barraMenu = new JMenuBar();
        this.menuItemList = new ArrayList<JMenuItem>();
        
        this.menu1 = new JMenu("Parqueadero");
        this.menuItemList.add(new JMenuItem("Registrar Parqueadero"));
                
        this.menu2 = new JMenu("Tiquet");
        this.menuItemList.add(new JMenuItem("Crear Tiquet"));
                
        
        this.menu3= new JMenu("Vehiculo");
        this.menuItemList.add(new JMenuItem("Registrar Vehiculo"));
        
        
        this.menu4= new JMenu("Direccion");
        this.menuItemList.add(new JMenuItem("Añadir Direccion"));
        
        this.menu5= new JMenu("Trabajador");
        this.menuItemList.add(new JMenuItem("Registar Trabajador"));
        
        this.setContentPane(escritorio);
        this.setJMenuBar(barraMenu);
      
        this.barraMenu.add(menu1);
        this.menu1.add(this.menuItemList.get(0));    
        
        this.barraMenu.add(menu2);
        this.menu2.add(this.menuItemList.get(1));
                
        this.barraMenu.add(menu3);
        this.menu3.add(this.menuItemList.get(2));
                
        this.barraMenu.add(menu4);
        this.menu4.add(this.menuItemList.get(3));
        
        this.barraMenu.add(menu5);
        this.menu5.add(this.menuItemList.get(4));
                
        /*
        this.menuItemList.get(0).addActionListener(new EventoVentanaInicial(this));
        this.menuItemList.get(1).addActionListener(new EventoVentanaInicial(this));
        this.menuItemList.get(2).addActionListener(new EventoVentanaInicial(this));
        this.menuItemList.get(3).addActionListener(new EventoVentanaInicial(this));
        this.menuItemList.get(4).addActionListener(new EventoVentanaInicial(this));
        
        */        
        
    }

    public JMenu getMenu4() {
        return menu4;
    }

    public void setMenu4(JMenu menu4) {
        this.menu4 = menu4;
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
