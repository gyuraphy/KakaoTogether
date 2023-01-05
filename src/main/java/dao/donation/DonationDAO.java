package dao.donation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import dto.donation.CommentsDTO;
import dto.donation.MydonationDTO;
import dto.member.MemberDTO;

public class DonationDAO {
	public List<MydonationDTO> selectMyDonation(SqlSession session, int member_idx) throws Exception {
		return session.selectList("config.DonationMapper.selectMyDonation", member_idx);
	}
	
	public int insertDonation(SqlSession session, HashMap<String, Object> map) throws Exception {
		return session.insert("config.DonationMapper.insertDonation", map);
	}
	
	public int countComments(SqlSession session, HashMap<String, Object> map) throws Exception {
		return session.selectOne("config.DonationMapper.countComments", map);
	}
	
	public List<CommentsDTO> selectComments(SqlSession session, HashMap<String, Object> map) throws Exception {
		return session.selectList("config.DonationMapper.selectComments", map);
	}
}