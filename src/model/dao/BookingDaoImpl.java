package model.dao;

import model.dto.Booking;

import java.util.List;

public class BookingDaoImpl implements BookingDao {
    @Override
    public List<Booking> selectAll() {
        return List.of();
    }

    @Override
    public Booking selectByNo(int bookingNo) {
        return null;
    }

    @Override
    public void insert(Booking booking) {

    }

    @Override
    public void update(Booking booking) {

    }

    @Override
    public void delete(int bookingNo) {

    }
}
