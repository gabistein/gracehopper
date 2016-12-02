package conditionalPractice1;

class ExceptionA extends RuntimeException {
}

class ExceptionB extends ExceptionA {
}

class ExceptionC extends ExceptionA {
}

class ExceptionD extends ExceptionB {
}
