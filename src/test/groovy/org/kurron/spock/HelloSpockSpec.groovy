package org.kurron.spock

import spock.lang.Shared

/*
 * Copyright [2012] [Ronald D. Kurr]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

class HelloSpockSpec extends spock.lang.Specification {
    /* ---------------------- fields ------------------*/
    def notSharedBetweenFeatures = Integer.toString( new Random().nextInt( Integer.MAX_VALUE ), 16 )

    @Shared
    def sharedBetweenFeatures = Integer.toString( new Random().nextInt( Integer.MAX_VALUE ), 16 )

    // statics should be used for constants only
    static final PI = 3.141592654

    /*-------------------------- fixture methods -----------------*/
    def setup() { println '    -------- setup ----------' }
    def cleanup()
    {
        println '    -------- cleanup ----------'
        println()
    }

    def setupSpec() { println '---- uber setup ----'}
    def cleanupSpec() { println '---- uber clean up ----'}

    /*------------------------- feature methods -------------------------*/

    def "computing the maximum of two numbers"() {
        setup: "open database connection"
            println '        specification one: Setup phase'
            println '        specification one: notSharedBetweenFeatures = ' + notSharedBetweenFeatures
            println '        specification one: sharedBetweenFeatures = ' + sharedBetweenFeatures

        when:
            println '        specification one: Stimulus phase'

        then:
            println '        specification one: Response phase'
            println '        a = ' + a + ', b = ' + ', c = ' + c
            Math.max(a, b) == c

        cleanup:
            println '        specification one: Cleanup phase'

        where:
            a << [5, 3]
            b << [1, 9]
            c << [5, 9]
    }

    def "specification two"() {
        given: "an empty bank account"
            println '        specification two: an empty bank account'
            println '        specification two: notSharedBetweenFeatures = ' + notSharedBetweenFeatures
            println '        specification one: sharedBetweenFeatures = ' + sharedBetweenFeatures

        and: "and empty credit account"
            println '        specification two: and empty credit account'

        when: "the account is credited ten dollars"
            println '        specification two: the account is credited ten dollars'

        then:  "the account's balance is ten dollars"
            println '        specification two: the account balance is ten dollars'
            'a' == 'a'
        and: "the credit account is empty"
            helperMethodsShouldReturnVoid()

        cleanup:
            println '        specification two: Cleanup phase'
    }

    /*------------------------- helper methods --------------------------*/

    def void helperMethodsShouldReturnVoid()
    {
        println '        specification two: the credit account is empty'
        assert 0 == 0
    }
}
