package cn.blaze.vo;

import cn.blaze.domain.Bulletin;
import cn.blaze.utils.TimeUtils;

/**
 * Created by darlynn on 5/5/17.
 */
public class BulletinInfoVo {

    private String id;
    private String title;
    private String posterId;
    private String groupId;
    private String groupType;
    private String releaseTime;
    private String deadline;
    private String content;
    private String authority;
    private String isvalid;

    public BulletinInfoVo(Bulletin bulletin) {
        this.id = bulletin.getId();
        this.title = bulletin.getTitle();
        this.content = bulletin.getContent();
        this.posterId = bulletin.getPosterId();
        this.groupId = bulletin.getGroupId();
        this.groupType = bulletin.getGroupType();
        this.releaseTime = TimeUtils.getTime(bulletin.getReleaseTime().getTime());
        this.deadline = TimeUtils.getTime(bulletin.getReleaseTime().getTime());
        this.authority = bulletin.getAuthority();
        this.isvalid = bulletin.getIsvalid();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosterId() {
        return posterId;
    }

    public void setPosterId(String posterId) {
        this.posterId = posterId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(String isvalid) {
        this.isvalid = isvalid;
    }
}
