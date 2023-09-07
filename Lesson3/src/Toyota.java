public class Toyota extends Car implements ICleaningMirrors,IWindshieldCleaning,IHeadlightCleaning,IGasStation {

    public Toyota(String model, String color, String exter, String fluel_type, String control, int num_wheels, double vol_eng) {
        super("Toyota", model, color, exter, fluel_type, control, num_wheels, vol_eng);
        super.is_vecsicale = true;
        super.rides = true;
    }

    public void isLight_on(boolean is_light) {
        is_light = true;
    }

    @Override
    public void switch_move_type() {
        if (super.rides==true) {
            super.rides=false;
            System.out.println("полет");}
            else{
                super.rides=true;
                System.out.println("движение");
            }   
        }

    @Override
    public void cleaning_mirrors() {
        System.out.println(model+"Почистили зеркала");
    }

    @Override
    public void headlight_cleaning() {
        System.out.println(model+"Почистили фары");
    }

    @Override
    public void windshield_cleaning() {
        System.out.println(model+"Почистили лоб. стекло");
    }     
    @Override
    public void refueling() {
        System.out.println(fluel_type+" залит в "+model);;
        // return super.fluel_type+"заправлен";
    }
}

//    Создать конкретный автомобиль путём наследования класса «Car», определить метод «движение» - «полёт». Провести проверку принципа LSP.
//        7. Создать интерфейс «Заправочная станция», создать метод: заправка топливом.
//        8. Имплементировать метод интерфейса «Заправочная станция» в конкретный класс «Car».
//        9. Добавить в интерфейс «Заправочная станция» методы: протирка лобового стекла, протирка фар, протирка зеркал.
//        10. Имплементировать все методы интерфейса «Заправочная станция» в конкретный класс «Car». Провести проверку принципа ISP. Создать дополнительный/е интерфейсы и имплементировать их в конкретный класс «Car». Провести проверку принципа ISP.
//        11. Создать путём наследования класса «Car» два автомобиля: с бензиновым и дизельным двигателями, имплементировать метод «Заправка топливом» интерфейса «Заправочная станция». Реализовать заправку каждого автомобиля подходящим топливом. Провести проверку принципа DIP.
