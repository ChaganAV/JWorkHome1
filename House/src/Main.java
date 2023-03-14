public class Main {
    public static void main(String[] args) {
        Ark kovcheg = new Ark(true,"Коричневый");
        if (kovcheg.getState())
            System.out.println(kovcheg.toString()+" открыт!!!");
        Person autor = new Person();
        autor.speak("Бог сказал Ною: Войди в ковчег со своей семьей... Возьми с собой  из каждого рода животных и птиц.");
        autor.speak("Через 7 дней я пошлю на землю дождь");
        autor.speak("Ной собрал животных. В ковчег вошли живые существа каждого рода, самцы и самки (см. проект Animal)");
        autor.speak("После этого Бог закрыл за ними дверь...");
        autor.closeDoor(kovcheg);
        if(!kovcheg.getState())
            System.out.println(kovcheg.toString()+" закрыт!!!");
        autor.speak("В 600 год жизни Ноя, в 17 день второго месяца, открылись все источники водных глубин, распахнулись окна небес");
        autor.speak("и дождь лился на землю 40 дней и 40 ночей");

    }
}