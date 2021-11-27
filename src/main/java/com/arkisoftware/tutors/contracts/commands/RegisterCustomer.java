package com.arkisoftware.tutors.contracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class RegisterCustomer {
    @TargetAggregateIdentifier
    String tutorId;
    String firstName;
    String lastName;
    String dni;
}