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

import static org.neo4j.ogm.annotation.Relationship.OUTGOING;

import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Entity Representation for a Bundle.
 */
@NodeEntity
public class Bundle extends Entity {

    /**
     * The bundle's symbolic name
     *
     * @see Bundle#getSymbolicName()
     */
    public String bsn;

    /**
     * The bundle's version
     *
     * @see Bundle#getVersion()
     */
    public String version;

    /**
     * The bundle's state
     *
     * @see Bundle#getState()
     */
    public String state;

    /**
     * The bundle's location identifier
     *
     * @see Bundle#getLocation()
     */
    public String location;

    /**
     * The time when the bundle was last modified
     *
     * @see Bundle#getLastModified()
     */
    public long lastModified;

    /**
     * The list of capabilities the bundle provides
     */
    @Relationship(type = "PROVIDES", direction = OUTGOING)
    public List<Capability> providedCapabilities;

    /**
     * The list of capabilities the bundle requires
     */
    @Relationship(type = "REQUIRES", direction = OUTGOING)
    public List<Capability> requiredCapabilities;

}
