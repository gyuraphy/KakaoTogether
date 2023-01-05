package service.donation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import dto.donation.CommentsDTO;
import dto.donation.MydonationDTO;
import dto.member.MemberDTO;

public interface DonationService {
	public List<MydonationDTO> selectMyDonation(int member_idx) throws Exception;
	public int insertDonation(HashMap<String, Object> map) throws Exception;
	public List<CommentsDTO> selectComments(HashMap<String, Object> map) throws Exception;
	public int countComments(HashMap<String, Object> map) throws Exception;
}
