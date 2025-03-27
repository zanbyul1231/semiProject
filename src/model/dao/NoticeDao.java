package model.dao;


import java.util.List;

import model.dto.Notice;

public class NoticeDao {
    // 모든 공지사항 조회
    public void findAllNotices() {
        // SQL: SELECT * FROM notices
    }

    // 특정 공지사항 조회
    public void findNoticeById(int id) {
        // SQL: SELECT * FROM notices WHERE id = ?
    }

    // 공지사항 추가
    public void saveNotice(Notice notice) {
        // SQL: INSERT INTO notices (columns...) VALUES (?, ?, ...)
    }

    // 공지사항 수정
    public void updateNotice(Notice notice) {
        // SQL: UPDATE notices SET columns... WHERE id = ?
    }

    // 공지사항 삭제
    public void deleteNotice(int id) {
        // SQL: DELETE FROM notices WHERE id = ?
    }

	public void insert(Notice notice) {
		// TODO Auto-generated method stub
		
	}

	public void update(Notice notice) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int noticeNo) {
		// TODO Auto-generated method stub
		
	}

	public Notice selectByNo(int noticeNo) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Notice> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
