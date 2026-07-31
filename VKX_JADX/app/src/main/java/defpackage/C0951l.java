package defpackage;

/* JADX INFO: renamed from: lَؒؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C0951l<T> {
    public static final C1620l Companion = new C1620l();
    public final C4513l loadAd;
    public final Object yandex;

    static {
        C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse", null, 2);
        c13637l.smaato("response", true);
        c13637l.smaato("error", true);
    }

    public /* synthetic */ C0951l(int i, Object obj, C4513l c4513l) {
        if ((i & 1) == 0) {
            this.yandex = null;
        } else {
            this.yandex = obj;
        }
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = c4513l;
        }
    }

    public C0951l(Object obj) {
        this.yandex = obj;
        this.loadAd = null;
    }
}
