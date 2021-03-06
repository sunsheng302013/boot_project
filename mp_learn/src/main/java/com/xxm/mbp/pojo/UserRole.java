package com.xxm.mbp.pojo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author xiaoming.xian
 * @since 2019-09-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserRole extends Model<UserRole> {

    private static final long serialVersionUID=1L;

    private Integer uid;

    private Integer rid;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
