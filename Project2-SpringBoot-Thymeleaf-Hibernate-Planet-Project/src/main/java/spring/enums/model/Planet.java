package spring.enums.model;

/**
 * @Created 18 / 06 / 2020 - 4:47 PM
 * @project SpringBootEnum
 * @Author Hamdamboy
 */
public enum Planet {

    MERCURY("mercurity"),
    VENUS("venus"),
    EARTH("earth"),
    MARS("mars"),
    JUPITER("mars"),
    SATURN("saturn"),
    URANUS("uranus"),
    NEPTUNE("neptune");

    private final String displayValue;

    Planet(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }


}
