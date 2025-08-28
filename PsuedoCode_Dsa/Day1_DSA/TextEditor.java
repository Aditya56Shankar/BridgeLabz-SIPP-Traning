import java.util.Stack;

public class TextEditor {
    private Stack<String> undoStack;

    public TextEditor() {
        undoStack = new Stack<>();
    }

    // Write text (save in stack)
    public void write(String text) {
        undoStack.push(text);
        System.out.println("Written: " + text);
    }

    // Undo last text
    public void undo() {
        if (!undoStack.isEmpty()) {
            String lastText = undoStack.pop();
            System.out.println("Undo performed: " + lastText);
        } else {
            System.out.println("Nothing to undo");
        }
    }

    // Main to test
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.write("Hello");
        editor.write("World");
        editor.undo(); // removes "World"
        editor.undo(); // removes "Hello"
        editor.undo(); // nothing left
    }
}
