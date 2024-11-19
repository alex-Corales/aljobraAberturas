document.addEventListener('DOMContentLoaded', function() {
    const mamparasList = document.getElementById('mamparasList');
    const mamparaForm = document.getElementById('mamparaForm');
    const saveMamparaButton = document.getElementById('saveMampara');
    const mamparaModal = new bootstrap.Modal(document.getElementById('mamparaModal'));
    const detailsModal = new bootstrap.Modal(document.getElementById('detailsModal'));
    const deleteConfirmModal = new bootstrap.Modal(document.getElementById('deleteConfirmModal'));
    const deleteSuccessModal = new bootstrap.Modal(document.getElementById('deleteSuccessModal'));
    const confirmDeleteButton = document.getElementById('confirmDelete');
    let mamparaToDeleteId = null;

    // Load mamparas on page load
    loadMamparas();

    // Event listener for save button
    saveMamparaButton.addEventListener('click', saveMampara);

    // Event listener for confirm delete button
    confirmDeleteButton.addEventListener('click', function() {
        if (mamparaToDeleteId) {
            deleteMampara(mamparaToDeleteId);
            deleteConfirmModal.hide();
        }
    });

    function loadMamparas() {
        fetch('/mamparas')
            .then(response => response.json())
            .then(mamparas => {
                mamparasList.innerHTML = '';
                mamparas.forEach(mampara => {
                    const row = createMamparaRow(mampara);
                    mamparasList.appendChild(row);
                });
            })
            .catch(error => console.error('Error:', error));
    }

    function createMamparaRow(mampara) {
        const row = document.createElement('tr');
        row.innerHTML = `
            <td>${mampara.direccion}</td>
            <td>${mampara.numeroTelefono}</td>
            <td>
                <div class="action-buttons">
                    <button class="btn btn-sm btn-info edit-mampara" data-id="${mampara.idMampara}">Editar</button>
                    <button class="btn btn-sm btn-danger delete-mampara" data-id="${mampara.idMampara}">Eliminar</button>
                    <button class="btn btn-sm btn-secondary view-details" data-id="${mampara.idMampara}">Ver más</button>
                </div>
            </td>
        `;

        row.querySelector('.edit-mampara').addEventListener('click', () => editMampara(mampara));
        row.querySelector('.delete-mampara').addEventListener('click', () => showDeleteConfirmModal(mampara.idMampara));
        row.querySelector('.view-details').addEventListener('click', () => viewDetails(mampara));

        return row;
    }

    function saveMampara() {
        const mampara = {
            idMampara: document.getElementById('idMampara').value,
            direccion: document.getElementById('direccion').value,
            numeroTelefono: document.getElementById('numeroTelefono').value,
            alto: parseFloat(document.getElementById('alto').value),
            anchoAbajo: parseFloat(document.getElementById('anchoAbajo').value),
            anchoArriba: parseFloat(document.getElementById('anchoArriba').value),
            ubicacionDucha: document.getElementById('ubicacionDucha').value
        };

        const url = mampara.idMampara ? `/mamparas/modificar/${mampara.idMampara}` : '/mamparas/crear';
        const method = mampara.idMampara ? 'PUT' : 'POST';

        fetch(url, {
            method: method,
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(mampara),
        })
        .then(response => response.text())
        .then(message => {
            alert(message);
            mamparaModal.hide();
            loadMamparas();
            mamparaForm.reset();
        })
        .catch(error => console.error('Error:', error));
    }

    function editMampara(mampara) {
        document.getElementById('idMampara').value = mampara.idMampara;
        document.getElementById('direccion').value = mampara.direccion;
        document.getElementById('numeroTelefono').value = mampara.numeroTelefono;
        document.getElementById('alto').value = mampara.alto;
        document.getElementById('anchoAbajo').value = mampara.anchoAbajo;
        document.getElementById('anchoArriba').value = mampara.anchoArriba;
        document.getElementById('ubicacionDucha').value = mampara.ubicacionDucha;
        document.getElementById('mamparaModalLabel').textContent = 'Editar Mampara';
        mamparaModal.show();
    }

    function showDeleteConfirmModal(id) {
        mamparaToDeleteId = id;
        deleteConfirmModal.show();
    }

    function deleteMampara(id) {
        fetch(`/mamparas/eliminar/${id}`, {
            method: 'DELETE',
        })
        .then(response => response.text())
        .then(message => {
            deleteSuccessModal.show();
            loadMamparas();
        })
        .catch(error => console.error('Error:', error));
    }

    function viewDetails(mampara) {
        const detailsModalBody = document.getElementById('detailsModalBody');
        detailsModalBody.innerHTML = `
            <p><strong>Dirección:</strong> ${mampara.direccion}</p>
            <p><strong>Teléfono:</strong> ${mampara.numeroTelefono}</p>
            <p><strong>Alto:</strong> ${mampara.alto}</p>
            <p><strong>Ancho Abajo:</strong> ${mampara.anchoAbajo}</p>
            <p><strong>Ancho Arriba:</strong> ${mampara.anchoArriba}</p>
            <p><strong>Ubicación Ducha:</strong> ${mampara.ubicacionDucha}</p>
            <p><strong>Corte Alto Paño Corredizo:</strong> ${mampara.corteAltoPañoCorredizo}</p>
            <p><strong>Corte Alto Paño Fijo:</strong> ${mampara.corteAltoPañoFijo}</p>
            <p><strong>Corte Ancho Paños:</strong> ${mampara.corteAnchoPaños}</p>
        `;
        detailsModal.show();
    }

    // Reset form when modal is hidden
    document.getElementById('mamparaModal').addEventListener('hidden.bs.modal', function () {
        mamparaForm.reset();
        document.getElementById('idMampara').value = '';
        document.getElementById('mamparaModalLabel').textContent = 'Nueva Mampara';
    });
});