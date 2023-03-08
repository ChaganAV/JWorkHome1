public class Person extends Human{
    private int age;
    private Gender gender;
    private int birthday;
    public Person(){
        super();
        age = 0;
        gender = null;
        birthday = 0;
    }
    public Person(String name){
        super(name);
    }
    public Person(String name, int age){
        super(name);
        this.age = age;
    }
    public Person(String name, int age,Gender gender){
        super(name);
        this.age = age;
        this.gender = gender;
    }
    public Person(String name, int age,Gender gender,int birthday){
        super(name);
        this.age = age;
        this.gender = gender;
        this.birthday = birthday;
    }
    public int getAge(){
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        String gend = "мужчина";
        if(this.gender == Gender.woman) gend = "женщина";
        return String.format("%s %s возраст %d, год рождения %d до н.э.",super.getName(),gend,age,this.getBirthday());
    }
    @Override
    public boolean equals(Person pers) {
        String thisName = String.format("%s%d%s%d",this.getName(),this.getAge(),this.getGender(),this.getBirthday());
        String persName = String.format("%s%d%s%d",pers.getName(),pers.getAge(),pers.getGender(),pers.getBirthday());
        return thisName==persName;
    }
}
