/*
package com.company;

*/
/**
 * Created by khan on 3/14/17.
 *
 * *//*



public class ConvertIsSumProperty {
  Node tree;

  public static void main(String[] args) {
    ConvertIsSumProperty convertIsSumProperty=new ConvertIsSumProperty();

  }
}
*/
/*

package com.gdn.x.off2on.outbound.product.impl;

import com.gdn.common.web.wrapper.response.GdnRestListResponse;
import com.gdn.common.web.wrapper.response.GdnRestSingleResponse;
import com.gdn.common.web.wrapper.response.PageMetaData;
import com.gdn.x.off2on.exceptions.BaseIntegrationException;
import com.gdn.x.off2on.model.entity.ItemCategory;
import com.gdn.x.off2on.model.entity.ItemDetail;
import com.gdn.x.off2on.model.entity.Off2OnCart;
import com.gdn.x.off2on.model.entity.Off2OnCartItem;
import com.gdn.x.off2on.model.vo.SimpleItemNameVO;
import com.gdn.x.off2on.model.vo.SimpleItemVO;
import com.gdn.x.off2on.outbound.product.api.ProductDataConstructorService;
import com.gdn.x.product.client.ProductClient;
import com.gdn.x.product.rest.web.model.dto.ItemCatalogDTO;
import com.gdn.x.product.rest.web.model.dto.ItemCategoryDTO;
import com.gdn.x.product.rest.web.model.dto.ProductItemDetailDTO;
import com.gdn.x.product.rest.web.model.request.HandlingFeeRequestRestWeb;
import com.gdn.x.product.rest.web.model.response.HandlingFeeResponseRestWeb;
import com.gdn.x.product.rest.web.model.response.Off2OnPriceResponse;
import com.gdn.x.product.rest.web.model.response.ProductForTransactionResponse;
import com.gdn.x.product.rest.web.model.response.SimpleItemResponse;
import com.gdn.x.product.rest.web.model.response.SimpleMapStringResponse;
import org.dozer.Mapper;
import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class ProductClientServiceImplTest {

  private final static String USERNAME = "username";
  private final static String REQUESTID = "request-id";
  private final static String CHANNEL_ID = "channel-id";
  private final static String STOREID = "store-id";
  private final static String ITEMSKU = "item-sku";
  private final static String CATEGORY = "category";
  private final static String CATEGORYID = "category-id";
  private final static String PRODUCTCATEGORYID = "productCategory-id";
  private static final double PRICE = 1.000;
  private static final int QTY = 1;
  private static final int LEVEL = 1;
  private static final String ID = "id";
  private static final String CATENTRYID = "catentry-id";
  private static final String OFF2OnKEY_KEY = "off2Onkey";
  private static final String SIMPLEVO_KEY= "simpleVOKey";
  private static final String SAMPLE_MAP_KEY = "sampleMapKey";

  private GdnRestListResponse<SimpleItemResponse> gdnListSimpleItemResponse;
  private GdnRestListResponse<ProductForTransactionResponse> gdnListProductTransactionResponse;
  private List<String> itemSkuList;
  private List<SimpleItemVO> simpleItemVOList;
  private List<SimpleItemResponse> simpleItemResposeList;
  private SimpleItemResponse simpleResponse;
  private SimpleItemVO simpleVO;
  private List<ProductForTransactionResponse> productForTransactionResponseList;
  private ProductForTransactionResponse productTransactionResponse;
  private Off2OnCart pulsaCart;
  private List<HandlingFeeRequestRestWeb> listHandleRequest;
  private GdnRestSingleResponse<HandlingFeeResponseRestWeb> response;
  private GdnRestSingleResponse<SimpleMapStringResponse>
      simpleMapStringResponseGdnRestSingleResponse;
  private GdnRestListResponse<Off2OnPriceResponse> off2OnPriceResponseGdnRestListResponse;
  private HandlingFeeResponseRestWeb handlingResponse;
  private Map<String, List<List<ItemCategory>>> itemCategory;
  private Map<String, List<List<ItemCategoryDTO>>> itemCategoryDTO;
  private List<ItemCatalogDTO> itemCatalogs;
  private List<String> itemSku;
  private Map<String,Off2OnCartItem> stringOff2OnCartItemMap;
  private SortedSet<Off2OnCartItem> off2OnCartItems;
  private  Off2OnCartItem off2OnCartItem;
  private ItemDetail detail;
  private List<Off2OnPriceResponse> off2OnPriceResponses;
  private Off2OnPriceResponse off2OnPriceResponse;
  private Map<String, SimpleItemVO> Map;
  private List<SimpleItemNameVO> simpleItemNameVOs;
  private SimpleItemNameVO simpleItemNameVO;
  private SimpleMapStringResponse simpleMapStringResponse;
  private Map<String ,String> stringStringMap;

  @InjectMocks
  private ProductClientServiceImpl productClientserviceImpl;

  @Mock
  private ProductClient clientProduct;

  @Mock
  private ProductDataConstructorService constructorService;

  @Mock
  private Mapper dozer;

  @Test
  public void getOfferPriceAndBuyableStatusByItemSku_NULL() throws Exception {
    try {
      when(this.clientProduct
          .getPriceAndOff2OnChannelActiveByItemSku(ProductClientServiceImplTest.REQUESTID,
              ProductClientServiceImplTest.USERNAME, ProductClientServiceImplTest.CHANNEL_ID,
              this.itemSkuList)).thenReturn(null);
      this.productClientserviceImpl
          .getOfferPriceAndOff2OnFlagByItemSku(ProductClientServiceImplTest.REQUESTID,
              ProductClientServiceImplTest.USERNAME, ProductClientServiceImplTest.CHANNEL_ID,
              this.itemSkuList);
    } catch (Exception e) {
      assertThat(e, Matchers.instanceOf(BaseIntegrationException.class));
      verify(this.clientProduct)
          .getPriceAndOff2OnChannelActiveByItemSku(ProductClientServiceImplTest.REQUESTID,
              ProductClientServiceImplTest.USERNAME, ProductClientServiceImplTest.CHANNEL_ID,
              this.itemSkuList);
    }
  }

  @Test
  public void getProductBuyableStatusTrue() throws Exception {
    when(
        this.clientProduct.getPriceAndOff2OnChannelActiveByItemSku(
            ProductClientServiceImplTest.REQUESTID, ProductClientServiceImplTest.USERNAME,
            ProductClientServiceImplTest.CHANNEL_ID, this.itemSkuList)).thenReturn(
        this.off2OnPriceResponseGdnRestListResponse);

    when(this.constructorService.constructSimpleItemVO(this.off2OnPriceResponses))
        .thenReturn(this.Map);
    Map<String, SimpleItemVO> result = this.productClientserviceImpl
        .getOfferPriceAndOff2OnFlagByItemSku(ProductClientServiceImplTest.REQUESTID,
            ProductClientServiceImplTest.USERNAME, ProductClientServiceImplTest.CHANNEL_ID,
            itemSkuList);

    assertThat(result.size(), equalTo(1));

    verify(this.clientProduct).getPriceAndOff2OnChannelActiveByItemSku(
        ProductClientServiceImplTest.REQUESTID, ProductClientServiceImplTest.USERNAME,
        ProductClientServiceImplTest.CHANNEL_ID, this.itemSkuList);
    verify(this.constructorService).constructSimpleItemVO(this.off2OnPriceResponses);
  }

  @Test
  public void getProductDataByItemSkuFailedException() throws Exception {
    try {
      when(
          this.clientProduct.getProductForTransactionByItemSkus(
              ProductClientServiceImplTest.REQUESTID, ProductClientServiceImplTest.USERNAME,
              this.itemSkuList)).thenReturn(null);
      this.productClientserviceImpl
          .getProductDataByItemSkuList(ProductClientServiceImplTest.REQUESTID,
              ProductClientServiceImplTest.USERNAME, this.itemSkuList);

    } catch (Exception e) {
      assertThat(e, Matchers.instanceOf(BaseIntegrationException.class));
      verify(this.clientProduct).getProductForTransactionByItemSkus(
          ProductClientServiceImplTest.REQUESTID, ProductClientServiceImplTest.USERNAME,
          this.itemSkuList);
    }
  }

  @Test
  public void getProductDataByItemSkuFailedNullResponseValue() throws Exception {
    when(
        this.clientProduct.getProductForTransactionByItemSkus(
            ProductClientServiceImplTest.REQUESTID, ProductClientServiceImplTest.USERNAME,
            this.itemSkuList)).thenReturn(
        new GdnRestListResponse<ProductForTransactionResponse>(null, new PageMetaData(0, 0, 0),
            ProductClientServiceImplTest.REQUESTID));

    Map<String, Off2OnCartItem> result = this.productClientserviceImpl
        .getProductDataByItemSkuList(ProductClientServiceImplTest.REQUESTID,
            ProductClientServiceImplTest.USERNAME, itemSkuList);

    assertThat(result, nullValue());
    verify(this.clientProduct).getProductForTransactionByItemSkus(
        ProductClientServiceImplTest.REQUESTID, ProductClientServiceImplTest.USERNAME,
        this.itemSkuList);
  }

  @Test
  public void getProductDataByItemSkuSuccess() throws Exception {
    when(
        this.clientProduct.getProductForTransactionByItemSkus(
            ProductClientServiceImplTest.REQUESTID, ProductClientServiceImplTest.USERNAME,
            this.itemSkuList)).thenReturn(this.gdnListProductTransactionResponse);
    when(this.constructorService.convertCatalogsListDtoToCategory(this.itemCatalogs)).thenReturn(
        this.itemCategory);
    when(this.dozer.map(this.productTransactionResponse,Off2OnCartItem.class)).thenReturn(this
        .off2OnCartItem);

    Map<String, Off2OnCartItem> result =
        this.productClientserviceImpl.getProductDataByItemSkuList(
            ProductClientServiceImplTest.REQUESTID, ProductClientServiceImplTest.USERNAME,
            itemSkuList);

    assertThat(result, notNullValue());
    assertThat(this.off2OnCartItem, notNullValue());
    verify(this.clientProduct).getProductForTransactionByItemSkus(
        ProductClientServiceImplTest.REQUESTID, ProductClientServiceImplTest.USERNAME,
        this.itemSkuList);
    verify(this.constructorService).convertCatalogsListDtoToCategory(this.itemCatalogs);
    verify(this.dozer).map(this.productTransactionResponse,Off2OnCartItem.class);
  }

  @Test
  public void getListOfItemNamesNullResponceValue() throws Exception {
    try {
      when(this.clientProduct.getItemNameByItemSku(ProductClientServiceImplTest.REQUESTID,
          ProductClientServiceImplTest.USERNAME, this.itemSkuList)).thenThrow(Exception.class);
      this.productClientserviceImpl.getListOfItemNames(ProductClientServiceImplTest.REQUESTID,
          ProductClientServiceImplTest.USERNAME, this.itemSkuList);
    }catch (Exception e){
      assertThat(e, Matchers.instanceOf(Exception.class));
    }

    verify(this.clientProduct).getItemNameByItemSku(ProductClientServiceImplTest.REQUESTID,
        ProductClientServiceImplTest.USERNAME,this.itemSkuList);
  }
  @Test
  public void getListOfItemNamesSuccess() throws Exception {
    when(this.clientProduct.getItemNameByItemSku(ProductClientServiceImplTest.REQUESTID,
        ProductClientServiceImplTest.USERNAME,this.itemSkuList)).thenReturn(this
        .simpleMapStringResponseGdnRestSingleResponse);
    this.simpleItemNameVOs= this.productClientserviceImpl.getListOfItemNames
        (ProductClientServiceImplTest.REQUESTID, ProductClientServiceImplTest.USERNAME,this.itemSkuList);
    assertNotNull(this.simpleItemNameVO);
    assertNotNull(this.simpleMapStringResponseGdnRestSingleResponse);
    verify(this.clientProduct).getItemNameByItemSku(ProductClientServiceImplTest.REQUESTID,
        ProductClientServiceImplTest.USERNAME,this.itemSkuList);
  }

  @Before
  public void setUp() {
    initMocks(this);

    this.off2OnCartItems = new TreeSet<>();
    this.stringOff2OnCartItemMap = new HashMap<>();
    this.off2OnCartItem = new Off2OnCartItem();
    this.detail = new ItemDetail();
    this.detail.setItemCatentryId(ProductClientServiceImplTest.CATENTRYID);
    this.off2OnCartItem.setQuantity(ProductClientServiceImplTest.QTY);
    this.off2OnCartItem.setItemSku(ProductClientServiceImplTest.ITEMSKU);
    this.off2OnCartItem.setItemDetail(this.detail);
    this.off2OnCartItems.add(this.off2OnCartItem);
    stringOff2OnCartItemMap.put(OFF2OnKEY_KEY, this.off2OnCartItem);
    this.pulsaCart = new Off2OnCart();
    this.pulsaCart.setOff2OnCartItems(this.off2OnCartItems);

    HandlingFeeRequestRestWeb handlingFeeRequest = new HandlingFeeRequestRestWeb();
    handlingFeeRequest.setItemSku(ProductClientServiceImplTest.ITEMSKU);
    handlingFeeRequest.setQuantity(ProductClientServiceImplTest.QTY);

    this.listHandleRequest = new ArrayList<HandlingFeeRequestRestWeb>();
    this.listHandleRequest.add(handlingFeeRequest);

    this.handlingResponse = new HandlingFeeResponseRestWeb();
    this.handlingResponse.setId(ProductClientServiceImplTest.ID);
    this.handlingResponse.setStoreId(ProductClientServiceImplTest.STOREID);
    this.handlingResponse.setTotalHandlingFee(new BigDecimal(0.0));
    this.response =
        new GdnRestSingleResponse<HandlingFeeResponseRestWeb>(this.handlingResponse,
            ProductClientServiceImplTest.REQUESTID);

    ItemCategoryDTO itemDTO = new ItemCategoryDTO();
    itemDTO.setCategory(ProductClientServiceImplTest.CATEGORY);
    itemDTO.setCategoryId(ProductClientServiceImplTest.CATEGORYID);
    itemDTO.setLevel(ProductClientServiceImplTest.LEVEL);
    itemDTO.setProductCategoryCode(ProductClientServiceImplTest.PRODUCTCATEGORYID);

    List<ItemCategoryDTO> listItemCategoryDTO = new ArrayList<ItemCategoryDTO>();
    listItemCategoryDTO.add(itemDTO);

    List<List<ItemCategoryDTO>> listofListItemDTO = new ArrayList<List<ItemCategoryDTO>>();
    listofListItemDTO.add(listItemCategoryDTO);

    this.itemCategoryDTO = new HashMap<String, List<List<ItemCategoryDTO>>>();
    this.itemCategoryDTO.put("itemCategories", listofListItemDTO);

    ItemCatalogDTO itemCatalog = new ItemCatalogDTO();
    itemCatalog.setCatalogId("itemCategories");
    itemCatalog.setItemCategories(listItemCategoryDTO);

    this.itemCatalogs = new ArrayList<ItemCatalogDTO>();
    this.itemCatalogs.add(itemCatalog);

    this.itemCategory = new HashMap<String, List<List<ItemCategory>>>();
    BeanUtils.copyProperties(this.itemCategoryDTO, this.itemCategory);

    this.Map = new HashMap<>();
    this.stringStringMap = new HashMap<>();
    this.stringStringMap.put(SAMPLE_MAP_KEY, ITEMSKU);

    ProductItemDetailDTO prodItemDetailDTO = new ProductItemDetailDTO();
    prodItemDetailDTO.setItemCatentryId(ProductClientServiceImplTest.CATENTRYID);
    prodItemDetailDTO.setItemCatalogs(this.itemCatalogs);

    ItemDetail itemDetail = new ItemDetail();
    itemDetail.setItemCatentryId(ProductClientServiceImplTest.CATENTRYID);
    itemDetail.setItemCategories(this.itemCategory);

    this.itemSku = new ArrayList<String>();
    this.itemSku.add(ProductClientServiceImplTest.ITEMSKU);

    this.itemSkuList = new ArrayList<String>();
    this.itemSkuList.add(ProductClientServiceImplTest.ITEMSKU);

    this.simpleItemNameVOs = new ArrayList<>();

    this.simpleItemNameVO = new SimpleItemNameVO();
    this.simpleItemNameVO.setItemSku(ITEMSKU);

    this.simpleMapStringResponse = new SimpleMapStringResponse();
    this.simpleMapStringResponseGdnRestSingleResponse =
        new GdnRestSingleResponse<>("", "", true, this.simpleMapStringResponse,
            ProductClientServiceImplTest.REQUESTID);
    this.simpleMapStringResponseGdnRestSingleResponse.setValue(this.simpleMapStringResponse);

    this.simpleVO = new SimpleItemVO();
    this.simpleVO.setOfferPrice(ProductClientServiceImplTest.PRICE);
    this.Map.put(SIMPLEVO_KEY, this.simpleVO);
    this.simpleResponse = new SimpleItemResponse();
    this.simpleResponse.setOfferPrice(ProductClientServiceImplTest.PRICE);
    this.off2OnPriceResponse = new Off2OnPriceResponse();
    this.off2OnPriceResponse.setOfferPrice(ProductClientServiceImplTest.PRICE);

    this.simpleItemVOList = new ArrayList<SimpleItemVO>();
    this.simpleItemVOList.add(this.simpleVO);

    this.simpleItemResposeList = new ArrayList<SimpleItemResponse>();
    this.simpleItemResposeList.add(this.simpleResponse);
    this.off2OnPriceResponses = new ArrayList<>();
    this.off2OnPriceResponses.add(this.off2OnPriceResponse);

    this.productTransactionResponse = new ProductForTransactionResponse();
    this.productTransactionResponse.setItemSku(ProductClientServiceImplTest.ITEMSKU);
    this.productTransactionResponse.setItemDetail(prodItemDetailDTO);

    this.productForTransactionResponseList = new ArrayList<ProductForTransactionResponse>();
    this.productForTransactionResponseList.add(this.productTransactionResponse);

    this.gdnListSimpleItemResponse =
        new GdnRestListResponse<SimpleItemResponse>(this.simpleItemResposeList, new PageMetaData(0,
            0, 10), ProductClientServiceImplTest.REQUESTID);
    this.off2OnPriceResponseGdnRestListResponse =
        new GdnRestListResponse<>(this.off2OnPriceResponses, new PageMetaData(0, 0, 10),
            ProductClientServiceImplTest.REQUESTID);

    this.gdnListProductTransactionResponse =
        new GdnRestListResponse<ProductForTransactionResponse>(
            this.productForTransactionResponseList, new PageMetaData(0, 0, 10),
            ProductClientServiceImplTest.REQUESTID);
  }

  @After
  public void tearDown() {
    verifyNoMoreInteractions(this.clientProduct);
    verifyNoMoreInteractions(this.constructorService);
  }
}
*/

