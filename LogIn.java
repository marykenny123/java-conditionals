import java.util.Scanner;
public class LogIn {
    public static void main(String[] args) {
        /*Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, si son
        iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal:
        Nombre de usuario o contraseña incorrecta.
         */
        /*Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que
        no haga un salto de línea.
         */

        // he probado contra usuario "user" y contraseña "pswd"
        Scanner scanner = new Scanner(System.in);
        System.out.print("P fv teclea tu nombre de usuaria: ");
        String username = scanner.nextLine();
        System.out.print("P fv teclea tu contraseña: ");
        String password = scanner.nextLine();
        if ((username.equals("user")) && (password.equals("pswd"))) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrecta");
        }

        /* versión switch ---- he probado pero no funciona correctamente, si los datos son correctos
        devuelve que son correctos pero tb default que no son correctos
        * */
        System.out.print("P fv teclea tu nombre de usuaria (versión switch): ");
        String username1 = scanner.nextLine();
        System.out.print("P fv teclea tu contraseña (versión switch): ");
        String password1 = scanner.nextLine();
        switch (username1) {
            case "user":
                // la idea es si usuario correcto entonces comprobar contraseña
                switch (password1) {
                    case "pswd":
                        System.out.println("Acceso concedido");
                        break;
                    default:
                        System.out.println("Nombre de usuario o contraseña incorrecta");
                        break;
                }
            default:
                // la idea es que si no fue correcto usuario no revisar contraseña y devolver msj de datos erroneos
                System.out.println("**Nombre de usuario o contraseña incorrecta");
                break;
        }


    scanner.close();
    }
}
