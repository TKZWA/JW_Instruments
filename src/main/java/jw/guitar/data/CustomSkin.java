package jw.guitar.data;

import jw.fluent_api.logger.OldLogger;
import jw.fluent_api.utilites.files.yml.api.annotations.YmlProperty;
import jw.fluent_api.utilites.java.JavaUtils;
import lombok.Data;
import org.bukkit.Material;


@Data
public class CustomSkin
{
    @YmlProperty
    private String name = JavaUtils.EMPTY_STRING;

    @YmlProperty
    private String parent = JavaUtils.EMPTY_STRING;

    @YmlProperty(name = "custom-model-id")
    private Integer customModelId;

    @YmlProperty(name = "crafting-material")
    private String craftingMaterial = JavaUtils.EMPTY_STRING;


    public Material getMaterial()
    {
        var value = craftingMaterial;
        value = value.toUpperCase();
        value = value.replace(" ","_");
        OldLogger.info("skin name",value);
        return Material.getMaterial(value);
    }
}
