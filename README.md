# Test task
Тестовое приложение
# Architecture: MVI
#Screenshots:

![Screenshot_20221129_224444](https://user-images.githubusercontent.com/103441009/204635107-323abaaf-d561-483b-820e-d5bb87d36e95.png)
![Screenshot_20221129_224332](https://user-images.githubusercontent.com/103441009/204635116-4186f407-8a91-481c-8bf4-9cdd28e3c8b0.png)

# Stack:
    def lifecycle_version = "2.5.0-rc01"
    def retrofit_version = "2.9.0"
    def coroutines_version = "1.6.2"
    def gson_version = "2.9.0"
    def koin_version = "3.2.0"
    def logging_interceptor  = "4.10.0"
    def adapter_delegates_version = "4.3.2"
    def glide_version = "4.14.2"
    def nav_version = "2.5.3"

    // ViewModel
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    // LiveData
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
    // Retrofit
    implementation "com.squareup.retrofit2:retrofit:$retrofit_version"
    // Coroutines
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines_version"
    // Gson
    implementation "com.squareup.retrofit2:converter-gson:$retrofit_version"
    // Gson_Converter
    implementation "com.google.code.gson:gson:$gson_version"
    // Koin
    implementation "io.insert-koin:koin-android:$koin_version"
    // LoggingInterceptor
    implementation "com.squareup.okhttp3:logging-interceptor:$logging_interceptor"
    // Adapter_Delegates
    implementation "com.hannesdorfmann:adapterdelegates4-kotlin-dsl:$adapter_delegates_version"
    implementation "com.hannesdorfmann:adapterdelegates4-kotlin-dsl-viewbinding:$adapter_delegates_version"
    // Glide
    implementation "com.github.bumptech.glide:glide:$glide_version"
    annotationProcessor "com.github.bumptech.glide:compiler:$glide_version"
    // JetpackNavigation
    implementation "androidx.navigation:navigation-fragment-ktx:$nav_version"
    implementation "androidx.navigation:navigation-ui-ktx:$nav_version"

    implementation "androidx.fragment:fragment-ktx:1.5.4"
