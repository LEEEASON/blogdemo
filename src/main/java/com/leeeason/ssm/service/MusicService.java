package com.leeeason.ssm.service;

import com.leeeason.ssm.model.Music;

import java.util.List;

/**
 * Created by AL on 0009 09 05.
 */
public interface MusicService {
    /**
     * @param url
     * @return 音樂信息
     */
    public List<Music> getMusic(String url);
}
