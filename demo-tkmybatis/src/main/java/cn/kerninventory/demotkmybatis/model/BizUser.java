package cn.kerninventory.demotkmybatis.model;

import javax.persistence.*;

@Table(name = "biz_user")
public class BizUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
}