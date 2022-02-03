public class Main {
    public static void main(String[] args) {
        //данные
        int amount = 43;
        int replenishmentAmount = 1550;
        //процесс
        int total = amount + replenishmentAmount;
        int bonus;
        if (replenishmentAmount > 1000) {
            bonus = 1;
            int totalWithBonus = replenishmentAmount / 100 + amount + replenishmentAmount;
            System.out.println("На Вашем счете:" + totalWithBonus);
        } else {
            System.out.println("На Вашем счете:" + total);
        }
    }
}

