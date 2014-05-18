app.controller("searchController", function($scope) 
{
	var isDebug = true;
	$scope.serviceName = "searchController";
	this.endPointPath = "/auditorEndpoint/v1";
	
	console.log($scope.serviceName);
	
    $scope.searchX = function()
    {
    	console.log('searchX');
    	alert('test');
    	
    	serviceClientService.put(isDebug, $scope.serviceName, this.endPointPath + "/search", searchCriteria).then(function(data) {
    		console.log(data);
    	});
    	
//        loggingService.debug(isDebug, $scope.employeeSearchCriteria);
//
//        employeeService.search($scope.employeeSearchCriteria).then(function(data){
//            if (data.recordCount == 0)
//                $scope.allData = [];
//            else
//                $scope.allData = data.items;
//
//        }, function(error){
//            loggingService.error(error);
//        });
    }
	
});
