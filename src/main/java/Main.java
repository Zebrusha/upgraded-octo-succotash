public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Петр";
        post.phone = "7_900_012_34_56";
        post.patronymic = "Сергеевич";
        post.passport = "4444 № 44444444";
        post.surname = "Попов";
        post.subscription = "true";
        post.birthday = new FormDate();
        post.birthday.day = 10;
        post.birthday.month = 1;
        post.birthday.year = 1990;
    }

}

