
public class Principal {
	public static void main(String[] main) {
		GeoPunto z, w;
		double d;
		z = new GeoPunto(28.482687,-16.31694);
		w = new GeoPunto(32.646008,-16.91029);
		d=z.distancia(w);
		System.out.println("Distancia: " + d); // 466922.281 m
	}
}
