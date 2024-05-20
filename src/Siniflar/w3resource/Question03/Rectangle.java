package Siniflar.w3resource.Question03;

public class Rectangle {
    private int width;
    private int height;

    // Yapıcı Metot
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //Getter
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


    // Setter
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Metotlarımızı yazıyoruz..
    // Alan hesaplama Metodu
    public double getArea() {

       return width * height;

    }

    //Çevre Hesaplama Metodu
    public double getPerimeter(){
        return 2 * (width + height);


    }



}
