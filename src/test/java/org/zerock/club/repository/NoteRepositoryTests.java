package org.zerock.club.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class NoteRepositoryTests {

    @Autowired
    private NoteRepository noteRepository;

    @Test
    public void testListByEmail() {

        String email ="user10@zerock.org";

        noteRepository.getList(email).forEach(note -> System.out.println(note));

    }
}
