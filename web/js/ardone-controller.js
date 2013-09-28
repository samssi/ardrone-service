var url = "http://localhost:8080/";
var controllerServlet = url + "control/";
var directionServlet = url + "direction/";
var controller = angular.module('controller', ['ui.utils']);

function CommandController($scope, $http) {
    $scope.takeoff = function() {
        console.log('t')
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

    $scope.up = function() {
        console.log('up')
    }

    $scope.down = function() {
        console.log('down')
    }

    $scope.left = function() {
        console.log('left')
    }
    $scope.right = function() {
        console.log('right')
    }
    $scope.emergency = function() {
        console.log('emergency')
    }
}

