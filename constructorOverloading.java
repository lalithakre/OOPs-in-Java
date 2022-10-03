public class constructorOverloading {
    String name;

    constructorOverloading() {
        System.out.println("Constructor method called.");
    }

    constructorOverloading(String t) {
        name = t;
    }

    public static void main(String[] args) {
        constructorOverloading cpp = new constructorOverloading();
        constructorOverloading java = new constructorOverloading("Java");
        cpp.setName("C++");
        java.getName();
        cpp.getName();
    }

    void setName(String t) {
        name = t;
    }

    void getName() {
        System.out.println("Language name: " + name);
    }

}
