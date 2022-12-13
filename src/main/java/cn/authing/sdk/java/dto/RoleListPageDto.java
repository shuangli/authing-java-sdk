package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.RolePermissionListDto;

public class RoleListPageDto {
    /**
     * 记录总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 响应数据
     */
    @JsonProperty("data")
    private List<RolePermissionListDto> data;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<RolePermissionListDto> getData() {
        return data;
    }
    public void setData(List<RolePermissionListDto> data) {
        this.data = data;
    }



}