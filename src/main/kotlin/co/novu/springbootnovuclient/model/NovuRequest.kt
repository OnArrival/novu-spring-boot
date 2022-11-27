package co.novu.springbootnovuclient.model

data class NovuRequest(
        var name: String?=null,
        var payload: Any?=null,
        var to: Any? =null //string or list of string
)