package defpackage;

import ua.itaysonlab.catalogkit.objects.Catalog2Response;

/* JADX INFO: renamed from: lّؗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4842l extends AbstractC8189l {
    public final String billing;
    public final String mopub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4842l() {
        super(Catalog2Response.class);
        C16287l.yandex.getClass();
        long jCrashlytics = C16287l.crashlytics();
        this.billing = "catalog";
        this.mopub = "getAudio";
        metrica("need_blocks", true);
        vip("url", AbstractC15560l.ads(jCrashlytics, "?section=all", new StringBuilder("https://vk.com/audios")));
    }

    @Override // defpackage.AbstractC8189l
    public final String firebase() {
        return this.mopub;
    }

    @Override // defpackage.AbstractC8189l
    public final String isPro() {
        return this.billing;
    }
}
