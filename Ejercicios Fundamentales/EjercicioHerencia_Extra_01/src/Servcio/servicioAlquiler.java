/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servcio;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcoLujo;
import Entidad.BarcoMotor;
import Entidad.Velero;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Juan
 */
public class servicioAlquiler {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Alquiler a = new Alquiler();
    Barco b = new Barco();
    Velero v = new Velero();
    BarcoLujo bl = new BarcoLujo();
    BarcoMotor bm = new BarcoMotor();
    ArrayList<Barco> lista = new ArrayList<>();
    Date f_alq = new Date();
    Date f_dev = new Date();

    public void crearAlquiler() {

        System.out.println(" Ingrese Nombre del Cliente ");
        a.setNombre(leer.next());
        System.out.println("");
        System.out.println(" Ingrese el DNI del Cliente ");
        a.setDocumento(leer.nextLong());
        System.out.println(" Ingrese la fecha de Alquiler de la Embarcación ");
        System.out.print(" Dia : ");
        f_alq.setDate(leer.nextInt());
        System.out.print(" Mes : ");
        f_alq.setMonth(leer.nextInt());
        System.out.print(" Año : ");
        f_alq.setYear(leer.nextInt());
        a.setFecha_alquiler(f_alq);
        System.out.println("");
        System.out.println(" Ingrese la fecha de Devolución de la Embarcación ");
        System.out.print(" Dia : ");
        f_dev.setDate(leer.nextInt());
        System.out.print(" Mes : ");
        f_dev.setMonth(leer.nextInt());
        System.out.print(" Año : ");
        f_dev.setYear(leer.nextInt());
        a.setFecha_devolucion(f_dev);
        System.out.println("");

        long dias = calculoDias(f_alq, f_dev);

        long val_base = calculoAlquilerBase(dias);

        long precio_vel;
        long precio_barcom;
        long precio_yates;

        mostrarBarcos();
        System.out.println("");
        System.out.println(" Cual Barco desea Alquilar ");
        String matri = leer.next();

        for (Barco barco : lista) {
            if (barco.getMatricula().equalsIgnoreCase(matri) && barco.isAlquilado() == false) {
                barco.setAlquilado(true);
                if (barco instanceof Velero) {
                    precio_vel = val_base + v.getN_mastiles();
                    System.out.println(" El Cliente " + a.getNombre() + " a alquilado el Barco de Matricula "
                            + b.getMatricula() + " El Alquiler del barco tiene un precio de $ " + precio_vel);
                    continue;
                } else if (barco instanceof BarcoMotor) {
                    precio_barcom = val_base + bm.getPot_cv_motor();
                    System.out.println(" El Cliente " + a.getNombre() + " a alquilado el Barco de Matricula "
                            + b.getMatricula() + " El Alquiler del barco tiene un precio de $ " + precio_barcom);
                    continue;
                } else if (barco instanceof BarcoLujo) {
                    precio_yates = val_base + bl.getN_camarotes_yates() + bl.getPot_cv_motor();
                    System.out.println(" El Cliente " + a.getNombre() + " a alquilado el Barco de Matricula "
                            + b.getMatricula() + " El Alquiler del barco tiene un precio de $ " + precio_yates);
                    continue;
                }
            }
        }
    }

    public void crearBarco() {
        boolean flag = false;
        do {
            System.out.println(" Ingrese el Tipo de Barco a Crear");
            System.out.println(" 1. Veleros");
            System.out.println(" 2. Barco a Motor");
            System.out.println(" 3. Yates");
            System.out.println(" 4. Volver al menu anterior");

            int opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println(" Ingrese la Matricula del Barco. (ej. MHT125JU) ");
                    b.setMatricula(leer.next());
                    System.out.println(" Ingrese la Eslora del Barco ");
                    b.setEslora(leer.nextInt());
                    System.out.println(" Ingrese el Año de Fabricación del Barco ");
                    b.setAnio_fabricacion(leer.nextInt());
                    b.setAlquilado(false);
                    System.out.println(" Cuantos Mastiles tiene el Velero ");
                    v.setN_mastiles(leer.nextInt());

                    v = new Velero(v.getN_mastiles(), b.getMatricula(), b.getEslora(), b.getAnio_fabricacion(), b.isAlquilado());
                    lista.add(v);
                    break;
                case 2:
                    System.out.println(" Ingrese la Matricula del Barco. (ej. MHT125JU) ");
                    b.setMatricula(leer.next());
                    System.out.println(" Ingrese la Eslora del Barco ");
                    b.setEslora(leer.nextInt());
                    System.out.println(" Ingrese el Año de Fabricación del Barco ");
                    b.setAnio_fabricacion(leer.nextInt());
                    b.setAlquilado(false);
                    System.out.println(" Cual es la potencia del Motor ");
                    bm.setPot_cv_motor(leer.nextInt());

                    bm = new BarcoMotor(bm.getPot_cv_motor(), b.getMatricula(), b.getEslora(), b.getAnio_fabricacion(), b.isAlquilado());

                    lista.add(bm);
                    break;
                case 3:
                    System.out.println(" Ingrese la Matricula del Barco. (ej. MHT125JU) ");
                    b.setMatricula(leer.next());
                    System.out.println(" Ingrese la Eslora del Barco ");
                    b.setEslora(leer.nextInt());
                    System.out.println(" Ingrese el Año de Fabricación del Barco ");
                    b.setAnio_fabricacion(leer.nextInt());
                    b.setAlquilado(false);
                    System.out.println(" Cual es la potencia del Motor ");
                    bl.setPot_cv_motor(leer.nextInt());
                    System.out.println(" Ingrese el número de Camarotes que tiene su Yate");
                    bl.setN_camarotes_yates(leer.nextInt());

                    bl = new BarcoLujo(bl.getN_camarotes_yates(), bl.getPot_cv_motor(), b.getMatricula(), b.getEslora(), b.getAnio_fabricacion(), b.isAlquilado());
                    lista.add(bl);
                    break;
                case 4:
                    flag = true;
                    break;
                default:
                    System.out.println(" Opcion Incorrecta ingrese nuevamente");
            }

        } while (!flag == true);

    }

    public long calculoDias(Date alq, Date dev) {
        long dif_fechas;
        TimeUnit unidad = TimeUnit.DAYS;
        dif_fechas = dev.getTime() - alq.getTime();
        long dias = unidad.convert(dif_fechas, TimeUnit.MILLISECONDS);
        System.out.println(" La Cantidad de dias alquilado seran de " + dias);
        return dias;
    }

    public long calculoAlquilerBase(long dias) {

        long valor_base = dias * (10 * b.getEslora());

        return valor_base;
    }

    public void mostrarBarcos() {

        for (Barco barco : lista) {
            System.out.println(barco);
        }

    }

} // Fin Clase Servicio Clientes
