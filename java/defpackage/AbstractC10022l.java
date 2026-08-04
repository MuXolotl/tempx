package defpackage;

/* JADX INFO: renamed from: lَؑۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10022l implements InterfaceC13536l, InterfaceC2262l {
    public abstract C2369l admob();

    public abstract C8485l amazon();

    public abstract InterfaceC9354l crashlytics();

    public abstract C14249l loadAd();

    public abstract C2759l mopub();

    public abstract C8485l purchase();

    public final String toString() {
        return "HttpResponse[" + AbstractC3474l.mopub(this).getUrl() + ", " + mopub() + ']';
    }
}
