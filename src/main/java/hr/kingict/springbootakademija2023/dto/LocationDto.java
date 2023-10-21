package hr.kingict.springbootakademija2023.dto;

public class LocationDto {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocationDto(String name) {
        this.name = name;
    }

    private String name;

}
