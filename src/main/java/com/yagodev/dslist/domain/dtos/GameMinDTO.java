package com.yagodev.dslist.domain.dtos;

import com.yagodev.dslist.domain.entities.Game;
import com.yagodev.dslist.domain.projections.GameMinProjection;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@NoArgsConstructor
@Data
public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public GameMinDTO(GameMinProjection projection) {
        BeanUtils.copyProperties(projection, this);
    }
}
