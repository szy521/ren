package cn.pojo;


public class Order {

  private Integer oid;
  private Integer ouid;
  private Integer ogid;
  private String otitle;
  private String odate;
  private Integer ostate;

  public Integer getOid() {
    return oid;
  }

  public void setOid(Integer oid) {
    this.oid = oid;
  }

  public Integer getOuid() {
    return ouid;
  }

  public void setOuid(Integer ouid) {
    this.ouid = ouid;
  }

  public Integer getOgid() {
    return ogid;
  }

  public void setOgid(Integer ogid) {
    this.ogid = ogid;
  }

  public String getOtitle() {
    return otitle;
  }

  public void setOtitle(String otitle) {
    this.otitle = otitle;
  }

  public String getOdate() {
    return odate;
  }

  public void setOdate(String odate) {
    this.odate = odate;
  }

  public Integer getOstate() {
    return ostate;
  }

  public void setOstate(Integer ostate) {
    this.ostate = ostate;
  }
}
