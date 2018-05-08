package com.drpicox.bowlingKata;

import org.junit.Before;
import org.junit.Test;
import java.sql.SQLException;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {

    @Test
    public void testGutterGame() throws Exception {
        Game g = new Game();
        for (int i=0; i<20;i++)
            g.roll(0);
        assertEquals(0, g.score());
    }
}