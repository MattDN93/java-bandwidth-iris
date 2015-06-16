package com.bandwidth.iris.sdk.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by sbarstow on 6/16/15.
 */
@XmlRootElement(name = "ActivationStatus")
@XmlAccessorType(XmlAccessType.FIELD)
public class ActivationStatus {
    @XmlElement(name = "AutoActivationDate")
    private Date autoActivationDate;

    @XmlElementWrapper(name = "ActivatedTelephoneNumberList")
    @XmlElement(name = "TelephoneNumber")
    private List<String> activatedTelephoneNumberList = new ArrayList<String>();

    @XmlElementWrapper(name = "NotYetActivatedTelephoneNumberList")
    @XmlElement(name = "TelephoneNumber")
    private List<String> notYetActivatedTelephoneNumberList = new ArrayList<String>();

    public Date getAutoActivationDate() {
        return autoActivationDate;
    }

    public void setAutoActivationDate(Date autoActivationDate) {
        this.autoActivationDate = autoActivationDate;
    }

    public List<String> getActivatedTelephoneNumberList() {
        return activatedTelephoneNumberList;
    }

    public void setActivatedTelephoneNumberList(List<String> activatedTelephoneNumberList) {
        this.activatedTelephoneNumberList = activatedTelephoneNumberList;
    }

    public List<String> getNotYetActivatedTelephoneNumberList() {
        return notYetActivatedTelephoneNumberList;
    }

    public void setNotYetActivatedTelephoneNumberList(List<String> notYetActivatedTelephoneNumberList) {
        this.notYetActivatedTelephoneNumberList = notYetActivatedTelephoneNumberList;
    }
}
