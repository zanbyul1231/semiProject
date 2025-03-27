package model.service;

import java.util.List;

import model.dao.AttractionRateDao;
import model.dto.AttractionRate;

public class AttractionRateServiceImpl implements AttractionRateService {
    private AttractionRateDao attractionRateDao = new AttractionRateDao();

    @Override
    public List<AttractionRate> getAllAttractionRates() {
        return null;
    }

    @Override
    public AttractionRate getAttractionRateById(int id) {
        return null;
    }

    @Override
    public void addAttractionRate(AttractionRate rate) {
        attractionRateDao.saveAttractionRate(rate);
    }

    @Override
    public void updateAttractionRate(AttractionRate rate) {
        attractionRateDao.updateAttractionRate(rate);
    }

    @Override
    public void deleteAttractionRate(int id) {
        attractionRateDao.deleteAttractionRate(id);
    }
}
