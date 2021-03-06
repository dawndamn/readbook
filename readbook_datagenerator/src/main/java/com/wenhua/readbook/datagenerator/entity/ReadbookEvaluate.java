package com.wenhua.readbook.datagenerator.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 书籍评价表
 * </p>
 *
 * @author testjava
 * @since 2020-03-18
 */
@Component
@ComponentScan
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ReadbookEvaluate对象", description="书籍评价表")
public class ReadbookEvaluate implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "书籍评价id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "评价内容")
    private String text;

    @ApiModelProperty(value = "书籍id")
    private Integer bookId;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @ApiModelProperty(value = "星星数")
    private String star;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)//自动填充标识

    private Date createTime;

    @ApiModelProperty(value = "更改时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)

    private Date updateTime;


}
