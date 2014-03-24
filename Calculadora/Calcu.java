/*
Instituto Tecnológico de Costa Rica
Escuela de Ingeniería en Computación
Desarrollo de Aplicaciones para Dispositivos Móviles
Tarea Corta #1: Interfaz nativa JNI
Andrés Eduardo González Ortiz - 201016317
I Semestre, 2014
*/

public class Calcu
{
	//Se definen las operaciones nativas
	public native int suma(int num1, int num2);
	public native int resta(int num1, int num2);
	public native int multi(int num1, int num2);
	public native double divi(int num1, int num2);
	
	public static void main(String[] args)
	{
		//Inicialización de variables
		Calcu _calc = new Calcu();
		String _sNum1, _sNum2, _sOpe;
        	int _iNum1, _iNum2, _iNumR;
		
		//Se define el operando 1
		System.out.println("Operando 1: ");
		_sNum1 = System.console().readLine();
        	_iNum1 = Integer.parseInt(_sNum1);
		
		//Se define el operando 2
		System.out.println("Operando 2: ");
		_sNum2 = System.console().readLine();
        	_iNum2 = Integer.parseInt(_sNum2);
		
		//Se define la operación
		System.out.println("Operacion (+,-,*,/): ");
		_sOpe = System.console().readLine();
		
		//Switch de operaciones
		switch(_sOpe){
					//Suma
                    case "+":
                        _iNumR = _calc.suma(_iNum1, _iNum2);
                        System.out.println("El resultado es: "+_iNumR);
                        break;
					//Resta
                    case "-":
                        _iNumR = _calc.resta(_iNum1, _iNum2);
                        System.out.println("El resultado es: "+_iNumR);
                        break;
					//Multiplicación
                    case "*":
                        _iNumR = _calc.multi(_iNum1, _iNum2);
                        System.out.println("El resultado es: "+_iNumR);
                        break;
					//División
                    case "/":
                        double _dNumR = _calc.divi(_iNum1, _iNum2);
                        System.out.println("El resultado es: "+_dNumR);
                        break;
                }
                System.out.println("Pulse Enter para salir");
                System.console().readLine();
	}
	static
	{
		//Importación de Operaciones.dll
		System.loadLibrary("Operaciones");
	}
}
