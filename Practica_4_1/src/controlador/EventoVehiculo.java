package controlador;

import vista.VentanaDuenio;
import vista.VentanaVehiculo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Vehiculo;

public class EventoVehiculo implements ActionListener {

	private GestionDato gestionDato;
	private VentanaVehiculo ventana;

	public EventoVehiculo(GestionDato gestionDato, VentanaVehiculo ventana) {
		this.gestionDato = gestionDato;
		this.ventana = ventana;

	}

	public GestionDato getGestionDato() {
		return gestionDato;
	}

	public void setGestionDato(GestionDato gestionDato) {
		this.gestionDato = gestionDato;
	}

	public VentanaVehiculo getVentana() {
		return ventana;
	}

	public void setVentana(VentanaVehiculo ventana) {
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource().equals(this.ventana.getBoton3())) {
			VentanaDuenio vr = new VentanaDuenio(this.gestionDato);

		}

		if (e.getSource().equals(this.ventana.getBoton4())) {
			this.ventana.dispose();
			VentanaVehiculo vu = new VentanaVehiculo(this.gestionDato);

		}

		try {
			if (e.getSource().equals(this.ventana.getBoton())) {
				String marca = this.ventana.getTxtList().get(0).getText();
				String modelo = this.ventana.getTxtList().get(1).getText();
                                String placa = this.ventana.getTxtList().get(2).getText();
				String duenio = this.ventana.getBox().getSelectedItem().toString();

				for (Vehiculo u : this.gestionDato.getVehiculoList()) {
					if (u.getPlaca().equals(placa)) {
						throw new TestException("El auto ya esta repetido");
					}
				}

				Vehiculo u = new Vehiculo(marca,modelo,placa, this.ventana.getGestionDato().buscarDuenio2(duenio));
				this.gestionDato.addVehiculo(u);

				Object[][] datoVehiculo = this.ventana
						.cargaDatosTabla(this.ventana.getGestionDato().getVehiculoList().size(), 4);
				this.ventana.setDatos(datoVehiculo);
				this.ventana.getModeloTabla().setDataVector(this.ventana.getDatos(), this.ventana.getEncabezado());
			}
		} catch (TestException ex3) {
			JOptionPane.showMessageDialog(null, "El auto ya se encuentra registrada", "ERROR",
					JOptionPane.ERROR_MESSAGE);
		} catch (Exception a) {
			JOptionPane.showMessageDialog(null, "Contactese con el administrador", "ERROR", JOptionPane.ERROR_MESSAGE);
		}

		if (e.getActionCommand().equals("Limpiar")) {
			this.ventana.getTxtList().get(0).setText("");
			this.ventana.getTxtList().get(1).setText("");
                        this.ventana.getTxtList().get(2).setText("");
		}

	}
}
