import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.Scanner;


//        "Задание 1"
//class Person {
//    private String name;
//    private int age;
//    private String gender;
//
//    public Person(String name, int age, String gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }
//
//    public void displayInfo() {
//        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
//    }
//
//    public void increaseAge() {
//        age++;
//    }
//
//    public void setName(String newName) {
//        this.name = newName;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Person person = new Person("John", 25, "Male");
//        person.displayInfo();
//        person.increaseAge();
//        System.out.println("After increasing age:");
//        person.displayInfo();
//        person.setName("John Doe");
//        System.out.println("After changing name:");
//        person.displayInfo();
//    }
//}


//        "Задание 2"
//        class Person {
//            protected String name;
//            protected int age;
//            protected String gender;
//
//            public Person(String name, int age, String gender) {
//                this.name = name;
//                this.age = age;
//                this.gender = gender;
//            }
//
//            public void displayInfo() {
//                System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
//            }
//
//            public void increaseAge() {
//                age++;
//            }
//
//            public void setName(String newName) {
//                this.name = newName;
//            }
//        }
//
//        class Worker extends Person {
//            private double salary;
//
//            public Worker(String name, int age, String gender, double salary) {
//                super(name, age, gender);
//                this.salary = salary;
//            }
//
//            public void displayInfo() {
//                super.displayInfo();
//                System.out.println("Salary: " + salary);
//            }
//        }
//
//        class Manager extends Worker {
//            private String[] subordinates;
//
//            public Manager(String name, int age, String gender, double salary, String[] subordinates) {
//                super(name, age, gender, salary);
//                this.subordinates = subordinates;
//            }
//
//            public void displayInfo() {
//                super.displayInfo();
//                System.out.println("Subordinates: " + String.join(", ", subordinates));
//            }
//        }
//
//        public class Main {
//            public static void main(String[] args) {
//                Manager manager = new Manager("Alice", 35, "Female", 75000, new String[]{"John", "Sarah"});
//                manager.displayInfo();
//            }
//        }


//        "Задание 3"
//      interface Animal {
//          void makeSound();
//      }
//
//      class Dog implements Animal {
//           public void makeSound() {
//                System.out.println("Dog says: Woof");
//          }
//      }
//
//      class Cat implements Animal {
//          public void makeSound() {
//              System.out.println("Cat says: Meow");
//          }
//      }
//
//      class Cow implements Animal {
//          public void makeSound() {
//               System.out.println("Cow says: Moo");
//          }
//      }
//
//      public class Main {
//          public static void main(String[] args) {
//              Animal[] animals = { new Dog(), new Cat(), new Cow() };
//
//              for (Animal animal : animals) {
//                   animal.makeSound();
//               }
//           }
//      }

//        "Задание 4"
//    abstract class Transport {
//        public abstract void move();
//    }
//
//    class Car extends Transport {
//        public void move() {
//            System.out.println("Car moves on wheels");
//        }
//    }
//
//    class Bike extends Transport {
//        public void move() {
//            System.out.println("Bike moves on pedals");
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            Transport car = new Car();
//            Transport bike = new Bike();
//
//            car.move();
//            bike.move();
//        }
//    }

//        "Задание 5"
//class Book {
//    private String title;
//    private String author;
//    private int year;
//
//    public Book(String title, String author, int year) {
//        this.title = title;
//        this.author = author;
//        this.year = year;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public int getYear() {
//        return year;
//    }
//}
//
//class Library {
//    private List<Book> books;
//
//    public Library() {
//        books = new ArrayList<>();
//    }
//
//    public void addBook(Book book) {
//        books.add(book);
//    }
//
//    public void findByAuthor(String author) {
//        for (Book book : books) {
//            if (book.getAuthor().equals(author)) {
//                System.out.println("Found book: " + book.getTitle());
//            }
//        }
//    }
//
//    public void findByYear(int year) {
//        for (Book book : books) {
//            if (book.getYear() == year) {
//                System.out.println("Found book: " + book.getTitle());
//            }
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Library library = new Library();
//        library.addBook(new Book("Book1", "Author1", 2020));
//        library.addBook(new Book("Book2", "Author2", 2021));
//
//        library.findByAuthor("Author1");
//        library.findByYear(2021);
//    }
//}

//        "Задание 6"
//    class BankAccount {
//        private String accountNumber;
//        private double balance;
//
//        public BankAccount(String accountNumber, double balance) {
//            this.accountNumber = accountNumber;
//            this.balance = balance;
//        }
//
//        public void deposit(double amount) {
//            if (amount > 0) {
//                balance += amount;
//                System.out.println("Deposited: " + amount);
//            }
//        }
//
//        public void withdraw(double amount) {
//            if (amount > 0 && amount <= balance) {
//                balance -= amount;
//                System.out.println("Withdrawn: " + amount);
//            } else {
//                System.out.println("Insufficient funds.");
//            }
//        }
//
//        public void displayBalance() {
//            System.out.println("Account " + accountNumber + " balance: " + balance);
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            BankAccount account = new BankAccount("123456", 1000);
//            account.displayBalance();
//            account.deposit(500);
//            account.displayBalance();
//            account.withdraw(300);
//            account.displayBalance();
//            account.withdraw(2000);  // Insufficient funds
//        }
//    }


//        "Задание 7"
//    class Counter {
//        private static int count = 0;
//
//        public Counter() {
//            count++;
//        }
//
//        public static int getCount() {
//            return count;
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            new Counter();
//            new Counter();
//            new Counter();
//
//            System.out.println("Number of objects created: " + Counter.getCount());
//        }
//    }


//        "Задание 8"
//    abstract class Shape {
//        public abstract double getArea();
//    }
//
//    class Circle extends Shape {
//        private double radius;
//
//        public Circle(double radius) {
//            this.radius = radius;
//        }
//
//        @Override
//        public double getArea() {
//            return Math.PI * radius * radius;
//        }
//    }
//
//    class Rectangle extends Shape {
//        private double width;
//        private double height;
//
//        public Rectangle(double width, double height) {
//            this.width = width;
//            this.height = height;
//        }
//
//        @Override
//        public double getArea() {
//            return width * height;
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            Shape circle = new Circle(5);
//            Shape rectangle = new Rectangle(4, 6);
//
//            System.out.println("Area of circle: " + circle.getArea());
//            System.out.println("Area of rectangle: " + rectangle.getArea());
//        }
//    }

//        "Задание 9"
//    class Animal {
//        public void move() {
//            System.out.println("Animal moves");
//        }
//    }
//
//    class Fish extends Animal {
//        @Override
//        public void move() {
//            System.out.println("Fish swims");
//        }
//    }
//
//    class Bird extends Animal {
//        @Override
//        public void move() {
//            System.out.println("Bird flies");
//        }
//    }
//    class Dog extends Animal {
//        @Override
//        public void move() {
//            System.out.println("Dog runs");
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            Animal fish = new Fish();
//            Animal bird = new Bird();
//            Animal dog = new Dog();
//
//            fish.move();
//            bird.move();
//            dog.move();
//        }
//    }



//        "Задание 10"
//class Student {
//    private String name;
//    private String group;
//    private double grade;
//
//    public Student(String name, String group, double grade) {
//        this.name = name;
//        this.group = group;
//        this.grade = grade;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getGroup() {
//        return group;
//    }
//
//    public double getGrade() {
//        return grade;
//    }
//}
//
//class University {
//    private List<Student> students;
//
//    public University() {
//        students = new ArrayList<>();
//    }
//
//    public void addStudent(Student student) {
//        students.add(student);
//    }
//
//    public void sortByName() {
//        students.sort(Comparator.comparing(Student::getName));
//    }
//
//    public void filterByGrade(double minGrade) {
//        List<Student> filtered = students.stream()
//                .filter(s -> s.getGrade() >= minGrade)
//                .collect(Collectors.toList());
//        for (Student student : filtered) {
//            System.out.println("Student: " + student.getName() + ", Grade: " + student.getGrade());
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        University university = new University();
//        university.addStudent(new Student("John", "IT", 85.5));
//        university.addStudent(new Student("Alice", "Math", 90.0));
//        university.addStudent(new Student("Bob", "IT", 75.0));
//
//        university.sortByName();
//        university.filterByGrade(80);
//    }
//}

//        "Задание 11"
//class Product {
//    private String name;
//    private double price;
//    private int quantity;
//
//    public Product(String name, double price, int quantity) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//}
//
//class Store {
//    private List<Product> products;
//
//    public Store() {
//        products = new ArrayList<>();
//    }
//
//    public void addProduct(Product product) {
//        products.add(product);
//    }
//
//    public void removeProduct(String name) {
//        products.removeIf(p -> p.getName().equals(name));
//    }
//
//    public void findProductByName(String name) {
//        for (Product product : products) {
//            if (product.getName().equals(name)) {
//                System.out.println("Product found: " + product.getName() + ", Price: " + product.getPrice());
//                return;
//            }
//        }
//        System.out.println("Product not found.");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Store store = new Store();
//        store.addProduct(new Product("Apple", 1.5, 50));
//        store.addProduct(new Product("Orange", 2.0, 30));
//
//        store.findProductByName("Apple");
//        store.removeProduct("Apple");
//        store.findProductByName("Apple");
//    }
//}

//        "Задание 12"
//    interface PaymentSystem {
//        void pay(double amount);
//        void refund(double amount);
//    }
//
//    class CreditCard implements PaymentSystem {
//        @Override
//        public void pay(double amount) {
//            System.out.println("Paid " + amount + " using Credit Card");
//        }
//
//        @Override
//        public void refund(double amount) {
//            System.out.println("Refunded " + amount + " to Credit Card");
//        }
//    }
//
//    class PayPal implements PaymentSystem {
//        @Override
//        public void pay(double amount) {
//            System.out.println("Paid " + amount + " using PayPal");
//        }
//
//        @Override
//        public void refund(double amount) {
//            System.out.println("Refunded " + amount + " to PayPal");
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            PaymentSystem creditCard = new CreditCard();
//            PaymentSystem payPal = new PayPal();
//
//            creditCard.pay(100);
//            payPal.pay(200);
//
//            creditCard.refund(50);
//            payPal.refund(100);
//        }
//    }


//        "Задание 13"
//    class UniqueID {
//        private static int counter = 0;
//        private int id;
//
//        public UniqueID() {
//            this.id = ++counter;
//        }
//
//        public int getId() {
//            return id;
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            UniqueID obj1 = new UniqueID();
//            UniqueID obj2 = new UniqueID();
//            UniqueID obj3 = new UniqueID();
//
//            System.out.println("Object 1 ID: " + obj1.getId());
//            System.out.println("Object 2 ID: " + obj2.getId());
//            System.out.println("Object 3 ID: " + obj3.getId());
//        }
//    }

//        "Задание 14"
//class Point {
//    private int x;
//    private int y;
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public int getY() {
//        return y;
//    }
//}
//
//class Rectangle {
//    private Point topLeft;
//    private Point bottomRight;
//
//    public Rectangle(Point topLeft, Point bottomRight) {
//        this.topLeft = topLeft;
//        this.bottomRight = bottomRight;
//    }
//
//    public int calculateArea() {
//        int width = Math.abs(bottomRight.getX() - topLeft.getX());
//        int height = Math.abs(bottomRight.getY() - topLeft.getY());
//        return width * height;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Point p1 = new Point(0, 5);
//        Point p2 = new Point(5, 0);
//
//        Rectangle rectangle = new Rectangle(p1, p2);
//        System.out.println("Area of rectangle: " + rectangle.calculateArea());
//    }
//}


//        "Задание 15"
//    class ComplexNumber {
//        private double real;
//        private double imaginary;
//
//        public ComplexNumber(double real, double imaginary) {
//            this.real = real;
//            this.imaginary = imaginary;
//        }
//
//        public ComplexNumber add(ComplexNumber other) {
//            return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
//        }
//
//        public ComplexNumber subtract(ComplexNumber other) {
//            return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
//        }
//
//        public ComplexNumber multiply(ComplexNumber other) {
//            double realPart = this.real * other.real - this.imaginary * other.imaginary;
//            double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
//            return new ComplexNumber(realPart, imaginaryPart);
//        }
//
//        public ComplexNumber divide(ComplexNumber other) {
//            double denominator = other.real * other.real + other.imaginary * other.imaginary;
//            double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
//            double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
//            return new ComplexNumber(realPart, imaginaryPart);
//        }
//
//        @Override
//        public String toString() {
//            return real + " + " + imaginary + "i";
//        }
//
//        public static void main(String[] args) {
//            ComplexNumber num1 = new ComplexNumber(4, 5);
//            ComplexNumber num2 = new ComplexNumber(2, 3);
//
//            System.out.println("Num1: " + num1);
//            System.out.println("Num2: " + num2);
//
//            ComplexNumber sum = num1.add(num2);
//            System.out.println("Sum: " + sum);
//
//            ComplexNumber difference = num1.subtract(num2);
//            System.out.println("Difference: " + difference);
//
//            ComplexNumber product = num1.multiply(num2);
//            System.out.println("Product: " + product);
//
//            ComplexNumber quotient = num1.divide(num2);
//            System.out.println("Quotient: " + quotient);
//        }
//    }


//        "Задание 16"
//    class Matrix {
//        private int[][] data;
//        private int rows;
//        private int cols;
//
//        public Matrix(int rows, int cols) {
//            this.rows = rows;
//            this.cols = cols;
//            data = new int[rows][cols];
//        }
//
//        public void setValue(int row, int col, int value) {
//            data[row][col] = value;
//        }
//
//        public Matrix add(Matrix other) {
//            Matrix result = new Matrix(this.rows, this.cols);
//            for (int i = 0; i < rows; i++) {
//                for (int j = 0; j < cols; j++) {
//                    result.setValue(i, j, this.data[i][j] + other.data[i][j]);
//                }
//            }
//            return result;
//        }
//
//        public Matrix multiply(Matrix other) {
//            Matrix result = new Matrix(this.rows, other.cols);
//            for (int i = 0; i < rows; i++) {
//                for (int j = 0; j < other.cols; j++) {
//                    for (int k = 0; k < cols; k++) {
//                        result.data[i][j] += this.data[i][k] * other.data[k][j];
//                    }
//                }
//            }
//            return result;
//        }
//
//        public void display() {
//            for (int[] row : data) {
//                for (int val : row) {
//                    System.out.print(val + " ");
//                }
//                System.out.println();
//            }
//        }
//
//        public static void main(String[] args) {
//            Matrix mat1 = new Matrix(2, 2);
//            Matrix mat2 = new Matrix(2, 2);
//
//            mat1.setValue(0, 0, 1);
//            mat1.setValue(0, 1, 2);
//            mat1.setValue(1, 0, 3);
//            mat1.setValue(1, 1, 4);
//
//            mat2.setValue(0, 0, 5);
//            mat2.setValue(0, 1, 6);
//            mat2.setValue(1, 0, 7);
//            mat2.setValue(1, 1, 8);
//
//            System.out.println("Matrix 1:");
//            mat1.display();
//
//            System.out.println("Matrix 2:");
//            mat2.display();
//
//            Matrix sum = mat1.add(mat2);
//            System.out.println("Sum of matrices:");
//            sum.display();
//
//            Matrix product = mat1.multiply(mat2);
//            System.out.println("Product of matrices:");
//            product.display();
//        }
//    }


//        "Задание 17"
//class Player {
//    private String name;
//    private int health;
//    private int attackPower;
//
//    public Player(String name, int health, int attackPower) {
//        this.name = name;
//        this.health = health;
//        this.attackPower = attackPower;
//    }
//
//    public void attack(Enemy enemy) {
//        enemy.takeDamage(attackPower);
//        System.out.println(name + " attacks " + enemy.getName() + " for " + attackPower + " damage.");
//    }
//
//    public boolean isAlive() {
//        return health > 0;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void takeDamage(int damage) {
//        health -= damage;
//        System.out.println(name + " takes " + damage + " damage.");
//    }
//}
//
//class Enemy {
//    private String name;
//    private int health;
//    private int attackPower;
//
//    public Enemy(String name, int health, int attackPower) {
//        this.name = name;
//        this.health = health;
//        this.attackPower = attackPower;
//    }
//
//    public void takeDamage(int damage) {
//        health -= damage;
//        System.out.println(name + " takes " + damage + " damage.");
//    }
//
//    public void attack(Player player) {
//        player.takeDamage(attackPower);
//        System.out.println(name + " attacks " + player.getName() + " for " + attackPower + " damage.");
//    }
//
//    public boolean isAlive() {
//        return health > 0;
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Player player = new Player("Hero", 100, 20);
//        Enemy enemy = new Enemy("Goblin", 50, 10);
//
//        while (player.isAlive() && enemy.isAlive()) {
//            player.attack(enemy);
//            if (enemy.isAlive()) {
//                enemy.attack(player);
//            }
//        }
//
//        if (player.isAlive()) {
//            System.out.println(player.getName() + " wins!");
//        } else {
//            System.out.println(enemy.getName() + " wins!");
//        }
//    }
//}

//        "Задание 18"
//class Product {
//    private String name;
//    private double price;
//
//    public Product(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//}
//
//class Customer {
//    private String name;
//
//    public Customer(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//class Order {
//    private Customer customer;
//    private List<Product> products;
//
//    public Order(Customer customer) {
//        this.customer = customer;
//        products = new ArrayList<>();
//    }
//
//    public void addProduct(Product product) {
//        products.add(product);
//    }
//
//    public double getTotalPrice() {
//        double total = 0;
//        for (Product product : products) {
//            total += product.getPrice();
//        }
//        return total;
//    }
//
//    public void displayOrder() {
//        System.out.println("Order for " + customer.getName());
//        for (Product product : products) {
//            System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice());
//        }
//        System.out.println("Total: " + getTotalPrice());
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Customer customer = new Customer("John Doe");
//        Order order = new Order(customer);
//
//        Product apple = new Product("Apple", 1.5);
//        Product orange = new Product("Orange", 2.0);
//
//        order.addProduct(apple);
//        order.addProduct(orange);
//
//        order.displayOrder();
//    }
//}

//        "Задание 19"
//    class Device {
//        protected String brand;
//
//        public Device(String brand) {
//            this.brand = brand;
//        }
//
//        public void turnOn() {
//            System.out.println(brand + " device is turned on.");
//        }
//
//        public void turnOff() {
//            System.out.println(brand + " device is turned off.");
//        }
//    }
//
//    class Smartphone extends Device {
//        public Smartphone(String brand) {
//            super(brand);
//        }
//
//        public void takePhoto() {
//            System.out.println(brand + " smartphone takes a photo.");
//        }
//    }
//
//    class Laptop extends Device {
//        public Laptop(String brand) {
//            super(brand);
//        }
//
//        public void code() {
//            System.out.println(brand + " laptop is used for coding.");
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            Smartphone phone = new Smartphone("Apple");
//            Laptop laptop = new Laptop("Dell");
//
//            phone.turnOn();
//            phone.takePhoto();
//            phone.turnOff();
//
//            laptop.turnOn();
//            laptop.code();
//            laptop.turnOff();
//        }
//    }

//        "Задание 20"
//    class Game {
//        private char[][] board;
//        private char currentPlayer;
//
//        public Game() {
//            board = new char[3][3];
//            currentPlayer = 'X';
//            initializeBoard();
//        }
//
//        // Инициализация игрового поля
//        public void initializeBoard() {
//            for (int i = 0; i < 3; i++) {
//                for (int j = 0; j < 3; j++) {
//                    board[i][j] = '-';
//                }
//            }
//        }
//
//        // Отображение игрового поля
//        public void printBoard() {
//            System.out.println("  0 1 2");
//            for (int i = 0; i < 3; i++) {
//                System.out.print(i + " ");
//                for (int j = 0; j < 3; j++) {
//                    System.out.print(board[i][j] + " ");
//                }
//                System.out.println();
//            }
//        }
//
//        // Проверка, не полное ли игровое поле
//        public boolean isBoardFull() {
//            for (int i = 0; i < 3; i++) {
//                for (int j = 0; j < 3; j++) {
//                    if (board[i][j] == '-') {
//                        return false;
//                    }
//                }
//            }
//            return true;
//        }
//
//        // Получение текущего игрока
//        public char getCurrentPlayer() {
//            return currentPlayer;
//        }
//
//        // Смена игрока
//        public void changePlayer() {
//            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
//        }
//
//        // Попытка поместить метку на игровое поле
//        public boolean placeMark(int row, int col) {
//            if (row >= 0 && col >= 0 && row < 3 && col < 3 && board[row][col] == '-') {
//                board[row][col] = currentPlayer;
//                return true;
//            }
//            return false;
//        }
//
//        // Проверка, выиграл ли игрок
//        public boolean checkWin() {
//            return (checkRows() || checkColumns() || checkDiagonals());
//        }
//
//        // Проверка рядов
//        private boolean checkRows() {
//            for (int i = 0; i < 3; i++) {
//                if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
//                    return true;
//                }
//            }
//            return false;
//        }
//
//        // Проверка колонок
//        private boolean checkColumns() {
//            for (int i = 0; i < 3; i++) {
//                if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
//                    return true;
//                }
//            }
//            return false;
//        }
//
//        // Проверка диагоналей
//        private boolean checkDiagonals() {
//            if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
//                return true;
//            }
//            if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
//                return true;
//            }
//            return false;
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            Game game = new Game();
//            boolean gameWon = false;
//
//            System.out.println("Добро пожаловать в игру 'Крестики-нолики'!");
//            game.printBoard();
//
//            // Основной цикл игры
//            while (!game.isBoardFull()) {
//                System.out.println("Ход игрока " + game.getCurrentPlayer());
//                int row = -1, col = -1;
//
//                // Проверка корректности ввода
//                boolean validInput = false;
//                while (!validInput) {
//                    System.out.print("Введите номер строки (0-2): ");
//                    if (scanner.hasNextInt()) {
//                        row = scanner.nextInt();
//                    }
//                    System.out.print("Введите номер столбца (0-2): ");
//                    if (scanner.hasNextInt()) {
//                        col = scanner.nextInt();
//                    }
//                    scanner.nextLine();  // Очистка буфера
//
//                    if (row >= 0 && row < 3 && col >= 0 && col < 3 && game.placeMark(row, col)) {
//                        validInput = true;
//                    } else {
//                        System.out.println("Некорректный ход, попробуйте снова.");
//                    }
//                }
//
//                game.printBoard();
//
//                // Проверка, выиграл ли текущий игрок
//                if (game.checkWin()) {
//                    System.out.println("Игрок " + game.getCurrentPlayer() + " победил!");
//                    gameWon = true;
//                    break;
//                }
//
//                game.changePlayer();
//            }
//
//            if (!gameWon) {
//                System.out.println("Ничья!");
//            }
//        }
//    }



