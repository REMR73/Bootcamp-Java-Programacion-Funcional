package com.kodigo.b_java.f1_programacion_funcional.principal;

import com.kodigo.b_java.f1_programacion_funcional.models.Driver;
import com.kodigo.b_java.f1_programacion_funcional.models.F1Response;
import com.kodigo.b_java.f1_programacion_funcional.models.FP1Result;
import com.kodigo.b_java.f1_programacion_funcional.models.Team;
import com.kodigo.b_java.f1_programacion_funcional.services.F1ApiClient;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class F1FunctionalExercises {

    public static void main() {
        try {
            F1ApiClient apiClient = new F1ApiClient();
            // Acceder correctamente a la clase anidada estática
            F1Response data = apiClient.getFP1Results(2024, 1);

            // Ejecutar ejercicios de programación funcional con los datos obtenidos
            executeExercises(data);

        } catch (Exception e) {
            System.err.println("Error al ejecutar los ejercicios: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void executeExercises(F1Response data) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("====== EJERCICIOS DE PROGRAMACIÓN FUNCIONAL CON DATOS F1 ======\n");

        List<FP1Result> results = data.getRaces().getFp1Results();

        while (continuar) {
            System.out.println("\n--- Menú de Ejercicios ---");
            System.out.println("1. Pilotos por nacionalidad");
            System.out.println("2. Nombres de pilotos");
            System.out.println("3. Piloto más rápido");
            System.out.println("4. Piloto más joven");
            System.out.println("5. Pilotos agrupados");
            System.out.println("6. Composición de funciones");
            System.out.println("7. Opcionales para nulos");
            System.out.println("8. Predicados como funciones");
            System.out.println("9. Concurrencias");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1:
                    pilotosPorNacionalidad(results);
                    break;
                case 2:
                    nombresDePilotos(results);
                    break;
                case 3:
                    pilotoMasRapido(results);
                    break;
                case 4:
                    pilotoMasJoven(results);
                    break;
                case 5:
                    pilotosAgrupados(results);
                    break;
                case 6:
                    composicionDeFunciones(results);
                    break;
                case 7:
                    opcionalesParaNulos(results);
                    break;
                case 8:
                    predicacosComoFunciones(results);
                    break;
                case 9:
                    concurrencias(results);
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, por favor intente de nuevo.");
            }
        }

        scanner.close();
    }


    private static void pilotosPorNacionalidad(List<FP1Result> results) {
        // EJERCICIO 1: Filtrar pilotos por nacionalidad usando filter()
        System.out.println("EJERCICIO 1: Filtrar pilotos por nacionalidad (ejemplo: Gran Bretaña)");

        // TODO: Implementa aquí el uso de stream().filter() para filtrar por nacionalidad
        // Puedes usar result.getDriver().getNationality()

        // Ejemplo de cómo podrías imprimir el nombre:
        // System.out.println(result.getDriver().getName() + " " + result.getDriver().getSurname());

        System.out.println(); // Línea en blanco para separar la salida
    }

    private static void nombresDePilotos(List<FP1Result> results) {
        // EJERCICIO 2: Transformar datos con map() para obtener nombres completos de pilotos
        System.out.println("EJERCICIO 2: Obtener lista de nombres completos de pilotos usando map()");

        // TODO: Usa map() para transformar cada resultado en el nombre completo del piloto
        // Usa result.getDriver().getName() y result.getDriver().getSurname()

        // Luego imprime cada nombre usando forEach()

        System.out.println();
    }

    private static void pilotoMasRapido(List<FP1Result> results) {
        // EJERCICIO 3: Usar sorted() para ordenar resultados por tiempo
        System.out.println("EJERCICIO 3: Ordenar pilotos por tiempo de vuelta usando sorted()");

        // TODO: Usa sorted() con Comparator.comparing() para ordenar por tiempo
        // Puedes acceder al tiempo con result.getTime()

        // Luego imprime el shortName del piloto y su tiempo

        System.out.println();
    }


    private static void pilotoMasJoven(List<FP1Result> results) {
        // EJERCICIO 4: Encontrar el piloto más joven usando funciones de orden superior
        System.out.println("EJERCICIO 4: Encontrar el piloto más joven usando funciones de orden superior");

        // Puede que se presenten problemas para convertir las fechas, así que se te deja una función
        // para que no batalles en eso :)
        Function<Driver, LocalDate> getBirthday = driver ->
                parseFecha(driver.getBirthday());

        // TODO: Usa map() para obtener los pilotos desde los resultados
        // Luego utiliza reduce() o min() con un comparador basado en la fecha de nacimiento

        // Finalmente, imprime el nombre del piloto más joven encontrado

        System.out.println();
    }


    private static void pilotosAgrupados(List<FP1Result> results) {
        // EJERCICIO 5: Agrupar usando collectors avanzados
        System.out.println("EJERCICIO 5: Agrupar pilotos por nacionalidad usando groupingBy()");

        // TODO: Usa Collectors.groupingBy para agrupar los resultados por nacionalidad del piloto
        // Puedes acceder a la nacionalidad con result.getDriver().getNationality()

        // Luego recorre el mapa resultante para imprimir los nombres agrupados

        System.out.println();
    }

    private static void composicionDeFunciones(List<FP1Result> results) {
        // EJERCICIO 6: Composición de funciones para transformar datos
        System.out.println("EJERCICIO 6: Composición de funciones para transformar datos");

        // TODO: Define funciones que extraigan el nombre del piloto y el nombre del equipo
        // Usa result.getDriver().getName(), result.getDriver().getSurname(), y result.getTeam().getTeamName()

        // Luego crea una función compuesta que combine ambas

        // Aplica la función compuesta usando map() y muestra los resultados con forEach()

        System.out.println();
    }

    private static void opcionalesParaNulos(List<FP1Result> results) {
        // EJERCICIO 7: Uso de Optional para manejo seguro de nulos
        System.out.println("EJERCICIO 7: Uso de Optional para manejo seguro de nulos");

        // TODO: Usa Optional.ofNullable() para manejar posibles valores nulos
        // Puedes acceder a la cantidad de campeonatos con result.getTeam().getConstructorsChampionships()
        // y al nombre del equipo con result.getTeam().getTeamName()

        // Transforma la información en una cadena y muéstrala con forEach()

        System.out.println();
    }


    private static void predicacosComoFunciones(List<FP1Result> results) {
        // EJERCICIO 8: Uso de predicados como funciones de primer orden
        System.out.println("EJERCICIO 8: Uso de predicados como funciones de primer orden");

        // TODO: Crea predicados para verificar condiciones sobre los equipos
        // Ejemplo: si el equipo ha ganado campeonatos, si es un equipo histórico (antes del 2000), etc.

        // Luego combina predicados con and(), or(), negate()...

        // Usa esos predicados con filter() sobre el stream de equipos
        // y muestra los nombres con forEach()

        System.out.println();
    }

    private static void concurrencias(List<FP1Result> results) {
        // EJERCICIO 9: Implementación de currying y aplicación parcial (simulación)
        System.out.println("EJERCICIO 9: Implementación de currying y aplicación parcial");

        // TODO: Crea una función que devuelva otra función (currying)
        // Ejemplo: Function<Integer, Function<String, String>>

        // Aplica esa función parcialmente dentro del stream
        // y muestra resultados con forEach()

        System.out.println();
    }



    private static LocalDate parseFecha(String birthday) {
        List<DateTimeFormatter> formatos = List.of(
                DateTimeFormatter.ofPattern("yyyy-MM-dd"),
                DateTimeFormatter.ofPattern("dd/MM/yyyy")
        );

        for (DateTimeFormatter formatter : formatos) {
            try {
                return LocalDate.parse(birthday, formatter);
            } catch (DateTimeParseException e) {
            }
        }

        throw new RuntimeException("Formato de fecha inválido: " + birthday);
    }
}
