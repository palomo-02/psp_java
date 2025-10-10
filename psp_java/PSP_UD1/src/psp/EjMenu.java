package psp;

import java.util.Scanner;

public class EjMenu {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion = 0;

		do {

			menu();
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				uname();
				break;
			case 2:
				hostname();
				break;
			case 3:
				lscpu();
				break;
			case 4:
				timedatectl();
				break;
			case 5:
				System.out.println("saliendo");
				break;
			default:
				System.out.println("opcion no valida");
			}

		} while (opcion != 5);

	}

	private static void uname() {
		try {
			ProcessBuilder pb = new ProcessBuilder("sh","-c","uname", "-a");
			pb.inheritIO();
			Process p = pb.start();
			p.waitFor();
		} catch (Exception e) {
			System.out.println("Error ejecutando uname: " + e.getMessage());
		}
	}

	private static void hostname() {
		try {
			ProcessBuilder pb = new ProcessBuilder("sh","-c","hostname", "-a");
			pb.inheritIO();
			Process p = pb.start();
			p.waitFor();
		} catch (Exception e) {
			System.out.println("Error ejecutando hostname: " + e.getMessage());
		}
	}

	private static void lscpu() {
		try {
			ProcessBuilder pb = new ProcessBuilder("sh","-c","lscpu");
			pb.inheritIO();
			Process p = pb.start();
			p.waitFor();
		} catch (Exception e) {
			System.out.println("Error ejecutando lscpu: " + e.getMessage());
		}
	}

	private static void timedatectl() {
		try {
			ProcessBuilder pb = new ProcessBuilder("sh","-c","timedatectl", "status");
			pb.inheritIO();
			Process p = pb.start();
			p.waitFor();
		} catch (Exception e) {
			System.out.println("Error ejecutando timedatectl: " + e.getMessage());
		}
	}

	public static void menu() {

		System.out.println("1. uname -a");
		System.out.println("2. hostname -a");
		System.out.println("3. lscpu");
		System.out.println("4. timedatectl status");
		System.out.println("5. salir");
	}
}