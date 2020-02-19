package Main;

import java.util.*;

import Caracteristicas.Propietario;
import Caracteristicas.TipoServicio;
import Vehiculos.Buses;
import Vehiculos.Carros;
import Vehiculos.Motos;
import Vehiculos.Vehiculos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Propietario pr1 = new Propietario("Andres Quintero");
		TipoServicio t1 = new TipoServicio("Publico");

		// Datos Vehiculo 2
		Propietario pr2 = new Propietario("Harinton Ariza");
		TipoServicio t2 = new TipoServicio("Publico");

		// Datos Vehiculo 3
		Propietario pr3 = new Propietario("Alejandra Perez");
		TipoServicio t3 = new TipoServicio(" Particular");

		// Vehiculos

		Vehiculos c1 = new Carros(1234, pr1, t1);
		Vehiculos b1 = new Buses(5555, pr2, t2);
		Vehiculos m1 = new Motos(3113, pr3, t3);

		// Lista

		List<Vehiculos> vehiculos = new ArrayList<>();

		vehiculos.add(c1);
		vehiculos.add(b1);
		vehiculos.add(m1);

		// Mapa

		HashMap<Integer, Vehiculos> mapavehiculos = new HashMap<Integer, Vehiculos>();

		for (Vehiculos VehiculoActual : vehiculos) {

			mapavehiculos.put(VehiculoActual.getPlaca(), VehiculoActual);

		}

		System.out.println("Ingrese La Placa");

		Integer placa = sc.nextInt();

		System.out.println("¿Que vehiculo tiene?");

		System.out.println("1. Moto.");
		System.out.println("2. Carro.");
		System.out.println("3. Bus.");

		int veh = sc.nextInt();

		Vehiculos dato = mapavehiculos.get(placa);

		switch (veh) {

		case 1:

			String x = "moto";

			System.out.println("Propietario: " + dato.getPropietario().getNombre() + " ; Tipo de servicio: "
					+ dato.getTiposervicio().getTipo() + " ; El tipo de vehiculo es: " + x);

			System.out.println("");

			m1.Consultar();

			break;

		case 2:

			String y = "carro";

			System.out.println("Propietario: " + dato.getPropietario().getNombre() + " ; Tipo de servicio: "
					+ dato.getTiposervicio().getTipo() + " ; El tipo de vehiculo es: " + y);

			System.out.println("");

			c1.Consultar();

			break;

		case 3:

			String z = "bus";

			System.out.println("Propietario: " + dato.getPropietario().getNombre() + " ; Tipo de servicio: "
					+ dato.getTiposervicio().getTipo() + " ; El tipo de vehiculo es: " + z);

			System.out.println("");

			b1.Consultar();

			break;

		default:

			System.out.println("No manejamos esa clase de vehiculos");

			break;

		}

	}

}
