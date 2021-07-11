package tut.hibernate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;

@Entity
public class MachineEntity implements Serializable {

    @Id
    private String machineId;
    String timeTurnedOm;
    Long temperature;
    Long pressure;


    public MachineEntity(String machineId, String timeTurnedOm, Long temperature, Long pressure) {
        this.machineId = machineId;
        this.timeTurnedOm = timeTurnedOm;
        this.temperature = temperature;
        this.pressure = pressure;
    }


    public MachineEntity() {

    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public String getTimeTurnedOm() {
        return timeTurnedOm;
    }

    public void setTimeTurnedOm(String timeTurnedOm) {
        this.timeTurnedOm = timeTurnedOm;
    }

    public Long getTemperature() {
        return temperature;
    }

    public void setTemperature(Long temperature) {
        this.temperature = temperature;
    }

    public Long getPressure() {
        return pressure;
    }

    public void setPressure(Long pressure) {
        this.pressure = pressure;
    }


    //HashMap<Long, HashMap<String, String>> ValueMap;
}
