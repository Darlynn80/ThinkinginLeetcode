package cn.blaze.service;

import cn.blaze.domain.Bulletin;

/**
 * Created by darlynn on 4/26/17.
 */
public interface BulletinService {

    /**
     * @Title addEductionInfo
     * @Description add bulletin
     * @param bulletin
     * @Retrun
     */
    boolean addBulletin(Bulletin bulletin);

    /**
     * @Title queryBulletin
     * @Description query bulletin
     * @param id
     * @Return Bulletin
     * */
    Bulletin queryBulletin(String id);

    /**
     * @Title delBulletin
     * @Description delete bulletin
     * @param id
     * @Return boolean
     * */
    boolean delBulletin(String id);

    /**
     * @Title updateBulletin
     * @Description update bulletin
     * @param bulletin
     * @Return boolean
     * */
    boolean updateBulletin(Bulletin bulletin);
}
