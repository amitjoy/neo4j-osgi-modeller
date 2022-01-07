/*******************************************************************************
 * Copyright 2022 Amit Kumar Mondal
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

import static org.neo4j.ogm.annotation.Relationship.INCOMING;

import java.util.List;
import java.util.Map;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Entity representation of a capability that has been declared from a Bundle.
 */
@NodeEntity
public class Capability extends Entity {

    /**
     * The namespace of this capability
     */
    public String namespace;

    /**
     * An unmodifiable map of attribute names to attribute values for
     * this capability, or an empty map if this capability has no
     * attributes.
     */
    public Map<String, String> attributes;

    /**
     * An unmodifiable map of directive names to directive values for
     * this capability, or an empty map if this capability has no
     * directives
     */
    public Map<String, String> directives;

    /**
     * The bundles providing this requirement
     */
    @Relationship(type = "PROVIDES", direction = INCOMING)
    public List<Bundle> providers;

    /**
     * The bundles requiring this requirement
     */
    @Relationship(type = "REQUIRES", direction = INCOMING)
    public List<Bundle> requirers;

}
