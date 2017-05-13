package cn.blaze.controller;

import cn.blaze.consts.Consts;
import cn.blaze.consts.RetCode;
import cn.blaze.domain.Bulletin;
import cn.blaze.service.BulletinService;
import cn.blaze.utils.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by darlynn on 5/5/17.
 */

@RestController
@RequestMapping("bulletin/")
public class BulletinController extends BaseController {

    @Autowired
    private BulletinService bulletinService;

    /**
     * release bulletin
     * @param  request
     * @param  response
     * @throws IOException,ParseException
     * */
    @ResponseBody
    @RequestMapping()
    public void addBulletin(HttpServletRequest request,
                            HttpServletResponse response,
                            @RequestParam String title,
                            @RequestParam String content,
                            @RequestParam String poster,
                            @RequestParam String group,
                            @RequestParam String groupType,
                            @RequestParam String releaseTime,
                            @RequestParam String deadline,
                            @RequestParam String authority) throws ParseException, IOException {
        Bulletin bulletin = new Bulletin();
        bulletin.setTitle(title);
        bulletin.setReleaseTime(TimeUtils.parseTime(releaseTime));
        bulletin.setDeadline(TimeUtils.parseTime(deadline));
        bulletin.setPosterId(poster);
        bulletin.setContent(content);
        bulletin.setGroupId(group);
        bulletin.setGroupType(groupType);
        bulletin.setAuthority(authority);
        bulletin.setIsvalid(Consts.ISVALID.YES);
        boolean result = bulletinService.addBulletin(bulletin);
        if (result){
            writeJsonP(request, response, initAjaxResult(RetCode.SUCCESS.code) );
            return;
        }else {
            writeJsonP(request, response, initAjaxResult(RetCode.SERVER_ERROR.code));
            return;
        }
    }

    /**
     * delete bulletin
     * @param request
     * @param response
     * @throws IOException
     * */
    @ResponseBody
    @RequestMapping()
    public void deleteBulletin(HttpServletRequest request,
                               HttpServletResponse response,
                               @RequestParam String id) throws IOException {
        boolean result = bulletinService.delBulletin(id);
        if (result){
            writeJsonP(request, response, initAjaxResult(RetCode.SUCCESS.code));
        }else {
            writeJsonP(request, response, initAjaxResult(RetCode.SERVER_ERROR.code));
        }
    }

    /**
     * update bulletin
     * @param request
     * @param response
     * @throws ParseException,IOException
     * */
    @ResponseBody
    @RequestMapping()
    public void updateBulletin(HttpServletRequest request,
                               HttpServletResponse response,
                               @RequestParam String id,
                               @RequestParam String title,
                               @RequestParam String content,
                               @RequestParam String poster,
                               @RequestParam String group,
                               @RequestParam String groupType,
                               @RequestParam String releaseTime,
                               @RequestParam String deadline,
                               @RequestParam String authority) throws ParseException, IOException {
        Bulletin bulletin = new Bulletin();
        bulletin.setId(id);
        bulletin.setTitle(title);
        bulletin.setReleaseTime(TimeUtils.parseTime(releaseTime));
        bulletin.setDeadline(TimeUtils.parseTime(deadline));
        bulletin.setPosterId(poster);
        bulletin.setContent(content);
        bulletin.setGroupId(group);
        bulletin.setGroupType(groupType);
        bulletin.setAuthority(authority);
        bulletin.setIsvalid(Consts.ISVALID.YES);
        boolean result = bulletinService.updateBulletin(bulletin);
        if (result){
            writeJsonP(request, response, initAjaxResult(RetCode.SUCCESS.code) );
            return;
        }else {
            writeJsonP(request, response, initAjaxResult(RetCode.SERVER_ERROR.code));
            return;
        }
    }

}
