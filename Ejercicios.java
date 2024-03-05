import java.util.Scanner;

public class Ejercicios {

        private int numero1;
        private int numero2;

        public Ejercicios() {
            this.numero1=5;
            this.numero2=10;
        }

        public Ejercicios(int numero1, int numero2){
            this.numero1 = numero1;
            this.numero1 = numero1;
        }

        public int getNumero1() {
            return numero1;
        }

        public void setNumero1(int numero1) {
            this.numero1 = numero1;
        }

        public int getNumero2() {
            return numero2;
        }

        public void setNumero2(int numero2) {
            this.numero2 = numero2;
        }
        public void crearOperacion(){

            System.out.println("Escriba un numero");
            Scanner consola= new Scanner(System.in);
            numero1=consola.nextInt();
            System.out.println("Escriba un segundo numero");
            numero2= consola.nextInt();
            System.out.println("Los numeros rccibidos son: " + numero1 + "y" +numero2);
        }
        public void sumar(int a, int b){
            int suma= a+b;
            System.out.println("La suma de los 2 numeros es= " + suma);
        }
        public void restar(int a, int b){
            if( a>b){
                int resta = a-b;
                System.out.println("La resta de ambos numeros es= "+ resta);
            } else{
                int resta=b-a;
                System.out.println("La resta de ambos numeros es= "+ resta);


            }
        }
    }

