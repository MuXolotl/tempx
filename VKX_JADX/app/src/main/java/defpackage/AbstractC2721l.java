package defpackage;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: lؔٚؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2721l {
    public static final C3624l loadAd;
    public static final LinkedHashSet yandex;

    static {
        List<C2312l> listRemoteconfig = AbstractC14055l.remoteconfig(AbstractC6830l.yandex, AbstractC6830l.admob, AbstractC6830l.subs, AbstractC6830l.crashlytics, AbstractC6830l.amazon, AbstractC6830l.billing);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C2312l c2312l : listRemoteconfig) {
            linkedHashSet.add(new C3624l(c2312l.loadAd(), c2312l.yandex.mopub()));
        }
        yandex = linkedHashSet;
        C2312l c2312l2 = AbstractC6830l.mopub;
        loadAd = new C3624l(c2312l2.loadAd(), c2312l2.yandex.mopub());
    }
}
