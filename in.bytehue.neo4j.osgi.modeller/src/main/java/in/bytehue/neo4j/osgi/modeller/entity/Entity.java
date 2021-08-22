/*******************************************************************************
 * Copyright 2021 Amit Kumar Mondal
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package in.bytehue.neo4j.osgi.modeller.entity;

import java.lang.reflect.Field;
import java.util.StringJoiner;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;

public abstract class Entity {

    @Id
    @GeneratedValue
    private Long id;

    /**
     * Return a string representation of this DTO suitable for use when debugging.
     *
     * <p>
     * The format of the string representation is not specified and subject to
     * change.
     *
     * @return A string representation of this DTO suitable for use when debugging.
     */
    @Override
    public String toString() {
        final StringJoiner joiner = new StringJoiner(", ");
        for (final Field f : getClass().getFields()) {
            try {
                joiner.add(f.getName() + " = " + f.get(this));
            } catch (final IllegalAccessException e) {
                // pass, don't print
            }
        }
        return "[" + joiner.toString() + "]";
    }

}