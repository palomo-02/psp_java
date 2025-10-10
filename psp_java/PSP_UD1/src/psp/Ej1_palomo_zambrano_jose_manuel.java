package psp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej1_palomo_zambrano_jose_manuel {

	public static void main(String[] args) throws Exception {
		
		ProcessBuilder pb = new ProcessBuilder(Utils.sh(String.join(" ", args)));
		Process p = pb.start();

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}

		int rc = p.waitFor();
		
		if(rc==0) {
			System.out.println("El comando se ha ejecutado correctamente");
			}else {	
				System.out.println("El comando no se ha ejecutado correctamente");
			}
		
		
		System.out.println("RC=" + rc);
		
		
		
		
		

	}
}