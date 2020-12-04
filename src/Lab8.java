class People {
    protected String name, lastName;
    protected int age;

    People(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    static People Human = new People("Ilya", "Berezhnev", 19);

    public static void main(String[] args) {
        walk();
        voice();
        run();
        Teacher.teach();
        Student.learn();
    }
    static void walk(){
        System.out.println(Human.name + " ходит");
    }
    static void voice(){
        System.out.println(Human.name + " говорит: привет!");
    }
    static void run(){
        System.out.println(Human.name + " бегает");
    }
}

class Student extends People{
    public Student(String name, String lastName, int age) {
        super(name, lastName, age);
    }
    static void learn(){
        System.out.println(Human.name + " учиться");
    }
}

class Teacher extends People{
    public Teacher(String name, String lastName, int age){
        super(name, lastName, age);
    }
    static void teach(){
        System.out.println(Human.name + " учит");
    }
}
