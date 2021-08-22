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
import java.util.Map;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceReference;

/**
 * Entity representation of a service capability
 */
@NodeEntity
public class Service extends Capability {

    /**
     * The identifier of the service
     *
     * @see Constants#SERVICE_ID
     */
    public long serviceId;

    /**
     * The properties for the service
     *
     * The value type must be a numerical type, Boolean, String, DTO or an array
     * of any of the former.
     *
     * @see ServiceReference#getProperty(String)
     */
    public Map<String, Object> properties;

    /**
     * The list of referenced services this service requires if it is registered using SCR
     */
    @Relationship(type = "REQUIRES", direction = OUTGOING)
    public List<Service> services;
}
