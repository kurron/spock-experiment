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

/**
 * Created with IntelliJ IDEA.
 * User: ron
 * Date: 9/26/12
 * Time: 9:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class Logan {

    private final Devan devan;

    public Logan(final Devan devan) {
        this.devan = devan;
    }

    public String time() {
        return devan.time();
    }
}
