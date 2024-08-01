package Collections;
//1) single inheritance
/*
class base{
    String name="Jivan";
    String surname="Bhosale";
}
public class main extends  base{
    public static void main(String[] args) {
        System.out.println("All ok");
        main m = new main();
        System.out.println(m.name);
        System.out.println(m.surname);
    }
}
*/
//2) Multilevel inheritance
/*
class grandfather{
    String name ="ramrav";
    String surname ="Bhosale";

}
class father extends grandfather{
    String name="Pandurang";
}
class brother extends father{
    String name="Sambhaji";
}

public class main extends brother{
    public static void main(String[] args) {
        System.out.println("All ok");
        main m = new main();
        System.out.println(m.name);
        System.out.println(m.surname);


    }
}
*/
// 3) Hybrid inheritance
/*

class grandfather{
    String name ="ramrav";
    String surname ="Bhosale";
    public void display(){
        System.out.println("hey i am display method of grandfather class");
    }
}
interface father{
    String name="Pandurang";
    public void fdisplay();
}
interface mom{
    String name="Savita";
    public void mdisplay();

}
class brother extends grandfather implements father,mom{
    String name="Sambhaji";

    @Override
    public void fdisplay() {
        System.out.println("Hey i am fdisplay method of father interface");
    }

    @Override
    public void mdisplay() {
        System.out.println("hey i am mdisplay method of mom interface");
    }
}

public class main extends brother{
    public static void main(String[] args) {
        main mybrother = new main();
        mybrother.display();
        mybrother.mdisplay();
        mybrother.fdisplay();
     }
    }

 */

// 4) hierarchical inheritance
class student{
    public void student(){
        System.out.println("student() method invoked in student class");
    }
}
class Science extends student{
    public void science(){
        System.out.println("science() method invoked in science class");
    }
}
class Commerce extends student{
    public void commerce(){
        System.out.println("commerce() method invoked in commerce class");
    }
}
class Arts extends student{
    public void arts(){
        System.out.println("arts() method invoked in arts class");
    }
}

public class main {
    public static void main(String[] args) {
        Science science = new Science();
        Commerce commerce = new Commerce();
        Arts arts = new Arts();
        science.student();
        commerce.student();
        arts.student();
     }
}