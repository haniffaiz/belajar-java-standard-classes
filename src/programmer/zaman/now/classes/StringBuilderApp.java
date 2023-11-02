package programmer.zaman.now.classes;

public class StringBuilderApp {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Hanif");
        builder.append(" ");
        builder.append("Faiz");
        builder.append(" ");
        builder.append("Hidayat");

        String name = builder.toString();

    }
}
