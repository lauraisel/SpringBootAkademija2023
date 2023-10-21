package hr.kingict.springbootakademija2023.dto;

public class LocationDto {


    public LocationDto(String name, String detailName, String iataCode) {
        this.name = name;
        this.detailName = detailName;
        this.iataCode = iataCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    private String name;
    private String detailName;
    private String iataCode;

}
