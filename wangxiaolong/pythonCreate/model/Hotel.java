public class Hotel extends BaseHotel<Hotel> {    public List getHotel(){        return Hotel.dao.find("select * from hotel");    }    public boolean insertHotel(String hotel_name,String address,String phone,String message,String pic,String x,String y) {        return new Hotel().set("hotel_name",hotel_name).set("address",address).set("phone",phone).set("message",message).set("pic",pic).set("x",x).set("y",y).save();    }    public boolean updateHotel(int id,String hotel_name,String address,String phone,String message,String pic,String x,String y) {        return Hotel.dao.findById(id).setHotel_name(hotel_name).setAddress(address).setPhone(phone).setMessage(message).setPic(pic).setX(x).setY(y).update();    }    public boolean deleteHotel(int id){        return Hotel.dao.findById(id).delete();    }}