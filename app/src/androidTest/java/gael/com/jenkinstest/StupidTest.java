package gael.com.jenkinstest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by aurelien on 20/04/16.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class StupidTest {

    @Rule
    public ActivityTestRule<MainActivity> test = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheFabForAbsolutlyNoReasonIndeedItWontDoAThingAnyway() {
        //another comment
        onView(withId(R.id.fab)).perform(click());
        onView(withId(R.id.fab)).check(matches(isDisplayed()));
    }

    @Test
    public void testIfThisTestWillFailAsItShould() {
        assertThat(2, is(equalTo(2)));
    }

}
