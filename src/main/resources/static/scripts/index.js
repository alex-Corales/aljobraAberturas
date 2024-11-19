document.addEventListener('DOMContentLoaded', function() {
    const presupuestoBtn = document.getElementById('presupuestoBtn');
    const presupuestoModal = new bootstrap.Modal(document.getElementById('presupuestoModal'));

    presupuestoBtn.addEventListener('click', function() {
        presupuestoModal.show();
    });
});