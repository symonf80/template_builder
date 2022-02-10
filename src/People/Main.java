package People;

public class Main {
    public static void main(String[] args) {
        Person dad = new PersonBuilder()
                .setName("Арчибальд")
                .setSurname("Медведев")
                .setAge(41)
                .setAddress("Рио де Жанейро")
                .build();
        Person son = dad.newChildBuilder()
                .setName("Вова")
                .build();
        System.out.println("У" + dad + "есть сын" + son);
        try {
            //Не хватает обязательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            //Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
