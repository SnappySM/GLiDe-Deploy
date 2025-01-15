package edu.upc.gessi.glidebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerGamificationDto {
    private Long id;
    private String playername;
    private String gameSubjectAcronym;
    private Integer gameCourse;
    private String gamePeriod;
}
