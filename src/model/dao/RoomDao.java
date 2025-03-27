package model.dao;

import java.util.List;

import model.dto.Room;

public class RoomDao {
    // 모든 방 정보 조회
    public void findAllRooms() {
        // SQL: SELECT * FROM rooms
    }

    // 특정 방 정보 조회
    public void findRoomById(int id) {
        // SQL: SELECT * FROM rooms WHERE id = ?
    }

    // 방 추가
    public void saveRoom(Room room) {
        // SQL: INSERT INTO rooms (columns...) VALUES (?, ?, ...)
    }

    // 방 정보 수정
    public void updateRoom(Room room) {
        // SQL: UPDATE rooms SET columns... WHERE id = ?
    }

    // 방 삭제
    public void deleteRoom(int id) {
        // SQL: DELETE FROM rooms WHERE id = ?
    }

	public void insert(Room room) {
		// TODO Auto-generated method stub
		
	}

	public Room selectByNo(int roomNo) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Room> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
