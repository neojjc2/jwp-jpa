package jpa.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Location extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Station startStation;

    @ManyToOne(fetch = FetchType.LAZY)
    private Station endStation;

    @ManyToOne(fetch = FetchType.LAZY)
    private Line line;

    @Embedded
    private Distance distance;

    @Builder
    public Location(long id, Station startStation, Station endStation, Line line, long distance) {
        this.id = id;
        this.startStation = startStation;
        this.endStation = endStation;
        this.line = line;
        this.distance = new Distance(distance);
    }
}
