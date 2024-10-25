package com.campusdual.classroom;

import java.util.Objects;

public class Exercise03 {

    // Funcion saludo
    public static String greetings(String name) {
        return "Hola. Bienvenido " + name;
    }

    // Funcion error
    public static String error(String nombre) {
        return "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " + nombre;
    }

    //Procedimiento check
    public static void checkUser(String user, String pass) {
       if(user.equals("Sebas") && pass.equals("sebas01")){
            System.out.println(greetings(user));
        }
       else{
           System.out.println(error("Sebas"));
       }
    }


    public static void main(String[] args) {
        checkUser("Sebas","sebas01");
        checkUser("Adrian","mal");
    }
}
