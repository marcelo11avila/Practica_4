/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.GestionDato;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estudiante
 */
public class VentanaDireccion extends JFrame {
    private JPanel panel;
    private JPanel panelVista;
    private JPanel panelFondo;
    private List<JLabel> etiquetaList;
    private List<JButton> botonList;
    private List<JTextField> txtList;
    private JComboBox combo;
    private GestionDato gestionDato;
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;

    public VentanaDireccion(GestionDato gestionDato) {
        super("Registro de Direccion");
        this.gestionDato = gestionDato;
        this.setSize(400, 300);
        this.setVisible(true);
        this.iniciaComponentes();
    }
    public void iniciaComponentes(){
        LayoutManager disenioFondo=new GridLayout(2,1);
        LayoutManager disenio = new GridLayout(6,2);
        
        this.panel=new JPanel(disenio);
        this.panelFondo=new JPanel(disenioFondo);
        this.panelVista=new JPanel(new BorderLayout());
        
        this.etiquetaList=new ArrayList<JLabel>();
        this.etiquetaList.add(new JLabel("Ciudad:"));
        this.etiquetaList.add(new JLabel("Calle Principal:"));
        this.etiquetaList.add(new JLabel("Calle Secundario:"));
        
        
        this.txtList=new ArrayList<JTextField>();
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        
        
        this.botonList=new ArrayList<JButton>();
        this.botonList.add(new JButton("Guardar "));
        this.botonList.add(new JButton("Limpiar "));
        
        for(int i =0;i<5;i++){
            this.panel.add(this.etiquetaList.get(i));
            this.panel.add(this.txtList.get(i));
        }
        //this.botonList.get(0).addActionListener(new EventoVentanaAspirante(gestionDato,this));
        //this.botonList.get(1).addActionListener(new EventoVentanaAspirante(gestionDato,this));
        
        this.encabezado=new Object[3];
        this.encabezado[0]="Ciudad";
        this.encabezado[1]="Calle Prin";
        this.encabezado[2]="Calle Secun";
        
        
        //this.datos=cargaDatosTabla(this.gestionDato.getAspiranteList().size() ,5);
        
        this.modeloTabla=new DefaultTableModel(this.datos,this.encabezado);
        this.tabla=new JTable(this.modeloTabla);
        this.scroll= new JScrollPane(this.tabla);
                
        this.panelVista.add(this.scroll,BorderLayout.CENTER);
        this.panel.add(this.botonList.get(0));
        this.panel.add(this.botonList.get(1));
        this.panelFondo.add(this.panel);
        this.panelFondo.add(this.panelVista);
        this.add(this.panelFondo);
        
        
        
    }
    
    

    
}
