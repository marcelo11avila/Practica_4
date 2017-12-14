package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controlador.GestionDato;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

    private JPanel panel;
    private JPanel panelVacio;
    private JLabel etiqueta;
    private JButton boton;
    private GestionDato gD;
    private List<JMenu> menuLista;
    private List<JMenuItem> itemMenuList;
    private JMenuBar barraMenu;

    public VentanaPrincipal(GestionDato g) {
        super("Gestion de Inscripcion");
        this.gD = g;
        this.setSize(370, 400);
        this.iniciaComponente();
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
    }

    public void iniciaComponente() {
        this.menuLista = new ArrayList<JMenu>();
        
        ImageIcon img = new ImageIcon("AutoGif.gif");
        
        this.menuLista.add(new JMenu("Direccion |"));
        this.menuLista.add(new JMenu("Parqueadero |"));
        this.menuLista.add(new JMenu("Vehiculo |"));
        this.menuLista.add(new JMenu("Tickets |"));
        this.menuLista.add(new JMenu("Trabajador"));
       
        this.barraMenu= new JMenuBar();
        
        for(int i = 0 ; i < 5; i++){
            this.barraMenu.add(this.menuLista.get(i));
        }
        
        this.setJMenuBar(this.barraMenu);
        
        this.boton = new JButton(img);
  

        LayoutManager disenioFinal = new BorderLayout();
        LayoutManager disenio = new FlowLayout();

        this.panelVacio = new JPanel(disenio);
        this.panel = new JPanel(disenioFinal);

        this.panelVacio.add(this.boton);
        

        //for (int i = 0; i < 6; i++) {
        //	this.botonList.get(i).addActionListener(new EventoPrincipal(this, this.gD));
        //}
        this.panel.add(this.panelVacio, BorderLayout.CENTER);
        this.add(panel);

    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public JPanel getPanelVacio() {
        return panelVacio;
    }

    public void setPanelVacio(JPanel panelVacio) {
        this.panelVacio = panelVacio;
    }

    public JLabel getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(JLabel etiqueta) {
        this.etiqueta = etiqueta;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }

    public List<JMenu> getMenuLista() {
        return menuLista;
    }

    public void setMenuLista(List<JMenu> menuLista) {
        this.menuLista = menuLista;
    }

    public List<JMenuItem> getItemMenuList() {
        return itemMenuList;
    }

    public void setItemMenuList(List<JMenuItem> itemMenuList) {
        this.itemMenuList = itemMenuList;
    }

    public JMenuBar getBarraMenu() {
        return barraMenu;
    }

    public void setBarraMenu(JMenuBar barraMenu) {
        this.barraMenu = barraMenu;
    }

}
