package com.kodilla.good.patterns.challenges;

class SaleProcessor {

    private final InformationService informationService;
    private final SaleService saleService;
    private final SaleRepository saleRepository;
    private final SaleStorage saleStorage;

    public SaleProcessor(final InformationService informationService,
                         final SaleService saleService,
                         final SaleRepository saleRepository,
                         final SaleStorage saleStorage) {
        this.informationService = informationService;
        this.saleService = saleService;
        this.saleRepository = saleRepository;
        this.saleStorage = saleStorage;
    }

    public SaleDto process(final SaleRequest saleRequest) {
        boolean isSold = saleService.sale(saleRequest.getSaleProduct(), saleStorage);

        if (isSold) {
            informationService.inform(saleRequest.getBuyer(), saleRequest.getBuyerAddress());
            saleRepository.createSale(saleRequest);
            return new SaleDto(saleRequest.getBuyer(), true);
        } else {
            return new SaleDto(saleRequest.getBuyer(), false);
        }
    }
}