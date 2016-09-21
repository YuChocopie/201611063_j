class Hello {
    String name;
    Hello(String name) {
        this.name=name;
    }
    void sayHello() {
        System.out.println("hello " + name);
    }
}


Hello h=new Hello("world");
h.sayHello();
h.getClass()