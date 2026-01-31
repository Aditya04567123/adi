package polymorphism;
class Trainer {
    void teach() {
        System.out.println("Teaches");
    }
}
class JavaTrainer extends Trainer {
    void teach() {
        System.out.println("teaches Java");
    }
}
class AptitudeTrainer extends Trainer {
    @Override
    void teach() {
        System.out.println("teaches aptitude");
    }
}
class TestingTrainer extends Trainer {
    @Override
    void teach() {
        System.out.println("teaches testing");
    }
}
public class A {
    public static void main(String[] args) {
        duty(new JavaTrainer());
        duty(new AptitudeTrainer());
        duty(new TestingTrainer());
    }

    static void duty(Trainer t) {
        t.teach();
    }
}


