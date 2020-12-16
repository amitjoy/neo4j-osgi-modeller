package in.bytehue.neo4j.osgi.modeller.dto;

import java.util.Map;

/**
 * Entity representation of a capability that has been declared from a Bundle.
 */
public class Capability extends DTO {

    /**
     * The bundle that provides this capability
     */
    public Bundle provider;

    /**
     * The namespace of this capability.
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

}
