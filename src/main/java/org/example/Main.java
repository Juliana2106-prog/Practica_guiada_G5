package org.example;

import org.example.Ayudas.Licor;
import org.example.modelos.Cliente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Licor licorUno = new Licor();
        Licor licorDos = new Licor("Aguardiente antioqueño tapa verde","aguardiente","FLA", LocalDate.of(2028,10,31),29.0);

        Cliente clienteUno = new Cliente();
        Cliente clienteDos = new Cliente("JULIANA","1001237552",25,"carrera 66 #16B05 interior 201","julianaospina2106@gmail.com");


        //accediendo a los atributos
        System.out.println(licorUno.getNombre());
        System.out.println(licorDos.getNombre());




    }
}