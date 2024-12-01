package com.github.lkrtz.combine.parser.checks;

import com.github.lkrtz.combine.parser.input.InputCharStream;
import com.github.lkrtz.combine.parser.util.Error;
import com.github.lkrtz.combine.parser.util.Either;

import java.util.function.Predicate;

public class SingleCharCheck {
    private final Predicate<Character> charPredicate;


    public SingleCharCheck(Predicate<Character> charPredicate) {
        this.charPredicate = charPredicate;
    }

    public Either<Character, Error> checkChar(InputCharStream input) {
        if (charPredicate.test(input.peek())) {
            return Either.left(input.pop());
        } else {
            return Either.right(new Error(1));
        }
    }
}
