//методы: движение, обслуживание, переключение передач, включение фар дворников.

public class Car implements ICar {
    protected String mark, model, color, exter, fluel_type, control;
    protected int num_wheels;
    protected double vol_eng;

    protected boolean rides;
    private boolean light_on;
    protected boolean is_vecsicale;
    

    public Car(String mark, String model, String color, String exter, String fluel_type, String control, int num_wheels, double vol_eng) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.exter = exter;
        this.fluel_type = fluel_type;
        this.control = control;
        this.num_wheels = num_wheels;
        this.vol_eng = vol_eng;
    }

    protected String movement() {
        return "";
    }

    protected String service() {
        return "";
    }

    public void changeControl(String control_mode) {
    }




    @Override
    public boolean isSweepingStreet(boolean isSweeping) {
        return false;
    }

    @Override
    public void isLight_on(boolean is_light) {
        if (this.light_on==false) {
            this.light_on=true;
            System.out.println("Фары вкл.");}
            else{
                System.out.println("Фары уже вкл.");
            }
        }

    @Override
    public void switch_move_type() {
        }

   

        
    
}
