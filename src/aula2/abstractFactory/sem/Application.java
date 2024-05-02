package aula2.abstractFactory.sem;

interface Button {
    void paint();
}

class WindowsButton implements Button {
    public void paint() {
        System.out.println("Render a button in a Windows style.");
    }
}

class MacOSButton implements Button {
    public void paint() {
        System.out.println("Render a button in a macOS style.");
    }
}

interface Checkbox {
    void paint();
}

class WindowsCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Render a checkbox in a Windows style.");
    }
}

class MacOSCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Render a checkbox in a macOS style.");
    }
}

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(String osType) {
        if (osType.equalsIgnoreCase("Windows")) {
            button = new WindowsButton();
            checkbox = new WindowsCheckbox();
        } else if (osType.equalsIgnoreCase("macOS")) {
            button = new MacOSButton();
            checkbox = new MacOSCheckbox();
        } else {
            throw new IllegalArgumentException("Unsupported OS type: " + osType);
        }
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {
        Application app = new Application("Windows");
        app.paint();
        // Você pode mudar para "macOS" e testar a outra configuração também.
    }
}

