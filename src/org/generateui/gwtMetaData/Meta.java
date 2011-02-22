package org.generateui.gwtMetaData;

import javax.swing.Icon;

public interface Meta extends HasMeta
{
    public String getName();

    public String getLocalizedName();

    public String getDescription();

    public Icon icon();

    public String gwtWikiTag();
}
