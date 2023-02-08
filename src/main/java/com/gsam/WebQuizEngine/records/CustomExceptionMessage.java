/**
 * This exception message can be instantiated to occupy the body of
 * a returned ResponseEntity instance.
 *
 * Because this message is only ever thrown and populated once a
 * record is better suited for its purpose.
 */

package com.gsam.WebQuizEngine.records;

import java.time.LocalDateTime;

public record CustomExceptionMessage(
        int statusCode,
        LocalDateTime timestamp,
        String message,
        String description) {

}
