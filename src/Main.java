public class Main {
    public static void main(String[] args) {
        String[] arrBooks = {"Название1", "Имя Отчество Фамилия1", "Название2", "Имя Отчество Фамилия2","Название3", "Имя Отчество Фамилия3"};
        for (int i = 0; i < arrBooks.length; i += 2) {
            System.out.print("\"" + arrBooks[i] + "\"" + " " + arrBooks[i + 1]);
            System.out.println();
        }

    }

}