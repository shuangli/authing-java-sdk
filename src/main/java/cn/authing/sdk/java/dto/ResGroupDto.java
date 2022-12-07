package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ResGroupDto {
    /**
     * 分组 code
     */
    @JsonProperty("code")
    private String code;
    /**
     * 分组名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 分组描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 分组类型
     */
    @JsonProperty("type")
    private String type;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }



}