package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import syspagos.Empleado;
import excepciones.*;

public class TestEmpleado 
{
//Estas son las pruebas de número de empleado//
	@Test 
	public void establecerNumeroDeEmpleadoCorrecto() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado("004");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(4,e.getNumeroEmpleado());
	}
	@Test 
	public void establecerNumeroDeEmpleadoIncorrecto000() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado("000");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(000,e.getNumeroEmpleado());
	}
	@Test
	public void establecerNumeroDeEmpleadoIncorrectoMayor3digitos() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado("4000");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(4000,e.getNumeroEmpleado());
	}
	@Test
	public void establecerNumeroDeEmpleadoIncorrectoNúmeroNegativo() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado("-150");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(-150,e.getNumeroEmpleado());
	}
	@Test
	public void establecerNumeroDeEmpleadoIncorrectoNoNúmero() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado("patata");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals("patata",e.getNumeroEmpleado());
	}
	@Test
	public void establecerNumeroDeEmpleadoIncorrectoNoCadena() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado(null);
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(null,e.getNumeroEmpleado());
	}
//Estas son las pruebas de los meses trabajados//
	@Test 
	public void MesesCorrectos() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceMesesTrabajo("004");
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertEquals(004,e.getMesesTrabajo());
	}
	@Test 
	public void MesesIncorrectoMayor3digitos() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceMesesTrabajo("4004");
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertEquals(4004,e.getMesesTrabajo());
	}
	@Test
	public void MesesIncorrectoNúmeroNegativo() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceMesesTrabajo("-4004");
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertEquals(-4004,e.getMesesTrabajo());
	}
	@Test
	public void MesesIncorrectoNoCadena() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceMesesTrabajo(null);
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertEquals(null,e.getMesesTrabajo());
	}

//Estos son las pruebas de nombres correctos//
	@Test
	public void NombresCorrectos() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceNombreEmpleado("RosaMelana");
        } catch (NombreEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals("RosaMelana",e.getNombreEmpleado());
	}
	@Test
	public void NombresIncorrectoMas10caracteres() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceNombreEmpleado("Bandoleroooooo");
        } catch (NombreEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals("Bandoleroooooo",e.getMesesTrabajo());
	}
	@Test
	public void NombresIncorrectoMenos10caracteres() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceNombreEmpleado("Jorge");
        } catch (NombreEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals("Jorge",e.getMesesTrabajo());
	}

	@Test
	public void NombresIncorrectoDigitos() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceNombreEmpleado("1234567890");
        } catch (NombreEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals("1234567890",e.getMesesTrabajo());
	}
	@Test
	public void NombresIncorrectoNoCadena() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceNombreEmpleado(null);
        } catch (NombreEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(null,e.getMesesTrabajo());
	}
//Estas son las pruebas de los cargos establecidos
	@Test
	public void CargoCorrectoSimboloMas() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerSerDirectivo("+");
        } catch (CargoException ex) 
        {
        	fail();
        }
        assertEquals(true,e.getDirectivo());
	}
	@Test
	public void CargoCorrectoSimboloMenos() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerSerDirectivo("-");
        } catch (CargoException ex) 
        {
        	fail();
        }
        assertEquals(false,e.getDirectivo());
	}
	@Test
	public void CargoIncorrectoMasdeUnCaracter() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerSerDirectivo("--");
        } catch (CargoException ex) 
        {
        	fail();
        }
        assertEquals(false,e.getDirectivo());
	}
	@Test
	public void CargoIncorrectoSimboloDiferente() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerSerDirectivo("?");
        } catch (CargoException ex) 
        {
        	fail();
        }
        assertEquals(false,e.getDirectivo());
	}
	@Test
	public void CargoIncorrectoNoCadena() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerSerDirectivo(null);
        } catch (CargoException ex) 
        {
        	fail();
        }
        assertEquals(false,e.getDirectivo());
	}
//Estas son las pruebas de las primas//
	@Test
	public void Prima1() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.calcularPrima("125","RosaMelana","112","+");
        } catch (Exception ex) 
        {
        	fail();
        }
        assertEquals("P1",e.getPrima());
	}
	@Test
	public void Prima2() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.calcularPrima("125","RosaMelana","255","-");
        } catch (Exception ex) 
        {
        	fail();
        }
        assertEquals("P2",e.getPrima());
	}
	@Test
	public void Prima3() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.calcularPrima("125","RosaMelana","005","+");
        } catch (Exception ex) 
        {
        	fail();
        }
        assertEquals("P3",e.getPrima());
	}
	@Test
	public void Prima4() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.calcularPrima("125","RosaMelana","005","-");
        } catch (Exception ex) 
        {
        	fail();
        }
        assertEquals("P4",e.getPrima());
	}
	@Test
	public void PrimaIncorrectoNumepleado() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.calcularPrima("1225","RosaMelana","525","+");
        } catch (Exception ex) 
        {
        	fail();
        }
        assertEquals("P4",e.getPrima());
	}
	@Test
	public void PrimaIncorrectoNomepleado() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.calcularPrima("125","Rosa","525","+");
        } catch (Exception ex) 
        {
        	fail();
        }
        assertEquals("P4",e.getPrima());
	}
	@Test
	public void PrimaIncorrectoMesesTrabajo() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.calcularPrima("125","Rosa","5255","+");
        } catch (Exception ex) 
        {
        	fail();
        }
        assertEquals("P4",e.getPrima());
	}
	@Test
	public void PrimaIncorrectoCargo() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.calcularPrima("125","Rosa","525","++");
        } catch (Exception  ex)
        {
        	fail();
        }
        assertEquals("P4",e.getPrima());
	}
}
