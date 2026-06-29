public  class Rectangle extends Shape {
    private   int width;
    private int height;


    //setters
    public void setWidth(int width){
        this.width = width;
    }

    public  void setHeight(int height){
        this.height = height;
    }


    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;

    }

    @Override
    public double calculateArea() {
        return width * height;
    }



}
