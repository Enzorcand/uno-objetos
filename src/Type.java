public class Type {
    String color;
    String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Type{" +
                "color='" + color + '\'' +
                ", type=" + type +
                '}';
    }
}
