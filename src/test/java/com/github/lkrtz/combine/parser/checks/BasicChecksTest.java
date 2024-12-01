package com.github.lkrtz.combine.parser.checks;

import org.junit.jupiter.api.Test;

public class BasicChecksTest {
    @Test
    void testAnyChar() {
        BasicChecks.anyChar.get().checkChar()
    }
}
