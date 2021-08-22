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

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Entity representation of a package capability
 */
@NodeEntity
public class Package extends Capability {

    /**
     * The name of the package
     */
    public String name;

    /**
     * The minimum version of the package
     */
    public String minVersion;

    /**
     * The maximum version of the package
     */
    public String maxVersion;

}
