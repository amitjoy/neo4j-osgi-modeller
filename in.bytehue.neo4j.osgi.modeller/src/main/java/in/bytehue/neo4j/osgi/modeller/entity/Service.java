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
