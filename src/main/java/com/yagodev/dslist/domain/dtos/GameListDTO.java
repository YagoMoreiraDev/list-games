package com.yagodev.dslist.domain.dtos;

import com.yagodev.dslist.domain.entities.GameList;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@NoArgsConstructor
@Data
public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(GameList entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
