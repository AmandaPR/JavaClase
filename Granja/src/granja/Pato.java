package granja;

public class Pato 
{

	//Propiedades del pato
	
	private int posicion;
	private boolean hembra;
	private boolean macho;
	
	//Constructor
	public Pato(int p)
	{
		this.posicion=0;
	}
	
	//Métodos
	public int AndarAdelante(int pasos)
	{
		return this.posicion+=pasos;
	}
	
	
	public int AndarAtras(int pasos)
	{
		return this.posicion-=pasos;
	}
	
	
	public int DimePosicion()
	{
		return this.posicion;
	}
	
	private boolean SexoPato()
	{
		if(Pato==0)
		{
			Pato=macho;
		}
		
		if(Pato==1)
		{
			Pato=hembra;
		}
	}
	
	
	
	
	
	
	
}
