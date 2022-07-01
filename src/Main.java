public class Main {
    public static void main(String[] args) {
        int anount = 9520;//сумма паполнения счета
        int bonus;//количество начисляебых бонусных рублей
        int score = 20; // у клиента на счету до зачисления суммы пополнения и бонусов

        if (anount > 1000) {
            bonus = anount / 100;
        } else {
            bonus = 0;
        }

        int finalScore = score + anount + bonus;

        System.out.println("Итоговы счет " + finalScore);
        System.out.println("Бонусы " + bonus);

    }
}
