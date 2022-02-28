import com.sun.org.glassfish.gmbal.Description;
import helper.Constants;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeliveryTest {

    @DataProvider(name = "test-data")
    public Object[][] dataProviderMethod() {
        return new Object[][] {
                { new Delivery(0, Dimension.SMALL, false, ServiceLoad.DEFAULT), Constants.CAN_NOT_DELIVERY},
                { new Delivery(1, Dimension.SMALL, false, ServiceLoad.DEFAULT), Constants.FOUR_HUNDRED},
                { new Delivery(2, Dimension.SMALL, false, ServiceLoad.DEFAULT), Constants.FOUR_HUNDRED},
                { new Delivery(5, Dimension.SMALL, false, ServiceLoad.DEFAULT), Constants.FOUR_HUNDRED},
                { new Delivery(10, Dimension.SMALL, false, ServiceLoad.DEFAULT), Constants.FOUR_HUNDRED},
                { new Delivery(15, Dimension.SMALL, false, ServiceLoad.DEFAULT), Constants.FOUR_HUNDRED},
                { new Delivery(30, Dimension.SMALL, false, ServiceLoad.DEFAULT), Constants.FOUR_HUNDRED},
                { new Delivery(31, Dimension.SMALL, false, ServiceLoad.DEFAULT), Constants.FOUR_HUNDRED},

                { new Delivery(-1, Dimension.BIG, false, ServiceLoad.DEFAULT), Constants.CAN_NOT_DELIVERY},
                { new Delivery(1, Dimension.BIG, false, ServiceLoad.DEFAULT), Constants.FOUR_HUNDRED},
                { new Delivery(2, Dimension.BIG, false, ServiceLoad.DEFAULT), Constants.FOUR_HUNDRED},
                { new Delivery(5, Dimension.BIG, false, ServiceLoad.DEFAULT), Constants.FOUR_HUNDRED},
                { new Delivery(10, Dimension.BIG, false, ServiceLoad.DEFAULT), Constants.FOUR_HUNDRED},
                { new Delivery(15, Dimension.BIG, false, ServiceLoad.DEFAULT), Constants.FOUR_HUNDRED},
                { new Delivery(30, Dimension.BIG, false, ServiceLoad.DEFAULT), Constants.FOUR_HUNDRED},
                { new Delivery(31, Dimension.BIG, false, ServiceLoad.DEFAULT), Constants.FIVE_HUNDRED},

                { new Delivery(-1, Dimension.SMALL, true, ServiceLoad.DEFAULT), Constants.CAN_NOT_DELIVERY},
                { new Delivery(1, Dimension.SMALL, true, ServiceLoad.DEFAULT), Constants.FOUR_HUNDRED_FIFTY},
                { new Delivery(2, Dimension.SMALL, true, ServiceLoad.DEFAULT), Constants.FOUR_HUNDRED_FIFTY},
                { new Delivery(5, Dimension.SMALL, true, ServiceLoad.DEFAULT), Constants.FIVE_HUNDRED},
                { new Delivery(10, Dimension.SMALL, true, ServiceLoad.DEFAULT), Constants.FIVE_HUNDRED},
                { new Delivery(15, Dimension.SMALL, true, ServiceLoad.DEFAULT), Constants.SIX_HUNDRED},
                { new Delivery(30, Dimension.SMALL, true, ServiceLoad.DEFAULT), Constants.SIX_HUNDRED},
                { new Delivery(31, Dimension.SMALL, true, ServiceLoad.DEFAULT), Constants.CAN_NOT_DELIVERY},

                { new Delivery(0, Dimension.BIG, true, ServiceLoad.DEFAULT), Constants.CAN_NOT_DELIVERY},
                { new Delivery(1, Dimension.BIG, true, ServiceLoad.DEFAULT), Constants.FIVE_HUNDRED_FIFTY},
                { new Delivery(2, Dimension.BIG, true, ServiceLoad.DEFAULT), Constants.FIVE_HUNDRED_FIFTY},
                { new Delivery(5, Dimension.BIG, true, ServiceLoad.DEFAULT), Constants.SIX_HUNDRED},
                { new Delivery(10, Dimension.BIG, true, ServiceLoad.DEFAULT), Constants.SIX_HUNDRED},
                { new Delivery(15, Dimension.BIG, true, ServiceLoad.DEFAULT), Constants.SEVEN_HUNDRED},
                { new Delivery(30, Dimension.BIG, true, ServiceLoad.DEFAULT), Constants.SEVEN_HUNDRED},
                { new Delivery(31, Dimension.BIG, true, ServiceLoad.DEFAULT), Constants.CAN_NOT_DELIVERY},


                { new Delivery(-1, Dimension.SMALL, false, ServiceLoad.HIGH), Constants.CAN_NOT_DELIVERY},
                { new Delivery(1, Dimension.SMALL, false, ServiceLoad.HIGH), Constants.FOUR_HUNDRED},
                { new Delivery(2, Dimension.SMALL, false, ServiceLoad.HIGH), Constants.FOUR_HUNDRED},
                { new Delivery(5, Dimension.SMALL, false, ServiceLoad.HIGH), Constants.FOUR_HUNDRED},
                { new Delivery(10, Dimension.SMALL, false, ServiceLoad.HIGH), Constants.FOUR_HUNDRED},
                { new Delivery(15, Dimension.SMALL, false, ServiceLoad.HIGH), Constants.FOUR_HUNDRED},
                { new Delivery(30, Dimension.SMALL, false, ServiceLoad.HIGH), Constants.FOUR_HUNDRED},
                { new Delivery(31, Dimension.SMALL, false, ServiceLoad.HIGH), Constants.FOUR_HUNDRED_EIGHTY},

                { new Delivery(0, Dimension.BIG, false, ServiceLoad.HIGH), Constants.CAN_NOT_DELIVERY},
                { new Delivery(1, Dimension.BIG, false, ServiceLoad.HIGH), Constants.FOUR_HUNDRED},
                { new Delivery(2, Dimension.BIG, false, ServiceLoad.HIGH), Constants.FOUR_HUNDRED},
                { new Delivery(5, Dimension.BIG, false, ServiceLoad.HIGH), Constants.FOUR_HUNDRED},
                { new Delivery(10, Dimension.BIG, false, ServiceLoad.HIGH), Constants.FOUR_HUNDRED},
                { new Delivery(15, Dimension.BIG, false, ServiceLoad.HIGH), Constants.FOUR_HUNDRED_EIGHTY},
                { new Delivery(30, Dimension.BIG, false, ServiceLoad.HIGH), Constants.FOUR_HUNDRED_EIGHTY},
                { new Delivery(31, Dimension.BIG, false, ServiceLoad.HIGH), Constants.SIX_HUNDRED},

                { new Delivery(-1, Dimension.SMALL, true, ServiceLoad.HIGH), Constants.CAN_NOT_DELIVERY},
                { new Delivery(1, Dimension.SMALL, true, ServiceLoad.HIGH), Constants.FIVE_HUNDRED_FORTY},
                { new Delivery(2, Dimension.SMALL, true, ServiceLoad.HIGH), Constants.FIVE_HUNDRED_FORTY},
                { new Delivery(5, Dimension.SMALL, true, ServiceLoad.HIGH), Constants.SIX_HUNDRED},
                { new Delivery(10, Dimension.SMALL, true, ServiceLoad.HIGH), Constants.SIX_HUNDRED},
                { new Delivery(15, Dimension.SMALL, true, ServiceLoad.HIGH), Constants.SEVEN_HUNDRED_TWENTY},
                { new Delivery(30, Dimension.SMALL, true, ServiceLoad.HIGH), Constants.SEVEN_HUNDRED_TWENTY},
                { new Delivery(31, Dimension.SMALL, true, ServiceLoad.HIGH), Constants.CAN_NOT_DELIVERY},

                { new Delivery(-1, Dimension.BIG, true, ServiceLoad.HIGH), Constants.CAN_NOT_DELIVERY},
                { new Delivery(1, Dimension.BIG, true, ServiceLoad.HIGH), Constants.SIX_HUNDRED_SIXTY},
                { new Delivery(2, Dimension.BIG, true, ServiceLoad.HIGH), Constants.SIX_HUNDRED_SIXTY},
                { new Delivery(5, Dimension.BIG, true, ServiceLoad.HIGH), Constants.SEVEN_HUNDRED_TWENTY},
                { new Delivery(10, Dimension.BIG, true, ServiceLoad.HIGH), Constants.SEVEN_HUNDRED_TWENTY},
                { new Delivery(15, Dimension.BIG, true, ServiceLoad.HIGH), Constants.EIGHT_HUNDRED_FORTY},
                { new Delivery(30, Dimension.BIG, true, ServiceLoad.HIGH), Constants.EIGHT_HUNDRED_FORTY},
                { new Delivery(31, Dimension.BIG, true, ServiceLoad.HIGH), Constants.CAN_NOT_DELIVERY},


                { new Delivery(0, Dimension.SMALL, false, ServiceLoad.HIGHEST), Constants.CAN_NOT_DELIVERY},
                { new Delivery(1, Dimension.SMALL, false, ServiceLoad.HIGHEST), Constants.FOUR_HUNDRED},
                { new Delivery(2, Dimension.SMALL, false, ServiceLoad.HIGHEST), Constants.FOUR_HUNDRED},
                { new Delivery(5, Dimension.SMALL, false, ServiceLoad.HIGHEST), Constants.FOUR_HUNDRED},
                { new Delivery(10, Dimension.SMALL, false, ServiceLoad.HIGHEST), Constants.FOUR_HUNDRED},
                { new Delivery(15, Dimension.SMALL, false, ServiceLoad.HIGHEST), Constants.FOUR_HUNDRED_TWENTY},
                { new Delivery(30, Dimension.SMALL, false, ServiceLoad.HIGHEST), Constants.FOUR_HUNDRED_TWENTY},
                { new Delivery(31, Dimension.SMALL, false, ServiceLoad.HIGHEST), Constants.FIVE_HUNDRED_SIXTY},

                { new Delivery(-1, Dimension.BIG, false, ServiceLoad.HIGHEST), Constants.CAN_NOT_DELIVERY},
                { new Delivery(1, Dimension.BIG, false, ServiceLoad.HIGHEST), Constants.FOUR_HUNDRED},
                { new Delivery(2, Dimension.BIG, false, ServiceLoad.HIGHEST), Constants.FOUR_HUNDRED},
                { new Delivery(5, Dimension.BIG, false, ServiceLoad.HIGHEST), Constants.FOUR_HUNDRED_TWENTY},
                { new Delivery(10, Dimension.BIG, false, ServiceLoad.HIGHEST), Constants.FOUR_HUNDRED_TWENTY},
                { new Delivery(15, Dimension.BIG, false, ServiceLoad.HIGHEST), Constants.FIVE_HUNDRED_SIXTY},
                { new Delivery(30, Dimension.BIG, false, ServiceLoad.HIGHEST), Constants.FIVE_HUNDRED_SIXTY},
                { new Delivery(31, Dimension.BIG, false, ServiceLoad.HIGHEST), Constants.SEVEN_HUNDRED},

                { new Delivery(0, Dimension.SMALL, true, ServiceLoad.HIGHEST), Constants.CAN_NOT_DELIVERY},
                { new Delivery(1, Dimension.SMALL, true, ServiceLoad.HIGHEST), Constants.SIX_HUNDRED_THIRTY},
                { new Delivery(2, Dimension.SMALL, true, ServiceLoad.HIGHEST), Constants.SIX_HUNDRED_THIRTY},
                { new Delivery(5, Dimension.SMALL, true, ServiceLoad.HIGHEST), Constants.SEVEN_HUNDRED},
                { new Delivery(10, Dimension.SMALL, true, ServiceLoad.HIGHEST), Constants.SEVEN_HUNDRED},
                { new Delivery(15, Dimension.SMALL, true, ServiceLoad.HIGHEST), Constants.EIGHT_HUNDRED_FORTY},
                { new Delivery(30, Dimension.SMALL, true, ServiceLoad.HIGHEST), Constants.EIGHT_HUNDRED_FORTY},
                { new Delivery(31, Dimension.SMALL, true, ServiceLoad.HIGHEST), Constants.CAN_NOT_DELIVERY},

                { new Delivery(0, Dimension.BIG, true, ServiceLoad.HIGHEST), Constants.CAN_NOT_DELIVERY},
                { new Delivery(1, Dimension.BIG, true, ServiceLoad.HIGHEST), Constants.SEVEN_HUNDRED_SEVENTY},
                { new Delivery(2, Dimension.BIG, true, ServiceLoad.HIGHEST), Constants.SEVEN_HUNDRED_SEVENTY},
                { new Delivery(5, Dimension.BIG, true, ServiceLoad.HIGHEST), Constants.EIGHT_HUNDRED_FORTY},
                { new Delivery(10, Dimension.BIG, true, ServiceLoad.HIGHEST), Constants.EIGHT_HUNDRED_FORTY},
                { new Delivery(15, Dimension.BIG, true, ServiceLoad.HIGHEST), Constants.NINE_HUNDRED_EIGHTY},
                { new Delivery(30, Dimension.BIG, true, ServiceLoad.HIGHEST), Constants.NINE_HUNDRED_EIGHTY},
                { new Delivery(31, Dimension.BIG, true, ServiceLoad.HIGHEST), Constants.CAN_NOT_DELIVERY},


                { new Delivery(-2, Dimension.SMALL, false, ServiceLoad.CRITICAL), Constants.CAN_NOT_DELIVERY},
                { new Delivery(1, Dimension.SMALL, false, ServiceLoad.CRITICAL), Constants.FOUR_HUNDRED},
                { new Delivery(2, Dimension.SMALL, false, ServiceLoad.CRITICAL), Constants.FOUR_HUNDRED},
                { new Delivery(5, Dimension.SMALL, false, ServiceLoad.CRITICAL), Constants.FOUR_HUNDRED},
                { new Delivery(10, Dimension.SMALL, false, ServiceLoad.CRITICAL), Constants.FOUR_HUNDRED},
                { new Delivery(15, Dimension.SMALL, false, ServiceLoad.CRITICAL), Constants.FOUR_HUNDRED_EIGHTY},
                { new Delivery(30, Dimension.SMALL, false, ServiceLoad.CRITICAL), Constants.FOUR_HUNDRED_EIGHTY},
                { new Delivery(31, Dimension.SMALL, false, ServiceLoad.CRITICAL), Constants.SIX_HUNDRED_FORTY},

                { new Delivery(-3, Dimension.BIG, false, ServiceLoad.CRITICAL), Constants.CAN_NOT_DELIVERY},
                { new Delivery(1, Dimension.BIG, false, ServiceLoad.CRITICAL), Constants.FOUR_HUNDRED},
                { new Delivery(2, Dimension.BIG, false, ServiceLoad.CRITICAL), Constants.FOUR_HUNDRED},
                { new Delivery(5, Dimension.BIG, false, ServiceLoad.CRITICAL), Constants.FOUR_HUNDRED_EIGHTY},
                { new Delivery(10, Dimension.BIG, false, ServiceLoad.CRITICAL), Constants.FOUR_HUNDRED_EIGHTY},
                { new Delivery(15, Dimension.BIG, false, ServiceLoad.CRITICAL), Constants.SIX_HUNDRED_FORTY},
                { new Delivery(30, Dimension.BIG, false, ServiceLoad.CRITICAL), Constants.SIX_HUNDRED_FORTY},
                { new Delivery(31, Dimension.BIG, false, ServiceLoad.CRITICAL), Constants.EIGHT_HUNDRED},

                { new Delivery(0, Dimension.SMALL, true, ServiceLoad.CRITICAL), Constants.CAN_NOT_DELIVERY},
                { new Delivery(1, Dimension.SMALL, true, ServiceLoad.CRITICAL), Constants.SEVEN_HUNDRED_TWENTY},
                { new Delivery(2, Dimension.SMALL, true, ServiceLoad.CRITICAL), Constants.SEVEN_HUNDRED_TWENTY},
                { new Delivery(5, Dimension.SMALL, true, ServiceLoad.CRITICAL), Constants.EIGHT_HUNDRED},
                { new Delivery(10, Dimension.SMALL, true, ServiceLoad.CRITICAL), Constants.EIGHT_HUNDRED},
                { new Delivery(15, Dimension.SMALL, true, ServiceLoad.CRITICAL), Constants.NINE_HUNDRED_SIXTY},
                { new Delivery(30, Dimension.SMALL, true, ServiceLoad.CRITICAL), Constants.NINE_HUNDRED_SIXTY},
                { new Delivery(31, Dimension.SMALL, true, ServiceLoad.CRITICAL), Constants.CAN_NOT_DELIVERY},

                { new Delivery(-5, Dimension.BIG, true, ServiceLoad.CRITICAL), Constants.CAN_NOT_DELIVERY},
                { new Delivery(1, Dimension.BIG, true, ServiceLoad.CRITICAL), Constants.EIGHT_HUNDRED_EIGHTY},
                { new Delivery(2, Dimension.BIG, true, ServiceLoad.CRITICAL), Constants.EIGHT_HUNDRED_EIGHTY},
                { new Delivery(5, Dimension.BIG, true, ServiceLoad.CRITICAL), Constants.NINE_HUNDRED_SIXTY},
                { new Delivery(10, Dimension.BIG, true, ServiceLoad.CRITICAL), Constants.NINE_HUNDRED_SIXTY},
                { new Delivery(15, Dimension.BIG, true, ServiceLoad.CRITICAL), Constants.THOUSAND_ONE_HUNDRED_TWENTY},
                { new Delivery(30, Dimension.BIG, true, ServiceLoad.CRITICAL), Constants.THOUSAND_ONE_HUNDRED_TWENTY},
                { new Delivery(31, Dimension.BIG, true, ServiceLoad.CRITICAL), Constants.CAN_NOT_DELIVERY}
        };
    }

    @Test(dataProvider = "test-data")
    @Description("Verify, that delivery cost calculate correct, or can't delivery")
    public void testVerifyDeliveryWorksCorrect(Delivery delivery , String expectedResult) {
        String actualResult = delivery.getCost();
        Assert.assertEquals(actualResult, expectedResult, "Delivery result is incorrect");
    }

}
