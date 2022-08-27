// Generated with g9.

package com.crud.sql.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="provider")
public class Provider implements Serializable {

    /** Primary key. */
    protected static final String PK = "code";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(unique=true, nullable=false, length=4)
    private String code;
    @Column(length=100)
    private String name;
    @OneToMany(mappedBy="provider")
    private Set<Supply> supply;

    /** Default constructor. */
    public Provider() {
        super();
    }

    /**
     * Access method for code.
     *
     * @return the current value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for code.
     *
     * @param aCode the new value for code
     */
    public void setCode(String aCode) {
        code = aCode;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
    }

    /**
     * Access method for supply.
     *
     * @return the current value of supply
     */
    public Set<Supply> getSupply() {
        return supply;
    }

    /**
     * Setter method for supply.
     *
     * @param aSupply the new value for supply
     */
    public void setSupply(Set<Supply> aSupply) {
        supply = aSupply;
    }

    /**
     * Compares the key for this instance with another Provider.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Provider and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Provider)) {
            return false;
        }
        Provider that = (Provider) other;
        Object myCode = this.getCode();
        Object yourCode = that.getCode();
        if (myCode==null ? yourCode!=null : !myCode.equals(yourCode)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Provider.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Provider)) return false;
        return this.equalKeys(other) && ((Provider)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        if (getCode() == null) {
            i = 0;
        } else {
            i = getCode().hashCode();
        }
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Provider |");
        sb.append(" code=").append(getCode());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("code", getCode());
        return ret;
    }

}
