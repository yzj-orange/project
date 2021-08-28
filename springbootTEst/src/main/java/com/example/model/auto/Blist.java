package com.example.model.auto;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author astupidcoder
 * @since 2021-08-22
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Blist extends Model {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String supplier;

    private String itemname;

    private Integer quantity;

    private String amount;

    private String paid;

    private String date;


}
