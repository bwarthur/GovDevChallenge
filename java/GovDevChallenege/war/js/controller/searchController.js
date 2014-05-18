app.controller("searchController", function($scope, auditorService, loggingService) 
{
	var isDebug = true;
	$scope.serviceName = "searchController";
	this.endPointPath = "/auditorEndpoint/v1";
	
	console.log($scope.serviceName);
	
    $scope.showGrid = function() {
        return typeof($scope.allData) != 'undefined';
    }	
    
    $scope.totalServerItems = 0;
    
    $scope.pagingOptions = {
            pageSizes: [10],
            pageSize: 10,
            currentPage: 1
        };	    
    
    $scope.setPagingData = function(data, page, pageSize){	
        var pagedData = data.slice((page - 1) * pageSize, page * pageSize);
        $scope.slicedData = pagedData;
        $scope.totalServerItems = data.length;
        if (!$scope.$$phase) {
            $scope.$apply();
        }
    };    
    
    $scope.gridOptions = { 
    		data: 'slicedData',
            enablePaging: true,
    		showFooter: true,
            columnDefs: [
                         	{ field:'vendorName', displayName:'Vendor Name' }
                         ],
            totalServerItems: 'totalServerItems',
            pagingOptions: $scope.pagingOptions                      
	};    
	
    $scope.$watch('pagingOptions', function (newVal, oldVal) {
        if (newVal !== oldVal && newVal.currentPage !== oldVal.currentPage) {
        	$scope.setPagingData($scope.allData, $scope.pagingOptions.currentPage, $scope.pagingOptions.pageSize);
        }
    }, true);
    
    $scope.searchX = function()
    {
    	console.log('searchX');
    	loggingService.debug(isDebug, $scope.auditorSearchCriteria);
    	
    	auditorService.search($scope.auditorSearchCriteria).then(function(data) {
    		console.log(data);
    		$scope.allData = data.items;
    		$scope.setPagingData(data.items, 1, 10)
    	});
    }
	
});
