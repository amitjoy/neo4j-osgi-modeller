package in.bytehue.neo4j.osgi.modeller.dto;

import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Entity Representation for a Bundle.
 */
@NodeEntity
public class Bundle extends DTO {

    /**
     * The bundle's symbolic name.
     *
     * @see Bundle#getSymbolicName()
     */
    public String bsn;

    /**
     * The bundle's version.
     *
     * @see Bundle#getVersion()
     */
    public String version;

    /**
     * The bundle's state.
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
     * The time when the bundle was last modified.
     *
     * @see Bundle#getLastModified()
     */
    public long lastModified;

    /**
     * The list of requirements the bundle needs
     */
    public List<Requirement> requirements;

    /**
     * The list of capabilities the bundle provides
     */
    public List<Capability> capabilities;

}
