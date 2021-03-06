package me.study.studyolle.settings.form;

import lombok.Data;
import lombok.NoArgsConstructor;
import me.study.studyolle.domain.Account;

@Data
public class Notification {
    private boolean studyCreatedByEmail;

    private boolean studyCreatedByWeb;

    private boolean studyEnrollmentResultByEmail;

    private boolean studyEnrollmentResultByWeb;

    private boolean studyUpdateByEmail;

    private boolean studyUpdateByWeb;
}
