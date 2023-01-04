package dao.member;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import dto.member.MemberDTO;

public class MemberDAO {
	public MemberDTO selectMember(SqlSession session, Map<String, Object> map) throws Exception {
		return session.selectOne("config.MemberMapper.selectMember", map);
	}
	
	public int insertMember(SqlSession session, MemberDTO dto) throws Exception {
		return session.insert("config.MemberMapper.insertMember", dto);
	}
	
	public MemberDTO selectForMypage(SqlSession session, int idx) throws Exception {
		return session.selectOne("config.MemberMapper.selectForMypage", idx);
	}

	public MemberDTO login(SqlSession session, Map<String, Object> map) throws Exception {
		return session.selectOne("config.MemberMapper.login", map);
	}
		
	public MemberDTO idDuplicateCheck(SqlSession session, String userid) {
		return session.selectOne("config.MemberMapper.idDuplicateCheck", userid);
	}
	
	public int updateMember(SqlSession session, MemberDTO dto) throws Exception {
		return session.update("config.MemberMapper.updateMember", dto);
	}
	
}
