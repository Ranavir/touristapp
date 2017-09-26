package com.stl.touristapp.pojo;

import java.util.ArrayList;

public class Tier implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	private int tierId;
    private String tierName;
    private String tierCode;
    private String tierDesc;
    private String tierNotes;
    private String startDate;
    private String endDate;
    private int statusId;
    private String statusCode;
    private ArrayList rulesets;
    private String programCode;
    private String programName;
    private String programDesc;
    private String tierDescription;
    

    public String getTierDescription() {
		return tierDescription;
	}

	public void setTierDescription(String tierDescription) {
		this.tierDescription = tierDescription;
	}

	public Tier() {
    }
   
    public int getTierId() {
        return this.tierId;
    }

    public String getTierName() {
        return this.tierName;
    }

    public String getTierCode() {
        return this.tierCode;
    }

    public String getTierDesc() {
        return this.tierDesc;
    }

    public String getTierNotes() {
        return this.tierNotes;
    }

    public String getStartDate() {
        return this.startDate;
    } 
    
    public String getEndDate() {
        return this.endDate;
    } 
   
    public int getStatusId() {
        return this.statusId;
    }

	public String getStatusCode() {
		return statusCode;
	}

    public ArrayList getRulesets() {
        return this.rulesets;
    }

    public void setTierId(int tierId) {
        this.tierId = tierId;
    }
    
    public void setTierName(String tierName) {
        this.tierName = tierName;
    }

    public void setTierCode(String tierCode) {
        this.tierCode = tierCode;
    }

    public void setTierDesc(String tierDesc) {
        this.tierDesc = tierDesc;
    }
    
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    public void setTierNotes(String tierNotes) {
        this.tierNotes = tierNotes;
    }
    
    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
    
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
    
    public void setRulesets(ArrayList rulesets) {
        this.rulesets = rulesets;
    }

	public String getProgramCode() {
		return programCode;
	}

	public void setProgramCode(String programCode) {
		this.programCode = programCode;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getProgramDesc() {
		return programDesc;
	}

	public void setProgramDesc(String programDesc) {
		this.programDesc = programDesc;
	}
}
