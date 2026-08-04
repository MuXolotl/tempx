package defpackage;

/* JADX INFO: renamed from: lٕٕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14908l extends UnsupportedOperationException {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f29350l;

    public C14908l(AbstractC10022l abstractC10022l, InterfaceC1388l interfaceC1388l, InterfaceC1388l interfaceC1388l2) {
        this.f29350l = AbstractC1833l.firebase("\n        Expected response body of the type '" + interfaceC1388l2 + "' but was '" + interfaceC1388l + "'\n        In response from `" + AbstractC3474l.mopub(abstractC10022l).getUrl() + "`\n        Response status `" + abstractC10022l.mopub() + "`\n        Response header `ContentType: " + abstractC10022l.yandex().signatures("Content-Type") + "` \n        Request header `Accept: " + AbstractC3474l.mopub(abstractC10022l).yandex().signatures("Accept") + "`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f29350l;
    }
}
