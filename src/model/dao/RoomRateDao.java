package model.dao;

import java.util.List;

import model.dto.RoomRate;

public class RoomRateDao {
    // 모든 방 요금 정보 조회
    public void findAllRoomRates() {
        // SQL: SELECT * FROM room_rates
    }

    // 특정 방 요금 정보 조회
    public void findRoomRateById(int id) {
        // SQL: SELECT * FROM room_rates WHERE id = ?
    }

    // 방 요금 추가
    public void saveRoomRate(RoomRate rate) {
        // SQL: INSERT INTO room_rates (columns...) VALUES (?, ?, ...)
    }

    // 방 요금 수정
    public void updateRoomRate(RoomRate rate) {
        // SQL: UPDATE room_rates SET columns... WHERE id = ?
    }

    // 방 요금 삭제
    public void deleteRoomRate(int id) {
        // SQL: DELETE FROM room_rates WHERE id = ?
    }
}
