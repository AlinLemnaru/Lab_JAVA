CREATE TABLE IF NOT EXISTS evenimente
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    denumire    VARCHAR(255) NOT NULL,
    locatie     VARCHAR(255) NOT NULL,
    data        DATE NOT NULL,
    timp        TIME NOT NULL,
    pret_bilet  FLOAT NOT NULL
    );

INSERT INTO eveniment (denumire, locatie, data, timp, pret_bilet) VALUES
                                                                      ('Concert Rock', 'Sala Polivalenta', '2025-01-10', '19:00:00', 100.0),
                                                                      ('Teatru Clasic', 'Teatru National', '2025-01-15', '20:00:00', 50.0),
                                                                      ('Expozitie Pictura', 'Galeria Artelor', '2025-01-20', '10:00:00', 30.0),
                                                                      ('Expozitie Sculptura', 'Muzeul de Arta', '2025-01-25', '11:00:00', 40.0);
