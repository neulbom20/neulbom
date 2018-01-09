package com.company.neulbom.Service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.company.neulbom.Domain.PhotoAlbumVO;
import com.company.neulbom.Domain.SearchCriteria;
import com.company.neulbom.Persistence.PhotoAlbumMapper;

@Service("PhotoAlbumServiceImpl")
public class PhotoAlbumServiceImpl implements PhotoAlbumService{
	
	@Resource(name="sqlSession")
	private SqlSession sqlSession;

	@Override
	public ArrayList<PhotoAlbumVO> getPhotoAlbumList(SearchCriteria scri) {
		
	     //System.out.println(sqlSession);
			ArrayList<PhotoAlbumVO> alist = new ArrayList<PhotoAlbumVO>();
			PhotoAlbumMapper pam = sqlSession.getMapper(com.company.neulbom.Persistence.PhotoAlbumMapper.class);
			alist = pam.getPhotoAlbumList(scri);
			
			return alist;
	}

	@Override
	public PhotoAlbumVO getPhotoAlbum(int photoalbum_idx) {
		
		PhotoAlbumMapper pam = sqlSession.getMapper(com.company.neulbom.Persistence.PhotoAlbumMapper.class);		
		PhotoAlbumVO pav = pam.getPhotoAlbum(photoalbum_idx);
		
		return pav;
	}

	@Override
	public int writePhotoAlbum(PhotoAlbumVO pav) {
		
		HashMap<String,Object> map = new  HashMap<String,Object>(); 
		
		map.put("photoalbum_title", pav.getPhotoalbum_title());
		map.put("photoalbum_content", pav.getPhotoalbum_content());
		map.put("photoalbum_writer",pav.getPhotoalbum_writer());
		map.put("photoalbum_date",pav.getPhotoalbum_date());
		map.put("photoalbum_hits;", pav.getPhotoalbum_hits());	
		
		PhotoAlbumMapper pam = sqlSession.getMapper(com.company.neulbom.Persistence.PhotoAlbumMapper.class);
		int rrd = pam.writePhotoAlbum(map); 
		
		return rrd;
	}

	@Override
	public int modifyPhotoAlbum(PhotoAlbumVO pav) {
		
		HashMap<String,Object> map = new  HashMap<String,Object>();
		
		map.put("photoalbum_title", pav.getPhotoalbum_title());
		map.put("photoalbum_content", pav.getPhotoalbum_content());
		map.put("photoalbum_writer",pav.getPhotoalbum_writer());
		map.put("photoalbum_date", pav.getPhotoalbum_date());		
		
		PhotoAlbumMapper pam = sqlSession.getMapper(com.company.neulbom.Persistence.PhotoAlbumMapper.class);
		int rrd = pam.modifyPhotoAlbum(map);		
		
		return rrd;
		
	}

	@Override
	public int deletePhotoAlbum(int photoalbum_idx) {
		
		PhotoAlbumMapper pam = sqlSession.getMapper(com.company.neulbom.Persistence.PhotoAlbumMapper.class);		
		int rrd = pam.deletePhotoAlbum(photoalbum_idx);
		
		return rrd;
	}

	@Override
	public int totalRecordCount(SearchCriteria scri) {
		
		PhotoAlbumMapper pam = sqlSession.getMapper(com.company.neulbom.Persistence.PhotoAlbumMapper.class);
		int cnt = pam.totalRecordCount(scri);
		
		return cnt;	
	}
}