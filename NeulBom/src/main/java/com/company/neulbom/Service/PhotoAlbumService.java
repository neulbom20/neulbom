package com.company.neulbom.Service;

import java.util.ArrayList;

import com.company.neulbom.Domain.PhotoAlbumVO;
import com.company.neulbom.Domain.SearchCriteria;

public interface PhotoAlbumService {

	public ArrayList<PhotoAlbumVO> getPhotoAlbumList(SearchCriteria scri);	
	public PhotoAlbumVO getPhotoAlbum(int photoalbum_idx);
	public int writePhotoAlbum(PhotoAlbumVO pav);
	public int modifyPhotoAlbum(PhotoAlbumVO pav);
	public int deletePhotoAlbum(int photoalbum_idx);
	public int totalRecordCount(SearchCriteria scri);
	
}