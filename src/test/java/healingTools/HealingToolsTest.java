package healingTools;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingToolsTest {

    HealingTools healingTools;
    Potion potion;

    @Before
    public void before(){
        potion = new Potion(10);
    }

    @Test
    public void potionCanHeal(){
        assertEquals(10, potion.getHealthToDeal());
    }
}
