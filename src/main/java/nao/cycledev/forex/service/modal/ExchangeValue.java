package nao.cycledev.forex.service.modal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeValue {
    @Id
    @Getter
    private long id;

    @Column(name="currency_from")
    @Getter
    private String from;

    @Column(name="currency_to")
    @Getter
    private String to;

    @Getter
    private BigDecimal conversionMultiple;

    @Getter @Setter
    private int port;
}
