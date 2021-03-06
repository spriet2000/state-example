package spriet2000.state.variant1.impl;


import spriet2000.state.variant1.ProductContext;
import spriet2000.state.variant1.ProductState;

import java.util.Arrays;
import java.util.List;

public class PauseState extends ProductState {

    public void handle(ProductContext context) {

        // logic
        System.out.printf("logic applied of status %s%n", this.getName());

        // set new state
        context.setState(this);
    }

    public String getName() {
        return "Pause";
    }

    public List<ProductState> getNextStates(ProductContext context) {
        return Arrays.asList(new InitState(), new ActiveState(), new CancelledState());
    }
}
