package in.bytehue.neo4j.osgi.modeller.dto;

import java.util.Map;

/**
 * A representation of a declared component description.
 *
 * @since 1.3
 * @NotThreadSafe
 * @author $Id: 78df935bfa8eb02c69a3cb60df108fa2b459261c $
 */
public class ComponentDescription extends DTO {
    /**
     * The name of the component.
     *
     * <p>
     * This is declared in the {@code name} attribute of the {@code component}
     * element. This must be the default name if the component description does
     * not declare a name.
     */
    public String name;

    /**
     * The bundle declaring the component description.
     */
    public Bundle bundle;

    /**
     * The component factory name.
     *
     * <p>
     * This is declared in the {@code factory} attribute of the
     * {@code component} element. This must be {@code null} if the component
     * description is not declared as a factory component.
     */
    public String factory;

    /**
     * The service scope.
     *
     * <p>
     * This is declared in the {@code scope} attribute of the {@code service}
     * element. This must be {@code null} if the component description does not
     * declare any service interfaces.
     */
    public String scope;

    /**
     * The fully qualified name of the implementation class.
     *
     * <p>
     * This is declared in the {@code class} attribute of the
     * {@code implementation} element.
     */
    public String implementationClass;

    /**
     * The initial enabled state.
     *
     * <p>
     * This is declared in the {@code enabled} attribute of the
     * {@code component} element.
     */
    public boolean defaultEnabled;

    /**
     * The immediate state.
     *
     * <p>
     * This is declared in the {@code immediate} attribute of the
     * {@code component} element.
     */
    public boolean immediate;

    /**
     * The fully qualified names of the service interfaces.
     *
     * <p>
     * These are declared in the {@code interface} attribute of the
     * {@code provide} elements. The array must be empty if the component
     * description does not declare any service interfaces.
     */
    public String[] serviceInterfaces;

    /**
     * The component properties.
     * <p>
     * These are declared in the component description by the {@code property}
     * and {@code properties} elements as well as the {@code target} attribute
     * of the {@code reference} elements.
     */
    public Map<String, Object> properties;

    /**
     * The referenced services.
     *
     * <p>
     * These are declared in the {@code reference} elements. The array must be
     * empty if the component description does not declare references to any
     * services.
     */
    public Reference[] references;

    /**
     * The name of the activate method.
     *
     * <p>
     * This is declared in the {@code activate} attribute of the
     * {@code component} element. This must be {@code null} if the component
     * description does not declare an activate method name.
     */
    public String activate;

    /**
     * The name of the deactivate method.
     *
     * <p>
     * This is declared in the {@code deactivate} attribute of the
     * {@code component} element. This must be {@code null} if the component
     * description does not declare a deactivate method name.
     */
    public String deactivate;

    /**
     * The name of the modified method.
     *
     * <p>
     * This is declared in the {@code modified} attribute of the
     * {@code component} element. This must be {@code null} if the component
     * description does not declare a modified method name.
     */
    public String modified;

    /**
     * The configuration policy.
     *
     * <p>
     * This is declared in the {@code configuration-policy} attribute of the
     * {@code component} element. This must be the default configuration policy
     * if the component description does not declare a configuration policy.
     */
    public String configurationPolicy;

    /**
     * The configuration pids.
     *
     * <p>
     * These are declared in the {@code configuration-pid} attribute of the
     * {@code component} element. This must contain the default configuration
     * pid if the component description does not declare a configuration pid.
     */
    public String[] configurationPid;

    /**
     * The factory properties.
     * <p>
     * These are declared in the component description by the
     * {@code factory-property} and {@code factory-properties} elements. This
     * must be {@code null} if the component description is not declared as a
     * {@link #factory factory component}.
     *
     * @since 1.4
     */
    public Map<String, Object> factoryProperties;

    /**
     * The activation fields.
     * <p>
     * These are declared in the {@code activation-fields} attribute of the
     * {@code component} element. The array must be empty if the component
     * description does not declare any activation fields.
     *
     * @since 1.4
     */
    public String[] activationFields;

    /**
     * The constructor parameter count.
     * <p>
     * This is declared in the {@code init} attribute of the {@code component}
     * element. This must be {@code 0} if the component description does not
     * declare an {@code init} attribute.
     *
     * @since 1.4
     */
    public int init;
}
