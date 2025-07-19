package com.aluo.rabbit.common.constants;

/**
 * @author edz
 * @version V1.0
 * @Package com.aluo.rabbit.common.constants
 * @date 2025/7/19 17:42
 */
public enum DelayTypeEnum {

    DELAY_10s(1, "延时10s"),
    DELAY_60s(2, "延时60s");

    private Integer code;
    private String desc;

    DelayTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static DelayTypeEnum getDelayTypeEnumByValue(Integer code){
        for (DelayTypeEnum value : DelayTypeEnum.values()) {
            if (value.getCode().equals(code)){
                return value;
            }
        }
        return null;
    }
}
