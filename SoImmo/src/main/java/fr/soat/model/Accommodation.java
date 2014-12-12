package fr.soat.model;

import java.util.Date;

public class Accommodation {

	private long id;
	
    private Address address;

    private Double surface;

    private Integer rooms;

    private Boolean elevator;

    private Double rent;

    private Double charge;

    private Date availableFrom;

    private Boolean active;

    private AccommodationType type;

    private HotWaterProductionType hotWaterProductionType;

	private HeatingType heatingType;

	public Accommodation() {
	}

	public Accommodation(long id, Address address, Double surface, Integer rooms, Boolean elevator, Double rent, Double charge, Date availableFrom, Boolean active, AccommodationType type, HotWaterProductionType hotWaterProductionType, HeatingType heatingType) {
		this.id = id;
		this.address = address;
        this.surface = surface;
        this.rooms = rooms;
        this.elevator = elevator;
        this.rent = rent;
        this.charge = charge;
        this.availableFrom = availableFrom;
        this.active = active;
        this.type = type;
        this.hotWaterProductionType = hotWaterProductionType;
        this.heatingType = heatingType;
    }

    public Boolean getActive() {
        return active;
    }

    public Address getAddress() {
        return address;
    }

    public Date getAvailableFrom() {
        return availableFrom;
    }

    public Double getCharge() {
        return charge;
    }

    public Boolean getElevator() {
        return elevator;
    }

    public HeatingType getHeatingType() {
        return heatingType;
    }

    public HotWaterProductionType getHotWaterProductionType() {
        return hotWaterProductionType;
    }

    public long getId() {
		return id;
	}

    public Double getRent() {
        return rent;
    }

    public Integer getRooms() {
        return rooms;
    }

    public Double getSurface() {
        return surface;
    }

    public AccommodationType getType() {
        return type;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAvailableFrom(Date availableFrom) {
        this.availableFrom = availableFrom;
    }

    public void setCharge(Double charge) {
        this.charge = charge;
    }

    public void setElevator(Boolean elevator) {
        this.elevator = elevator;
    }

    public void setHeatingType(HeatingType heatingType) {
        this.heatingType = heatingType;
    }

    public void setHotWaterProductionType(HotWaterProductionType hotWaterProductionType) {
        this.hotWaterProductionType = hotWaterProductionType;
    }

    public void setId(long id) {
		this.id = id;
	}

    public void setRent(Double rent) {
        this.rent = rent;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public void setSurface(Double surface) {
        this.surface = surface;
    }

    public void setType(AccommodationType type) {
        this.type = type;
    }

	@Override
	public String toString() {
		return "Accommodation [id=" + id + ", address=" + address
				+ ", surface=" + surface + ", rooms=" + rooms + ", elevator="
				+ elevator + ", rent=" + rent + ", charge=" + charge
				+ ", availableFrom=" + availableFrom + ", active=" + active
				+ ", type=" + type + ", hotWaterProductionType="
				+ hotWaterProductionType + ", heatingType=" + heatingType + "]";
	}
}
