package Distance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfLocation {
    private String name;
    private Double longitude;
    private Double latitude;
}
