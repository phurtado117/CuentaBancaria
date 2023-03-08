import java.util.Scanner;
public class CuentaBBVA {
    private String name;
    private int Account;
    private int balance;



    public CuentaBBVA(String name, int Account, int balance) {
        this.Account = Account;
        this.name = name;
        this.balance = balance;

    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount() {
        return Account;
    }

    public void setAccount(int account) {
        Account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;

    }
    public void Menu(){
        Scanner entra =new Scanner(System.in);
        int opcion;
        double Retirar =0;
        double total;
        double Deposito =0;

        do{
            System.out.println("[1] Saldo");
            System.out.println("[2] Retirar");
            System.out.println("[3] Depositar");
            System.out.println("[0] Salir");
            opcion= entra.nextInt();

            if(opcion == 1){
                System.out.println("su saldo es;"+getBalance());
            }
            if (opcion==2){
                System.out.println("ingrese cantidad a retirar:");
                Retirar =entra.nextDouble();
                total=getBalance()-Retirar;
                System.out.println("su saldo ahora es:"+total);
            }
            if (opcion==3){
                System.out.println("ingrese cantidad a depositar");
                Deposito= entra.nextDouble();
                total=getBalance()+Deposito;
                System.out.println("su saldo ahora es:"+total);


            }

        }
        while(opcion!=0);

            }

        }






