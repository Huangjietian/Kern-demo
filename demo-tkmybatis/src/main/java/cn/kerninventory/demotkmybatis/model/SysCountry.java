package cn.kerninventory.demotkmybatis.model;

import javax.persistence.*;

@Table(name = "sys_country")
public class SysCountry {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "country_name")
    private String countryName;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return country_code
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return country_name
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}