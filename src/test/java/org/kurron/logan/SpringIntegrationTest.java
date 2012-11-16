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

package org.kurron.logan;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;


/**
 * An example of a simple Spring-based integration test.
 */
@ContextConfiguration
public class SpringIntegrationTest extends AbstractJUnit4SpringContextTests
{
    @Autowired
    private Logan sut;

    @Test
    public void given_when_then() throws Exception
    {
        System.out.println( "Test called!" );
        assertThat( sut, is( notNullValue() ) );

        final String results = sut.time();
        assertThat( results, is( notNullValue() ) );
        assertThat( results, is( equalTo( "bob" ) ) );
    }
}
