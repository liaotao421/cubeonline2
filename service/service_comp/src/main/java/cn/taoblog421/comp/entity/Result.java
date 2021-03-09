package cn.taoblog421.comp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author liaotao
 * @since 2021-03-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Result对象", description="")
public class Result implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    private String pid;

    private String cid;

    private String eid;

    private Double t1;

    private Double t2;

    private Double t3;

    private Double t4;

    private Double t5;

    private Double single;

    private Double result;

    private Integer isDeleted;

    private Date gmtCreate;

    private Date gmtModified;


}
