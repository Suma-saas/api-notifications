package com.sumasaas.models;

import com.sumasaas.interfaces.Topic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigurationSubscriber {
    private Integer id;
    private String companyId;
    private List<Topic> topics;
}
