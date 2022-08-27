// Generated with g9.

package com.crud.sql.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="supply")
public class Supply implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int id;
    private LocalDateTime registeredAt;
    private double price;
    @ManyToOne
    @JoinColumn(name="piece_id")
    private Piece piece;
    @ManyToOne
    @JoinColumn(name="provider_code")
    private Provider provider;

    /** Default constructor. */
    public Supply() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for registeredAt.
     *
     * @return the current value of registeredAt
     */
    public LocalDateTime getRegisteredAt() {
        return registeredAt;
    }

    /**
     * Setter method for registeredAt.
     *
     * @param aRegisteredAt the new value for registeredAt
     */
    public void setRegisteredAt(LocalDateTime aRegisteredAt) {
        registeredAt = aRegisteredAt;
    }

    /**
     * Access method for price.
     *
     * @return the current value of price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setter method for price.
     *
     * @param aPrice the new value for price
     */
    public void setPrice(double aPrice) {
        price = aPrice;
    }

    /**
     * Access method for piece.
     *
     * @return the current value of piece
     */
    public Piece getPiece() {
        return piece;
    }

    /**
     * Setter method for piece.
     *
     * @param aPiece the new value for piece
     */
    public void setPiece(Piece aPiece) {
        piece = aPiece;
    }

    /**
     * Access method for provider.
     *
     * @return the current value of provider
     */
    public Provider getProvider() {
        return provider;
    }

    /**
     * Setter method for provider.
     *
     * @param aProvider the new value for provider
     */
    public void setProvider(Provider aProvider) {
        provider = aProvider;
    }

    /**
     * Compares the key for this instance with another Supply.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Supply and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Supply)) {
            return false;
        }
        Supply that = (Supply) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Supply.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Supply)) return false;
        return this.equalKeys(other) && ((Supply)other).equalKeys(this);
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
        i = getId();
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
        StringBuffer sb = new StringBuffer("[Supply |");
        sb.append(" id=").append(getId());
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
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

}
