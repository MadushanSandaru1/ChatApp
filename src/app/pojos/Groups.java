package app.pojos;
// Generated Dec 18, 2020 3:57:46 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Groups generated by hbm2java
 */
public class Groups  implements java.io.Serializable {


     private Integer id;
     private byte[] icon;
     private String name;
     private String description;
     private Date createdDate;
     private Date createdTime;
     private byte status;
     private byte isDeleted;

    public Groups() {
    }

	
    public Groups(String name, Date createdDate, Date createdTime, byte status, byte isDeleted) {
        this.name = name;
        this.createdDate = createdDate;
        this.createdTime = createdTime;
        this.status = status;
        this.isDeleted = isDeleted;
    }
    public Groups(byte[] icon, String name, String description, Date createdDate, Date createdTime, byte status, byte isDeleted) {
       this.icon = icon;
       this.name = name;
       this.description = description;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
       this.status = status;
       this.isDeleted = isDeleted;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public byte[] getIcon() {
        return this.icon;
    }
    
    public void setIcon(byte[] icon) {
        this.icon = icon;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public Date getCreatedTime() {
        return this.createdTime;
    }
    
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
    public byte getStatus() {
        return this.status;
    }
    
    public void setStatus(byte status) {
        this.status = status;
    }
    public byte getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(byte isDeleted) {
        this.isDeleted = isDeleted;
    }




}


