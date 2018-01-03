/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.GestionDato;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estudiante
 */
public class VentanaVehiculo extends JFrame{
    private JPanel panel;
    private JPanel panelCentro;
    private JPanel panelVista;
    private JPanel panelFondo;
    private JPanel panelSup;
    private JPanel panelBotonDuenio;
    private JPanel panelBotonesInferior;
    private List<JLabel> etiquetaList;
    private List<JButton> botonList;
    private List<JTextField> txtList;
    private JComboBox comboDireccion;
    private JComboBox comboDuenio;
    private GestionDato gestionDato;
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;

    public VentanaVehiculo(GestionDato gestionDato) {
        super("Registro Parqueadero");
        this.gestionDato = gestionDato;
        this.setSize(400, 300);
        this.iniciaComponentes();
        
    }
    public void iniciaComponentes(){
        LayoutManager disenioFondo=new GridLayout();
        LayoutManager disenioCentro=new GridLayout();
        LayoutManager disenioBotInf=new FlowLayout();
        LayoutManager disenioBotSup=new GridLayout(); 
        
        this.panelBotonesInferior=new JPanel(disenioBotInf);
        this.panelBotonDuenio=new JPanel(disenioBotSup);
        this.panelCentro=new JPanel(disenioCentro);
        this.panelFondo= new JPanel(disenioFondo);
        this.panelVista= new JPanel(new BorderLayout());
        this.panelSup=   new JPanel(new BorderLayout());
        
        this.etiquetaList=new ArrayList<JLabel>();
        this.etiquetaList.add(new JLabel("Nombre: "));
        this.etiquetaList.add(new JLabel("Direccion: "));
        this.etiquetaList.add(new JLabel("Capacidad: "));
        this.etiquetaList.add(new JLabel("Dueño: "));
        
        this.txtList=new ArrayList<JTextField>();
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        
        this.encabezado= new Object[4];               
        this.encabezado[0]="Nombre";
        this.encabezado[1]="Direccion";
        this.encabezado[2]="Capacidad";
        this.encabezado[3]="Dueño";
        
        this.botonList=new ArrayList<JButton>();
        this.botonList.add(new JButton("Guardar"));
        this.botonList.add(new JButton("Limpiar"));
        this.botonList.add(new JButton("Add Dueño"));
        this.botonList.add(new JButton("Actualizar"));
        
        //this.datos=cargaDatosTabla(this.gestionDato.getUniversidadList.size(),4);
         
        this.modeloTabla= new DefaultTableModel(this.datos,this.encabezado);
        this.tabla =new JTable(this.modeloTabla);
        this.scroll = new JScrollPane(this.tabla);
       
        this.panelVista.add(this.scroll, BorderLayout.CENTER);
        
        this.panelCentro.add(this.etiquetaList.get(0));
        this.panelCentro.add(this.txtList.get(0));
        this.panelCentro.add(this.etiquetaList.get(1));
        this.panelCentro.add(comboDireccion);
        this.panelCentro.add(this.etiquetaList.get(2));
        this.panelCentro.add(this.txtList.get(1));
        this.panelCentro.add(this.etiquetaList.get(3));
        this.panelCentro.add(comboDuenio);
        
        this.panelBotonesInferior.add(this.botonList.get(0));
        this.panelBotonesInferior.add(this.botonList.get(1));
        this.panelBotonesInferior.add(this.botonList.get(3));
        
        /*this.botonList.get(0).addActionListener(new EventoVentanaUniversidad(gestionDato,this));
        this.botonList.get(1).addActionListener(new EventoVentanaUniversidad(gestionDato,this));
        this.botonList.get(2).addActionListener(new EventoVentanaUniversidad(gestionDato,this));
        this.botonList.get(3).addActionListener(new EventoVentanaUniversidad(gestionDato,this));
        */
        
        this.panelBotonDuenio.add(this.botonList.get(2));
        this.panelSup.add(this.panelBotonDuenio,BorderLayout.NORTH);
        this.panelSup.add(this.panelCentro,BorderLayout.CENTER);
        this.panelSup.add(this.panelBotonesInferior,BorderLayout.SOUTH);

        this.panelFondo.add(this.panelSup);
        this.panelFondo.add(this.panelVista);
        
        this.add(this.panelFondo);
        
        
        
     }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JPanel getPanelCentro() {
        return panelCentro;
    }

    public void setPanelCentro(JPanel panelCentro) {
        this.panelCentro = panelCentro;
    }

    public JPanel getPanelVista() {
        return panelVista;
    }

    public void setPanelVista(JPanel panelVista) {
        this.panelVista = panelVista;
    }

    public JPanel getPanelFondo() {
        return panelFondo;
    }

    public void setPanelFondo(JPanel panelFondo) {
        this.panelFondo = panelFondo;
    }

    public JPanel getPanelSup() {
        return panelSup;
    }

    public void setPanelSup(JPanel panelSup) {
        this.panelSup = panelSup;
    }

    public JPanel getPanelBotonDuenio() {
        return panelBotonDuenio;
    }

    public void setPanelBotonDuenio(JPanel panelBotonDuenio) {
        this.panelBotonDuenio = panelBotonDuenio;
    }

    public JPanel getPanelBotonesInferior() {
        return panelBotonesInferior;
    }

    public void setPanelBotonesInferior(JPanel panelBotonesInferior) {
        this.panelBotonesInferior = panelBotonesInferior;
    }

    public List<JLabel> getEtiquetaList() {
        return etiquetaList;
    }

    public void setEtiquetaList(List<JLabel> etiquetaList) {
        this.etiquetaList = etiquetaList;
    }

    public List<JButton> getBotonList() {
        return botonList;
    }

    public void setBotonList(List<JButton> botonList) {
        this.botonList = botonList;
    }

    public List<JTextField> getTxtList() {
        return txtList;
    }

    public void setTxtList(List<JTextField> txtList) {
        this.txtList = txtList;
    }

    public JComboBox getComboDireccion() {
        return comboDireccion;
    }

    public void setComboDireccion(JComboBox comboDireccion) {
        this.comboDireccion = comboDireccion;
    }

    public JComboBox getComboDuenio() {
        return comboDuenio;
    }

    public void setComboDuenio(JComboBox comboDuenio) {
        this.comboDuenio = comboDuenio;
    }

    public GestionDato getGestionDato() {
        return gestionDato;
    }

    public void setGestionDato(GestionDato gestionDato) {
        this.gestionDato = gestionDato;
    }

    public Object[][] getDatos() {
        return datos;
    }

    public void setDatos(Object[][] datos) {
        this.datos = datos;
    }

    public Object[] getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(Object[] encabezado) {
        this.encabezado = encabezado;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }
    
    
    
    
}
