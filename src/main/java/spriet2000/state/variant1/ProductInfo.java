package spriet2000.state.variant1;

public final class ProductInfo {

    private ProductState productState;
    private final boolean isCompleted;

    public ProductInfo(ProductState productState, boolean isCompleted) {

        this.productState = productState;
        this.isCompleted = isCompleted;
    }

    public ProductState getState() {
        return productState;
    }

    public void setState(ProductState state) {
        this.productState = state;
    }

    public boolean isCompleted(){
        return isCompleted;
    }
}
