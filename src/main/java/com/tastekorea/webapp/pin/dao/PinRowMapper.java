package com.tastekorea.webapp.pin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tastekorea.webapp.member.domain.Region;
import com.tastekorea.webapp.member.domain.TasteMember;
import com.tastekorea.webapp.pin.domain.Pin;
import com.tastekorea.webapp.pin.domain.PinCategory;

/**
 * 
 * @author "rohyh"
 *
 */
public class PinRowMapper implements RowMapper<Pin> {

	/**
	 * 
	 */
	@Override
	public Pin mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pin pin = new Pin();
		pin.setId(rs.getLong("id"));
		pin.setCategory(new PinCategory(rs.getLong("categoryId")));
		pin.setMember(new TasteMember(rs.getLong("memberId")));
		pin.setRegion(new Region(rs.getLong("regionId")));
		pin.setImagePath(rs.getString("pinPhoto"));
		pin.setTitle(rs.getString("title"));
		pin.setDescription(rs.getString("details"));
		pin.setMapData(rs.getString("mapData"));
		pin.setLike(rs.getInt("like"));
		pin.setDislike(rs.getInt("dislike"));
		pin.setRegDate(rs.getTimestamp("regDate"));
		pin.setUpdateDate(rs.getTimestamp("updateDate"));

		return pin;
	}

}