package dao.board;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dto.board.BoardDTO;
// DB 접근을 위한 객체
public class BoardDAO {
	// Now
	public List<BoardDTO> selectAllNow(SqlSession session, HashMap<String, Object> map) throws Exception {
		return session.selectList("config.BoardMapper.selectAllNow", map);
	}
	
	public BoardDTO selectNowContent(SqlSession session, HashMap<String, Object> map) throws Exception {
		return session.selectOne("config.BoardMapper.selectNowContent", map);
	}
	
	public String selectContentTag(SqlSession session, String code) throws Exception {
		return session.selectOne("config.BoardMapper.selectContentTag", code);
	}
	
	public int insertNow(SqlSession session, BoardDTO dto) throws Exception {
		return session.insert("config.BoardMapper.insertNow", dto);
	}
	
	public int updateNow(SqlSession session, BoardDTO dto) throws Exception {
		return session.update("config.BoardMapper.updateNow", dto);
	}
	
	
	// Epil
	public int insertEpil(SqlSession session, BoardDTO dto) throws Exception {
		return session.insert("config.BoardMapper.insertEpil", dto);
	}
	
	public int updateEpil(SqlSession session, BoardDTO dto) throws Exception {
		return session.update("config.BoardMapper.updateEpil", dto);
	}
	
	public List<BoardDTO> selectAllEpil(SqlSession session, HashMap<String, Object> map) throws Exception {
		return session.selectList("config.BoardMapper.selectAllEpil", map);
	}
	
	public BoardDTO selectEpilContent(SqlSession session, HashMap<String, Object> map) throws Exception {
		return session.selectOne("config.BoardMapper.selectEpilContent", map);
	}
	
	
	// Prom
	public List<BoardDTO> selectAllProm(SqlSession session, HashMap<String, Object> map) throws Exception {
		return session.selectList("config.BoardMapper.selectAllProm", map);
	} 
	
	public BoardDTO selectPromContent(SqlSession session, HashMap<String, Object> map) throws Exception {
		return session.selectOne("config.BoardMapper.selectPromContent", map);
	}
	
	public int insertProm(SqlSession session, BoardDTO dto) throws Exception {
		return session.insert("config.BoardMapper.insertProm", dto);
	}
	
	public int updateProm(SqlSession session, BoardDTO dto) throws Exception {
		System.out.println(dto.toString());
		return session.update("config.BoardMapper.updateProm", dto);
	}
	
	
	public int deleteOne(SqlSession session, int idx) throws Exception {
		return session.delete("config.BoardMapper.deleteOne", idx);
	}

	public int countTotalProm(SqlSession session, HashMap<String, Object> map) throws Exception {
		return session.selectOne("config.BoardMapper.countTotalProm", map);
	}
	
	
	
	
	
	public int countTotalMywrite(SqlSession session, HashMap<String, Object> map) throws Exception {
		return session.selectOne("config.BoardMapper.countTotalMywrite", map);
	}
	
	public List<BoardDTO> selectAllMywrite(SqlSession session, HashMap<String, Object> map) throws Exception {
		return session.selectList("config.BoardMapper.selectAllMywrite", map);
	}
	
	
	// Search
	public List<BoardDTO> searchOne(SqlSession session, HashMap<String, Object> map) throws Exception {
		return session.selectList("config.BoardMapper.searchOne", map);
	}
	
}
