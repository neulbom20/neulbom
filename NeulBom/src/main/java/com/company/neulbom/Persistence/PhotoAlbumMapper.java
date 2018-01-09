package com.company.neulbom.Persistence;

import java.util.ArrayList;
import java.util.HashMap;

import com.company.neulbom.Domain.PhotoAlbumVO;
import com.company.neulbom.Domain.SearchCriteria;

public interface PhotoAlbumMapper {

	public ArrayList<PhotoAlbumVO> getPhotoAlbumList(SearchCriteria scri);	
	public PhotoAlbumVO getPhotoAlbum(int photoalbum_idx);
	public int writePhotoAlbum(HashMap<String, Object> map);
	public int modifyPhotoAlbum(HashMap<String, Object> map);
	public int deletePhotoAlbum(int photoalbum_idx);
	public int totalRecordCount(SearchCriteria scri);
	
}