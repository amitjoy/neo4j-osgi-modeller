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
