package co.edu.unbosque.controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import co.edu.unbosque.model.Operaciones;
import co.edu.unbosque.view.VentanaJuego;
import co.edu.unbosque.view.VentanaOpciones;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VentanaTutorial;
import co.edu.unbosque.view.ViewVentana;

/**
 * Esta clase es el controlador del proyecto, consta 6 métodos, el contructor, dos de tipo void (asignarOyentes y actionPerformed) y 3 de tipo boolean.
 * Relaciona las clases del paquete model con las clases del paquete view y controla las interacciones entre ellas
 * @author David Real
 * @author David Millán
 * @author Jorge García
 * @version 1.0
 */

public class Controller implements ActionListener{
	
	/**
	 * Objeto de VentanaPricipal que permite llamar a sus métodos y sus atributos
	 */
	private VentanaPrincipal vPrincipal;
	/**
	 * Objeto de VentanaOpciones que permite llamar a sus métodos y sus atributos
	 */
	private VentanaOpciones vOpciones;
	/**
	 * Objeto de VentanaJuego que permite llamar a sus métodos y sus atributos
	 */
	private VentanaJuego vJuego;
	/**
	 * Objeto de VentanaTutorial que permite llamar a sus métodos y sus atributos
	 */
	private VentanaTutorial vTuto;
	/**
	 * Objeto de Operaciones que permite llamar a sus métodos y sus atributos
	 */
	private Operaciones op;
	/**
	 * Objeto de ViewVentana que permite llamar a sus métodos y sus atributos
	 */
	private ViewVentana vista;
	/**
	 * Objeto de ArrayList de tipo String que permite guardar los valores de número, picas y fijas del jugador 1
	 */
	private ArrayList<ArrayList<String>> arrlistaJ1;
	/**
	 * Objeto de ArrayList de tipo String que permite guardar los valores de número, picas y fijas del jugador 2
	 */
	private ArrayList<ArrayList<String>> arrlistaJ2;
	/**
	 * Método constructor de la clase controller
	 */
	public Controller() {
		
		vPrincipal = new VentanaPrincipal();
		vOpciones = new VentanaOpciones();
		vJuego = new VentanaJuego();
		vTuto = new VentanaTutorial();
		vista = new ViewVentana();
		op = new Operaciones();
		arrlistaJ1 = new ArrayList<ArrayList<String>>();
		arrlistaJ2 = new ArrayList<ArrayList<String>>();
		Activo_Inactivo(false);
		asignarOyentes();
	}

	/**
	 * Método que asigna los oyentes a los componentes que realizan acciones
	 */
	public void asignarOyentes() {
		
		vPrincipal.getPrincipal().getB_tuto().addActionListener(this);
		vPrincipal.getPrincipal().getB_1vsM().addActionListener(this);
		vPrincipal.getPrincipal().getB_1vs1().addActionListener(this);
		vTuto.getPtuto().getB_menu().addActionListener(this);
		vTuto.getPtuto().getB_PvsM().addActionListener(this);
		vOpciones.getpOpciones().getB_opciones().addActionListener(this);
		vJuego.getpJuego().getB_menu().addActionListener(this);
		vJuego.getpJuego().getpJugador().getB_ingresar().addActionListener(this);
		vJuego.getpJuego().getpJugador().getB_adivinar().addActionListener(this);
		vJuego.getpJuego().getpJugador2().getB_ingresar().addActionListener(this);
		vJuego.getpJuego().getpJugador2().getB_adivinar().addActionListener(this);
		vJuego.getpJuego().getpJugador().getB_ayuda1().addActionListener(this);
		vJuego.getpJuego().getpJugador().getB_ayuda2().addActionListener(this);
		vJuego.getpJuego().getpJugador().getB_ayuda3().addActionListener(this);
		vJuego.getpJuego().getpJugador2().getB_ayuda1().addActionListener(this);
		vJuego.getpJuego().getpJugador2().getB_ayuda2().addActionListener(this);
		vJuego.getpJuego().getpJugador2().getB_ayuda3().addActionListener(this);
	}
	
	/**
	 * Método que asigna las operaciones a realizar según sea el caso 
	 *  
	 * @param arg0 es un objeto de tipo ActionEvent
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(arg0.getActionCommand().equals("VOLVER")) {
			vJuego.setVisible(false);
			vTuto.setVisible(false);
			vPrincipal.setVisible(true);
			vOpciones.getpOpciones().getC_dig().setText("");
			vOpciones.getpOpciones().getC_intentos().setText("");
			vOpciones.getpOpciones().getO_RepSi().setSelected(false);
			vJuego.getpJuego().getpJugador().getC_fijas().setText("");
			vJuego.getpJuego().getpJugador().getC_picas().setText("");
			vJuego.getpJuego().getpJugador().getC_lista().setText("||  Número  ||  Fijas  ||  Picas ||\n");
			vJuego.getpJuego().getpJugador().getC_num1().setText("");
			vJuego.getpJuego().getpJugador().getC_numA().setText("");
			vJuego.getpJuego().getpJugador2().getC_fijas().setText("");
			vJuego.getpJuego().getpJugador2().getC_picas().setText("");
			vJuego.getpJuego().getpJugador2().getC_lista().setText("||  Número  ||  Fijas  ||  Picas ||\n");
			vJuego.getpJuego().getpJugador2().getC_num1().setText("");
			vJuego.getpJuego().getpJugador2().getC_numA().setText("");
			vJuego.getpJuego().getpJugador().setPuntuacion(0);
			vJuego.getpJuego().getpJugador().getE_puntos().setText("Puntuación: "+vJuego.getpJuego().getpJugador().getPuntuacion());
			vJuego.getpJuego().getpJugador2().setPuntuacion(0);
			vJuego.getpJuego().getpJugador2().getE_puntos().setText("Puntuación: "+vJuego.getpJuego().getpJugador2().getPuntuacion());
			arrlistaJ1.clear();
			arrlistaJ2.clear();
		}else if (arg0.getActionCommand().equals("TUTORIAL")) {
			vTuto.setVisible(true);
			vPrincipal.setVisible(false);
		}else if (arg0.getActionCommand().equals("JvsM")) {
			vJuego.getpJuego().getpJugador().getB_ingresar().setActionCommand("GENERARNUM");
			vJuego.getpJuego().getpJugador().getB_adivinar().setActionCommand("ADIVNUM");
			vJuego.getpJuego().getpJugador().getB_ingresar().setText("Generar");
			vJuego.getpJuego().getpJugador().getE_num1().setText("Número a adivinar");
			vJuego.getpJuego().getpJugador2().setVisible(false);
			vJuego.setSize(500,650);
			vJuego.getpJuego().setBounds(5, 5, 475,600);
			vJuego.getpJuego().getpJugador().setBounds(50, 80, 370, 490);
			vJuego.setLocationRelativeTo(null);
			Activo_InactivoJ1(true);
			vJuego.getpJuego().getpJugador().getC_num1().setEditable(false);
			vJuego.getpJuego().getpJugador().getB_ingresar().setEnabled(true);
			vJuego.getpJuego().getpJugador().getC_picas().setEditable(false);
			vJuego.getpJuego().getpJugador().getC_fijas().setEditable(false);
			vJuego.getpJuego().getpJugador().getB_adivinar().setEnabled(false);
			vJuego.getpJuego().getpJugador().getC_numA().setEnabled(false);
			vJuego.getpJuego().getpJugador().getE_numA().setEnabled(false);
			vJuego.setVisible(false);
			vTuto.setVisible(false);
			vPrincipal.setVisible(false);
			vOpciones.setVisible(true);
		}else if (arg0.getActionCommand().equals("JvsJ")) {
			vJuego.getpJuego().getpJugador().getB_ingresar().setActionCommand("INGRESARNUM1");
			vJuego.getpJuego().getpJugador().getB_adivinar().setActionCommand("ADIVNUM1");
			vJuego.getpJuego().getpJugador().getB_ingresar().setText("Ingresar");
			vJuego.getpJuego().getpJugador().getE_num1().setText("Ingrese número J1:");
			vJuego.getpJuego().getpJugador2().setVisible(true);
			vJuego.getpJuego().getpJugador2().getB_ayuda1().setActionCommand("J2AYUDA1");
			vJuego.getpJuego().getpJugador2().getB_ayuda2().setActionCommand("J2AYUDA2");
			vJuego.getpJuego().getpJugador2().getB_ayuda3().setActionCommand("J2AYUDA3");
			vJuego.setSize(800,600);
			vJuego.getpJuego().setBounds(5, 5, 775,550);
			vJuego.getpJuego().getpJugador().setBounds(15, 50, 370, 490);
			vJuego.setLocationRelativeTo(null);
			Activo_Inactivo(false);
			Activo_InactivoJ1(true);
			vJuego.getpJuego().getpJugador().getC_num1().setEditable(true);
			vJuego.getpJuego().getpJugador().getC_picas().setEditable(false);
			vJuego.getpJuego().getpJugador().getC_fijas().setEditable(false);
			vJuego.getpJuego().getpJugador().getC_numA().setEnabled(false);
			vJuego.getpJuego().getpJugador().getB_adivinar().setEnabled(false);
			vJuego.setVisible(false);
			vPrincipal.setVisible(false);
			vOpciones.setVisible(true);
		}
		int tamNum = 0;
		int intentos=0;
		int aux=0;
		int puntos=0;
		int pos=-1;
		int fila=-1;
		String lista="";
		String aux2="";
		String NumJ1 = "";
		String NumJ2 = "";
		Boolean bandera=false;
		if (arg0.getActionCommand().equals("OPCIONES")) {
			try {
				tamNum = Integer.parseInt(vOpciones.getpOpciones().getC_dig().getText());
				aux = Integer.parseInt(vOpciones.getpOpciones().getC_intentos().getText());
				if (tamNum<1 || tamNum>10) {
					vista.mostrarMensaje("Ingrese un tamaño entre 1 y 10", "error");
					vOpciones.getpOpciones().getC_dig().setText("");
				}else if(aux<1 || aux>(tamNum*5)){
					vista.mostrarMensaje("Ingrese un número de intentos válido", "error");
					vOpciones.getpOpciones().getC_intentos().setText("");
				}else{
					vJuego.getpJuego().getpJugador().setNumintentos(aux);
					vJuego.getpJuego().getpJugador().getE_intentos().setText("Intentos: "+aux);
					vJuego.getpJuego().getpJugador2().setNumintentos(aux);
					vJuego.getpJuego().getpJugador2().getE_intentos().setText("Intentos: "+aux);
					vOpciones.setVisible(false);
					vJuego.setVisible(true);
				}
			} catch (NumberFormatException e) {
				vista.mostrarMensaje("Ingrese un número entero positivo", "error");
				vOpciones.getpOpciones().getC_dig().setText("");
			}
		}
		
		if (arg0.getActionCommand().equals("GENERARNUM")) {
			tamNum = Integer.parseInt(vOpciones.getpOpciones().getC_dig().getText());
			if(tamNum!=1 && vOpciones.getpOpciones().getO_RepSi().isSelected()==false) {
				do {	
					NumJ2 = op.Maquina(tamNum);
				} while (op.VerificarRepetidos(NumJ2));
			}else if (tamNum!=1 && vOpciones.getpOpciones().getO_RepSi().isSelected()) {
				NumJ2 = op.Maquina(tamNum);
			}else if (tamNum==1) {
				NumJ2 = op.Maquina(tamNum);
			}
			vJuego.getpJuego().getpJugador().getC_num1().setText(NumJ2);
			vJuego.getpJuego().getpJugador2().getC_num1().setText(NumJ2);
			Activo_InactivoJ1(true);
			vJuego.getpJuego().getpJugador().getC_num1().setEnabled(false);
			vJuego.getpJuego().getpJugador().getE_num1().setEnabled(false);
			vJuego.getpJuego().getpJugador().getB_ingresar().setEnabled(false);
			
		}else if (arg0.getActionCommand().equals("ADIVNUM")) {
			int fijas=0;
			int picas=0;
			try {
				tamNum = Integer.parseInt(vOpciones.getpOpciones().getC_dig().getText());
				intentos = vJuego.getpJuego().getpJugador().getNumintentos();
				NumJ2 = String.valueOf(vJuego.getpJuego().getpJugador2().getC_num1().getPassword());
				aux2 = vJuego.getpJuego().getpJugador().getC_numA().getText();
				aux = Integer.parseInt(aux2);
				if (aux2.length()!=tamNum) {
					vista.mostrarMensaje("Ingrese un número de "+tamNum+" cifras", "error");
					vJuego.getpJuego().getpJugador().getC_numA().setText("");
				}else if(tamNum!=1 && op.VerificarRepetidos(aux2) && vOpciones.getpOpciones().getO_RepSi().isSelected()==false){
					vista.mostrarMensaje("Ingrese un número sin dígitos repetidos", "error");
					vJuego.getpJuego().getpJugador().getC_numA().setText("");
				}else{
					fijas=op.fijas(NumJ2,aux2);
					if (fijas!=tamNum) {
						picas=op.picas(NumJ2,aux2);
					}
					lista = vJuego.getpJuego().getpJugador().getC_lista().getText();
					vJuego.getpJuego().getpJugador().getC_lista().setText(lista+"\n ||  "+aux2+"  ||  "+fijas+"  ||  "+picas+"  ||");
					vJuego.getpJuego().getpJugador().getC_picas().setText(""+picas);
					vJuego.getpJuego().getpJugador().getC_fijas().setText(""+fijas);
					vJuego.getpJuego().getpJugador().getC_numA().setText("");
					fila=Integer.parseInt(vOpciones.getpOpciones().getC_intentos().getText())-intentos;
					arrlistaJ1.add(new ArrayList<String>());
					arrlistaJ1.get(fila).add(aux2);
					arrlistaJ1.get(fila).add(String.valueOf(fijas));
					arrlistaJ1.get(fila).add(String.valueOf(picas));
					intentos = intentos-1;
					vJuego.getpJuego().getpJugador().setNumintentos(intentos);
					vJuego.getpJuego().getpJugador().getE_intentos().setText("Intentos: "+intentos);
					if (fijas==tamNum) {
						vista.mostrarMensaje("¡FELICITACIONES!\nHa adivinado el número\nFIN DEL JUEGO", "informativo");
						Activo_Inactivo(false);
						bandera =true;
					}else {
						puntos=(fijas*5)+(picas*2)+(vJuego.getpJuego().getpJugador().getPuntuacion());
						vJuego.getpJuego().getpJugador().setPuntuacion(puntos);
						vJuego.getpJuego().getpJugador().getE_puntos().setText("Puntuación: "+puntos);
					}
					if(vJuego.getpJuego().getpJugador().getNumintentos()==0 && bandera==false){
						vista.mostrarMensaje("Intentos agotados\nEl número era: "+NumJ2, "informativo");
						Activo_Inactivo(false);
					}
				}
			} catch (NumberFormatException e) {
				// TODO: handle exception
				vista.mostrarMensaje("Ingrese un número de "+tamNum+" cifras", "error");
				vJuego.getpJuego().getpJugador().getC_numA().setText("");
			}
			
		}
		
		if (arg0.getActionCommand().equals("INGRESARNUM1")) {
			try {
				tamNum = Integer.parseInt(vOpciones.getpOpciones().getC_dig().getText());
				NumJ1 = String.valueOf(vJuego.getpJuego().getpJugador().getC_num1().getPassword());
				aux = Integer.parseInt(NumJ1);
				if (NumJ1.length()!=tamNum) {
					vista.mostrarMensaje("Ingrese un número de "+tamNum+" cifras", "error");
					vJuego.getpJuego().getpJugador().getC_num1().setText("");
				}else if(tamNum!=1 && op.VerificarRepetidos(NumJ1) && vOpciones.getpOpciones().getO_RepSi().isSelected()==false){
						vista.mostrarMensaje("Ingrese un número sin dígitos repetidos", "error");
						vJuego.getpJuego().getpJugador().getC_num1().setText("");
				}else{
					Activo_InactivoJ1(false);
					Activo_InactivoJ2(true);
					vJuego.getpJuego().getpJugador2().getC_picas().setEditable(false);
					vJuego.getpJuego().getpJugador2().getC_fijas().setEditable(false);
					vJuego.getpJuego().getpJugador2().getC_numA().setEnabled(false);
					vJuego.getpJuego().getpJugador2().getB_adivinar().setEnabled(false);
				}
			} catch (NumberFormatException e) {
				vista.mostrarMensaje("Ingrese un número válido", "error");
				vJuego.getpJuego().getpJugador().getC_num1().setText("");
			}
			
		}else if (arg0.getActionCommand().equals("INGRESARNUM2")) {
			try {
				tamNum = Integer.parseInt(vOpciones.getpOpciones().getC_dig().getText());
				NumJ2 = String.valueOf(vJuego.getpJuego().getpJugador2().getC_num1().getPassword());
				aux = Integer.parseInt(NumJ2);
				if (NumJ2.length()!=tamNum) {
					vista.mostrarMensaje("Ingrese un número de "+tamNum+" cifras", "error");
					vJuego.getpJuego().getpJugador2().getC_num1().setText("");
				}else if(tamNum!=1 && op.VerificarRepetidos(NumJ2) && vOpciones.getpOpciones().getO_RepSi().isSelected()==false){
					vista.mostrarMensaje("Ingrese un número sin dígitos repetidos", "error");
					vJuego.getpJuego().getpJugador2().getC_num1().setText("");
				}else {
					Activo_InactivoJ1(true);
					Activo_InactivoJ2(false);
					vJuego.getpJuego().getpJugador().getC_num1().setEnabled(false);
					vJuego.getpJuego().getpJugador().getE_num1().setEnabled(false);
					vJuego.getpJuego().getpJugador().getC_picas().setEditable(false);
					vJuego.getpJuego().getpJugador().getC_fijas().setEditable(false);
					vJuego.getpJuego().getpJugador().getB_ingresar().setEnabled(false);
				}
			} catch (NumberFormatException e) {
				// TODO: handle exception
				vista.mostrarMensaje("Ingrese un número de "+tamNum+" cifras", "error");
				vJuego.getpJuego().getpJugador2().getC_num1().setText("");
			}
		}
		
		if (arg0.getActionCommand().equals("ADIVNUM1")) {
			int fijas=0;
			int picas=0;
			try {
				tamNum = Integer.parseInt(vOpciones.getpOpciones().getC_dig().getText());
				intentos = vJuego.getpJuego().getpJugador().getNumintentos();
				NumJ2 = String.valueOf(vJuego.getpJuego().getpJugador2().getC_num1().getPassword());
				aux2 = vJuego.getpJuego().getpJugador().getC_numA().getText();
				aux = Integer.parseInt(aux2);
				if (aux2.length()!=tamNum) {
					vista.mostrarMensaje("Ingrese un número de "+tamNum+" cifras", "error");
					vJuego.getpJuego().getpJugador().getC_numA().setText("");
				}else if(tamNum!=1 && op.VerificarRepetidos(aux2) && vOpciones.getpOpciones().getO_RepSi().isSelected()==false){
					vista.mostrarMensaje("Ingrese un número sin dígitos repetidos", "error");
					vJuego.getpJuego().getpJugador().getC_numA().setText("");
				}else{
					fijas=op.fijas(NumJ2,aux2);
					if (fijas!=tamNum) {
						picas=op.picas(NumJ2,aux2);
					}
					lista = vJuego.getpJuego().getpJugador().getC_lista().getText();
					vJuego.getpJuego().getpJugador().getC_lista().setText(lista+"\n ||  "+aux2+"  ||  "+fijas+"  ||  "+picas+"  ||");
					vJuego.getpJuego().getpJugador().getC_picas().setText(""+picas);
					vJuego.getpJuego().getpJugador().getC_fijas().setText(""+fijas);
					fila=Integer.parseInt(vOpciones.getpOpciones().getC_intentos().getText())-intentos;
					arrlistaJ1.add(new ArrayList<String>());
					arrlistaJ1.get(fila).add(aux2);
					arrlistaJ1.get(fila).add(String.valueOf(fijas));
					arrlistaJ1.get(fila).add(String.valueOf(picas));
					intentos = intentos-1;
					vJuego.getpJuego().getpJugador().setNumintentos(intentos);
					vJuego.getpJuego().getpJugador().getE_intentos().setText("Intentos: "+intentos);
					Activo_InactivoJ1(false);
					Activo_InactivoJ2(true);
					vJuego.getpJuego().getpJugador2().getC_numA().setText("");
					vJuego.getpJuego().getpJugador2().getC_num1().setEnabled(false);
					vJuego.getpJuego().getpJugador2().getE_num1().setEnabled(false);
					vJuego.getpJuego().getpJugador2().getC_picas().setEditable(false);
					vJuego.getpJuego().getpJugador2().getC_fijas().setEditable(false);
					vJuego.getpJuego().getpJugador2().getB_ingresar().setEnabled(false);
					if (fijas==tamNum) {
						vista.mostrarMensaje("¡FELICITACIONES!\nHa adivinado el número del jugador 2\nFIN DEL JUEGO", "informativo");
						Activo_Inactivo(false);
						bandera = true;
					}else {
						puntos=(fijas*5)+(picas*2)+(vJuego.getpJuego().getpJugador().getPuntuacion());
						vJuego.getpJuego().getpJugador().setPuntuacion(puntos);
						vJuego.getpJuego().getpJugador().getE_puntos().setText("Puntuación: "+puntos);
					}
					if(vJuego.getpJuego().getpJugador().getNumintentos()==0 && bandera==false){
						vista.mostrarMensaje("Intentos agotados\nEl número del Jugador 2 era: "+NumJ2, "informativo");
						Activo_InactivoJ1(false);
					}
				}
			} catch (NumberFormatException e) {
				// TODO: handle exception
				vista.mostrarMensaje("Ingrese un número de "+tamNum+" cifras", "error");
				vJuego.getpJuego().getpJugador().getC_numA().setText("");
			}
			
		}else if(arg0.getActionCommand().equals("ADIVNUM2")) {
			int fijas=0;
			int picas=0;
			try {
				tamNum = Integer.parseInt(vOpciones.getpOpciones().getC_dig().getText());
				intentos = vJuego.getpJuego().getpJugador2().getNumintentos();
				NumJ1 = String.valueOf(vJuego.getpJuego().getpJugador().getC_num1().getPassword());
				aux2 = vJuego.getpJuego().getpJugador2().getC_numA().getText();
				aux = Integer.parseInt(aux2);
				if (aux2.length()!=tamNum) {
					vista.mostrarMensaje("Ingrese un número de "+tamNum+" cifras", "error");
					vJuego.getpJuego().getpJugador2().getC_numA().setText("");
				}else if(tamNum!=1 && op.VerificarRepetidos(aux2) && vOpciones.getpOpciones().getO_RepSi().isSelected()==false){
					vista.mostrarMensaje("Ingrese un número sin dígitos repetidos", "error");
					vJuego.getpJuego().getpJugador2().getC_numA().setText("");
				}else{
					fijas=op.fijas(NumJ1,aux2);
					if (fijas!=tamNum) {
						picas=op.picas(NumJ1,aux2);
					}
					lista = vJuego.getpJuego().getpJugador2().getC_lista().getText();
					vJuego.getpJuego().getpJugador2().getC_lista().setText(lista+"\n  "+aux2+"  ||  "+fijas+"  ||  "+picas);
					vJuego.getpJuego().getpJugador2().getC_picas().setText(""+picas);
					vJuego.getpJuego().getpJugador2().getC_fijas().setText(""+fijas);
					fila=Integer.parseInt(vOpciones.getpOpciones().getC_intentos().getText())-intentos;
					arrlistaJ2.add(new ArrayList<String>());
					arrlistaJ2.get(fila).add(aux2);
					arrlistaJ2.get(fila).add(String.valueOf(fijas));
					arrlistaJ2.get(fila).add(String.valueOf(picas));
					intentos = intentos-1;
					vJuego.getpJuego().getpJugador2().setNumintentos(intentos);
					vJuego.getpJuego().getpJugador2().getE_intentos().setText("Intentos: "+intentos);
					Activo_InactivoJ1(true);
					Activo_InactivoJ2(false);
					vJuego.getpJuego().getpJugador().getC_numA().setText("");
					vJuego.getpJuego().getpJugador().getC_num1().setEnabled(false);
					vJuego.getpJuego().getpJugador().getE_num1().setEnabled(false);
					vJuego.getpJuego().getpJugador().getC_picas().setEditable(false);
					vJuego.getpJuego().getpJugador().getC_fijas().setEditable(false);
					vJuego.getpJuego().getpJugador().getB_ingresar().setEnabled(false);
					if (fijas==tamNum) {
						vista.mostrarMensaje("¡FELICITACIONES!\nHa adivinado el número del jugador 1\nFIN DEL JUEGO", "informativo");
						Activo_Inactivo(false);
						bandera = true;
					}else {
						puntos=(fijas*5)+(picas*2)+(vJuego.getpJuego().getpJugador2().getPuntuacion());
						vJuego.getpJuego().getpJugador2().setPuntuacion(puntos);
						vJuego.getpJuego().getpJugador2().getE_puntos().setText("Puntuación: "+puntos);
					}
					if(vJuego.getpJuego().getpJugador2().getNumintentos()==0 && bandera==false){
						vista.mostrarMensaje("Intentos agotados\nEl número del Jugador 1 era: "+NumJ1, "informativo");
						Activo_InactivoJ2(false);
						if (Activo_InactivoJ1(false)) {
							Activo_Inactivo(false);
						}
						int puntosFinalesJ1=vJuego.getpJuego().getpJugador().getPuntuacion();
						int puntosFinalesJ2=vJuego.getpJuego().getpJugador2().getPuntuacion();
						if(puntosFinalesJ1>puntosFinalesJ2) {
							vista.mostrarMensaje("FIN DEL JUEGO\nGana el Jugador 1 con "+puntosFinalesJ1+" puntos", "informativo");
						}else if(puntosFinalesJ1<puntosFinalesJ2) {
							vista.mostrarMensaje("FIN DEL JUEGO\nGana el Jugador 2 con "+puntosFinalesJ2+" puntos", "informativo");
						}else if(puntosFinalesJ1==puntosFinalesJ2) {
							vista.mostrarMensaje("FIN DEL JUEGO\nEmpate\nAmbos jugadores tienen "+puntosFinalesJ2+" puntos", "informativo");
						}
					}
				}
			} catch (NumberFormatException e) {
				// TODO: handle exception
				vista.mostrarMensaje("Ingrese un número de "+tamNum+" cifras", "error");
				vJuego.getpJuego().getpJugador2().getC_numA().setText("");
			}
		}
		if (arg0.getActionCommand().equals("AYUDA1")) {
			NumJ2 = String.valueOf(vJuego.getpJuego().getpJugador2().getC_num1().getPassword());
			intentos = vJuego.getpJuego().getpJugador().getNumintentos();
			fila=(Integer.parseInt(vOpciones.getpOpciones().getC_intentos().getText())-intentos)-1;
			puntos = vJuego.getpJuego().getpJugador().getPuntuacion();
			if (puntos<5) {
				vista.mostrarMensaje("Puntos insuficientes", "error");
			}else if(Integer.parseInt(arrlistaJ1.get(fila).get(2))==0) {
				vista.mostrarMensaje("No hay picas", "error");
			}else{
				aux2 = op.ayudapicas(arrlistaJ1.get(fila).get(0), NumJ2);
				vista.mostrarMensaje("Las picas son " + aux2, "informativo");
				puntos=(vJuego.getpJuego().getpJugador().getPuntuacion())-5;
				vJuego.getpJuego().getpJugador().setPuntuacion(puntos);
				vJuego.getpJuego().getpJugador().getE_puntos().setText("Puntuación: "+puntos);
			}
		}else if (arg0.getActionCommand().equals("J2AYUDA1")) {
			NumJ1 = String.valueOf(vJuego.getpJuego().getpJugador().getC_num1().getPassword());
			intentos = vJuego.getpJuego().getpJugador2().getNumintentos();
			fila=(Integer.parseInt(vOpciones.getpOpciones().getC_intentos().getText())-intentos)-1;
			puntos = vJuego.getpJuego().getpJugador2().getPuntuacion();
			if (puntos<5) {
				vista.mostrarMensaje("Puntos insuficientes", "error");
			}else if(Integer.parseInt(arrlistaJ2.get(fila).get(2))==0) {
				vista.mostrarMensaje("No hay picas", "error");
			}else{
				aux2 = op.ayudapicas(arrlistaJ2.get(fila).get(0), NumJ1);
				vista.mostrarMensaje("Las picas son " + aux2, "informativo");
				puntos=(vJuego.getpJuego().getpJugador2().getPuntuacion())-5;
				vJuego.getpJuego().getpJugador2().setPuntuacion(puntos);
				vJuego.getpJuego().getpJugador2().getE_puntos().setText("Puntuación: "+puntos);
			}
			
		}else if (arg0.getActionCommand().equals("AYUDA2")) {
			NumJ2 = String.valueOf(vJuego.getpJuego().getpJugador2().getC_num1().getPassword());
			intentos = vJuego.getpJuego().getpJugador().getNumintentos();
			fila=(Integer.parseInt(vOpciones.getpOpciones().getC_intentos().getText())-intentos)-1;
			puntos = vJuego.getpJuego().getpJugador().getPuntuacion();
			if (puntos<10) {
				vista.mostrarMensaje("Puntos insuficientes", "error");
			}else if(Integer.parseInt(arrlistaJ1.get(fila).get(1))==0) {
				vista.mostrarMensaje("No hay fijas", "error");
			}else{
				aux2 = op.ayudafijas(arrlistaJ1.get(fila).get(0), NumJ2);
				vista.mostrarMensaje("Las fijas son " + aux2, "informativo");
				puntos=(vJuego.getpJuego().getpJugador().getPuntuacion())-10;
				vJuego.getpJuego().getpJugador().setPuntuacion(puntos);
				vJuego.getpJuego().getpJugador().getE_puntos().setText("Puntuación: "+puntos);
			}
		} else if(arg0.getActionCommand().equals("J2AYUDA2")) {
			NumJ1 = String.valueOf(vJuego.getpJuego().getpJugador().getC_num1().getPassword());
			intentos = vJuego.getpJuego().getpJugador2().getNumintentos();
			fila=(Integer.parseInt(vOpciones.getpOpciones().getC_intentos().getText())-intentos)-1;
			puntos = vJuego.getpJuego().getpJugador2().getPuntuacion();
			if (puntos<10) {
				vista.mostrarMensaje("Puntos insuficientes", "error");
			}else if(Integer.parseInt(arrlistaJ2.get(fila).get(1))==0) {
				vista.mostrarMensaje("No hay fijas", "error");
			}else{
				aux2 = op.ayudafijas(arrlistaJ2.get(fila).get(0), NumJ1);
				vista.mostrarMensaje("Las fijas son " + aux2, "informativo");
				puntos=(vJuego.getpJuego().getpJugador2().getPuntuacion())-10;
				vJuego.getpJuego().getpJugador2().setPuntuacion(puntos);
				vJuego.getpJuego().getpJugador2().getE_puntos().setText("Puntuación: "+puntos);
			}
		}else if (arg0.getActionCommand().equals("AYUDA3")) {
			char digito;
				puntos = vJuego.getpJuego().getpJugador().getPuntuacion();
				if (puntos<20) {
					vista.mostrarMensaje("Puntos insuficientes", "error");
				}else{
					try {
						pos = vista.leerDato("Ingrese la posición a ver");
						digito = String.valueOf(vJuego.getpJuego().getpJugador2().getC_num1().getPassword()).charAt(pos-1);
						vista.mostrarMensaje("El dígito en la posición "+pos+" es "+ digito, "informativo");
						puntos=(vJuego.getpJuego().getpJugador().getPuntuacion())-20;
						vJuego.getpJuego().getpJugador().setPuntuacion(puntos);
						vJuego.getpJuego().getpJugador().getE_puntos().setText("Puntuación: "+puntos);
					} catch (NumberFormatException e) {
						// TODO: handle exception
						vista.mostrarMensaje("Ingrese un número válido", "error");
					}catch (StringIndexOutOfBoundsException e) {
						// TODO: handle exception
						vista.mostrarMensaje("Ingrese un número válido", "error");
					}
				}
		}else if (arg0.getActionCommand().equals("J2AYUDA3")) {
			char digito;
			puntos = vJuego.getpJuego().getpJugador2().getPuntuacion();
			if (puntos<20) {
				vista.mostrarMensaje("Puntos insuficientes", "error");
			}else{
				try {
					pos = vista.leerDato("Ingrese la posición a ver");
					digito = String.valueOf(vJuego.getpJuego().getpJugador().getC_num1().getPassword()).charAt(pos-1);
					vista.mostrarMensaje("El dígito en la posición "+pos+" es "+ digito, "informativo");
					puntos=(vJuego.getpJuego().getpJugador2().getPuntuacion())-20;
					vJuego.getpJuego().getpJugador2().setPuntuacion(puntos);
					vJuego.getpJuego().getpJugador2().getE_puntos().setText("Puntuación: "+puntos);
				} catch (NumberFormatException e) {
					// TODO: handle exception
					vista.mostrarMensaje("Ingrese un número válido", "error");
				}catch (StringIndexOutOfBoundsException e) {
					// TODO: handle exception
					vista.mostrarMensaje("Ingrese un número válido", "error");
				}
			}
		}
	}

	/**
	 *Método que recorre con un bucle for los componentes de pJugador y pJugador2 y los activa o desactiva según se le pase por parámetro
	 * 
	 * @param estado Objeto de tipo Boolean
	 * @return <ul>
	 * 			<li>True:si el valor de la variable estado es True
	 * 			<li>False:si el valor de la variable estado es False
	 * 		   </ul>
	 */
	public boolean Activo_Inactivo(boolean estado) {
		
		for(Component x:vJuego.getpJuego().getpJugador().getComponents()) {
			x.setEnabled(estado);			
		}
		
		for(Component x:vJuego.getpJuego().getpJugador2().getComponents()) {
			x.setEnabled(estado);			
		}
		return estado;
	}
	
	/**
	 *Método que recorre con un bucle for los componentes de pJugador y los activa o desactiva según se le pase por parámetro
	 * 
	 * @param estado Objeto de tipo Boolean
	 * @return <ul>
	 * 			<li>True:si el valor de la variable estado es True
	 * 			<li>False:si el valor de la variable estado es False
	 * 		   </ul>
	 */
	public boolean Activo_InactivoJ1(boolean estado) {
		
		for(Component x:vJuego.getpJuego().getpJugador().getComponents()) {
			x.setEnabled(estado);			
		}
		return estado;
	}
	
	/**
	 *Método que recorre con un bucle for los componentes de pJugador2 y los activa o desactiva según se le pase por parámetro
	 * 
	 * @param estado Objeto de tipo Boolean
	 * @return <ul>
	 * 			<li>True:si el valor de la variable estado es True
	 * 			<li>False:si el valor de la variable estado es False
	 * 		   </ul>
	 */
	public boolean Activo_InactivoJ2(boolean estado) {
		
		for(Component x:vJuego.getpJuego().getpJugador2().getComponents()) {
			x.setEnabled(estado);			
		}
		return estado;
	}
}
