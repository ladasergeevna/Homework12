//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author gogol = new Author("Николай", "Гоголь");
        Author coelho = new Author("Пауло", "Коэльо");
        Book deadSouls = new Book("Мертвые души", gogol, 1842);
        Book alchemist = new Book("Алхимик", coelho, 1988);
        System.out.println("Название книги:" + deadSouls.getTitle() + ", Автор:" + deadSouls.getAuthor().getFirstName() + " " + deadSouls.getAuthor().getLastName() + ", Год издания:" + deadSouls.getYearPublication());
        System.out.println("Название книги:" + alchemist.getTitle() + ", Автор:" + alchemist.getAuthor().getFirstName() + " " + alchemist.getAuthor().getLastName() + ", Год издания:" + alchemist.getYearPublication());
        deadSouls.setYearPublication(1843);
        System.out.println("Название книги:" + deadSouls.getTitle() + ", Автор:" +
                "" + deadSouls.getAuthor().getFirstName() + " " + deadSouls.getAuthor().getLastName() + ", Год издания:" + deadSouls.getYearPublication());
    }
}