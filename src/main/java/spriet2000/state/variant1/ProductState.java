package spriet2000.state.variant1;

import java.util.List;

public abstract class ProductState {

    public abstract void handle(ProductContext context);

    public abstract String getName();

    public abstract List<ProductState> getNextStates(ProductContext context);

}
