package demo.entity;

import com.xieshizhen.target.Column;
import com.xieshizhen.target.Table;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Kitetop <1363215999@qq.com>
 * @version Release: v1.0
 * Date: 2019/07/20
 * @Description the depart entity
 */
@Table(value = "manage_depart")
public class DepartEntity {
    private Integer id;
    @NotNull(message = "the depart name can not be null")
    @Column(name = "depart")
    private String depart;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart.trim();
    }

    @Override
    public String toString() {
        return "DepartEntity{" +
                "id=" + id +
                ", depart='" + depart + '\'' +
                '}';
    }
}