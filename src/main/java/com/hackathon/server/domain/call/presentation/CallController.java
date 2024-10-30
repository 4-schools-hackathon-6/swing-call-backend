package com.hackathon.server.domain.call.presentation;

import com.hackathon.server.domain.call.presentation.dto.request.CallRequest;
import com.hackathon.server.domain.call.service.CallService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/call")
@RequiredArgsConstructor
@Tag(name = "콜 서비스", description = "콜 서비스 관련 api 입니다.")
public class CallController {

    private final CallService callService;

    @PostMapping
    public ResponseEntity<Void> makeScall(@RequestBody CallRequest callRequest) {
        callService.execute(callRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}