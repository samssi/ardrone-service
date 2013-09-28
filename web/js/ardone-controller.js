var controllerServlet = "http://localhost:8080/control/"
var controller = angular.module('controller', []);

function CommandController($scope, $http) {
    $scope.takeoff = function() {
        sendCommand("takeoff");
    }
    $scope.land = function() {
        sendCommand("land");
    }
    $scope.hover = function() {
        sendCommand("hover");
    }
    function sendCommand(command) {
        $http.get(controllerServlet + command);
    }
}

