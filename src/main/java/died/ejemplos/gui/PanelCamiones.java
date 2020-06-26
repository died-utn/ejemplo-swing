package died.ejemplos.gui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import died.ejemplos.controller.CamionController;

public class PanelCamiones extends JPanel{

	private JLabel lblPatente = new JLabel("Patente:");
	private JTextField txtPatente;
	private JLabel lblModelo = new JLabel("Modelo:");
	private JTextField txtModelo;
	private JLabel lblMarca = new JLabel("Marca:");
	private JTextField txtMarca;
	private JLabel lblFecha = new JLabel("Fecha:");
	private DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
	private JFormattedTextField txtFechaCompra = new JFormattedTextField(df);	
	private JLabel lblKm = new JLabel("KMs:");
	private JTextField txtKm;
	private JButton btnGuardar;
	private JButton btnCancelar;
	
	private CamionController controller;
	
	public PanelCamiones(){
		super();
		this.controller= new CamionController(this);
		this.armarPanel();
	}
	
	private void armarPanel() {
		this.txtPatente = new JTextField(20);
		this.add(lblPatente);
		this.add(txtPatente);
		this.txtModelo = new JTextField(50);
		this.add(lblModelo);
		this.add(txtModelo);
		this.txtMarca = new JTextField(50);
		this.add(lblMarca);
		this.add(txtMarca);
		this.txtFechaCompra = new JFormattedTextField(80);
		this.add(lblFecha);
		this.add(txtFechaCompra);
		this.txtKm = new JTextField(30);		
		this.add(lblKm);
		this.add(txtKm);
		this.btnGuardar = new JButton("Guardar");
		this.btnGuardar.addActionListener( e -> controller.guardar());
		this.add(btnGuardar);
		this.btnCancelar = new JButton("Cancelar");
		this.add(btnCancelar);
	}

	public JTextField getTxtPatente() {
		return txtPatente;
	}

	public void setTxtPatente(JTextField txtPatente) {
		this.txtPatente = txtPatente;
	}

	public JTextField getTxtModelo() {
		return txtModelo;
	}

	public void setTxtModelo(JTextField txtModelo) {
		this.txtModelo = txtModelo;
	}

	public JTextField getTxtMarca() {
		return txtMarca;
	}

	public void setTxtMarca(JTextField txtMarca) {
		this.txtMarca = txtMarca;
	}

	public DateFormat getDf() {
		return df;
	}

	public void setDf(DateFormat df) {
		this.df = df;
	}

	public JFormattedTextField getTxtFechaCompra() {
		return txtFechaCompra;
	}

	public void setTxtFechaCompra(JFormattedTextField txtFechaCompra) {
		this.txtFechaCompra = txtFechaCompra;
	}

	public JTextField getTxtKm() {
		return txtKm;
	}

	public void setTxtKm(JTextField txtKm) {
		this.txtKm = txtKm;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public CamionController getController() {
		return controller;
	}

	public void setController(CamionController controller) {
		this.controller = controller;
	}


	
	
	
}
