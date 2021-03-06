package ayizan.domain.orderbook;

import ayizan.domain.IdGenerator;

public class OrderIdGenerator implements IdGenerator<Long>
{
    private long id;

    public OrderIdGenerator()
    {
        id = 0;
    }

    @Override
    public Long next()
    {
        return ++id;
    }
}
