public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog " + dog);
        System.out.println("cat " + cat);
        System.out.println("paper " + paper);

        System.out.println("Задача №2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog " + dog);
        System.out.println("cat " + cat);
        System.out.println("paper " + paper);

        System.out.println("Задача №3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog " + dog);
        System.out.println("cat " + cat);
        System.out.println("paper " + paper);

        System.out.println("Зфдача №4");
        var friend = 19;
        System.out.println("friend " + friend);
        friend = friend + 2;
        System.out.println("friend " + friend);
        friend = friend / 17;
        System.out.println("friend " + friend);

        System.out.println("Задача №5");
        var frog = 3.5;
        System.out.println("frog " + frog);
        frog = frog * 10;
        System.out.println("frog " + frog);
        frog = frog / 3.5;
        System.out.println("frog " + frog);
        frog = frog + 4;
        System.out.println("frog " + frog);

        System.out.println("Задача №6");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общая масса боксёров " + totalWeight + "кг");
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе между боксёрами " + weightDifference + "кг");

        System.out.println("Задача №7");
        var a = 78.2;
        var b = 82.7;
        var c = b % a;
        System.out.println(c);

        System.out.println("Задача №8");
        var allHours = 640;
        var worker1 = 8;
        var allWorker = allHours / worker1;
        System.out.println("Всего работников в компании - " + allWorker + " человек");
        allWorker = allWorker + 94;
        allHours = allWorker * worker1;
        System.out.println("Если в компании работает - " + allWorker + " человек, то всего " + allHours + " часов работы может быть поделено между сотрудниками");

    }
}