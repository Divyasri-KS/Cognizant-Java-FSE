package Week1_DataStructuresAndAlgroithm_HandsOn.FinancialForecasting_HandsOn.Code;

public class Main {
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 0.05; // 5% annual growth
        int years = 5;

        double forecastedValue = FinancialForecast.futureValue(principal, rate, years);
        System.out.printf("Future Value after %d years: %.2f", years, forecastedValue);
    }
}

