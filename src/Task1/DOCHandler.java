package Task1;

public class DOCHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Open DOC");
    }

    @Override
    void change() {
        System.out.println("Chenge DOC");
    }

    @Override
    void create() {
        System.out.println("Create DOC");
    }

    @Override
    void save() {
        System.out.println("Save DOC");
    }
}
