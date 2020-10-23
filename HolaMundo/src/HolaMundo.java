
public class HolaMundo {
	public static void main(String[] args) {
		String Saludar = "Hola mundo desde Java";
		String saludo = "Hola Mundo";

		System.out.println(Saludar);
		System.out.println("Hola mundo desde Java");
		System.out.println(saludo);

		if (saludo.equals("Hola Mundo")) { // El "equals" sirve para comparar Strings
			System.out.println("Es cierto");

		} else {
			System.out.println("No es cierto");

		}

		var despedirse = "hasta luego"; // Var escoge el tipo de dato de la variable automaticamente
		System.out.println(despedirse);

	}
}
//Con control+shift+f se organizará automaticamente el formato