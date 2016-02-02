package pato;

public class Pato 
{
	private int Posicion;
	
	public Pato (int pos)
	{
		this.Posicion=pos;
	}
	
	public int AndarHaciaDelante(int pasos) 
	{
		return this.Posicion+=pasos;
	}
	public int AndarHaciaAtras(int pasos) 
	{
		return this.Posicion-=pasos;
	}
	public int Dimeposicion()
	{
		return this.Posicion;
	}
	
	//Proyecto del pato sin acabar
}
