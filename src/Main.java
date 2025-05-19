//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int eaters = 5; // сколько людей будут есть

        int water = 3000; // миллилитров воды
        int patatoes = 5; // картофелин
        int chicken = 6; // куриных бедер
        int spices = 10; // ложек специй

        System.out.println("Сварил суп. На одгого человека вышло:");
        System.out.println((water / eaters) + " миллилитров(а) воды");
        System.out.println((patatoes / eaters) + " картофелин(ф/ы)");
        System.out.println((chicken / eaters) + " куринных(ое) бёдер(ро)");
        System.out.println((spices / eaters) + "ложек(ки/ка) специй");
    }
}