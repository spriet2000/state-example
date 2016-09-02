package spriet2000.state.variant1;

public final class ProductInfo {

    private ProductState productState;

    public ProductInfo(ProductState productState) {

        this.productState = productState;
    }

    public ProductState getState() {
        return productState;
    }

    public void setState(ProductState state) {
        this.productState = state;
    }

    public boolean isCompleted(){
        return true;
    }
}
