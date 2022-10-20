public class Main {
    public static void main(String[] args) {
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
       cat = cat + 4;
      paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 4;
        cat = cat - 2;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("task №4");
        var friend = 19;
        System.out.println("friend="+friend);
        friend = friend + 2;
        System.out.println("friend="+friend);
        friend = friend / 7;
        System.out.println("friend="+friend);
        System.out.println("task №5");
        var frog = 3.5;
        System.out.println("frog="+frog);
        frog = frog * 10;
        System.out.println("frog="+frog);
        frog = frog/3.5;
        System.out.println("frog="+frog);
        frog = frog + 4;
        System.out.println("frog="+frog);
        var liftingCapacity = 50;
        var staffWeight = 20;
        var capacityLeft = liftingCapacity - staffWeight;
        System.out.println("Еще можно положить "+capacityLeft + " кг вещей");
        System.out.println("task №6");
        var weightBoxerOne = 78.2;
        var weightBoxerTwo = 82.7;
        var totalWeight = weightBoxerOne + weightBoxerTwo;
        var weightDifference = weightBoxerOne - weightBoxerTwo;
        System.out.println("вес первого бойца = "+weightBoxerOne);
        System.out.println("вес второго бойца = "+weightBoxerTwo);
        System.out.println("общий вес = "+totalWeight);
        System.out.println("разница веса = "+weightDifference);
        System.out.println("task №7");
        var weightDifferencetwo = weightBoxerOne - weightBoxerTwo;
        var weightDeg = weightBoxerTwo % weightBoxerOne;
        System.out.println("вычитание веса = "+weightDifferencetwo);
        System.out.println("остаток от деления = "+weightDeg);
        System.out.println("task №8.1");
        var totalTime = 640;
        var oneWorkerTime = 8;
        var totalWorker = totalTime / oneWorkerTime;
        System.out.println("total Worker "+totalWorker);
        System.out.println("task №8.2");
        var worker = 94;
        var hourPerWorker = totalTime / worker;
        System.out.println("Если в компании работает "+worker+" человека, то всего "+totalTime+ " может быть поделено между сотрудниками по "+hourPerWorker+" каждому");


    }
}