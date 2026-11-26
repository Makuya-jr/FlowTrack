package io.github.makuyajr.flowtrack;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    private final List<Report> reports = new CopyOnWriteArrayList<>();
    private final AtomicLong nextId = new AtomicLong(1);

    @PostMapping
    public Report createReport(@RequestBody Report report) {
        report.setId(nextId.getAndIncrement());
        report.setStatus("REPORTED");
        report.setReportedAt(LocalDateTime.now());
        reports.add(report);
        return report;
    }

    @GetMapping
    public List<Report> getAllReports() {
        return reports;
    }
}
