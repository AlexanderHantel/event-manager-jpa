package com.hantel.event_manager.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ConcertEventManagementControllerDTO {
    private String date;
    private String time;
    private String vacantSeatsAmount;
}
