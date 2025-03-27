package model.dao;

import java.util.List;

import model.dto.Booking;

public class BookingDao {
	// 모든 예약 조회
	public List<Booking> selectAll() {
		return null;
		// SQL: SELECT * FROM bookings
	}

	// 특정 예약 조회
	public Booking selectByNo(int bookingNo) {
		return null;
		// SQL: SELECT * FROM bookings WHERE id = ?
	}

	// 예약 추가
	public void insert(Booking booking) {
		// SQL: INSERT INTO bookings (columns...) VALUES (?, ?, ...)
	}

	// 예약 수정
	public void update(Booking booking) {
		// SQL: UPDATE bookings SET columns... WHERE id = ?
	}

	// 예약 취소 (삭제)
	public void delete(int bookingNo) {
		// SQL: DELETE FROM bookings WHERE id = ?
	}

}
