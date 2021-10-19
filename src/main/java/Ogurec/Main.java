package Ogurec;

public class Main {
    public static void main(String[] args) {
        Sotrudnik[] chel = new Sotrudnik[5];
        chel[0] = new Sotrudnik("Дарт Вейдер", "dark228@gmail.com", "главныйнифиганеделающий", "88005553535",28, 20000);
        chel[1] = new Sotrudnik("Люк Скайуокер", "luksolucky@gmail.com", "крутой перец", "89245209782", 20, 5000);
        chel[2] = new Sotrudnik("Стив Бобс", "pineapple@gmail.com", "уборщик", "89249274017", 58, 36);
        chel[3] = new Sotrudnik("Тимур Дракулидзе", "timuritto@gmail.com", "главный", "89542281337", 16, 5000000);
        chel[4] = new Sotrudnik("Клавдия Моргенштерн", "kadilac@gmail.com", "кофеварка", "89241840278", 174, 666);

        for (Sotrudnik aboba : chel) {
            if (aboba.get_Age() > 40) {
                System.out.println(aboba.MString());
            }
            System.out.println();
        }
    }
}
