package org.generateui.gwtMetaData;

public class IconImpl implements Iconw
{
    private String iconLarge = null;
    private String iconMedium = null;
    private String iconSmall = null;

    public IconImpl(String iconLarge, String iconMedium, String iconSmall)
    {
        super();
        this.iconLarge = iconLarge == null ? Resources.icons()
                        .unavailableLarge().getURL() : iconLarge;

        this.iconMedium = iconMedium == null ? Resources.icons()
                        .unavailableMedium().getURL() : iconMedium;

        this.iconSmall = iconSmall == null ? Resources.icons()
                        .unavailableSmall().getURL() : iconSmall;
    }

    @Override
    public String iconLarge()
    {
        return iconLarge;
    }

    @Override
    public String iconMedium()
    {
        return iconMedium;
    }

    @Override
    public String iconSmall()
    {
        return iconSmall;
    }
}