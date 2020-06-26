package died.ejemplos.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

import died.ejemplos.dominio.Camion;
import died.ejemplos.gui.PanelCamiones;

public class CamionController {
	
	private Camion c;
	private PanelCamiones panel;
	
	public CamionController(PanelCamiones p) {
		this.panel = p;
		c = new Camion();
	}
	
	public void actualizarModelo() {
		if(this.panel.getTxtPatente()!=null) c.setPatente(this.panel.getTxtPatente().getText()); 
		if(this.panel.getTxtModelo()!=null) c.setModelo(this.panel.getTxtModelo().getText()); 
		if(this.panel.getTxtMarca()!=null) c.setMarca(this.panel.getTxtMarca().getText()); 
		if(this.panel.getTxtKm()!=null) c.setKm(Integer.valueOf(this.panel.getTxtKm().getText())); 
		//if(this.panel.getTxtFechaCompra()!=null) c.setPatente(this.panel.getFechaCompra.getText()); 
	}
	
	public Camion guardar() {
		this.actualizarModelo();
		
		return null;
	}

}
