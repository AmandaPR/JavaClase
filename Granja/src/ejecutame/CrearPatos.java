package ejecutame;

import granja.Pato;

public class CrearPatos 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Pato mipato=new Pato[8];
		
		mipato.AndarAdelante(6);
		System.out.println("La posicion del pato es "+mipato.DimePosicion()+".");
		
	}

}
