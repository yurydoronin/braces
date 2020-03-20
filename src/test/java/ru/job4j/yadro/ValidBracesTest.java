package ru.job4j.yadro;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 2.0
 * @since 20.03.2020
 */
public class ValidBracesTest {

    @Test
    public void whenStringWithBracesThenCheckOder() {
        assertThat(ValidBraces.checkBracesOder("([])"), is(Boolean.TRUE));
        assertThat(ValidBraces.checkBracesOder("{[(]}"), is(Boolean.FALSE));
        assertThat(ValidBraces.checkBracesOder("()[()]{()()[]}"), is(Boolean.TRUE));
        assertThat(ValidBraces.checkBracesOder("[(]{})"), is(Boolean.FALSE));
    }
}