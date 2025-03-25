

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variable para entrar datos
        Scanner entradaDeOpciones = new Scanner(System.in);

        //variables tipo String, salir del programa o elegir opciones
        String opcionesExistentesEnMenu;
        String nuevoValorProductoActualizado;

        //arreglos donde se guardan los diferentes productos
        ArrayList<String> risitoLista = new ArrayList<>();
        ArrayList<String> jugosLista = new ArrayList<>();
        ArrayList<String> bebidasLista = new ArrayList<>();
        ArrayList<String> sopasLista = new ArrayList<>();

        //variables para los indices de las listas
        int indiceDeProducto = 0;
        int numeroDeProductoParaActualizar;

        //booleanos para identificar caracteres
        boolean verificaSiEsNumero;
        boolean salirDeLosMenus;


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
            System.out.print("*-- ");
            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();


            casos: {
                switch (opcionesExistentesEnMenu) {
                    case "1":

                        // ESTA PARTE ME PERMITE INGRESAR PRODUCTOS A LAS LISTAS
                            opcionesExistentesEnMenu = "SI";
                            while   (opcionesExistentesEnMenu.equals("SI")) {

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
                                System.out.print("*-- ");
                                opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();


                                while  (opcionesExistentesEnMenu.equals("1")) {
                                    System.out.println("***********************************************************************");
                                    System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                    System.out.println("***********************************************************************");
                                    System.out.println("*        --ingresa tu producto                                        *");
                                    System.out.print("*-- ");
                                    entradaDeOpciones.nextLine();

                                    risitoLista.add(entradaDeOpciones.nextLine().toUpperCase());
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
                                    System.out.print("*-- ");
                                    entradaDeOpciones.nextLine();
                                    jugosLista.add(entradaDeOpciones.nextLine().toUpperCase());
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
                                    System.out.print("*-- ");
                                    entradaDeOpciones.nextLine();
                                    bebidasLista.add(entradaDeOpciones.nextLine().toUpperCase());
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
                                    System.out.print("*-- ");
                                    entradaDeOpciones.nextLine();
                                    sopasLista.add(entradaDeOpciones.nextLine().toUpperCase());
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
                                                System.out.println(e);
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


                                if (opcionesExistentesEnMenu.equals("REGRESAR")) {
                                    opcionesExistentesEnMenu = "REGRESAR";
                                }else if (opcionesExistentesEnMenu != "REGRESAR") {
                                    opcionesExistentesEnMenu = "SI";
                                }
                            }

                        break casos;


                    case "2":

                        // ESTA PARTE ME PERMITE MOSTRAR LO QUE TIENEN MIS LISTAS
                        opcionesExistentesEnMenu = "SI";
                        while   (opcionesExistentesEnMenu.equals("SI")) {


                                System.out.println("***********************************************************************");
                                System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                System.out.println("***********************************************************************");
                                System.out.println();

                                System.out.println("***********************************************************************");
                                System.out.println("*-- Los risitos ingresados son: ");
                                for (String risitos : risitoLista) {
                                    System.out.println( "* " +risitos);
                                }

                                System.out.println();
                                System.out.println("***********************************************************************");
                                System.out.println("*-- Los jugos ingresados son: ");
                                for (String jugos: jugosLista){
                                    System.out.println("* " + jugos);
                                }

                                System.out.println();
                                System.out.println("***********************************************************************");
                                System.out.println("+-- las bebidas ingresadas son: ");
                                for (String bebidas: bebidasLista){
                                    System.out.println("* " + bebidas);
                                }


                                System.out.println();
                                System.out.println("***********************************************************************");
                                System.out.println("*-- las sopas son: ");
                                for (String sopas: sopasLista){
                                    System.out.println("* " + sopas);

                                }

                                System.out.println();
                                System.out.println();
                                System.out.println();



                            System.out.println("***********************************************************************");
                            System.out.println("*                        ¡INVENTARIOS GABO!                           *");
                            System.out.println("***********************************************************************");
                            System.out.println();

                            System.out.println("***********************************************************************");
                            System.out.println("*-- ¿Desea ver otra vez los productos? ");
                            System.out.println("*-- Si repetir, No para salir");
                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();

                                if (opcionesExistentesEnMenu.equals("SI")) {
                                    opcionesExistentesEnMenu = "SI";
                                }else if(opcionesExistentesEnMenu.equals("NO")) {
                                    opcionesExistentesEnMenu = "NO";
                                }else {

                                    opcionesExistentesEnMenu = "REPETIR";

                                    while (opcionesExistentesEnMenu.equals("REPETIR") ) {
                                        System.out.println("***********************************************************************");
                                        System.out.println("*                        ¡INVENTARIOS GABO!                           *");
                                        System.out.println("***********************************************************************");
                                        System.out.println();
                                        System.out.println("*-- INGRESE UN VALOR PERMITIDO: SI O NO");
                                        System.out.println();
                                        opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();


                                        if (opcionesExistentesEnMenu != "SI" || opcionesExistentesEnMenu != "NO") {
                                            opcionesExistentesEnMenu = "REPETIR";
                                        }
                                    }


                                }




                            }
                        break casos;


                    case "3":
                        // ESETA PARTE ME PERMITE ACTUALIZAR LOS PRODUCTOS INGRESADOS
                        opcionesExistentesEnMenu = "SI";
                        while   (opcionesExistentesEnMenu.equals("SI")) {
                            System.out.println("***********************************************************************");
                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                            System.out.println("***********************************************************************");
                            System.out.println("*               puedes hacer lo siguiente                             *" +
                                             "\n*                1. Actualizar risitos                                *" +
                                             "\n*                2. Actualizar jugos                                  *" +
                                             "\n*                3. Actualizar bebidas gaseosas                       *" +
                                             "\n*                4. Actualizar Sopas                                  *" +
                                             "\n*                5. Para para regresar escriba: REGRESAR              *" +
                                             "\n*                --INGRESE UNA DE LAS OPCIONES--                      *" +
                                             "\n***********************************************************************");
                            System.out.println();
                            System.out.print("*-- ");
                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();

                            actualizar:
                                switch (opcionesExistentesEnMenu){
                                    case "1":

                                        salirDeLosMenus = false;
                                        while (!salirDeLosMenus) {

                                            System.out.println("***********************************************************************");
                                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                            System.out.println("***********************************************************************");
                                            System.out.println("*-- ¿cual desea modificar?, Ingrese el numero");


                                            numeroDeProductoParaActualizar = 0;
                                            indiceDeProducto = 0;

                                            for (String risitos: risitoLista){
                                                indiceDeProducto++;
                                                System.out.println("* "+ indiceDeProducto + ". " + risitos);
                                            }
                                            System.out.println();

                                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();
                                            verificaSiEsNumero = false;





                                            //sino ingresan un numero, repite hasta que sea numero
                                           while (!verificaSiEsNumero) {

                                               try {
                                                   numeroDeProductoParaActualizar = Integer.parseInt(opcionesExistentesEnMenu);
                                                   verificaSiEsNumero = true;
                                               }catch (NumberFormatException e){
                                                   verificaSiEsNumero = false;

                                                   System.out.println("***********************************************************************");
                                                   System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                                   System.out.println("***********************************************************************");
                                                   System.out.println("*-- INGRESE EL NUMERO DE SU PRODUCTO PARA ACTUALIZAR");
                                                   System.out.println();


                                                   indiceDeProducto = 0;
                                                   for (String risitos: risitoLista){
                                                       indiceDeProducto++;
                                                       System.out.println("* "+ indiceDeProducto + ". " + risitos);
                                                   }

                                                   System.out.println();

                                                   System.out.print("*-- ");
                                                   opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();
                                               }

                                           }





                                            System.out.println();
                                            System.out.println("*-- Ingrese el nuevo risito: ");

                                            entradaDeOpciones.nextLine();
                                            nuevoValorProductoActualizado = entradaDeOpciones.nextLine().toUpperCase();


                                            risitoLista.set((numeroDeProductoParaActualizar -1), nuevoValorProductoActualizado);


                                            System.out.println("***********************************************************************");
                                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                            System.out.println("***********************************************************************");
                                            System.out.println("*-- Para salir escribe: Salir");
                                            System.out.println("*-- Para Actualizar otro escribe: no");
                                            System.out.print("*-- ");
                                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();


                                            if (opcionesExistentesEnMenu.equals("SALIR")) {
                                                salirDeLosMenus = true;
                                            }else {
                                                salirDeLosMenus = false;
                                            }

                                        }

                                    break actualizar;



                                    case "2":

                                        salirDeLosMenus = false;
                                        while (!salirDeLosMenus) {

                                            System.out.println("***********************************************************************");
                                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                            System.out.println("***********************************************************************");
                                            System.out.println("*-- ¿cual desea modificar?, Ingrese el numero");


                                            numeroDeProductoParaActualizar = 0;
                                            indiceDeProducto = 0;

                                            for (String jugos: jugosLista){
                                                indiceDeProducto++;
                                                System.out.println("* "+ indiceDeProducto + ". " + jugos);
                                            }
                                            System.out.println();

                                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();
                                            verificaSiEsNumero = false;



                                            while (!verificaSiEsNumero) {

                                                try {
                                                    numeroDeProductoParaActualizar = Integer.parseInt(opcionesExistentesEnMenu);
                                                    verificaSiEsNumero = true;
                                                }catch (NumberFormatException e){
                                                    verificaSiEsNumero = false;

                                                    System.out.println("***********************************************************************");
                                                    System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                                    System.out.println("***********************************************************************");
                                                    System.out.println("*-- INGRESE EL NUMERO DE SU PRODUCTO PARA ACTUALIZAR");
                                                    System.out.println();

                                                    indiceDeProducto = 0;
                                                    for (String jugos: jugosLista){
                                                        indiceDeProducto++;
                                                        System.out.println("* "+ indiceDeProducto + ". " + jugos);
                                                    }

                                                    System.out.println();

                                                    System.out.print("*-- ");
                                                    opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();
                                                }

                                            }





                                            System.out.println();
                                            System.out.println("*-- Ingrese el nuevo jugo: ");

                                            entradaDeOpciones.nextLine();
                                            nuevoValorProductoActualizado = entradaDeOpciones.nextLine().toUpperCase();


                                            jugosLista.set((numeroDeProductoParaActualizar -1), nuevoValorProductoActualizado);


                                            System.out.println("***********************************************************************");
                                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                            System.out.println("***********************************************************************");
                                            System.out.println("*-- Para salir escribe: Salir");
                                            System.out.println("*-- Para Actualizar otro escribe: no");
                                            System.out.print("*-- ");
                                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();


                                            if (opcionesExistentesEnMenu.equals("SALIR")) {
                                                salirDeLosMenus = true;
                                            }else {
                                                salirDeLosMenus = false;
                                            }

                                        }

                                        break actualizar;

                                    case "3":

                                        salirDeLosMenus = false;
                                        while (!salirDeLosMenus) {

                                            System.out.println("***********************************************************************");
                                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                            System.out.println("***********************************************************************");
                                            System.out.println("*-- ¿cual desea modificar?, Ingrese el numero");


                                            numeroDeProductoParaActualizar = 0;
                                            indiceDeProducto = 0;

                                            for (String bebidas: bebidasLista){
                                                indiceDeProducto++;
                                                System.out.println("* "+ indiceDeProducto + ". " + bebidas);
                                            }
                                            System.out.println();

                                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();
                                            verificaSiEsNumero = false;



                                            while (!verificaSiEsNumero) {

                                                try {
                                                    numeroDeProductoParaActualizar = Integer.parseInt(opcionesExistentesEnMenu);
                                                    verificaSiEsNumero = true;
                                                }catch (NumberFormatException e){
                                                    verificaSiEsNumero = false;

                                                    System.out.println("***********************************************************************");
                                                    System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                                    System.out.println("***********************************************************************");
                                                    System.out.println("*-- INGRESE EL NUMERO DE SU PRODUCTO PARA ACTUALIZAR");
                                                    System.out.println();

                                                    indiceDeProducto = 0;
                                                    for (String bebidas: bebidasLista){
                                                        indiceDeProducto++;
                                                        System.out.println("* "+ indiceDeProducto + ". " + bebidas);
                                                    }

                                                    System.out.println();

                                                    System.out.print("*-- ");
                                                    opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();
                                                }

                                            }





                                            System.out.println();
                                            System.out.println("*-- Ingrese la nueva bebida: ");

                                            entradaDeOpciones.nextLine();
                                            nuevoValorProductoActualizado = entradaDeOpciones.nextLine().toUpperCase();


                                            bebidasLista.set((numeroDeProductoParaActualizar -1), nuevoValorProductoActualizado);


                                            System.out.println("***********************************************************************");
                                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                            System.out.println("***********************************************************************");
                                            System.out.println("*-- Para salir escribe: Salir");
                                            System.out.println("*-- Para Actualizar otro escribe: no");
                                            System.out.print("*-- ");
                                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();


                                            if (opcionesExistentesEnMenu.equals("SALIR")) {
                                                salirDeLosMenus = true;
                                            }else {
                                                salirDeLosMenus = false;
                                            }

                                        }

                                        break actualizar;

                                    case "4":

                                        salirDeLosMenus = false;
                                        while (!salirDeLosMenus) {

                                            System.out.println("***********************************************************************");
                                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                            System.out.println("***********************************************************************");
                                            System.out.println("*-- ¿cual desea modificar?, Ingrese el numero");


                                            numeroDeProductoParaActualizar = 0;
                                            indiceDeProducto = 0;

                                            for (String sopas: sopasLista){
                                                indiceDeProducto++;
                                                System.out.println("* "+ indiceDeProducto + ". " + sopas);
                                            }
                                            System.out.println();

                                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();
                                            verificaSiEsNumero = false;



                                            while (!verificaSiEsNumero) {

                                                try {
                                                    numeroDeProductoParaActualizar = Integer.parseInt(opcionesExistentesEnMenu);
                                                    verificaSiEsNumero = true;
                                                }catch (NumberFormatException e){
                                                    verificaSiEsNumero = false;

                                                    System.out.println("***********************************************************************");
                                                    System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                                    System.out.println("***********************************************************************");
                                                    System.out.println("*-- INGRESE EL NUMERO DE SU PRODUCTO PARA ACTUALIZAR");
                                                    System.out.println();

                                                    indiceDeProducto = 0;
                                                    for (String sopas: sopasLista){
                                                        indiceDeProducto++;
                                                        System.out.println("* "+ indiceDeProducto + ". " + sopas);
                                                    }

                                                    System.out.println();

                                                    System.out.print("*-- ");
                                                    opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();
                                                }

                                            }





                                            System.out.println();
                                            System.out.println("*-- Ingrese la nueva sopa: ");

                                            entradaDeOpciones.nextLine();
                                            nuevoValorProductoActualizado = entradaDeOpciones.nextLine().toUpperCase();


                                            sopasLista.set((numeroDeProductoParaActualizar -1), nuevoValorProductoActualizado);


                                            System.out.println("***********************************************************************");
                                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                            System.out.println("***********************************************************************");
                                            System.out.println("*-- Para salir escribe: Salir");
                                            System.out.println("*-- Para Actualizar otro escribe: no");
                                            System.out.print("*-- ");
                                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();


                                            if (opcionesExistentesEnMenu.equals("SALIR")) {
                                                salirDeLosMenus = true;
                                            }else {
                                                salirDeLosMenus = false;
                                            }

                                        }

                                        break actualizar;

                                }




                        }

                        if (opcionesExistentesEnMenu.equals("REGRESAR")) {
                            opcionesExistentesEnMenu = "NO";
                        }else {
                            opcionesExistentesEnMenu = "SI";
                        }

                        break casos;

                    case "4":
                        // ESTA PARTE ME PERMITE ELIMINAR EL INDICE QUE QUIERA
                        salirDeLosMenus = false;
                        while (!salirDeLosMenus) {
                            System.out.println("***********************************************************************");
                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                            System.out.println("***********************************************************************");
                            System.out.println("*               puedes hacer lo siguiente                             *" +
                                             "\n*                1. Eliminar risitos                                  *" +
                                             "\n*                2. Eliminar jugos                                    *" +
                                             "\n*                3. Eliminar bebidas gaseosas                         *" +
                                             "\n*                4. Eliminar Sopas                                    *" +
                                             "\n*                5. Para para regresar escriba: REGRESAR              *" +
                                             "\n*                --INGRESE UNA DE LAS OPCIONES--                      *" +
                                             "\n***********************************************************************");
                            System.out.println();
                            System.out.print("*-- ");
                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();

                            eliminar:
                                switch (opcionesExistentesEnMenu){
                                    case "1":

                                        salirDeLosMenus = false;
                                        while (!salirDeLosMenus){

                                            System.out.println("***********************************************************************");
                                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                            System.out.println("***********************************************************************");
                                            System.out.println("*               INGRESA EL NUMERO DEL RISITO A ELIMINAR               *");
                                            System.out.println();


                                            numeroDeProductoParaActualizar = 0;
                                            indiceDeProducto = 0;
                                            verificaSiEsNumero = false;

                                            for (String risito: risitoLista){
                                                indiceDeProducto++;
                                                System.out.println(indiceDeProducto + ". " + risito);
                                            }

                                            System.out.print("*-- ");
                                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();


                                            while (!verificaSiEsNumero){

                                                try {
                                                    numeroDeProductoParaActualizar = Integer.parseInt(opcionesExistentesEnMenu);
                                                    verificaSiEsNumero = true;
                                                }catch (NumberFormatException e){

                                                    System.out.println("***********************************************************************");
                                                    System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                                    System.out.println("***********************************************************************");
                                                    System.out.println("*-- INGRESE EL NUMERO DE SU PRODUCTO PARA ELIMINAR");
                                                    System.out.println();


                                                    indiceDeProducto = 0;
                                                    for (String risito: risitoLista){
                                                        indiceDeProducto++;
                                                        System.out.println(indiceDeProducto + ". " + risito);
                                                    }

                                                    System.out.println();

                                                    System.out.print("*-- ");
                                                    opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();

                                                    verificaSiEsNumero = false;
                                                }
                                            }


                                            risitoLista.remove((numeroDeProductoParaActualizar - 1));


                                            System.out.println("***********************************************************************");
                                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                            System.out.println("***********************************************************************");
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("*--------------------EL PRODUCTO FUE ELIMINADO CON EXITO--------------*");
                                            System.out.println("*-- Su nueva lista es: ");
                                            System.out.println();
                                            System.out.println();


                                            indiceDeProducto = 0;
                                            for (String risitos: risitoLista){
                                                indiceDeProducto++;
                                                System.out.println(indiceDeProducto +  ". " + risitos);
                                            }
                                            System.out.println();
                                            System.out.println();


                                            System.out.println("***********************************************************************");
                                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                            System.out.println("***********************************************************************");
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("*-- Para salir del programa escribe: Regresar                          *");
                                            System.out.println();
                                            System.out.print("*-- ");
                                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();



                                            if (opcionesExistentesEnMenu.equals("REGRESAR")){
                                                salirDeLosMenus = true;
                                            }else {
                                                salirDeLosMenus = false;
                                            }
                                        }

                                        break eliminar;

                                    case "2":

                                        salirDeLosMenus = false;
                                        while (!salirDeLosMenus){

                                            System.out.println("***********************************************************************");
                                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                            System.out.println("***********************************************************************");
                                            System.out.println("*               INGRESA EL NUMERO DEL RISITO A ELIMINAR               *");
                                            System.out.println();


                                            numeroDeProductoParaActualizar = 0;
                                            indiceDeProducto = 0;
                                            verificaSiEsNumero = false;

                                            for (String jugos: jugosLista){
                                                indiceDeProducto++;
                                                System.out.println(indiceDeProducto + ". " + jugos);
                                            }

                                            System.out.print("*-- ");
                                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();


                                            while (!verificaSiEsNumero){

                                                try {
                                                    numeroDeProductoParaActualizar = Integer.parseInt(opcionesExistentesEnMenu);
                                                    verificaSiEsNumero = true;
                                                }catch (NumberFormatException e){

                                                    System.out.println("***********************************************************************");
                                                    System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                                    System.out.println("***********************************************************************");
                                                    System.out.println("*-- INGRESE EL NUMERO DE SU PRODUCTO PARA ELIMINAR");
                                                    System.out.println();


                                                    indiceDeProducto = 0;
                                                    for (String jugos: jugosLista){
                                                        indiceDeProducto++;
                                                        System.out.println(indiceDeProducto + ". " + jugos);
                                                    }

                                                    System.out.println();

                                                    System.out.print("*-- ");
                                                    opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();

                                                    verificaSiEsNumero = false;
                                                }
                                            }


                                            jugosLista.remove((numeroDeProductoParaActualizar - 1));


                                            System.out.println("***********************************************************************");
                                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                            System.out.println("***********************************************************************");
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("*--------------------EL PRODUCTO FUE ELIMINADO CON EXITO--------------*");
                                            System.out.println("*-- Su nueva lista es: ");
                                            System.out.println();
                                            System.out.println();


                                            indiceDeProducto = 0;
                                            for (String jugos: jugosLista){
                                                indiceDeProducto++;
                                                System.out.println(indiceDeProducto +  ". " + jugos);
                                            }


                                            System.out.println("***********************************************************************");
                                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                            System.out.println("***********************************************************************");
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("*-- Para salir del programa escribe: Regresar                          *");
                                            System.out.println();
                                            System.out.print("*-- ");
                                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();


                                            if (opcionesExistentesEnMenu.equals("REGRESAR")){
                                                salirDeLosMenus = true;
                                            }else {
                                                salirDeLosMenus = false;
                                            }
                                        }

                                        break eliminar;

                                    case "3":

                                        salirDeLosMenus = false;
                                        while (!salirDeLosMenus){

                                            System.out.println("***********************************************************************");
                                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                            System.out.println("***********************************************************************");
                                            System.out.println("*               INGRESA EL NUMERO DEL RISITO A ELIMINAR               *");
                                            System.out.println();


                                            numeroDeProductoParaActualizar = 0;
                                            indiceDeProducto = 0;
                                            verificaSiEsNumero = false;

                                            for (String bebidas: bebidasLista){
                                                indiceDeProducto++;
                                                System.out.println(indiceDeProducto + ". " + bebidas);
                                            }

                                            System.out.print("*-- ");
                                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();


                                            while (!verificaSiEsNumero){

                                                try {
                                                    numeroDeProductoParaActualizar = Integer.parseInt(opcionesExistentesEnMenu);
                                                    verificaSiEsNumero = true;
                                                }catch (NumberFormatException e){

                                                    System.out.println("***********************************************************************");
                                                    System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                                    System.out.println("***********************************************************************");
                                                    System.out.println("*-- INGRESE EL NUMERO DE SU PRODUCTO PARA ELIMINAR");
                                                    System.out.println();


                                                    indiceDeProducto = 0;
                                                    for (String bebidas: bebidasLista){
                                                        indiceDeProducto++;
                                                        System.out.println(indiceDeProducto + ". " + bebidas);
                                                    }

                                                    System.out.println();

                                                    System.out.print("*-- ");
                                                    opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();

                                                    verificaSiEsNumero = false;
                                                }
                                            }


                                            bebidasLista.remove((numeroDeProductoParaActualizar - 1));


                                            System.out.println("***********************************************************************");
                                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                            System.out.println("***********************************************************************");
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("*--------------------EL PRODUCTO FUE ELIMINADO CON EXITO--------------*");
                                            System.out.println("*-- Su nueva lista es: ");
                                            System.out.println();
                                            System.out.println();


                                            indiceDeProducto = 0;
                                            for (String bebidas:  bebidasLista){
                                                indiceDeProducto++;
                                                System.out.println(indiceDeProducto +  ". " + bebidas);
                                            }




                                            System.out.println("***********************************************************************");
                                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                            System.out.println("***********************************************************************");
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("*-- Para salir del programa escribe: Regresar                          *");
                                            System.out.println();
                                            System.out.print("*-- ");
                                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();


                                            if (opcionesExistentesEnMenu.equals("REGRESAR")){
                                                salirDeLosMenus = true;
                                            }else {
                                                salirDeLosMenus = false;
                                            }
                                        }

                                        break eliminar;

                                    case "4":

                                        salirDeLosMenus = false;
                                        while (!salirDeLosMenus){

                                            System.out.println("***********************************************************************");
                                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                            System.out.println("***********************************************************************");
                                            System.out.println("*               INGRESA EL NUMERO DEL RISITO A ELIMINAR               *");
                                            System.out.println();


                                            numeroDeProductoParaActualizar = 0;
                                            indiceDeProducto = 0;
                                            verificaSiEsNumero = false;

                                            for (String sopas: sopasLista){
                                                indiceDeProducto++;
                                                System.out.println(indiceDeProducto + ". " + sopas);
                                            }

                                            System.out.print("*-- ");
                                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();


                                            while (!verificaSiEsNumero){

                                                try {
                                                    numeroDeProductoParaActualizar = Integer.parseInt(opcionesExistentesEnMenu);
                                                    verificaSiEsNumero = true;
                                                }catch (NumberFormatException e){

                                                    System.out.println("***********************************************************************");
                                                    System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                                    System.out.println("***********************************************************************");
                                                    System.out.println("*-- INGRESE EL NUMERO DE SU PRODUCTO PARA ELIMINAR");
                                                    System.out.println();


                                                    indiceDeProducto = 0;
                                                    for (String sopas: sopasLista){
                                                        indiceDeProducto++;
                                                        System.out.println(indiceDeProducto + ". " + sopas);
                                                    }

                                                    System.out.println();

                                                    System.out.print("*-- ");
                                                    opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();

                                                    verificaSiEsNumero = false;
                                                }
                                            }


                                            sopasLista.remove((numeroDeProductoParaActualizar - 1));


                                            System.out.println("***********************************************************************");
                                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                            System.out.println("***********************************************************************");
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("*--------------------EL PRODUCTO FUE ELIMINADO CON EXITO--------------*");
                                            System.out.println("*-- Su nueva lista es: ");
                                            System.out.println();
                                            System.out.println();


                                            indiceDeProducto = 0;
                                            for (String sopas: sopasLista){
                                                indiceDeProducto++;
                                                System.out.println(indiceDeProducto +  ". " + sopas);
                                            }




                                            System.out.println("***********************************************************************");
                                            System.out.println("*               bienvenido a ¡INVENTARIOS GABO!                       *");
                                            System.out.println("***********************************************************************");
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("*-- Para salir del programa escribe: Regresar                          *");
                                            System.out.println();
                                            System.out.print("*-- ");
                                            opcionesExistentesEnMenu = entradaDeOpciones.next().toUpperCase();


                                            if (opcionesExistentesEnMenu.equals("REGRESAR")){
                                                salirDeLosMenus = true;
                                            }else {
                                                salirDeLosMenus = false;
                                            }
                                        }

                                        break eliminar;
                                }


                        }

                        if (opcionesExistentesEnMenu.equals("REGRESAR")) {
                            salirDeLosMenus = true;

                        }else{
                            salirDeLosMenus = false;
                        }

                        break casos;
                }

            }

            if (opcionesExistentesEnMenu.equals("SALIR")) {
                salirDeLosMenus = true;
            }else {
                salirDeLosMenus = false;
            }





        }while (!salirDeLosMenus);


    }
}