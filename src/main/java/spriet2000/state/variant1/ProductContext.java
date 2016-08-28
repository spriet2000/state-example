package spriet2000.state.variant1;

public final class ProductContext {

    private final ProductInfo productInfo;
    private final ClientInfo clientInfo;
    private ProductState nextState;

    public ProductContext(ProductInfo productInfo, ClientInfo clientInfo) {
        this.productInfo = productInfo;
        this.clientInfo = clientInfo;
    }

    public void setNewState(final ProductState nextState) {
        this.nextState = nextState;
    }

    public void act() {
        this.nextState.act(this);
        persistStateChange(productInfo.getState(), nextState);
    }

    private void persistStateChange(ProductState from, ProductState to) {
        System.out.printf("saved from %s,to %s%n", from.getName(), to.getName());
    }

    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    public ProductInfo getProductInfo() {
        return productInfo;
    }
}
