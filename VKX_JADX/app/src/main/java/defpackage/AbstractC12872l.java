package defpackage;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lؘّۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12872l {
    public static final C16543l amazon;
    public static final C16543l crashlytics;
    public static final C16543l loadAd;
    public static final C16543l yandex;

    static {
        int i = 11;
        yandex = new C16543l(i, C2580l.f5619l);
        int i2 = 4096;
        AbstractC12704l.yandex(4096);
        C12881l c12881l = new C12881l(i2);
        AbstractC12704l.yandex(4096);
        loadAd = new C16543l(i, new C9192l(c12881l, new C12881l(i2)));
        crashlytics = new C16543l(i, Boolean.FALSE);
        amazon = new C16543l(i, Boolean.TRUE);
    }

    public static final void crashlytics(C9477l c9477l, AbstractC5162l... abstractC5162lArr) throws IOException {
        loadAd(c9477l, AbstractC8669l.m2415super(abstractC5162lArr));
    }

    public static final void loadAd(C9477l c9477l, List list) throws IOException {
        c9477l.loadAd().yandex(yandex, AbstractC18296l.admob(list));
        String strM4210case = AbstractC16901l.m4210case(list, null, null, null, new C17015l(10, new C9987l()), 31);
        Map map = c9477l.mopub;
        if (!AbstractC8576l.yandex(map, Boolean.valueOf(c9477l.billing))) {
            if (!AbstractC2812l.advert(map)) {
                C11586l.yandex();
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            c9477l.mopub = linkedHashMap;
            c9477l.billing = true;
            map = linkedHashMap;
        }
        AbstractC9464l.loadAd(map).put("coil#transformations", strM4210case);
    }

    public static final void yandex(C9477l c9477l, boolean z) {
        int i = z ? 200 : 0;
        C16543l c16543l = AbstractC10413l.yandex;
        c9477l.loadAd().yandex(AbstractC10413l.yandex, i > 0 ? new C1962l(i) : InterfaceC3457l.yandex);
    }
}
