package defpackage;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: renamed from: lًٜۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8322l {
    public final C15435l loadAd;
    public final C3982l yandex;

    public C8322l(C3982l c3982l, C15435l c15435l) {
        this.yandex = c3982l;
        this.loadAd = c15435l;
    }

    public final C18067l yandex(C18067l c18067l) {
        String str;
        this.loadAd.getClass();
        String lowerCase = AbstractC16648l.advert(UUID.randomUUID().toString(), "-", "", false).toLowerCase(Locale.ROOT);
        return new C18067l(c18067l != null ? c18067l.crashlytics + 1 : 0, this.yandex.yandex().loadAd, lowerCase, (c18067l == null || (str = c18067l.loadAd) == null) ? lowerCase : str);
    }
}
