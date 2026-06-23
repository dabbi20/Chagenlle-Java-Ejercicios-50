public abstract class Person {
protected String name;
protected String email;
protected String edad;

public Person(String name,String email,String edad){
    this.name = name;
    this.email = email;
    this.edad = edad;
}

public abstract void labor();
}
