package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.dto.User;

public class UserDao {
	
	private Connection connection;
	
	// 모든 사용자 조회
	public List<User> findAllUsers() {
		List<User> userList = new ArrayList<>();
		String sql = "SELECT * FROM users";
		try (PreparedStatement stmt = connection.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

			while (rs.next()) {
				userList.add(new User(rs.getInt("id"), rs.getString("name"), rs.getString("email")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}

	// 특정 사용자 조회
	public void findUserById(int id) {
		// SQL: SELECT * FROM users WHERE id = ?
	}

	// 사용자 추가
	public void addUser(User user) {
		String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, user.getName());
			stmt.setString(2, user.getEmail());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 사용자 수정
	public void updateUser(User user) {
		// SQL: UPDATE users SET columns... WHERE id = ?
	}

	// 사용자 삭제
	public void deleteUser(int id) {
		// SQL: DELETE FROM users WHERE id = ?
	}

	public User selectByNo(int userNo) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
