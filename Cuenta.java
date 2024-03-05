import java.util.Scanner;

public class Cuenta {
    int numeroCuenta;
    long DNI;
    double sueldoActual;

    public Cuenta() {
        this.numeroCuenta=58887;
        this.DNI=40897584;
        this.sueldoActual=89999;
    }

    public Cuenta(int numeroCuenta, long DNI, double sueldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI=DNI;
        this.sueldoActual = sueldoActual;

    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSueldoActual() {
        return sueldoActual;
    }

    public void setSueldoActual(double sueldoActual) {
        this.sueldoActual = sueldoActual;
    }

  //pide los datos al usuario
    public void Cuenta(int numeroCuenta, long DNI, double sueldoActual){
        System.out.println("indique su numero de cuenta");
        Scanner consola= new Scanner(System.in);
        numeroCuenta=consola.nextInt();
        System.out.println("indique su numero DNI");
        consola = new Scanner(System.in);
        DNI= consola.nextLong();
        System.out.println("indique su sueldo actual");
        consola= new Scanner(System.in);
        sueldoActual=consola.nextDouble();
    }
    //método recibe una cantidad de dinero a ingresar y se la sumará al saldo actual.
    public void ingresar(double ingreso){
        double nuevoSueldo;
        nuevoSueldo= this.sueldoActual + ingreso;
        System.out.println("el nuevo sueldo será= " + nuevoSueldo);
    }
    public void retirar(double retiro){
        if(retiro > this.sueldoActual){
            System.out.println("No tiene suficiente dinero en cuenta");
            this.sueldoActual=0;
        } else{
            double nuevoSueldo2;
            nuevoSueldo2= this.sueldoActual - retiro;
            System.out.println("Su nuevo sueldo es de = " + nuevoSueldo2);

        }
    }

    //permite sacar solo un 20% de su saldo
    public void extraccionRapida(){
        double limiteExtraccion = this.sueldoActual * 0.2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dinero a extraer: ");
        double montoExtraccion = scanner.nextDouble();

        if (montoExtraccion > 0 && montoExtraccion <= limiteExtraccion) {
            this.sueldoActual -= montoExtraccion;
            System.out.println("Se han extraído " + montoExtraccion + ". Saldo actual: " + this.sueldoActual);
        } else {
            System.out.println("La cantidad a extraer debe ser mayor que 0 y no puede superar el 20% del saldo.");
        }
        //consulta el saldo disponible en la cuenta
       /* public void consultarSaldo(){
            System.out.println("Su saldo actual es de: " + this.sueldoActual);
        }*/
        /*public void consultarDatos(){
            System.out.println("Su numero de cuenta es= " + this.numeroCuenta + "DNI= " + this.DNI +
                    "Su sueldo actual es de= " + this.sueldoActual);
        }*/
    }
}
