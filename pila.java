import java.util.Scanner;
public class Pila {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int dim=0, frente, atras, opc;
		Push stack = new Push();
		System.out.println("Programa generador de una Pila");
		System.out.println("Ingresaremos la dimension de el arreglo: "); dim=ent.nextInt();
			int [] pila = new int[dim];
		do{	
		System.out.println("\tMENU");
		System.out.println("1.- Insertar");
		System.out.println("2.- Eliminar");
		System.out.println("3.- Mostrar");
		System.out.println("4.- Salir");
		
		System.out.println("Ingrese la opcion deseada: "); int op=ent.nextInt();
			switch(op)
			{
			case 1:
				System.out.println("Ingresa la dimension de la pila: ");
				dim.ent.nextInt();
				stack.Push(dim);
				break;
			case 2: stack.Pop();
				break;
			case 3: stack.Mostrar();
				break;
			case 4: return;
				break;			
			}
		}while(opc!=4);

	}

}


public class Push {
	int dim;
	float[] pilaa;
	float dato;
	int tope;
		public Push(int a)
		{
			float tope=-1;
			for(int i=0;i<a;i++)
			pilaa[i] = new float[i];
		}
		
		void public Push()
		{
			
		}

}
