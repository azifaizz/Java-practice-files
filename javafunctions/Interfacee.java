package javafunctions;
@FunctionalInterface
interface Interfacee {
	void sound();
	default void sleep() {
        System.out.println("Sleeping");
    }
    static void info() {
        System.out.println("This is a static method in interface");
    }
}
