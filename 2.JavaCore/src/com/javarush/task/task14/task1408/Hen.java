package com.javarush.task.task14.task1408;

public abstract class Hen {
    abstract int getCountOfEggsPerMonth();
    String getDescription(){
        return "Я - курица.";
    }
}
class RussianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }
    @Override
    String getDescription(){
        return super.getDescription() + " Моя страна - Russia." + " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

class UkrainianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    String getDescription(){
        return super.getDescription() + " Моя страна - Ukraine." + " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

class MoldovanHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 30;
    }

    @Override
    String getDescription(){
        return super.getDescription() + " Моя страна - Moldova." + " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

class BelarusianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 40;
    }

    @Override
    String getDescription(){
        return super.getDescription() + " Моя страна - Belarus." + " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
