
// <!DOCTYPE html>
// <html lang="en">

// <head>
//     <meta charset="utf-8">
//     <meta http-equiv="X-UA-Compatible" content="IE=edge">
//     <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0">
//     <!-- Global site tag (gtag.js) - Google Analytics -->
//     <script async src="https://www.googletagmanager.com/gtag/js?id=UA-1220997-18"></script>
//     <script>
//         window.dataLayer = window.dataLayer || [];
//         function gtag(){dataLayer.push(arguments);}
//         gtag('js', new Date());
//         gtag('config', 'UA-1220997-18');
//     </script>
//     <link rel="icon" type="image/x-icon" class="js-site-favicon" href="https://image1.jdomni.in/favicon/10112020/FC/B2/AD/A9FA6C75321625D0B9C4CC1B76_1605007114685.ico">
//     <title>Justdial Marketplace - Manage Products</title>
//     <link data-chunk="main" rel="stylesheet" href="https://static1.jdomni.in/mpstatic/digital-catalogue/styles/vendor.2941d21f.css">
// <link data-chunk="main" rel="stylesheet" href="https://static1.jdomni.in/mpstatic/digital-catalogue/styles/common.d74729b6.css">
// <link data-chunk="main" rel="stylesheet" href="https://static1.jdomni.in/mpstatic/digital-catalogue/styles/main.368f2eb2.css"><link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700&amp;display=swap" rel="stylesheet">
//     <style>
//         body {
//             -webkit-font-smoothing: antialiased;
//             -webkit-user-select: none;
//             -moz-user-select: none;
//             -ms-user-select: none;
//             user-select: none;
//         }
//     </style>
//     <style>
//         body{
//             margin:0;
//         }
//         @-webkit-keyframes placeholder-shimmer-loader {
//             0% {
//                 background-position: -300px 0;
//             }
//             100% {
//                 background-position: 300px 0;
//             }
//         }
        
//         @-moz-keyframes placeholder-shimmer-loader {
//             0% {
//                 background-position: -300px 0;
//             }
//             100% {
//                 background-position: 300px 0;
//             }
//         }
//         @keyframes placeholder-shimmer-loader {
//             0% {
//                 background-position: -300px 0;
//             }
//             100% {
//                 background-position: 300px 0;
//             }
//         }
//         .shimmer-loader {
//             -webkit-animation-name: placeholder-shimmer-loader;
//             -moz-animation-name: placeholder-shimmer-loader;
//             animation-name: placeholder-shimmer-loader;
//             -webkit-animation-duration: 1s;
//             -moz-animation-duration: 1s;
//             animation-duration: 1s;
//             -webkit-animation-fill-mode: forwards;
//             -moz-animation-fill-mode: forwards;
//             animation-fill-mode: forwards;
//             -webkit-animation-iteration-count: infinite;
//             -moz-animation-iteration-count: infinite;
//             animation-iteration-count: infinite;
//             -webkit-animation-timing-function: linear;
//             -moz-animation-timing-function: linear;
//             animation-timing-function: linear;
//             background: #f6f7f8;
//             background-image: -webkit-linear-gradient(left, #f6f7f8 0%, #edeef1 20%, #f6f7f8 40%, #f6f7f8 100%);
//             background-image: -moz-linear-gradient(left, #f6f7f8 0%, #edeef1 20%, #f6f7f8 40%, #f6f7f8 100%);
//             background-image: linear-gradient(left, #f6f7f8 0%, #edeef1 20%, #f6f7f8 40%, #f6f7f8 100%);
//             background-repeat: no-repeat;  
//             height: 104px;
//             position: relative;
//             overflow: hidden;
//         }
//         .shimmer-container .head-title,
//         .shimmer-container .prod-title,
//         .shimmer-container .sub-title,
//         .shimmer-container .min-order-qty,
//         .shimmer-container .price{
//             height: 12px;
//             border-radius: 2px;
//         }
//         .shimmer-container .head-title{
//             margin-bottom: 6px;
//             width: 50%;
//         }
//         .shimmer-container .sub-title{
//             width: 30%;
//         }
//         .shimmer-container .upload-label{
//             height: 54px;
//             border-bottom: 1px solid #ededed;
//             display: flex;
//             align-items: center;
//             justify-content: center;
//         }
//         .shimmer-container .prod-block .prod-desc{
//         max-width: unset;
//         position: unset;
//         }
//         .shimmer-container .prod-block{
//             padding: 15px 15px;
//             width: 100vw;
//             display: flex;
//             flex-wrap: unset;
//             justify-content: space-between;
//             position: relative;
//             background: white;
//         }
//         .shimmer-container .prod-block .fake-border {
//             height: 1px;
//             background-color: #ededed;
//             bottom: 0px;
//             width: calc(100% - 30px);
//             position: absolute;
//         }
//         .shimmer-container .prod-title{
//             max-width: unset !important;
//         }
//         .shimmer-container .img-holder{
//             width: 100px;
//             height: 100px;
//         border-radius: 10px;
//         margin-right: 10px;
//         }
//         .shimmer-container .prod-title,
//         .shimmer-container .min-order-qty{
//             margin-bottom: 8px;
//             margin-top: 0;
//         }
//         .shimmer-loader .prod-title{
//             margin-bottom: 0.5rem;
//         }
//         .shimmer-container .min-order-qty{
//             width: 75%;
//         }
//         .shimmer-container .price{
//             width: 50%;
//         }
//         @media (min-width:768px) {
//             .shimmer-container .upload-label{
//                justify-content: flex-start;
//            }
//            .shimmer-container .upload-label .head-title.shimmer-loader{
//                margin-left: 15px;
//            }
//         /*Shimmer loader*/
//     </style>
//     <script>history.scrollRestoration = "manual"</script>
// </head>

// <body >
//         <div id="root"><div class=""><div class="mobile-loader "><div class="svg-wrapper"><div class="circle"></div></div></div><div id="react-slider-holder" class="desktop"></div><div id="portal-root"></div><div class=" _1wCn ILGc   undefined " style="bottom:-72px"><div class="_2j-M"></div><div class="_1YHJ b1ii _2keU O7yk"><i class="icon-HDRcross"></i><div class="hSEy"></div></div></div><div class="toast-msg-div jd-font-roboto hide-msg"><div class="toast-msg"><div class="toast-info two-line-ellipsis"><div class="msg-div"></div></div></div></div><div class="mobile-loader " style="display:none"><div class="svg-wrapper"><div class="circle"></div></div></div></div></div>
//         <script>
//             window.PRELOADED_STATE = {"session":{"token":"ai94Y0hWazgxWmdBWWhxWEV1K0NrVStJSkxpbVQzTCtNMTlhWlo4QWFUV0l3ZWpPQnA4dWdUb3c3V3JZMHRxOA==","user":{"loginData":{"ownerMobileList":["99xxxx7358"],"ownerEmailList":[],"employeeMobileList":["9582039777"],"employeeEmailList":[],"employeeName":"DD Infosoft","isTestingContract":false,"employeeCode":28,"noUserCheck":false,"companyName":"Pooja Industries","newProfile":0},"token":"ai94Y0hWazgxWmdBWWhxWEV1K0NrVStJSkxpbVQzTCtNMTlhWlo4QWFUV0l3ZWpPQnA4dWdUb3c3V3JZMHRxOA==","rId":28,"autoLoginToken":"","loggedUser":{"userType":"JDEMPLOYEE","subType":"CONTRACTOR","userName":"9582039777","token":"ai94Y0hWazgxWmdBWWhxWEV1K0NrVStJSkxpbVQzTCtNMTlhWlo4QWFUV0l3ZWpPQnA4dWdUb3c3V3JZMHRxOA==","rId":28}},"profileObject":{"isRE":true,"isSer":false,"isSO":false,"SingleLabel":"Product","PluralLabel":"Products"},"img_required_flag":1,"isPaid":0,"basePath":"\u002Fvendor\u002Fmanage-products-genio\u002Fai94Y0hWazgxWmdBWWhxWEV1K0NrVStJSkxpbVQzTCtNMTlhWlo4QWFUV0l3ZWpPQnA4dWdUb3c3V3JZMHRxOA==","isVideoEnabled":true,"showCompanyDetails":true,"source":"b2b","isJdSourceAndroid":false,"isJdSourceIO isJdBusinessIOS":false,"redirectToJdExt":false,"isJdMart":false,"jdSource":null,"supplierId":null},"items":{"itemInfo":{"productId":"","productName":"","visibility":"ON_DISPLAY","isSellOnline":true,"isEnquiryEnabled":false,"isBulkPricingActive":false,"activeTab":"","unitOfMeasurement":null,"productReviewState":"onlineProduct","isBatchEnabled":false,"inventoryPolicy":"track-inventory","isPrescriptionRequired":false,"imageUrlArr":[],"outletWiseDeliveryList":[],"variantJson":[],"variantsInventoryJson":[],"packagingType":"","isAddInventoryLater":false,"selectedProductGroupIds":0,"productGroup":0,"bestBeforeUnit":"months","templateId":0,"productAttachmentList":null,"isAutoReorderLevel":true,"reorderLevel":0,"isAutoReorderQuantity":true,"reorderQuantity":0,"brandName":"","manufacturerName":"","associatedSuppliers":[],"associatedSuppliersDetails":[]},"undoInfo":[],"isTemplate":false,"itemCategoies":[],"newCategoryImage":[],"errors":{},"warnings":{},"displayInfo":{},"selectedCategory":[],"productPuvMap":null,"imagesUploadStatus":false},"products":{"allProducts":{"ADD_PRODUCT":{"imageUrlArr":[],"videoUrlIds":[]}},"allEnrichProducts":{},"listing":{"results":[],"companyDetails":{},"currentPage":1,"filterObj":{},"headerData":{},"newTabClicked":false},"filterProductObj":{},"search":{"results":[],"searchQuery":"","searchTab":""},"actionCardData":{"results":[],"filterQuery":""},"productList":{"results":[],"currentPage":1},"isAddProductSlider":false,"fromEditProductService":false,"isSearchSliderOpen":false,"isActionCardSliderOpen":false,"actionCardFilter":{"cardName":"","filterQuery":"","type":""},"isReloadCardSlider":false,"imagesBeingUploaded":[],"initialRespRejectAudit":"","editProduct":null,"enrichProduct":null,"currentEditPage":"listing","editImageOptions":null,"productUnderEdit":{},"uploadedFileModalData":{},"showAddEditProduct":false,"showEnrichEditProduct":false,"showItemSearch":false,"showEditOptions":false,"showAddPriceTag":false,"showOutDatedPriceTag":false,"fileAttachmentData":{"currentFile":{},"showViewDetailsSlider":false,"showProgressBar":false,"permissionData":{}},"approvalPendingList":[],"productConflictList":[],"auditPendingList":[],"rejectedList":[],"deletionPendingList":[],"brandSelDesel":{"list":{},"showActive":false,"showDeactive":false,"activateCount":0,"deactivateCount":0,"changedList":[]},"objectionableList":[],"brandList":[],"genericDeletionList":[],"confirmDeleteModal":false,"isToggleTab":false,"showInfoBox":true,"auditData":{"textAreaValue":"","checkedValue":""},"undoInfo":null,"vendorImages":null,"jdGalleryImages":null,"vendorObjectionableProducts":[],"countryList":[],"selectedCategoryType":"product","queueType":"","smartFillData":[],"auditorBrandedLog":[],"docIdSearch":false,"fromSellerDashboard":false,"tabIndex":0,"isActiveBrochure":false,"brochureAttachment":{"uploadingFiles":[],"showUploadHistorySlider":false,"uploadHistory":{"totalFiles":0,"totalErrors":0,"totalSuccess":0},"uploadProgress":0,"editNameDialog":false,"previewFile":{"fileMimeType":"jpg","filePreviewToggle":false},"uploadHistoryFiles":[],"fileAttachments":[]},"pricecardData":null,"pauseApprovalRedirect":false,"outDatedPricecardData":[],"pendingTabs":[],"showCategoryMissingCard":false,"categoryMissingCardData":[],"showCategoryMissingCardPersist":false,"showSupportSlider":false},"permissions":{},"deviceData":{"isMobile":false,"isIphone":false,"isIpad":false,"isIpadApp":false,"isIphoneApp":false,"isAndroidApp":false,"isMacOS":false,"isChrome":true,"phpSource":"WebBrowser"},"uom":{"uomJsonMap":[],"productUOM":[],"netweightUOM":[],"serviceUOM":[]},"discount":{"list":{"results":[],"pageNo":1}},"addEditDiscount":{"data":{},"customers":[],"customerGroup":[]},"supplierInfo":{"businessDetails":{"companyName":"","nickName":"","website":""},"contactDetails":[{"name":"","mobileNumber":[""],"landlineNumber":[""],"email":[""]}],"billingAddress":[{"pincode":"","addressline1":"","addressline2":"","area":"","city":"","state":"","country":"","latitude":"","longitude":""}],"taxDetails":{"panNumber":"","gstinNumber":""},"removeModal":null,"miscData":{"note":"","vendorLogo":""},"loading":false,"errors":{}},"brandCategory":{"showUpdateButton":[false,false],"selectAll":{"printAllCat":true,"printByBrand":true,"printAllBrands":true,"printByCat":true}},"bulkUpload":{"mappingOptions":{},"currentStep":0,"packagingMapping":{},"headerMapping":{},"bulkUploadServices":false},"videoupload":{"videos":{}},"toastMessage":{"showToastMessage":false,"message":"","duration":3000,"hasUndo":false,"onUndoClick":function(){}},"showLoader":false,"library":{"toastMessage":{},"deviceData":{"isBot":false,"isMobile":false,"isIphone":false,"isIpad":false,"isIpadApp":false,"isIphoneApp":false,"isAndroidApp":false,"isMacOS":false,"isUCBrowser":false,"isOpera":false,"isFirefox":false,"isChrome":true},"userSettings":{},"brandCategoryReducer":{"showUpdateButton":[false,false],"selectAll":{"printAllCat":true,"printByBrand":true,"printAllBrands":true,"printByCat":true}},"loaderReducer":false},"photosGallery":{"selectedImages":[],"addModal":{"show":false},"deleteModal":{"show":false},"jdPhotosData":{"variantId":null,"curImageUrl":""},"isJdPhotoSlider":false,"selectPhotoSlider":false},"videoLibrary":{"videos":{},"showLibrarySlider":false,"ignoreSave":false},"uploadOptions":{"type":"","sliderType":"","data":{}},"dashboard":{"data":[],"fields":[],"columns":[],"currentPage":1,"totalPages":1,"totalResult":1,"startCount":1,"endCount":1,"sortBy":"","modelList":null,"modelData":{},"lastEditedOn":null},"userSettings":{},"notificationCount":{},"contractor":{"contractorWelcome":false,"searchDataArr":[]},"productSpecification":{"initPuvSpecAttributes":[],"editablePuvSpecAttributes":[],"savedPuvSpecAttributes":[],"initCustomSpecAttributes":[{"key":{},"value":{}}],"savedCustomSpecAttributes":[],"specSliderState":false,"aiFlow":false,"productSmartFillSpec":[],"isEnrichSpec":false,"prevCatSpec":{}},"brandManufacturer":{"brandName":"","manufacturer":"","manufactured_details":"","importer":"","importers_detail":"","manufacturerMand":false,"sendDetails":[{"sid":"122","productId":null,"name":"brand","s_filter_flag":"1","values":[],"unit":""},{"sid":"","values":[],"name":"manufacturer","productId":null,"unit":"","s_filter_flag":"","isCustom":0},{"sid":"","values":[],"name":"manufactured_details","productId":null,"unit":"","s_filter_flag":"","isCustom":0},{"sid":"","values":[],"name":"importer","productId":null,"unit":"","s_filter_flag":"","isCustom":0},{"sid":"","values":[],"name":"importers_detail","productId":null,"unit":"","s_filter_flag":"","isCustom":0}],"installData":[{"name":"ins_days","values":[],"s_nm":"Installation Days","isCustom":1,"s_type":""},{"name":"ins_amount","values":[],"s_nm":"Installation Amount","isCustom":1,"s_type":""},{"name":"ins_cover","s_nm":"Covered under Standard Installation","values":[],"isCustom":1,"s_type":""},{"name":"ins_not_cover","values":[],"s_nm":"Not Covered under Standard Installation","isCustom":1,"s_type":""}],"contentWeightUnit":{"contentPerPiece":{"value":[],"error":""},"unitPerPiece":{"value":[],"error":""}},"contentWeightUnitSaved":{},"detailsSpecification":[],"brandSpec":[],"moq_require":0,"fixedSpecs":[]},"productInventory":{"currentTab":"ALL_PRODUCTS","viewinventorybatch":{"showDiag":false,"data":null},"allProducts":{"is_Fetching":false,"data":null,"error":null},"lowInventory":{"is_Fetching":false,"data":null,"error":null},"outOfStock":{"is_Fetching":false,"data":null,"error":null}},"variants":{"variantData":[],"variantCombinations":[],"variantProductData":[],"showEditVariantSlider":false,"variantTypeSlider":{"show":false,"mode":"add"},"variantOptionsSlider":{"show":false,"index":0},"variantDetailsSlider":false,"moreDetailsSlider":{"show":false,"productData":{},"onSave":function(){},"index":0},"syncImages":true,"showSyncImagesModal":false,"showSettings":false,"variantSpec":[]},"orderReturnInfo":{"tabsCount":[],"orderData":[],"searchData":[],"showShimmer":true,"viewClaimData":{},"filterList":{},"selectedTabKey":"","pageNo":1},"orderListing":{"tabsCount":[],"orderListingData":[],"pageNo":1,"showShimmer":true,"selectedTabKey":"","checkedListingList":[],"searchData":[],"filterList":[],"orderDetails":{}},"barcodeScanner":{"showScanner":false,"showScannerSecond":false,"showBarcodeResults":false,"failedStatus":false,"scannedBarcode":""},"hybrid":{"hybridToSend":[]},"deliveryOptions":{"deliveryOptionsList":[],"deliveryAgentsList":[],"multipleOrdersList":[],"orderId":null,"logistics_orderid":null,"vendor_group_orderid":null,"reassign_flag":false,"paid_status":null,"item_order_ids":[]},"deliveryBoy":{"deliveryBoyList":[]},"jdCategoryList":{"listing":{"existingJdId":[],"nonExistingJdId":[]},"showCatCoverSlider":false},"notifications":{"counts":{},"slider":false,"isImageUpload":false,"isProdFromListing":false},"feedback":{"showFeedbackForm":false,"options":{}}};
//         </script> <script id="__LOADABLE_REQUIRED_CHUNKS__" type="application/json">[]</script><script id="__LOADABLE_REQUIRED_CHUNKS___ext" type="application/json">{"namedChunks":[]}</script>
// <script async data-chunk="main" src="https://static1.jdomni.in/mpstatic/digital-catalogue/manifest.9fc801df.js"></script>
// <script async data-chunk="main" src="https://static1.jdomni.in/mpstatic/digital-catalogue/vendor.660cf56f.js"></script>
// <script async data-chunk="main" src="https://static1.jdomni.in/mpstatic/digital-catalogue/common.c1175576.js"></script>
// <script async data-chunk="main" src="https://static1.jdomni.in/mpstatic/digital-catalogue/main.872ec4c3.js"></script>
// </body>
 



//  import java.util.*;

//  public class Rough{
//     public static void main(String [] args){

//         Scanner sc = new Scanner(System.in);
//         System.out.println("eneter the value of x :-");
//         int x = sc.nextInt();

//         while(x<11){
//         System.out.println(x);
//         x++;
//         }
//     }
// }

 public class Rough {
    public static void main (String[] args){
        System.out.println("hello wprld");
    }
}
