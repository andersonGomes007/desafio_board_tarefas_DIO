package service;

import lombok.Data;
import persistence.config.dao.BoardColumnDAO;
import persistence.config.entity.BoardColumnEntity;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@Data
public class BoardColumnQueryService {

    private final Connection connection;

    public Optional<BoardColumnEntity> findById(final Long id) throws SQLException {
        var dao = new BoardColumnDAO(connection);
        return dao.findById(id);
    }
}