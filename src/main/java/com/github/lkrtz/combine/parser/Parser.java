package com.github.lkrtz.combine.parser;

import com.github.lkrtz.combine.parser.checks.Condition;
import com.github.lkrtz.combine.parser.checks.SingleCharCheck;
import com.github.lkrtz.combine.parser.util.Either;
import com.github.lkrtz.combine.parser.util.Error;

public class Parser {
    private final Condition ruleSet;

    public Parser(Condition ruleSet) {
        this.ruleSet = ruleSet;
    }

//    public static Either<Character, Error> parse(SingleCharCheck check, String input) {
//        return check.checkChar(input.toCharArray());
//    }


}
