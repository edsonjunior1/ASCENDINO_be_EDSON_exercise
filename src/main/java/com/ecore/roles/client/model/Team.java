package com.ecore.roles.client.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Team {

    private UUID id;
    private String name;
    private UUID teamLeadId;
    private List<UUID> teamMemberIds;
}