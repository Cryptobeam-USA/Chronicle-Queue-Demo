/*
 * Copyright (c) 2016-2022 Chronicle Software Ltd
 */

package org.trading.api;

import org.trading.dto.MarketDataSnapshot;

public interface AggregatorOut {
    void marketDataSnapshot(MarketDataSnapshot mds);
}
