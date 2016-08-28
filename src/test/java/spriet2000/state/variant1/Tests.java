package spriet2000.state.variant1;

import org.junit.Assert;
import org.junit.Test;
import spriet2000.state.variant1.impl.ActiveState;
import spriet2000.state.variant1.impl.InitState;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void clientInfoShouldBeSet() {
        ProductContext context = new ProductContext(
                new ProductInfo(new InitState()), new ClientInfo(200));

        assertEquals(200, context.getClientInfo().getStatus());
    }

    @Test
    public void productInfoShouldBeSet() {
        ProductContext context = new ProductContext(
                new ProductInfo(new ActiveState()), new ClientInfo(200));

        assertEquals("Active", context.getProductInfo().getState().getName());
    }

    @Test
    public void whenClientIs200NextStatesShouldBeExplicit() {
        ProductContext context = new ProductContext(
                new ProductInfo(new ActiveState()), new ClientInfo(200));

        List<ProductState> states = new ActiveState().getNextStates(context);

        assertEquals(2, states.size());
        Assert.assertEquals("Cancelled", states.get(0).getName());
        Assert.assertEquals("Pause", states.get(1).getName());
    }

    @Test
    public void whenClientIs600NextStatesShouldBeExplicit() {
        ProductContext context = new ProductContext(
                new ProductInfo(new ActiveState()), new ClientInfo(600));

        List<ProductState> states = new ActiveState().getNextStates(context);

        assertEquals(2, states.size());
        Assert.assertEquals("End", states.get(0).getName());
        Assert.assertEquals("Pause", states.get(1).getName());
    }
}
