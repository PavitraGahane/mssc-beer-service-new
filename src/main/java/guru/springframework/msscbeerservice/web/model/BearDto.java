package guru.springframework.msscbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BearDto {
    private UUID id;
    private Integer version;

    private OffsetDateTime createDate;
    private OffsetDateTime lastModifiedDate;

    private String bearName;

    private BearStyleEnum bearStyle;

    private Long upc;

    private BigDecimal price;

    private Integer quantityOnHand;



}
