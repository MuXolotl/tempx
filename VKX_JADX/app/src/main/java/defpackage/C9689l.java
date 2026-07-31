package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٍٜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9689l extends C1579l {
    public final /* synthetic */ C8315l mopub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9689l(C8315l c8315l) {
        super(20);
        this.mopub = c8315l;
    }

    @Override // defpackage.C1579l
    public final Object yandex(Object obj) throws Throwable {
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        AbstractC1051l.billing(str);
        C8315l c8315l = this.mopub;
        c8315l.m2927l();
        AbstractC1051l.billing(str);
        C8648l c8648l = c8315l.f13233l.f14451l;
        C6901l.m2082case(c8648l);
        C4816l c4816lM2378l = c8648l.m2378l(str);
        if (c4816lM2378l == null) {
            return null;
        }
        C8118l c8118l = ((C17417l) c8315l.f833l).f33950l;
        C17417l.admob(c8118l);
        c8118l.f16911l.loadAd(str, "Populate EES config from database on cache miss. appId");
        c8315l.m2303l(str, c8315l.m2312l(str, (byte[]) c4816lM2378l.f9860l));
        C9689l c9689l = c8315l.f17212l;
        synchronized (c9689l.crashlytics) {
            linkedHashMap = new LinkedHashMap(c9689l.loadAd.yandex.entrySet().size());
            for (Map.Entry entry : c9689l.loadAd.yandex.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (C15973l) linkedHashMap.get(str);
    }
}
