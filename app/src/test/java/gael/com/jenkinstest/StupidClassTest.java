package gael.com.jenkinstest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by aurelien on 20/04/16.
 */
public class StupidClassTest {

    @Test
    public void testTheStupidClass() {
        assertThat(StupidClass.returnTwo(), is(equalTo(2)));
    }
}
