class Student {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
