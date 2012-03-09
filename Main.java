
public class Main {
	
	
	public static void main(String[] args){
		
		impresora i=new impresora();
		
		i.setCadena("Hola m—n");
		
		calculadora c=new calculadora(10, 20);
		
		System.out.println(c.sumar());
		
		System.out.println(c.multiplicar());
		
		System.out.println(i.getCadena());
		
	}

}
