package com.osu.tt

import com.osu.tt.models.Table
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**Implementation of api methods and their parameters. Any method expects the name of the api method to be passed in the form method_name.php*/
interface API {
    @GET("https://www.osu.ru/pages/schedule/?who=1&what=1&filial=1&group={group}&mode=full&bot=1")
            /**Auth methods.
             * @param method_name it method name which need use. Type - [String]
             * @param phone_number it phone number which use like login. Type - [String]
             * @param password it password for auth. Type - [String]
             *@return [AuthModel] */
    fun get(
        @Path("group") method_name: String?,
    ): Call<List<Table?>?>?
}