package com.sumasaas.models;

import com.sumasaas.interfaces.Topic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class TopicNOF implements Topic<Integer> {
    private Integer id;

    public boolean sendNotification(Integer value) {
        return true;
    }
}
