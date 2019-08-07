package com.middle.advanced.test.classlife;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhe.ding
 * @date 2019-07-19
 */
public class LoanInfoDto implements Serializable {

    private String erpNo;

    private String loanNo;

    private List<String> snNos;

    public String getErpNo() {
        return erpNo;
    }

    public void setErpNo(String erpNo) {
        this.erpNo = erpNo;
    }

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public List<String> getSnNos() {
        return snNos;
    }

    public void setSnNos(List<String> snNos) {
        this.snNos = snNos;
    }
}
