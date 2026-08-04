package defpackage;

/* JADX INFO: renamed from: lٍْٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14790l {
    public static final C10705l crashlytics = new C10705l(new C16215l(false, false, false, false, false, false, false, false, false), AbstractC10651l.yandex);
    public final C13975l loadAd;
    public final C16215l yandex;

    static {
        AbstractC14707l.yandex(new C8864l(2));
    }

    public AbstractC14790l(C16215l c16215l, C13975l c13975l) {
        this.yandex = c16215l;
        this.loadAd = c13975l;
    }

    public final byte[] loadAd(InterfaceC16588l interfaceC16588l, Object obj) {
        C6129l c6129l = new C6129l();
        (this.yandex.admob ? new C17932l(this, c6129l) : new C5812l(this, c6129l)).purchase(interfaceC16588l, obj);
        int i = c6129l.loadAd;
        byte[] bArr = new byte[i];
        AbstractC8669l.applovin(c6129l.yandex, 0, 0, bArr, i, 2);
        return bArr;
    }

    public final Object yandex(InterfaceC16588l interfaceC16588l, byte[] bArr) {
        C6129l c6129l = new C6129l();
        c6129l.yandex = bArr;
        Object objMopub = new C18615l(this, new appmetrica(c6129l, this.yandex.mopub)).mopub(interfaceC16588l);
        if (bArr.length - c6129l.loadAd <= 0) {
            return objMopub;
        }
        throw new C5016l("Input contains " + (bArr.length - c6129l.loadAd) + " unprocessed bytes left after decoding a value.");
    }
}
