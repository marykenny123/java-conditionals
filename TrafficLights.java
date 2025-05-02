public class TrafficLights {
    public static void main(String[] args) {

        //Escribe un programa que basado en el color del semáforo verde, amarillo o rojo determine las acciones de un conductor 
        
        //Si es verde imprime en la terminal: Puedes seguir
        //Si es amarillo imprime en la terminal: Ten cuidado
        //Si es rojo imprime en la terminal: ¡¡¡Para!!!
        //Si es otro color imprime en la terminal: El semáforo está dañado

        String trafficLightColor = "0";

        if (!(trafficLightColor == "green" || trafficLightColor == "amber" || trafficLightColor == "red")) {
            System.out.println("El semáforo está dañado");
            } else if (trafficLightColor == "green") {
                System.out.println("Puedes seguir");
            } else if (trafficLightColor == "amber") {
                System.out.println("Ten cuidado");
            } else if (trafficLightColor == "red"){
                System.out.println("Para");
            }


        //Cambia el valor de la variable, corre el programa y mira el resultado
        // probado

        switch (trafficLightColor) {
            case ("green"):
                System.out.println("Puedes seguir -- versión switch");
                break;
            case ("amber"):
                System.out.println("Ten cuidado --- versión switch");
                break;
            case ("red"):
                System.out.println("Para --- versión switch");
                break;
            default:
                System.out.println("El semáforo está dañado --- versión switch");

        }


    }
    
}
