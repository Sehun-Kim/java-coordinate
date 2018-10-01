package view;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;

public class ResultViewTest {

    @Test
    public void makeNumIndent() {
        assertThat(ResultView.makeNumIndent(1), is("  "));
    }

    @Test
    public void numSizeIndent() {
        assertThat(ResultView.numSizeIndent(10), is("10"));
    }

    @Test()
    public void drawXLine() {
        ResultView.drawXLine(10);
    }

}