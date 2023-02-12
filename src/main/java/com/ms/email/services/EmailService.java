package com.ms.email.services;

import com.ms.email.models.EmailModel;
import com.ms.email.repositories.EmailRepository;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    final EmailRepository emailRepository;

    public EmailService(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    public void sendEmail(EmailModel emailModel) {




    }
}
