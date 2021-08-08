package com.example.loco.network
import com.example.`object`.Constant
import com.example.remote.YoutubeApi
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val networkModule = module {

    factory { providerOkHttpClient() }
    factory { providerApi(get())
    }
    single { providerRetrofitClient(get()) }
}

fun providerRetrofitClient(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(Constant.BASE_URL)
        .client(okHttpClient)
        .build()
}

fun providerOkHttpClient(): OkHttpClient {
    return OkHttpClient().newBuilder()
        .connectTimeout(30,TimeUnit.SECONDS)
        .writeTimeout(30,TimeUnit.SECONDS)
        .readTimeout(30,TimeUnit.SECONDS)
        .build()

}

fun providerApi(retrofit: Retrofit): YoutubeApi {
    return retrofit.create(YoutubeApi::class.java)
}


