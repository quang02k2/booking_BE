package com.web.enums;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PayStatus {

    DEPOSITED,
    PAID,
    CANCELLED;
}
