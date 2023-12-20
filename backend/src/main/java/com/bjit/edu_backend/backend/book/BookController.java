package com.bjit.edu_backend.backend.book;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/books")
public class BookController {
        private final BookService service;

        @PostMapping
        public ResponseEntity<?> save(
                @RequestBody BookRequest request
        ) {
            service.save(request);
            return ResponseEntity.accepted().build();
        }

        @GetMapping
        public ResponseEntity<List<Book>> findAllBooks() {
            return ResponseEntity.ok(service.findAll());
        }

}