package cl.jpvs.practicatienda.data.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductApi {
    @GET("products/")
    suspend fun getDataProduct(): Response<List<Product>>


}