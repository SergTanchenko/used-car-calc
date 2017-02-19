$(document).ready(function () {
    var $carForm = $('#carForm');

    $carForm.submit(function (event) {
        event.preventDefault();
        // TODO: add validation
        // if (validation is OK)
        window.location.href = window.location.origin + "?" + $(this).serialize();
    });

    $('#submitFormBtn').click(function () {
        $carForm.submit();
    });
});
