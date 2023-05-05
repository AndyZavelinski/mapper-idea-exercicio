class Periferico {
    constructor(nome, modelo, n_serie, tipo_de_periferico) {
        this._nome = nome;
        this._modelo= modelo;
        this._n_serie = n_serie;
        this._tipo_de_periferico = tipo_de_periferico;
    }

    showData() {
        console.log('Nome: ' + this._nome);
        console.log('Modelo: ' + this._modelo);
        console.log('N° de série: ' + this._n_serie);
        console.log('Tipo: ' + this._tipo_de_periferico);
    }

    setNome(nome) {
        this._nome = nome;
    }

    getNome(nome) {
        return this._nome;
    }

    setModelo(modelo) {
        this._modelo = modelo;
    }

    getModelo(modelo) {
        return this._modelo;
    }
    setNSerie(n_serie) {
        this._n_serie = n_serie;
    }

    getNSerie(n_serie) {
        return this._n_serie;

    } setTipo(tipo_de_periferico) {
        this._tipo_de_periferico = tipo_de_periferico;
    }

    getTipo(tipo_de_periferico) {
        return this._tipo_de_periferico;
    }
}