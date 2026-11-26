
package io.github.makuyajr.flowtrack;

import java.time.LocalDateTime;


public class Report {
    
    private Long id;
    private String type;
    private String area;
    private String description;
    private String status;
    private LocalDateTime reportedAt;
    private LocalDateTime fixedAt;
    
    public Report() {
}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getReportedAt() {
        return reportedAt;
    }

    public void setReportedAt(LocalDateTime reportedAt) {
        this.reportedAt = reportedAt;
    }

    public LocalDateTime getFixedAt() {
        return fixedAt;
    }

    public void setFixedAt(LocalDateTime fixedAt) {
        this.fixedAt = fixedAt;
    }
    
    
    
    
}
