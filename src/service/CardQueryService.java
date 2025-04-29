package service;

import dto.CardDetailsDTO;
import lombok.Data;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@Data
public class CardQueryService {

    private final Connection connection;

    public Optional<CardDetailsDTO> findById(final Long id) throws SQLException {
        var dao = new CardDAO(connection);
        return dao.findById(id);
    }
}
