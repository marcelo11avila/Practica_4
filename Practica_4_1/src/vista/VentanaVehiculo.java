package vista;


import controlador.GestionDato;
import modelo.Vehiculo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
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

public class VentanaVehiculo extends JFrame {

	private List<JLabel> etiList;
	private List<JTextField> txtList;
	private JButton boton;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JPanel panelGuardar;
	private JPanel panelInicial;
	private JPanel panelVer;
	private JPanel panelBotones;
	private JPanel panel;
	private GestionDato gestionDato;
	private Object[][] datos;
	private Object[] encabezado;
	private DefaultTableModel modeloTabla;
	private JTable tabla;
	private JScrollPane scroll;
	private JComboBox box;

	public VentanaVehiculo(GestionDato gD) throws HeadlessException {
		super("Vehiculo");
		this.gestionDato = gD;
		this.setSize(500, 300);
		this.iniciaComponente();
		this.setVisible(true);
	}

	public void iniciaComponente() {
		this.etiList = new ArrayList<JLabel>();
		this.etiList.add(new JLabel("Ingrese la marca:"));
		this.etiList.add(new JLabel("Ingrese modelo:"));
                this.etiList.add(new JLabel("Ingrese la placa:"));
		this.etiList.add(new JLabel("Dueño:"));

		this.txtList = new ArrayList<JTextField>();
		this.txtList.add(new JTextField(15));
		this.txtList.add(new JTextField(15));
                this.txtList.add(new JTextField(15));

		this.boton = new JButton("Guardar");
		this.boton2 = new JButton("Limpiar");
		this.boton3 = new JButton("Crear");
		this.boton4 = new JButton("Actualizar");

		//this.boton.addActionListener(new EventoUniversidad(this.gestionDato, this));
		//this.boton2.addActionListener(new EventoUniversidad(this.gestionDato, this));
		//this.boton3.addActionListener(new EventoUniversidad(this.gestionDato, this));
		//this.boton4.addActionListener(new EventoUniversidad(this.gestionDato, this));

		this.encabezado = new Object[4];
		this.encabezado[0] = "Marca";
		this.encabezado[1] = "Modelo";
                this.encabezado[2] = "Placa";
		this.encabezado[3] = "Dueño";

		this.datos = cargaDatosTabla(this.gestionDato.getVehiculoList().size(), 4);

		this.modeloTabla = new DefaultTableModel(this.datos, this.encabezado);
		this.tabla = new JTable(this.modeloTabla);
		this.scroll = new JScrollPane(this.tabla);

		this.box = new JComboBox();

		LayoutManager disenio = new GridLayout(5, 2);
		LayoutManager disenio2 = new GridLayout(2, 1);
		LayoutManager disenio3 = new GridLayout(1, 2);
		this.panelVer = new JPanel(new BorderLayout());
		this.panelGuardar = new JPanel(disenio);
		this.panelInicial = new JPanel(disenio2);
		this.panelBotones = new JPanel(disenio2);
		this.panel = new JPanel(disenio3);

		this.panelBotones.add(this.boton3);
		this.panelBotones.add(this.boton4);

		this.panel.add(this.box);
		this.panel.add(this.panelBotones);

		this.panelGuardar.add(this.etiList.get(0));
		this.panelGuardar.add(this.txtList.get(0));
		this.panelGuardar.add(this.etiList.get(1));
		this.panelGuardar.add(this.txtList.get(1));
		this.panelGuardar.add(this.etiList.get(2));
                this.panelGuardar.add(this.txtList.get(2));
		this.panelGuardar.add(this.etiList.get(3));
		this.panelGuardar.add(this.panel);

		this.panelVer.add(this.scroll, BorderLayout.CENTER);
		this.panelGuardar.add(this.boton);
		this.panelGuardar.add(this.boton2);
		this.panelInicial.add(this.panelGuardar);
		this.panelInicial.add(this.panelVer);
		this.add(this.panelInicial);

	}

	public Object[][] cargaDatosTabla(int h, int w) {
		Object[][] retorno = new Object[h][w];
		int i = 0;
		for (Vehiculo v : this.gestionDato.getVehiculoList()) {
			retorno[i][0] = v.getMarca();
			retorno[i][1] = v.getModelo();
			retorno[i][2] = v.getPlaca();
                        retorno[i][3] = v.getDuenio().getNombre()+" "+v.getDuenio().getApellido();
			i++;
		}
		return retorno;
	}

	public List<JLabel> getEtiList() {
		return etiList;
	}

	public void setEtiList(List<JLabel> etiList) {
		this.etiList = etiList;
	}

	public List<JTextField> getTxtList() {
		return txtList;
	}

	public void setTxtList(List<JTextField> txtList) {
		this.txtList = txtList;
	}

	public JButton getBoton() {
		return boton;
	}

	public void setBoton(JButton boton) {
		this.boton = boton;
	}

	public JButton getBoton2() {
		return boton2;
	}

	public void setBoton2(JButton boton2) {
		this.boton2 = boton2;
	}

	public JPanel getPanelInicial() {
		return panelInicial;
	}

	public void setPanelInicial(JPanel panelInicial) {
		this.panelInicial = panelInicial;
	}

	public GestionDato getGestionDato() {
		return gestionDato;
	}

	public void setGestionDato(GestionDato gestionDato) {
		this.gestionDato = gestionDato;
	}

	public JPanel getPanelGuardar() {
		return panelGuardar;
	}

	public void setPanelGuardar(JPanel panelGuardar) {
		this.panelGuardar = panelGuardar;
	}

	public JPanel getPanelVer() {
		return panelVer;
	}

	public void setPanelVer(JPanel panelVer) {
		this.panelVer = panelVer;
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

	public JButton getBoton3() {
		return boton3;
	}

	public void setBoton3(JButton boton3) {
		this.boton3 = boton3;
	}

	public JButton getBoton4() {
		return boton4;
	}

	public void setBoton4(JButton boton4) {
		this.boton4 = boton4;
	}

	public JPanel getPanelBotones() {
		return panelBotones;
	}

	public void setPanelBotones(JPanel panelBotones) {
		this.panelBotones = panelBotones;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JComboBox getBox() {
		return box;
	}

	public void setBox(JComboBox box) {
		this.box = box;
	}

}
