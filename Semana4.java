/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana4;

import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class Semana4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //variables
        int opcion;
        int precioBase = 20000;
        int edad ;
        int totalPagar;
        double descuento;
        String confirmacion;
        int numeroAsiento;
        char zona;
        
        //Variables de asientos del plano del teatro
        String a1 = "A1", a2 = "A2", a3 = "A3";
        String b1 = "B1", b2 = "B2", b3 = "B3";
        String c1 = "C1", c2 = "C2", c3 = "C3";

        
        for (;;){//bucle infinito usando for para el MENU
            System.out.println("************************************"); 
            System.out.println("**** BIENVENIDO AL TEATRO ******");
            System.out.println("Menu");
            System.out.println("Opcion 1: Comprar Entrada");
            System.out.println("Opcion 2: Salir");
            System.out.println("Seleccione una opcion:");
            
            //opcion = scanner.nextInt();
            
            //Ciclo para Manejo de errores para entradas invalidas(letras en vez de números) con ciclo if en el Menú
            if(scanner.hasNextInt()){ //Verificamos que lo ingresado sea un número antes de leerla, si la entrada es un número
                opcion = scanner.nextInt(); //se le asigna a la variable opción
                
            
            
            
                    if(opcion == 1){


                        //mostrar el plano del teatro con ubicaciones disponibles
                        System.out.println("************************************");
                        System.out.println("**** COMPRA DE ENTRADAS ******");
                        System.out.println("\nA continuacion le mostramos un plano del teatro con los Asientos Disponibles \n");

                        do{

                            System.out.println("******** ESCENARIO  *********");
                            System.out.println("ZONA A: " + a1 + " - " + a2 + " - " + a3);
                            System.out.println("ZONA B: " + b1 + " - " + b2 + " - " + b3);
                            System.out.println("ZONA C: " + c1 + " - " + c2 + " - " + c3);
                            System.out.println("\nPrimero ingrese la ZONA en que desea el asiento: (A/B/C)");

                            //Solicitar ubicación del asiento, usando validación con estructura condicional if

                            zona = scanner.next().trim().toUpperCase().charAt(0); 
                            //charAt: método para obtener un caracter específico en función de su posición, obtiene el primer caracter de la cadena
                            //scanner.next devuelve un String completo hasta el primer espacio y la variable zona está declarada como char por eso charAt es necesario
                            //de lo contrario se intentará asignar un String a una variable tipo char, lo que es incompatible y genera error de compilación
                            
                            if (zona != 'A' && zona != 'B' && zona != 'C'){
                                System.out.println("Zona invalida. Intente nuevamente");
                                continue;
                            }

                            System.out.println("Ahora ingrese el Numero del Asiento que desea comprar:");
                            numeroAsiento = scanner.nextInt();

                            if (numeroAsiento < 1 || numeroAsiento > 3){
                                System.out.println("Numero de asiento invalido. Intente nuevamente.");
                                continue;
                            }

                            if ( zona == 'A'){
                                if(numeroAsiento == 1 && !"XX".equals(a1) ) {
                                    a1 = "XX";
                                    break;
                                } else if (numeroAsiento == 2 && !"XX".equals(a2)){
                                    a2 = "XX";
                                    break;
                                } else if (numeroAsiento == 3 && !"XX".equals(a3)){
                                    a3 = "XX";
                                    break;
                                } else { 
                                    System.out.println("\n************************************"); 
                                    System.out.println("El asiento ya esta ocupado, por favor, eliga otro:");
                                } 
                            } else if ( zona == 'B'){
                                if(numeroAsiento == 1 && !"XX".equals(b1) ) {
                                    b1 = "XX";
                                    break;
                                } else if (numeroAsiento == 2 && !"XX".equals(b2)){
                                    b2 = "XX";
                                    break;
                                } else if (numeroAsiento == 3 && !"XX".equals(b3)){
                                    b3 = "XX";
                                    break;
                                } else { 
                                    System.out.println("\n************************************"); 
                                    System.out.println("El asiento ya esta ocupado, por favor, eliga otro:");
                                } 
                            } else if ( zona == 'C'){
                                if(numeroAsiento == 1 && !"XX".equals(c1) ) {
                                    c1 = "XX";
                                    break;
                                } else if (numeroAsiento == 2 && !"XX".equals(c2)){
                                    c2 = "XX";
                                    break;
                                } else if (numeroAsiento == 3 && !"XX".equals(c3)){
                                    c3 = "XX";
                                    break;
                                } else { 
                                    System.out.println("\n************************************"); 
                                    System.out.println("El asiento ya esta ocupado, por favor, eliga otro:");                     
                                }
                            }
                        }while(true);    



                        System.out.println("\n Usted ha reservado el siguiente asiento: " + zona + "" + numeroAsiento);

                        System.out.println("******** ESCENARIO  *********");
                        System.out.println("ZONA A: " + a1 + " - " + a2 + " - " + a3);
                        System.out.println("ZONA B: " + b1 + " - " + b2 + " - " + b3);
                        System.out.println("ZONA C: " + c1 + " - " + c2 + " - " + c3);



                        //Solicitar ingreso de edad y validarla aplicando descuentos con if-else
                        System.out.println("************************************"); 
                        System.out.println("El valor base de la entrada es: " + precioBase);
                        System.out.println("Ahora ingrese su edad para validar aplicacion de descuentos:");
                        



                         //Validación de edad y..
                        // Calcular Precio final en un ciclo do while o while, aplicando los descuentos
                            //Aplicar descuento 10% para estudiantes, 
                            //15 % para personas de la tercera edad, mayores de 60 años. El cálculo sería precioBase * 0.85 corresponde al 15%
                        //precioBase * 0.9 corresponde  al 10% de descuento para estudiantes 

                        do {

                            if(scanner.hasNextInt()){ //Si la entrada es un número...
                            edad = scanner.nextInt(); //Lee lo que el usuario ingresa, con nextInt captura número, lo asigno a la variable
                            
                                if(edad>60){
                                System.out.println("Aplica descuento del 15%, para tercera edad.");
                                descuento = 0.85;
                                totalPagar = (int) (precioBase * descuento);
                                break;

                                } else if (edad<23){
                                    System.out.println("Aplica descuento del 10%, para estudiantes.");
                                    descuento = 0.9;
                                    totalPagar = (int) (precioBase * descuento);
                                    break;

                                } else{
                                        System.out.println("No aplica descuentos, tarifa normal.");
                                        descuento = 0;
                                        totalPagar = precioBase;
                                        break;
                                }
                                                        
                            } else {
                                System.out.println("Opcion no valida. Ingrese un número por favor:");
                                scanner.next(); //consumimos entrada no valida para no caer en bucle.
                            }
                            
                        
                        } while(true);

                        
                        //Condicional para mostrar el % correctamente:
                        double porcentajeDescuento = 0;
                        if(descuento != 0){
                            porcentajeDescuento =  100 - (descuento * 100) ;
                        }else{
                            porcentajeDescuento = 0;
                        }
                        
                        
                        
                        //Resumen de la compra
                            System.out.println("************************************"); 
                            System.out.println("RESUMEN DE LA COMPRA:");
                            System.out.println("Ubicacion del asiento:" + zona + "" + numeroAsiento);
                            System.out.println("Precio Base de la entrada:" + precioBase);
                            System.out.println("Descuento aplicado:" + porcentajeDescuento + "%");
                            System.out.println("Precio final a pagar:" + totalPagar);
                            System.out.println("************************************"); 


                        //Confirmación de la compra
                         do{
                            System.out.println("¿Confirma la Compra? (S/N)");
                            confirmacion = scanner.next().trim().toLowerCase();

                            if( !"s".equals(confirmacion) && !"n".equals(confirmacion)){
                            System.out.println("Opcion no valida intente nuevamente.");

                            } else if ("n".equals(confirmacion)) {
                                System.out.println("************************************"); 
                                System.out.println("Compra Cancelada");
                                System.out.println("Su reserva se ha liberado.");                                
                                
                                //*********************************************************************************
                                // limpiar variables y sacar la reserva de asiento:
                                
                                if ( zona == 'A'){
                                    if(numeroAsiento == 1 && "XX".equals(a1) ) {
                                        a1 = "A1";
                                        break;
                                    } else if (numeroAsiento == 2 && "XX".equals(a2)){
                                        a2 = "A2";
                                        break;
                                    } else if (numeroAsiento == 3 && "XX".equals(a3)){
                                        a3 = "A3";
                                        break;
                                    }
                                } else if ( zona == 'B'){
                                    if(numeroAsiento == 1 && "XX".equals(b1) ) {
                                        b1 = "B1";
                                        break;
                                    } else if (numeroAsiento == 2 && "XX".equals(b2)){
                                        b2 = "B2";
                                        break;
                                    } else if (numeroAsiento == 3 && "XX".equals(b3)){
                                        b3 = "B3";
                                        break;
                                    }
                                } else if ( zona == 'C'){
                                    if(numeroAsiento == 1 && "XX".equals(c1) ) {
                                        c1 = "C1";
                                        break;
                                    } else if (numeroAsiento == 2 && "XX".equals(c2)){
                                        c2 = "C2";
                                        break;
                                    } else if (numeroAsiento == 3 && "XX".equals(c3)){
                                        c3 = "C3";
                                        break;
                                    }
                                }
                                
                                                              
                                //*********************************************************************************
                                break;
                             
                            } else {
                                System.out.println("Procesando la compra.....");
                                System.out.println("Has comprado la entrada exitosamente");
                                break;
                            }

                         }while(true);   

                        //Al finalizar compra, pregunta si desea realizar otra:


                            System.out.println("¿Desea realizar otra compra? (S/N)");

                            String respuesta = scanner.next().trim().toLowerCase();


                            if("n".equals(respuesta)){


                                System.out.println("Gracias por usar el sistema.");
                                break;

                            }

                            if( !"s".equals(respuesta) && !"n".equals(respuesta)){
                                System.out.println("Opcion no valida intente nuevamente.");

                            }





                    }else if(opcion==2){ //Salida del programa.
                        System.out.println("Saliendo del programa....  \nGracias por usar el sistema. ¡ Hasta luego !");
                        break;
                    }else{ //Manejo de error en Menú inicial sólo para números
                        System.out.println("************************************");
                        System.out.println("Opcion no valida, ingrese una de las dos opciones nuevamente.");
                    }
            
            } else { //si lo ingresado NO es un número
                System.out.println("Opcion no valida, no es un numero, ingrese nuevamente su opcion");
                scanner.next(); //consumimos entrada no válida: descartamos la entrada incorrecta y evitamos un bucle infinito
          
            }
            
        }
        
        scanner.close();
    }
    
}
