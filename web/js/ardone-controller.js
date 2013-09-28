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
    function sendDirection(direction) {
        $http.get(directionServlet + direction);
    }

    $scope.throttleUp = function() {
        console.log('up')
        sendDirection('throttleUp')
    }

    $scope.throttleDown = function() {
        console.log('throttleDown')
        sendDirection('throttleDown')
    }

    $scope.yawLeft = function() {
        console.log('left')
        sendDirection('yawLeft')
    }
    $scope.yawRight = function() {
        console.log('right')
        sendDirection('yawRight')
    }
    $scope.emergency = function() {
        sendCommand('emergency')
    }
}

