public class UndoRedoTextEditor {
    static class State {
        String text;
        State prev, next;

        State(String text) {
            this.text = text;
        }
    }

    static State current = null;
    static int maxSize = 10;
    static int size = 0;

    public static void addState(String text) {
        State newState = new State(text);
        if (current != null) {
            newState.prev = current;
            current.next = newState;
        }
        current = newState;
        size++;
        if (size > maxSize) {
            State temp = current;
            while (temp.prev != null && size > maxSize) {
                temp = temp.prev;
                size--;
                temp.prev = null;
            }
        }
    }

    public static void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    public static void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    public static void showCurrentState() {
        if (current != null)
            System.out.println("Current State: " + current.text);
        else
            System.out.println("No state.");
    }

    public static void main(String[] args) {
        addState("Hello");
        addState("Hello World");
        addState("Hello World!");
        showCurrentState();
        undo();
        showCurrentState();
        redo();
        showCurrentState();
    }
}