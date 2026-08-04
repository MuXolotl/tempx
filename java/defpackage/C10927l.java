package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lٌُۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10927l implements InterfaceC13241l {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C10927l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // defpackage.InterfaceC13241l
    public final void accept(Object obj) {
        int i = this.yandex;
        Object obj2 = this.loadAd;
        switch (i) {
            case 0:
                C13808l c13808l = (C13808l) obj;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    int i2 = c13808l.loadAd - ((C6822l) entry.getKey()).billing;
                    if (((C6822l) entry.getKey()).mopub) {
                        i2 = -i2;
                    }
                    int iIsPro = AbstractC18611l.isPro(i2);
                    C3716l c3716l = (C3716l) entry.getValue();
                    c3716l.getClass();
                    AbstractC12225l.firebase(new RunnableC7500l(c3716l, iIsPro, -1));
                }
                break;
            case 1:
                C17706l c17706l = (C17706l) obj2;
                AbstractC5088l.yandex("SurfaceViewImpl", "Safe to release surface.");
                if (c17706l != null) {
                    c17706l.yandex();
                }
                break;
            case 2:
                ((C5807l) obj2).loadAd((C7478l) obj);
                break;
            default:
                C12158l c12158l = (C12158l) obj2;
                AbstractC5088l.yandex("VideoEncoderSession", "Surface can be closed: " + ((C7478l) obj).loadAd);
                c12158l.mopub = null;
                ((C5807l) c12158l.smaato).loadAd((C7025l) c12158l.billing);
                c12158l.yandex();
                break;
        }
    }
}
