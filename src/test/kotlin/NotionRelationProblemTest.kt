import com.petersamokhin.notionsdk.Notion
import io.ktor.client.HttpClient
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull

class NotionRelationProblemTest {
    @Test
    internal fun `should return table with relations`() {
        val databaseSchema = runBlocking {
            Notion
                .fromToken("secret_QgJO0Bwt1n9Kww2nvSxq74GqdEWTpBqTrSGGbImcWx8", httpClient = HttpClient())
                .retrieveDatabase("c6fd688e693842ceb9e4e5f55fc6ffad")
        }
        assertNotNull(databaseSchema)
    }
}