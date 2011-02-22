package org.generateui.gwtMetaData.icons;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface Icons extends ClientBundle
{
    @Source("size16/Unavailable.png")
    public ImageResource unavailableSmall();

    @Source("size32/Unavailable.png")
    public ImageResource unavailableMedium();

    @Source("size48/Unavailable.png")
    public ImageResource unavailableLarge();

    @Source("size64/Unavailable.png")
    public ImageResource unavailable64();

    @Source("size128/Unavailable.png")
    public ImageResource unavailable128();

    @Source("size256/Unavailable.png")
    public ImageResource unavailable256();
}
