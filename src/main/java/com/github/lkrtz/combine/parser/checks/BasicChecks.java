package com.github.lkrtz.combine.parser.checks;

import com.github.lkrtz.combine.parser.input.InputCharStream;
import com.github.lkrtz.combine.parser.input.SingleCharInputCharStream;

import java.util.function.Function;
import java.util.function.Supplier;

public class BasicChecks {
    private static final SingleCharCheck anyCharPredicate = new SingleCharCheck(c -> true);
    private static final SingleCharCheck anyDigitPredicate = new SingleCharCheck(Character::isDigit);


    public static final Supplier<SingleCharCheck> anyChar = () -> anyCharPredicate;
    public static final Function<InputCharStream, SingleCharCheck> oneChar = (c1) -> new SingleCharCheck(c -> c==c1.peek());
    public static final Supplier<SingleCharCheck> anyDigit = () -> anyDigitPredicate;
    public static final Function<InputCharStream, SingleCharCheck> oneDigit = (c1) ->
            new SingleCharCheck(c -> anyDigit.get().checkChar(new SingleCharInputCharStream(c)).isLeft() && c==c1.peek());
}
