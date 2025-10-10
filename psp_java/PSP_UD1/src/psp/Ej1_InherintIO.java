package psp;

public class Ej1_InherintIO {

	public static void main(String[] args) throws Exception { 

		
		int return_code = new ProcessBuilder(Utils.sh("ls -la")).inheritIO().start().waitFor();
				
		new ProcessBuilder(Utils.sh("ls -la")).inheritIO().start().waitFor();
		
	}

}
