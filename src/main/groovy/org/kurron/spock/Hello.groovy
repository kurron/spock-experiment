package org.kurron.spock

/**
 * Simple example class to test.
 */
class Hello {
    def hello( count ) {
        count.each {
            println 'Hello, world.'
        }
    }

    public static void main(String[] args) {
        new Hello().hello( 1 )
    }
}
