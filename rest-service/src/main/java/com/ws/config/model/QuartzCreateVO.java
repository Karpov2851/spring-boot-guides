package com.ws.config.model;


import org.quartz.JobDataMap;

/**
 * Created by vikas on 02-07-2019.
 */
public class QuartzCreateVO implements java.io.Serializable{

    private Class T;
    private JobDataMap jobDataMap;
    private String qrtzIdent;
    private String qrtzDesc;
    private String dateString;
    private String triggerName;
    private String triggDesc;
    private Integer repeatCount;
    private int interval;
    private String endDateTime;

    public QuartzCreateVO(Class t, JobDataMap jobDataMap, String qrtzIdent, String qrtzDesc, String dateString, String triggerName, String triggDesc,
                          Integer repeatCount, int interval) {
        T = t;
        this.jobDataMap = jobDataMap;
        this.qrtzIdent = qrtzIdent;
        this.qrtzDesc = qrtzDesc;
        this.dateString = dateString;
        this.triggerName = triggerName;
        this.triggDesc = triggDesc;
        this.repeatCount = repeatCount;
        this.interval = interval;
    }

    public JobDataMap getJobDataMap() {
        return jobDataMap;
    }

    public void setJobDataMap(JobDataMap jobDataMap) {
        this.jobDataMap = jobDataMap;
    }

    public String getQrtzIdent() {
        return qrtzIdent;
    }

    public void setQrtzIdent(String qrtzIdent) {
        this.qrtzIdent = qrtzIdent;
    }

    public String getQrtzDesc() {
        return qrtzDesc;
    }

    public void setQrtzDesc(String qrtzDesc) {
        this.qrtzDesc = qrtzDesc;
    }

    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggDesc() {
        return triggDesc;
    }

    public void setTriggDesc(String triggDesc) {
        this.triggDesc = triggDesc;
    }

    public Integer getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(Integer repeatCount) {
        this.repeatCount = repeatCount;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public Class getT() {
        return T;
    }

    public void setT(Class t) {
        T = t;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    @Override
    public String toString() {
        return "QuartzCreateVO{" +
                "jobDataMap=" + jobDataMap +
                ", qrtzIdent='" + qrtzIdent + '\'' +
                ", qrtzDesc='" + qrtzDesc + '\'' +
                ", dateString='" + dateString + '\'' +
                ", triggerName='" + triggerName + '\'' +
                ", triggDesc='" + triggDesc + '\'' +
                ", repeatCount='" + repeatCount + '\'' +
                ", interval='" + interval + '\'' +
                '}';
    }
}
