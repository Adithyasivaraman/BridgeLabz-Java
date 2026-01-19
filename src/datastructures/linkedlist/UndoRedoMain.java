class TextState {
    String content;
    TextState prev, next;

    TextState(String content) {
        this.content = content;
    }
}

class UndoRedoManager {
    private TextState current;
    private int size = 0;
    private final int MAX = 10;

    public void addState(String text) {
        TextState newState = new TextState(text);
        if (current != null) {
            current.next = newState;
            newState.prev = current;
        }
        current = newState;
        size++;
        if (size > MAX) {
            // remove oldest
            while (current.prev.prev != null)
                current.prev = current.prev.prev;
        }
    }

    public void undo() {
        if (current != null && current.prev != null)
            current = current.prev;
    }

    public void redo() {
        if (current != null && current.next != null)
            current = current.next;
    }

    public void display() {
        if (current != null)
            System.out.println("Current Text: " + current.content);
    }
}

public class UndoRedoMain {
    public static void main(String[] args) {
        UndoRedoManager editor = new UndoRedoManager();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");

        editor.display();
        editor.undo();
        editor.display();
        editor.redo();
        editor.display();
    }
}
