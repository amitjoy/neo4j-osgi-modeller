package in.bytehue.neo4j.osgi.modeller.dto;

import java.lang.reflect.Field;
import java.util.StringJoiner;

public abstract class DTO {

    /**
     * Return a string representation of this DTO suitable for use when debugging.
     *
     * <p>
     * The format of the string representation is not specified and subject to
     * change.
     *
     * @return A string representation of this DTO suitable for use when debugging.
     */
    @Override
    public String toString() {
        final StringJoiner joiner = new StringJoiner(", ");
        for (final Field f : getClass().getFields()) {
            try {
                joiner.add(f.getName() + " = " + f.get(this));
            } catch (final IllegalAccessException e) {
                // pass, don't print
            }
        }
        return "[" + joiner.toString() + "]";
    }

}