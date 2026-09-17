package io.writeopia.update.api

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.http.isSuccess
import io.writeopia.app.endpoints.EndPoints
import io.writeopia.sdk.serialization.response.DesktopAppVersionResponse

class DesktopUpdateApi(
    private val client: HttpClient,
    private val baseUrl: String
) : DesktopUpdateVersionSource {

    override suspend fun latestVersion(): DesktopAppVersionResponse {
        val response =
            client.get("${baseUrl.trimEnd('/')}/api/${EndPoints.desktopAppVersion()}")

        check(response.status.isSuccess()) {
            "Desktop app version request failed with HTTP ${response.status.value}"
        }

        return response.body()
    }
}
