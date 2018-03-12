public class PhoneNumber {
        String phone = null;
        PhoneNumber(String phone){
            this.phone = phone;
        }

        boolean isValidPhone(){
            if(phone.length() == 10){
                return(true); //Romania
            }
            return(false);
        }
}
