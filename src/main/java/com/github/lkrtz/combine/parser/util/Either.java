package com.github.lkrtz.combine.parser.util;

public record Either<L, R>(L left, R right) {

    public static <L, R> Either<L, R> left(L left) {
        return new Either<>(left, null);
    }

    public static <L, R> Either<L, R> right(R right) {
        return new Either<>(null, right);
    }

    public Boolean isLeft() {
        return left != null;
    }

    public Boolean isRight() {
        return right != null;
    }
}
