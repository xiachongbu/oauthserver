package com.simon.model;

import com.simon.common.utils.SnowflakeGenId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
* @author SimonSun
* @create 2018-09-12
**/
@ApiModel(value = "字典")
@Data
@Entity
@Table(name="t_dict_type")
public class DictType implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @KeySql(genId = SnowflakeGenId.class)
    @GeneratedValue(generator = "sequenceId")
    @GenericGenerator(name = "sequenceId", strategy = "com.simon.common.utils.snowflake.SequenceId")
    private Long id;

    @ApiModelProperty(value = "创建人id")
    @Column(name = "create_by")
    private Long createBy;

    @ApiModelProperty(value = "创建时间")
    @Column(name = "create_date")
    private Date createDate;

    @ApiModelProperty(value = "更新人id")
    @Column(name = "update_by")
    private Long updateBy;

    @ApiModelProperty(value = "更新时间")
    @Column(name = "update_date")
    private Date updateDate;

    @ApiModelProperty(value = "字典编码")
    @Column(name = "type_code", nullable = false)
    private String typeCode;

    @ApiModelProperty(value = "字典编码名称")
    @Column(name = "type_name", nullable = false)
    private String typeName;

    @ApiModelProperty(value = "字典组id")
    @Column(name = "type_group_id", nullable = false)
    private Long typeGroupId;

    @ApiModelProperty(value = "排序")
    @Column(name = "order_num")
    private Integer orderNum;
}