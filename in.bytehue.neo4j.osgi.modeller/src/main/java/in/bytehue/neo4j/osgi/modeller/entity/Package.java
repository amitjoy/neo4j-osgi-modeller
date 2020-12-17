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
