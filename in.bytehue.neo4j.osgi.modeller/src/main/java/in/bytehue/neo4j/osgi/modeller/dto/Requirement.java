package in.bytehue.neo4j.osgi.modeller.dto;

import java.util.List;
import java.util.Map;

/**
 * Entity representation of a requirement that has been declared from a Bundle.
 */
public class Requirement extends DTO {

    /**
     * The namespace of this capability.
     */
    public String namespace;

    /**
     * The bundles that require this requirement
     */
    public List<Bundle> requirers;

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
