package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Operations;
import co.edu.unbosque.view.windows.VentanaBinSum;
import co.edu.unbosque.view.windows.VentanaDecBin;
import co.edu.unbosque.view.windows.VentanaDecHex;
import co.edu.unbosque.view.windows.VentanaPrincipal;
import co.edu.unbosque.view.ViewVentana;

public class Controller implements ActionListener {
	
	private VentanaPrincipal vprin;
	private VentanaDecBin vdb;
	private VentanaDecHex vdh;
	private VentanaBinSum vbs;
	private ViewVentana vista;

    public Controller() {
		vprin = new VentanaPrincipal();
		vdb = new VentanaDecBin();
		vdh = new VentanaDecHex();
		vbs = new VentanaBinSum();
		vista = new ViewVentana();

		asignarOyentes();
	}
	
	public void asignarOyentes() {
		vprin.getPmenu().getbDecBin().addActionListener(this);
		vprin.getPmenu().getbDecHex().addActionListener(this);
		vprin.getPmenu().getbSumBin().addActionListener(this);
		vprin.getPmenu().getbSalir().addActionListener(this);
		
		vdb.getPdb().getbConvertirDB().addActionListener(this);
		vdb.getPdb().getbVolverDB().addActionListener(this);
		
		vdh.getPdh().getbConvertirDH().addActionListener(this);
		vdh.getPdh().getbVolverDH().addActionListener(this);
		
		vbs.getPbs().getbSuma().addActionListener(this);
		vbs.getPbs().getbVolverBS().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int aux;
			long auxb1, auxb2;

            String ndec;
            if (e.getActionCommand().equals("CONVERTIR_DECBIN")) {
				vprin.setVisible(false);
				vdb.setVisible(true);
			}else if (e.getActionCommand().equals("CONVERTIR_DB")) {
				ndec = vdb.getPdb().getCampoDecDB().getText();
				aux = Integer.parseInt(ndec);
				if (aux>=0) {
					vdb.getPdb().getCampoResulBin().setText(""+ Operations.decBin(aux));
				}else {
					vdb.getPdb().getCampoResulBin().setText("El numero debe ser positivo.");
					vdb.getPdb().getCampoDecDB().setText("");
				}
			}else if (e.getActionCommand().equals("VOLVER_DB")) {
				vdb.setVisible(false);
				vprin.setVisible(true);
				vdb.getPdb().getCampoDecDB().setText("");
				vdb.getPdb().getCampoResulBin().setText("");
			}else if (e.getActionCommand().equals("CONVERTIR_DECHEX")) {
				vprin.setVisible(false);
				vdh.setVisible(true);
			}else if (e.getActionCommand().equals("CONVERTIR_DH")) {
				ndec = vdh.getPdh().getCampoDecDH().getText();
				aux = Integer.parseInt(ndec);
				if (aux>=0) {
					vdh.getPdh().getCampoResulHex().setText(""+Operations.decHex(aux));
				} else {
					vdh.getPdh().getCampoResulHex().setText("El numero debe ser positivo.");
					vdh.getPdh().getCampoDecDH().setText("");
				}
			}else if (e.getActionCommand().equals("VOLVER_DH")) {
				vdh.setVisible(false);
				vprin.setVisible(true);
				vdh.getPdh().getCampoDecDH().setText("");
				vdh.getPdh().getCampoResulHex().setText("");
			}else if (e.getActionCommand().equals("SUMA_BINARIOS")) {
				vprin.setVisible(false);
				vbs.setVisible(true);
			}else if(e.getActionCommand().equals("SUMA_BS")) {
                String bin1 = vbs.getPbs().getCampoBin1().getText();
				auxb1 = Integer.parseInt(bin1);
                String bin2 = vbs.getPbs().getCampoBin2().getText();
				auxb2 = Integer.parseInt(bin2);
				if (auxb1>=0 && auxb2>=0) {
					if (Operations.comprobarBinario(auxb1) && Operations.comprobarBinario(auxb2)) {
						vbs.getPbs().getCampoResulSuma().setText(""+Operations.sumaBin(auxb1, auxb2));
					}else {
						vbs.getPbs().getCampoResulSuma().setText("Ambos numeros deben ser binarios. (0 y 1)");
						vbs.getPbs().getCampoBin1().setText("");
						vbs.getPbs().getCampoBin2().setText("");
					}
				} else {
					vbs.getPbs().getCampoResulSuma().setText("El numero debe ser positivo.");
					vbs.getPbs().getCampoBin1().setText("");
					vbs.getPbs().getCampoBin2().setText("");
				}
				
			}else if (e.getActionCommand().equals("VOLVER_BS")) {
				vbs.setVisible(false);
				vprin.setVisible(true);
				vbs.getPbs().getCampoBin1().setText("");
				vbs.getPbs().getCampoBin2().setText("");
				vbs.getPbs().getCampoResulSuma().setText("");
			}else if(e.getActionCommand().equals("SALIR")) {
				System.exit(0);
			}
		}catch (NumberFormatException ex) {
			vista.mostrarMensaje("Debe ingresar un numero valido.", "error");
			vdb.getPdb().getCampoDecDB().setText("");
			vdb.getPdb().getCampoResulBin().setText("");
			vdh.getPdh().getCampoDecDH().setText("");
			vdh.getPdh().getCampoResulHex().setText("");
			vbs.getPbs().getCampoBin1().setText("");
			vbs.getPbs().getCampoBin2().setText("");
			vbs.getPbs().getCampoResulSuma().setText("");
		}
	}
}
