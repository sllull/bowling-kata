package com.drpicox.bowlingKata;

import org.junit.Before;
import org.junit.Test;
import java.sql.SQLException;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {
    private Game g;

    protected void setUp() throws Exception{
        g = new Game();
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
    }

    @Test
    public void testGutterGame() throws Exception {
        int n = 20;
        int pins = 0;
        rollMany(n,pins);
        assertEquals(0, g.score());
    }

    @Test
    public void testAllOnes() throws Exception{
        for (int i =0; i<20 ; i++)
            g.roll(1);
        assertEquals(20,g.score());
    }
}