package defpackage;

/* JADX INFO: renamed from: lَؓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10049l {
    public InterfaceC1361l admob;
    public String amazon;
    public C18389l firebase;
    public C18389l isPro;
    public EnumC9199l loadAd;
    public C13478l purchase;
    public long remoteconfig;
    public long smaato;
    public C18389l subs;
    public C4619l vip;
    public C17032l yandex;
    public int crashlytics = -1;
    public AbstractC6897l mopub = AbstractC6897l.f14438l;
    public InterfaceC14341l metrica = InterfaceC14341l.f28087l;
    public C16543l billing = new C16543l((byte) 0, 13);

    public static void loadAd(C18389l c18389l, String str) {
        if (c18389l != null) {
            if (c18389l.f35917l != null) {
                C10754l.metrica(str.concat(".networkResponse != null"));
            } else if (c18389l.f35912l != null) {
                C10754l.metrica(str.concat(".cacheResponse != null"));
            } else {
                if (c18389l.f35919l == null) {
                    return;
                }
                C10754l.metrica(str.concat(".priorResponse != null"));
            }
        }
    }

    public final C18389l yandex() {
        int i = this.crashlytics;
        if (i < 0) {
            C11983l.tapsense(this.crashlytics, "code < 0: ");
            return null;
        }
        C17032l c17032l = this.yandex;
        if (c17032l == null) {
            C8339l.smaato("request == null");
            return null;
        }
        EnumC9199l enumC9199l = this.loadAd;
        if (enumC9199l == null) {
            C8339l.smaato("protocol == null");
            return null;
        }
        String str = this.amazon;
        if (str != null) {
            return new C18389l(c17032l, enumC9199l, str, i, this.purchase, this.billing.smaato(), this.mopub, this.admob, this.subs, this.isPro, this.firebase, this.smaato, this.remoteconfig, this.vip, this.metrica);
        }
        C8339l.smaato("message == null");
        return null;
    }
}
