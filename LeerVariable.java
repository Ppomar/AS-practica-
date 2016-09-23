import java.io.*;
import java.lang.*;
public abstract class LeerVariable 
{
    public abstract void main(String[] args);
    private static InputStreamReader isr = new InputStreamReader(System.in);
	private static BufferedReader br = new BufferedReader (isr);
	
	//Metodo para las cadenas de texto
    public static String leerTexto(String mensaje)
    { 
	String texto= "";
	try
	{
	System.out.print(mensaje);
	texto= br.readLine();
	}
	catch (Exception e)
	{
	System.out.println("Error "+e); 
	}
	return texto;
    }
    //Metodo que leer numeros enteros 
    public static int leerEntero(String mensaje) 
    {
	int num=0;
	try
	{
		System.out.print(mensaje);
		num= Integer.parseInt(br.readLine());
		}
		catch (Exception e)
		{
			System.out.println("Error"+e);
			}
			return num;
			}
			//Metodo para numeros reales
			
			public static double leerReal(String mensaje)
			{
				double num= 0;
				try
				{
					System.out.print(mensaje);
					Double d = new Double(br.readLine());
					num = d.doubleValue();
				}
				catch (Exception e)
				{
				System.out.println("Error "+e);
				}
				return num;
			}
			}