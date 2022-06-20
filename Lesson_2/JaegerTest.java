package Lesson_2;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger coyoteTango_1 = new Jaeger();
        Jaeger chernoAlpha_1 = new Jaeger();

        System.out.println(coyoteTango_1.getModelName());
        System.out.println(coyoteTango_1.getModelName());
        System.out.println(coyoteTango_1.getHeight());
        System.out.println(coyoteTango_1.getArmor());
        chernoAlpha_1.drift();
        System.out.println(chernoAlpha_1.getPilots());

        Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Destroyed", "Russia", 
                                        2, 3, 10, 6, 2);
        System.out.printf(" Модель: %s\n Статус: %s\n Производитель: %s\n Вес: %.2f\n Скорость: %d\n" +
                          " Мроня: %d\n Кол-во убитых Kaiju: %d\n Кол-во пилотов: %d\n", 
                            chernoAlpha.getModelName(), chernoAlpha.getStatus(), chernoAlpha.getOrigin(),
                            chernoAlpha.getWeight(), chernoAlpha.getSpeed(),
                            chernoAlpha.getArmor(), chernoAlpha.getKaijuKilled(),chernoAlpha.getPilots());
        chernoAlpha.drift();
        chernoAlpha.getKaijuKilled();
        Jaeger coyoteTango = new Jaeger();
        coyoteTango.setModelName("Coyote Tango");
        coyoteTango.setMark("mark - 1");
        coyoteTango.setKaijuKilled(2);
        coyoteTango.drift();
        coyoteTango.getKaijuKilled();
        coyoteTango.setPilots(2);
        coyoteTango.drift();
        System.out.printf(" Модель: %s\n Марка: %s\n Кол-во убитых Kaiju: %d\n",
                          coyoteTango.getModelName(), coyoteTango.getMark(), coyoteTango.getKaijuKilled());
        coyoteTango.drift();
        coyoteTango.move();
        coyoteTango.killKaiju();


    }
}
