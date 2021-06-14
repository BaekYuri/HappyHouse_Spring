package com.ssafy.project.model.dao;

import java.sql.SQLException;
import java.util.Map;

import com.ssafy.project.model.dto.CountryMarketDto;

public interface CountryMarketDao {
	public CountryMarketDto getMarket(Map<String, String> mmap)throws SQLException;
	public CountryMarketDto getSumAvg() throws SQLException;
	public CountryMarketDto getGuAvg(String gugun) throws SQLException;
	public CountryMarketDto getMax() throws SQLException;
}
