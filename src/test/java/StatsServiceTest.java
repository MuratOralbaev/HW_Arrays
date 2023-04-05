import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void shouldFindBetweenSalesAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.salesAmount(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverSum = 15;
        int actualAverSum = service.averageSalesAmount(sales);
        Assertions.assertEquals(expectedAverSum, actualAverSum);
    }

    @Test
    public void shouldFindMonthPeakSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedPeak = 5;
        int actualPeak = service.numberMonthPeakSales(sales);
        Assertions.assertEquals(expectedPeak, actualPeak);
    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMin = 8;
        int actualMin = service.numberMonthMinSales(sales);
        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void shouldFindMonthBelow() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelow = 5;
        int actualBelow = service.numberMonthBelowOverage(sales);
        Assertions.assertEquals(expectedBelow, actualBelow);
    }

    @Test
    public void shouldFindMonthOverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedOverage = 5;
        int actualOverage = service.numberMonthAboveOverage(sales);
        Assertions.assertEquals(expectedOverage, actualOverage);
    }
}
