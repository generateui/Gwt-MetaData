package org.generateui.gwtMetaData;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Stub annotation to tag code for CitiesKnights ruleset
 * @see <a href="http://www.ibm.com/developerworks/library/j-annotate2.html">Annotations in Tiger, Part 2: Custom annotations</a>
 */

//Class, interface, or enum (but not annotation)
@Target(
{ ElementType.TYPE })
// No need to keep this annotation at runtime 
@Retention(RetentionPolicy.SOURCE)
public @interface MetaData
{
    public String name();

    public String localizedName();

    public String description();

    public String wikiPage();

    public String iconSmall();

    public String iconMedium();

    public String iconLarge();

    public String icon64();

    public String icon128();

    public String icon256();
}
