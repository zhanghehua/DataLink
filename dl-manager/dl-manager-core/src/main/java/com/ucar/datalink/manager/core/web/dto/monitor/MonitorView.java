package com.ucar.datalink.manager.core.web.dto.monitor;

import java.util.Date;

/**
 * Created by csf on 17/4/28.
 */
public class MonitorView {

    private Long id;

    private Long resourceId;

    private String resourceName;

    private Integer isEffective;

    private Integer threshold;

    private Long intervalTime;

    private String receivePeople;

    private Integer monitorType;

    private Integer monitorCat;

    private String alarmTemplate;

    private Date createTime;

    private Date modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public Long getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(Long intervalTime) {
        this.intervalTime = intervalTime;
    }

    public String getReceivePeople() {
        return receivePeople;
    }

    public void setReceivePeople(String receivePeople) {
        this.receivePeople = receivePeople;
    }

    public Integer getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(Integer monitorType) {
        this.monitorType = monitorType;
    }

    public Integer getMonitorCat() {
        return monitorCat;
    }

    public void setMonitorCat(Integer monitorCat) {
        this.monitorCat = monitorCat;
    }

    public String getAlarmTemplate() {
        return alarmTemplate;
    }

    public void setAlarmTemplate(String alarmTemplate) {
        this.alarmTemplate = alarmTemplate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
