package Chap11;
public class People {
    int weight;
    int height;
    public People(int w, int h){
        weight = w;
        height = h;
    }
    @Override
    public boolean equals(Object aThat) {
        if(this == aThat) {
            return true;
        }
        if(!(aThat instanceof People)) {
            return false;
        }
        People that = (People)aThat;
        return (this.weight == that.weight &&
                this.height == that.height);
    }
    @Override
    public int hashCode() {
        return 31*this.weight + this.height;
    }
}
