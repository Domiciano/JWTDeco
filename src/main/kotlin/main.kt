import java.util.*

fun main() {
    val token = "eyJhbGciOiJSUzI1NiJ9.eyJwZXJzSWQiOiI1NDU0OSIsInJvbGUiOiJST0xFX1VwZGF0ZS1uZXh1cyxST0xFX1Nob3ctZGFzaGJvYXJkLFJPTEVfU2hvdy1ob21lLFJPTEVfUXVlcnktbmVhci1jb250YWN0cyxST0xFX1VwZGF0ZS1zeW1wdG9tcyxST0xFX015LWNvbW11bml0aWVzLFJPTEVfQWRtaW4tbmVhci1jb250YWN0cyxST0xFX0dldC1wYXNzcG9ydCxST0xFX015LWRldmljZXMsUk9MRV9Tb2NpYWwtQ29udGFjcyxST0xFX015LUZvbGxvd3VwcyIsInBlcnNvbnMiOlt7InBlcnNJZCI6NTQ1NDksInBlcnNOYW1lIjoiRE9NSUNJQU5PICIsInBlcnNMYXN0bmFtZSI6IlJJTkNPTiBOSU5PIn1dLCJpbnN0aXR1dGlvbiI6MSwidXNlcm5hbWUiOiIxMTQzODQ4OTIyIiwiaWF0IjoxNjQ2MjU0MzkyLCJleHAiOjE2NDcxMTgzOTJ9.tlZzixXSP_wFDfTsaTHtcP8Yt6-IbfHHAgQT96xe6zQHPK-_IS_U8ItTmW3h7CsFNhszVZNLtf3Y02rtnGqyYj_AhbsOydTgrtvKk4phGWj-ycaZW4FlolN_cYL6eK18qnh-BU4qQlL9oT3zdgiBNc4H1dTyjWbUdnfGz4Oooab07D128vszwtRJBu9uaSa9-w6-yagy-mL_hFzdl-Tf2Zdxqmwv4VDYz1JCAp5yTG8VRf8xU6VUbFGk3d3k9zpoKHxJhZSKOd2FlTldR3qO9Ac3t9DzXjMkKsuE9B8kiffq9QTrWsmcKwiB5Z69CHoIy3LEKPf_8saUmyeW6pFqvAci00aIaSfX72EzYjVLfPU5qy8ZwuHNqpRnO6tLBrIm6HWiZhPxlE3RW40hqv-8WYL6UeIGCtqCdtKeE5cnT6NupbRwwhdr-hPCLdFhXiTDCx5XPPYJm81a240sPGoM8xLfkxx6kFp3RHT4xyayE6JceREVz5qPFAHL0NoRIZtsp6nRzvygeI42b64JLgmRJu7Cz5zTA0A2yliTFFFNFteD1LqcN1sjaTgzOIGjicNyPyVa_L0HufU7DGgoLOrMJVtJEgr9rBgZsc1J9owv7faH95EGoTVBx70nlhqV6lgxCWvgBsRePMEWY_MO5kOl1Zgm3LTn6Wjm8a7UQhAqFQE";
    val parts:List<String> = token.split(".")

    val decoder: Base64.Decoder = Base64.getUrlDecoder()

    val header = String(decoder.decode(parts[0]))
    val payload = String(decoder.decode(parts[1]))

    println(header)
    println(payload)

}