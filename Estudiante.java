public class Estudiante {
    private String name;
    private int age;
    private int score;

    // Constructor
    public Estudiante(String name, int age, int score) {
        this.name = name;
        setAge(age);
        setScore(score);
    }

    // Getter y Setter para el nombre
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter y Setter para la edad
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Edad inválida. Se asignará 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Getter y Setter para la calificación
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0) {
            System.out.println("Calificación inválida. Se asignará 0.");
            this.score = 0;
        } else {
            this.score = score;
        }
    }

    // Método toString para representación de objetos en forma de cadena
    @Override
    public String toString() {
        return "Estudiante [name=" + name + ", age=" + age + ", score=" + score + "]";
    }
}