package com.macro.sweets.sweets-mbg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author li_binqiang
 * @since 2020-10-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Upsteps implements Serializable {

    private static final long serialVersionUID=1L;

    private String phone;

    private String password;

    private String steps;

    private Integer flag;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String msg;


}
