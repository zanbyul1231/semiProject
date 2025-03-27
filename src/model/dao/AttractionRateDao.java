package model.dao;

import java.util.List;

import model.dto.AttractionRate;

public class AttractionRateDao {
    // 모든 관광지 요금 정보 조회
    public void findAllAttractionRates() {
        // SQL: SELECT * FROM attraction_rates
    }

    // 특정 관광지 요금 정보 조회
    public void findAttractionRateById(int id) {
        // SQL: SELECT * FROM attraction_rates WHERE id = ?
    }

    // 관광지 요금 정보 추가
    public void saveAttractionRate(AttractionRate rate) {
        // SQL: INSERT INTO attraction_rates (columns...) VALUES (?, ?, ...)
    }

    // 관광지 요금 정보 수정
    public void updateAttractionRate(AttractionRate rate) {
        // SQL: UPDATE attraction_rates SET columns... WHERE id = ?
    }

    // 관광지 요금 정보 삭제
    public void deleteAttractionRate(int id) {
        // SQL: DELETE FROM attraction_rates WHERE id = ?
    }
}
