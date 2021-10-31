package web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BearPagedList extends PageImpl<BearDto> {

    public BearPagedList(List<BearDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BearPagedList(List<BearDto> content) {
        super(content);
    }
}
