package Vehiculos;

import java.util.Scanner;

import Caracteristicas.Propietario;
import Caracteristicas.TipoServicio;

public class Motos extends Vehiculos {

	public Motos(Integer placa, Propietario propietario, TipoServicio tiposervicio) {
		super(placa, propietario, tiposervicio);

	}

	@Override

	public void Consultar() {

		System.out.println("¿Paga mensualidad?");
		System.out.println("1. Si");
		System.out.println("2. No");

		Scanner sc = new Scanner(System.in);

		int opt = sc.nextInt();

		switch (opt) {

		case 1:

			System.out.println("Puede salir.");

			break;

		case 2:

			System.out.println("¿Cuantas horas ha usado el parqueadero?");

			int num = sc.nextInt();

			System.out.println(" ");

			if (num > 6) {

				int saldo = (num - 6) * 5;

				System.out.println("Su recargo adicional es de: " + saldo + "%");

			} else {

				System.out.println("Su recarga es del 5%");

			}

			break;

		default:
			System.out.println("Esa no es una opcion valida");

			break;

		}

	}

}