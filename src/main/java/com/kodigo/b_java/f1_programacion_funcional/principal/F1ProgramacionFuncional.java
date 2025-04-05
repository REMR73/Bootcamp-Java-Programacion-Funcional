package com.kodigo.b_java.f1_programacion_funcional.principal;

import com.kodigo.b_java.f1_programacion_funcional.models.F1Response;
import com.kodigo.b_java.f1_programacion_funcional.models.FP1Result;
import com.kodigo.b_java.f1_programacion_funcional.services.F1ApiClient;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class F1ProgramacionFuncional {
    private static List<FP1Result> results;
    public void main() {
        try {
            // Crear una instancia del cliente de API
            F1ApiClient apiClient = new F1ApiClient();

            System.out.println("====== CONSUMIENDO API F1 ======");
            System.out.println("Obteniendo datos de la sesión FP1 de Bahréin 2024...");

            // Metodo asincrónico
            System.out.println("\n=== MÉTODO ASINCRÓNICO ===");
            // TODO la Api F1, solo contiene resultados del 2024, asi que no es posible obtener de anios anteriores
            CompletableFuture<F1Response> futureResponse =
                    apiClient.getFP1ResultsAsync(2024, 1);

            futureResponse.thenAccept(response -> {
                results = response.getRaces().getFp1Results();
                printResults(response);
                mostrarMenu();
            }).join();

            // Ejecutar los ejercicios de programación funcional
//            System.out.println("\n\n");
//            F1FunctionalExercises.main();

        } catch (Exception e) {
            System.err.println("Error al ejecutar la demo: " + e.getMessage());
            e.printStackTrace();
        }
    }


    private static void printResults(F1Response response) {
        System.out.println("Carrera: " + response.getRaces().getRaceName());
        System.out.println("Circuito: " + response.getRaces().getCircuit().getCircuitName() +
                ", " + response.getRaces().getCircuit().getCity() +
                ", " + response.getRaces().getCircuit().getCountry());
        System.out.println("Fecha FP1: " + response.getRaces().getFp1Date() +
                " a las " + response.getRaces().getFp1Time());

        System.out.println("\nResultados FP1:");
        response.getRaces().getFp1Results().forEach(result -> {
            System.out.println(result.getDriver().getName() + " " +
                    result.getDriver().getSurname() + " (" +
                    result.getDriver().getShortName() + ") - " +
                    result.getTeam().getTeamName() + " - " +
                    "Tiempo: " + result.getTime());
        });
    }

    private static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE EJERCICIOS STREAM ---");
            System.out.println("1. Mostrar solo nombres de pilotos");
            System.out.println("2. Mostrar nombres únicos de equipos");
            System.out.println("3. Mostrar pilotos ordenados por tiempo");
            System.out.println("4. Mostrar tiempo promedio de todos los pilotos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> mostrarNombresPilotos();
                case 2 -> mostrarEquiposUnicos();
                case 3 -> mostrarPilotosOrdenadosPorTiempo();
                case 4 -> mostrarTiempoPromedio();
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

    private static void mostrarNombresPilotos() {
        System.out.println("\n--- Nombres de Pilotos ---");

    }

    private static void mostrarEquiposUnicos() {
        System.out.println("\n--- Equipos Únicos ---");

    }

    private static void mostrarPilotosOrdenadosPorTiempo() {
        System.out.println("\n--- Pilotos Ordenados por Tiempo ---");

    }

    private static void mostrarTiempoPromedio() {
        System.out.println("\n--- Tiempo Promedio ---");
        double promedio = 0.0f;

        System.out.printf("Tiempo promedio de vuelta: %.3f segundos\n", promedio);
    }

}
