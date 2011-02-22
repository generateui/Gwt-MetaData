package org.generateui.gwtMetaData;

import org.generateui.gwtMetaData.icons.Icons;

import com.google.gwt.core.client.GWT;

public class Resources
{
    private static Icons icons = GWT.create(Icons.class);

    public static Icons icons()
    {
        return icons;
    }
}