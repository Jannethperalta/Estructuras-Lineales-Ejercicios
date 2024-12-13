package Materia.Stacks;

import java.util.EmptyStackException;

import Materia.Models.Node;

public class Stack {

    private Node top; // Nodo en la cima de la pila
    private int size; // Número de elementos en la pila

    /**
     * Constructor de la clase Stack.
     * Inicializa una pila vacía con la cima como null y tamaño 0.
     */
    public Stack() {
        this.top = null;
        this.size = 0;
    }

    /**
     * Método push:
     * Añade un nuevo elemento a la cima de la pila.
     *
     * @param value El valor del elemento que se desea añadir.
     *
     *              <p>
     *              <b>Complejidad:</b> O(1).
     *              </p>
     *              <ul>
     *              <li>Crea un nuevo nodo con el valor proporcionado.</li>
     *              <li>Enlaza el nuevo nodo al nodo actualmente en la cima.</li>
     *              <li>Actualiza la referencia `top` para que apunte al nuevo
     *              nodo.</li>
     *              <li>Incrementa el contador `size`.</li>
     *              </ul>
     */
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    /**
     * Método pop:
     * Retira y retorna el elemento en la cima de la pila.
     *
     * @return El valor del elemento retirado.
     * @throws EmptyStackException Si la pila está vacía.
     *
     *                             <p>
     *                             <b>Complejidad:</b> O(1).
     *                             </p>
     *                             <ul>
     *                             <li>Verifica si la pila está vacía; si es así,
     *                             lanza una excepción.</li>
     *                             <li>Recupera el valor del nodo en la cima.</li>
     *                             <li>Actualiza la referencia `top` al siguiente
     *                             nodo.</li>
     *                             <li>Decrementa el contador `size`.</li>
     *                             </ul>
     */
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    /**
     * Método peek:
     * Retorna el valor del elemento en la cima de la pila sin retirarlo.
     *
     * @return El valor del elemento en la cima de la pila.
     * @throws EmptyStackException Si la pila está vacía.
     *
     *                             <p>
     *                             <b>Complejidad:</b> O(1).
     *                             </p>
     *                             <ul>
     *                             <li>Verifica si la pila está vacía; si es así,
     *                             lanza una excepción.</li>
     *                             <li>Retorna el valor almacenado en el nodo en la
     *                             cima.</li>
     *                             </ul>
     */
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    /**
     * Método isEmpty:
     * Verifica si la pila está vacía.
     *
     * @return <code>true</code> si la pila no contiene elementos, de lo contrario
     *         <code>false</code>.
     */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Método size:
     * Retorna el número de elementos en la pila.
     *
     * @return El tamaño actual de la pila.
     *
     *         <p>
     *         <b>Complejidad:</b> O(1).
     *         </p>
     *         <ul>
     *         <li>Retorna el valor del contador `size`.</li>
     *         </ul>
     */
    public int size() {
        return size;
    }
}
