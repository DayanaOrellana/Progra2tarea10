package edu.umg;
import java.sql.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

                String url = "jdbc:mysql://localhost:3306/tu_base_de_datos";
                String usuario = "tu_usuario";
                String contraseña = "tu_contraseña";

                try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {
                    Scanner scanner = new Scanner(System.in);

                    while (true) {
                        System.out.println("Menú:");
                        System.out.println("1. Consultar información");
                        System.out.println("2. Agregar nueva persona");
                        System.out.println("3. Actualizar información");
                        System.out.println("4. Eliminar persona");
                        System.out.println("5. Salir");
                        System.out.print("Seleccione una opción: ");
                        int opcion = scanner.nextInt();
                        scanner.nextLine();  // Consumir la nueva línea después de nextInt()

                        switch (opcion) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            case 4:

                                break;
                            case 5:
                                System.out.println("Saliendo del programa.");
                                return;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


