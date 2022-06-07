package com.example.patterns.template;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@Api(tags = "Template method file parser controller")
@RequiredArgsConstructor
public class FileParserController {


    private final List<FileParser> fileParser;


    @GetMapping("/template/{parser-type}")
    public void parseTxtFile(@PathVariable(value = "parser-type") String parserType) {
        fileParser.forEach(parser -> {
            if (parser.getClass().getSimpleName().contains(parserType)) {
                parser.parse();
            }
        });
    }

}
