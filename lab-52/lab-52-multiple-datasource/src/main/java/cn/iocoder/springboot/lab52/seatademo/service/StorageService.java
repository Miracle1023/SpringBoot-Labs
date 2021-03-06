package cn.iocoder.springboot.lab52.seatademo.service;

/**
 * 库存 Service
 */
public interface StorageService {

    /**
     * 扣减库存
     *
     * @param productId 商品 ID
     * @param amount    扣减数量
     * @throws Exception 扣减失败时抛出异常
     */
    void reduceStock(Long productId, Integer amount) throws Exception;

}
