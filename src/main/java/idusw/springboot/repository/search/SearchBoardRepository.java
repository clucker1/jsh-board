package idusw.springboot.repository.search;

import idusw.springboot.entity.BoardEntity;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface SearchBoardRepository {
    BoardEntity searchBoard();
    Page<Object[]> searchPage(String type, String keyword, Pageable pageable);

    Page<Object[]> searchPage(String type, String keyword, org.springframework.data.domain.Pageable pageable);
}
