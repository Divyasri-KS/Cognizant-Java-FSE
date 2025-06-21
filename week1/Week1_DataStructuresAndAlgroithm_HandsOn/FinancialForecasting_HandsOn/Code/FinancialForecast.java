package Week1_DataStructuresAndAlgroithm_HandsOn.FinancialForecasting_HandsOn.Code;

public class FinancialForecast {
    public static double futureValue(double principal, double rate, int years) {
        if (years == 0) return principal;
        return futureValue(principal, rate, years - 1) * (1 + rate);
    }
}

