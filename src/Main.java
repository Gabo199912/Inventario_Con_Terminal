

import javax.management.openmbean.OpenMBeanConstructorInfo;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variable para entrar datos
        Scanner entradaDeOpciones = new Scanner(System.in);

        //variables tipo String, salir del programa o elegir opciones
        String opcionesExistentesEnMenu;


        //arreglos donde se guardan los diferentes productos
        ArrayList<String> risitoLista = new ArrayList<>();
        ArrayList<String> jugosLista = new ArrayList<>();
        ArrayList<String> bebidasLista = new ArrayList<>();
        ArrayList<String> sopasLista = new ArrayList<>();


        do {

            System.out.println("***********************************************************************");
            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
            System.out.println("***********************************************************************");
            System.out.println("*               puedes hacer lo siguiente                             *" +
                             "\n*                1. Ingresar productos                                *" +
                             "\n*                2. Mostrar los productos ingresados                  *" +
                             "\n*                3. Actualizar productos                              *" +
                             "\n*                4. Eliminar productos                                *" +
                             "\n*                5. Para terminar el programa ingrese: Salir          *" +
                             "\n*                --INGRESE UNA DE LAS OPCIONES--                      *"+
                             "\n***********************************************************************");
            System.out.println();
            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();


            casos: {
                switch (opcionesExistentesEnMenu) {
                    case "1":



                        System.out.println("***********************************************************************");
                        System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                        System.out.println("***********************************************************************");
                        System.out.println("*               puedes hacer lo siguiente                             *" +
                                         "\n*                1. Ingresar risitos                                  *" +
                                         "\n*                2. Ingresar jugos                                    *" +
                                         "\n*                3. Ingresar bebidas gaseosas                         *" +
                                         "\n*                4. Ingresar Sopas                                    *" +
                                         "\n*                5. Para para regresar escriba: REGRESAR              *" +
                                         "\n*                --INGRESE UNA DE LAS OPCIONES--                      *" +
                                         "\n***********************************************************************");

                        System.out.println();
                        opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();


                        while  (opcionesExistentesEnMenu.equals("1")) {
                            System.out.println("***********************************************************************");
                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                            System.out.println("***********************************************************************");
                            System.out.println("*        --ingresa tu producto                                        *");
                            System.out.print("*");
                            risitoLista.add(entradaDeOpciones.next().toUpperCase());
                            System.out.println("                                                                    *");

                            System.out.println("¿desea agregar otro producto?, SI para reingresar producto, NO para salir");
                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();



                            if (opcionesExistentesEnMenu.equals("SI")) {
                                opcionesExistentesEnMenu = "1";
                            }
                            else if(opcionesExistentesEnMenu.equals("NO")) {
                                opcionesExistentesEnMenu = "NO";
                            }
                            else {
                                opcionesExistentesEnMenu = "REPETIR";


                                while  (opcionesExistentesEnMenu.equals("REPETIR")) {
                                    System.out.println("INGRESE UN VALOR PERMITIDO");

                                    try {
                                        Thread.sleep(2500);
                                    } catch (InterruptedException e) {
                                        throw new RuntimeException(e);
                                    }

                                    System.out.println("***********************************************************************");
                                    System.out.println("*                       ¡INVENTARIOS GABO!                            *");
                                    System.out.println("***********************************************************************");
                                    System.out.print("* --  ");
                                    opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();


                                    if (opcionesExistentesEnMenu.equals("SI")) {
                                        opcionesExistentesEnMenu = "1";
                                    } else if (opcionesExistentesEnMenu.equals("NO")) {
                                        opcionesExistentesEnMenu = "NO";
                                    } else {
                                        opcionesExistentesEnMenu = "REPETIR";
                                    }
                                }



                            }
                        }

                        while  (opcionesExistentesEnMenu.equals("2")) {
                            System.out.println("***********************************************************************");
                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                            System.out.println("***********************************************************************");
                            System.out.println("*        --ingresa tu JUGO                                            *");
                            System.out.print("*");
                            jugosLista.add(entradaDeOpciones.next().toUpperCase());
                            System.out.println("                                                                    *");

                            System.out.println("¿desea agregar otro producto?, SI para reingresar producto, NO para salir");
                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();



                            if (opcionesExistentesEnMenu.equals("SI")) {
                                opcionesExistentesEnMenu = "2";
                            }
                            else if(opcionesExistentesEnMenu.equals("NO")) {
                                opcionesExistentesEnMenu = "NO";
                            }
                            else {
                                opcionesExistentesEnMenu = "REPETIR";


                                while  (opcionesExistentesEnMenu.equals("REPETIR")) {
                                    System.out.println("INGRESE UN VALOR PERMITIDO");

                                    try {
                                        Thread.sleep(2500);
                                    } catch (InterruptedException e) {
                                        throw new RuntimeException(e);
                                    }

                                    System.out.println("***********************************************************************");
                                    System.out.println("*                       ¡INVENTARIOS GABO!                            *");
                                    System.out.println("***********************************************************************");
                                    System.out.print("* --  ");
                                    opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();


                                    if (opcionesExistentesEnMenu.equals("SI")) {
                                        opcionesExistentesEnMenu = "2";
                                    } else if (opcionesExistentesEnMenu.equals("NO")) {
                                        opcionesExistentesEnMenu = "NO";
                                    } else {
                                        opcionesExistentesEnMenu = "REPETIR";
                                    }
                                }



                            }
                        }

                        while  (opcionesExistentesEnMenu.equals("3")) {
                            System.out.println("***********************************************************************");
                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                            System.out.println("***********************************************************************");
                            System.out.println("*        --ingresa tu BEBIDA GASEOSA                                  *");
                            System.out.print("*");
                            bebidasLista.add(entradaDeOpciones.next().toUpperCase());
                            System.out.println("                                                                    *");

                            System.out.println("¿desea agregar otro producto?, SI para reingresar producto, NO para salir");
                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();



                            if (opcionesExistentesEnMenu.equals("SI")) {
                                opcionesExistentesEnMenu = "3";
                            }
                            else if(opcionesExistentesEnMenu.equals("NO")) {
                                opcionesExistentesEnMenu = "NO";
                            }
                            else {
                                opcionesExistentesEnMenu = "REPETIR";


                                while  (opcionesExistentesEnMenu.equals("REPETIR")) {
                                    System.out.println("INGRESE UN VALOR PERMITIDO");

                                    try {
                                        Thread.sleep(2500);
                                    } catch (InterruptedException e) {
                                        throw new RuntimeException(e);
                                    }

                                    System.out.println("***********************************************************************");
                                    System.out.println("*                       ¡INVENTARIOS GABO!                            *");
                                    System.out.println("***********************************************************************");
                                    System.out.print("* --  ");
                                    opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();


                                    if (opcionesExistentesEnMenu.equals("SI")) {
                                        opcionesExistentesEnMenu = "3";
                                    } else if (opcionesExistentesEnMenu.equals("NO")) {
                                        opcionesExistentesEnMenu = "NO";
                                    } else {
                                        opcionesExistentesEnMenu = "REPETIR";
                                    }
                                }



                            }
                        }

                        while  (opcionesExistentesEnMenu.equals("4")) {
                            System.out.println("***********************************************************************");
                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                            System.out.println("***********************************************************************");
                            System.out.println("*        --ingresa tu SOPA                                            *");
                            System.out.print("*");
                            sopasLista.add(entradaDeOpciones.next().toUpperCase());
                            System.out.println("                                                                    *");

                            System.out.println("¿desea agregar otro producto?, SI para reingresar producto, NO para salir");
                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();



                            if (opcionesExistentesEnMenu.equals("SI")) {
                                opcionesExistentesEnMenu = "4";
                            }
                            else if(opcionesExistentesEnMenu.equals("NO")) {
                                opcionesExistentesEnMenu = "NO";
                            }
                            else {
                                opcionesExistentesEnMenu = "REPETIR";


                                while  (opcionesExistentesEnMenu.equals("REPETIR")) {
                                    System.out.println("INGRESE UN VALOR PERMITIDO");

                                    try {
                                        Thread.sleep(2500);
                                    } catch (InterruptedException e) {
                                        throw new RuntimeException(e);
                                    }

                                    System.out.println("***********************************************************************");
                                    System.out.println("*                       ¡INVENTARIOS GABO!                            *");
                                    System.out.println("***********************************************************************");
                                    System.out.print("* --  ");
                                    opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();


                                    if (opcionesExistentesEnMenu.equals("SI")) {
                                        opcionesExistentesEnMenu = "4";
                                    } else if (opcionesExistentesEnMenu.equals("NO")) {
                                        opcionesExistentesEnMenu = "NO";
                                    } else {
                                        opcionesExistentesEnMenu = "REPETIR";
                                    }
                                }



                            }
                        }





                        break casos;


                    case "2":
                        System.out.println("***********************************************************************");
                        System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                        System.out.println("***********************************************************************");

                        for (String risitos : risitoLista) {
                            System.out.println(risitos);
                        }

                        opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();

                        break;


                    case "3":

                        break;


                }

            }

            if (opcionesExistentesEnMenu.equals("SALIR")) {
                opcionesExistentesEnMenu = "SALIR";
            }else {
                opcionesExistentesEnMenu = "SI";
            }





        }while (opcionesExistentesEnMenu.equals("SI"));


    }
}