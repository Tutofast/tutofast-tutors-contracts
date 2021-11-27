package com.arkisoftware.tutors.contracts.events;

import lombok.Value;

import java.time.Instant;

@Value
public class TutorRegistered {
    String tutorId;
    String firstName;
    String lastName;
    String dni;
    Instant ocurredOn;
}
