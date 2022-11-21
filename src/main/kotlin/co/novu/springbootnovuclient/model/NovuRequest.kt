package co.novu.springbootnovuclient.model

data class NovuRequest(
        var name: String,
        var payload: Any,
        var to: Any //string or list of string
)