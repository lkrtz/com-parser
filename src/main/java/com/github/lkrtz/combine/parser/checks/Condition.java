package com.github.lkrtz.combine.parser.checks;

import com.github.lkrtz.combine.parser.input.InputCharStream;
import com.github.lkrtz.combine.parser.util.Error;
import com.github.lkrtz.combine.parser.util.Either;

public interface Condition {
    Either<Character, Error> checkChar(InputCharStream input);
}
