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

package org.kurron.spock

import spock.lang.Shared
import org.kurron.logan.Logan
import org.kurron.logan.DefaultDevan
import org.kurron.logan.Devan

class LoganUnitTest extends spock.lang.Specification {
    /* ---------------------- fields ------------------*/

    /*-------------------------- fixture methods -----------------*/
    def setup() {}
    def cleanup() {}
    def setupSpec() {}
    def cleanupSpec() {}

    /*------------------------- feature methods -------------------------*/

    def "given_concrete_devan_when_time_is_called_then_time_is_returned"() {
        given: "concrete Devan"
            def devan = new DefaultDevan()
            def logan = new Logan( devan )

        when: "time is called"
            final time = logan.time()

        then:  "time is not null"
            println 'time is ' + time
            null != time
    }

    def "given_stubbed_devan_when_time_is_called_then_time_is_returned"() {
        given:
            def devan = Mock( Devan )
            def sut = new Logan( devan )
            def bob = 'Ron was here'

        when:
            final time = sut.time()

        then:
            1 * devan.time() >> { bob }
            println 'time is ' + time
            null != time
    }

    /*------------------------- helper methods --------------------------*/
}
