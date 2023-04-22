import java.util.Scanner;

public class primerprograma {

static int joseluis(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
}

public static void main (String[] args) {
System.out.println("//////////////////////////////"); 
Scanner leer = new Scanner(System.in);
 System.out.println("pepe");

double juan = 1;
System.out.println(juan);

int primerleido;
primerleido = leer.nextInt();

if(primerleido != 61 ){
    System.out.println("El numero ingresado es distinto de 61");
} else {
    System.out.println("El numero ingresado es 61 xd");
}

switch(primerleido){
    case 61: 
    System.out.println("entraste al switch con el 61 jaja");
    break;
    default: 
    System.out.println("Entraste al switch pero sin el 61 :O ");
    
}

while (primerleido == 61){
    System.out.println("Entraste al while");
    int random = (int)(Math.random()*10+1); /*número generado estará entre 1 y 10 */
    primerleido = 61 - random;
    System.out.println(primerleido);
}

primerleido = 61;

do {
    System.out.println("el maldito bucle do while");
    primerleido = 61-1;
} while (primerleido == 61);

System.out.println("XD");

for(int i = 1;i <= 10;i++){
System.out.println("vuelta");
}
int number1 = 150;
int number2 = 1500;
int suma = joseluis(number1,number2);
System.out.println(suma);

}

}