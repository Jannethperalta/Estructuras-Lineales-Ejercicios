
import Ejercicio_01_sign.*;
import Ejercicio_02_sorting.*;
import Materia.Stacks.StackGeneric;

public class App {
        public static void main(String[] args) throws Exception {

                runEjercicio1();
                runEjercicio2();

        }

        private static void runEjercicio1() {
                String input1 = "([]){}";
                String input2 = "({)}";

                // Validar los signos
                System.out.println("¿Es válido '([]){}'? " + SignValidator.isValid(input1)); // true
                System.out.println("¿Es válido '({)}'? " + SignValidator.isValid(input2)); // false
        }

        private static void runEjercicio2() {

                StackGeneric<Integer> stack = new StackGeneric<>();

                // Agregar elementos a la pila
                stack.push(2);
                stack.push(4);
                stack.push(1);
                stack.push(5);

                // Mostrar la pila antes de ordenar
                System.out.println("Pila antes de ordenar:");
                stack.printAllNodes();

                // Ordenar la pila
                StackSorter.sort(stack);

                // Mostrar la pila después de ordenar
                System.out.println("Pila después de ordenar:");
                stack.printAllNodes();

        }

}
