package cn.kerninventory.demotkmybatis.model;

import javax.persistence.*;

@Table(name = "sys_province")
public class SysProvince {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "province_code")
    private String provinceCode;

    @Column(name = "province_name")
    private String provinceName;

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
     * @return province_code
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * @param provinceCode
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * @return province_name
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * @param provinceName
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}