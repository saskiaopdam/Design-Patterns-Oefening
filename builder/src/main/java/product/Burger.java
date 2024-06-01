package product;

public abstract class Burger implements Item {
    @Override
    public String packing() {
        return new Wrapper().pack();
    }

}
