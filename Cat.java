    public class Cat {
        public static void main(String[] args) {
            Dog dog = new Dog("nam", 5);
            System.out.println("name is " + dog.name);
            System.out.println("age is " + dog.age);
            dog.sleep();
            dog.play();
        }
        }