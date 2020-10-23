
public class Usuario {
	public static void main(String args[]) {

		var usuario = "Juan";
		var saludar = "Hola";

		System.out.println(saludar + " " + usuario);

		var i = 3;
		var j = 5;

		System.out.println(i + j); // Si colocas 2 variables nunericas, estas se sumaran al mostrarse

		System.out.println(saludar + i + j); // Aqui no se suman ya que antes de ellas viene otra variable no numerica

		System.out.println(i + j + saludar); // Aqui si se suman porque las variables numericas al llegar antes, estas se suman
	}
}
