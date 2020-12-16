package in.bytehue.neo4j.osgi.modeller.dto;

import java.util.Map;

import org.osgi.framework.Constants;
import org.osgi.framework.ServiceReference;

/**
 * Entity representation of a service capability
 */
public class ServiceCapability extends Capability {

    /**
     * The id of the service.
     *
     * @see Constants#SERVICE_ID
     */
    public long id;

    /**
     * The properties for the service.
     *
     * The value type must be a numerical type, Boolean, String, DTO or an array
     * of any of the former.
     *
     * @see ServiceReference#getProperty(String)
     */
    public Map<String, Object> properties;

    /**
     * The bundle that registered the service.
     *
     * @see ServiceReference#getBundle()
     */
    public Bundle registeredBundle;

    /**
     * The bundles that are using the service.
     *
     * @see ServiceReference#getUsingBundles()
     */
    public Bundle[] usingBundles;

    /**
     * The declared component description info if the service is registered using SCR
     */
    public ComponentDescription component;
}
