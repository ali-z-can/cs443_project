package com.cs443.project.userpastlinkanalyticsretrievalservice;

import java.math.BigDecimal;

public interface StatsOnly {

    BigDecimal getNumberOfClicks();
    BigDecimal getNumberOfDistinctLinks();

}
