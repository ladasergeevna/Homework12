//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author gogol = new Author("Николай", "Гоголь");
        Author coelho = new Author("Пауло", "Коэльо");
        Book deadSouls = new Book("Мертвые души", gogol, 1842);
        Book deadSoulsTom2 = new Book("Мертвые души", gogol, 1842);
        Book alchemist = new Book("Алхимик", coelho, 1988);
        System.out.println("Название книги:" + deadSouls.getTitle() + ", Автор:" + deadSouls.getAuthor().getFirstName() + " " + deadSouls.getAuthor().getLastName() + ", Год издания:" + deadSouls.getYearPublication());
        System.out.println("Название книги:" + alchemist.getTitle() + ", Автор:" + alchemist.getAuthor().getFirstName() + " " + alchemist.getAuthor().getLastName() + ", Год издания:" + alchemist.getYearPublication());
        alchemist.setYearPublication(1989);
        System.out.println("Название книги:" + alchemist.getTitle() + ", Автор:" + alchemist.getAuthor().getFirstName() + " " + alchemist.getAuthor().getLastName() + ", Год издания:" + alchemist.getYearPublication());

        System.out.println();
        System.out.println("Homework_2");
        System.out.println(gogol.toString());
        System.out.println(deadSouls.toString());
        System.out.println(deadSoulsTom2.toString());
        System.out.println("Гоголь = Коэльо? " + gogol.equals(coelho));
        System.out.println("Мертвые Души = Мертвые души.Том 2? " + deadSouls.equals(deadSoulsTom2));
        System.out.println(alchemist.hashCode());

    }


}