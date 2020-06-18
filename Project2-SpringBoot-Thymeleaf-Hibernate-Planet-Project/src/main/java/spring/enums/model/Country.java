package spring.enums.model;


import lombok.Getter;

/**
 * @Created 18 / 06 / 2020 - 4:53 PM
 * @project SpringBootEnum
 * @Author Hamdamboy
 */
public enum  Country {

    SPAIN("Spain"),
    USA("United States of America"),
    UK("United Kingdom");

    @Getter
    private String displayName;

    Country(String displayName) {
        this.displayName = displayName;
    }
}
