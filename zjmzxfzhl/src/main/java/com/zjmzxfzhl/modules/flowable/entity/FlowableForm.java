package com.zjmzxfzhl.modules.flowable.entity;

import javax.validation.constraints.NotNull;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zjmzxfzhl.common.base.BaseEntity;
import com.zjmzxfzhl.common.validator.constraints.LengthForUtf8;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 庄金明
 * @date 2020年3月23日
 */
@Getter
@Setter
@TableName("T_FLOWABLE_FORM")
public class FlowableForm extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@TableId
	@NotNull
	@LengthForUtf8(max = 100)
	private String formKey;

	@NotNull
	@LengthForUtf8(max = 100)
	private String formName;

	private String formJson;
}