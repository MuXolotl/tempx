package defpackage;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؙٔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14721l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC16860l f28781l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28782l;

    public /* synthetic */ C14721l(AbstractC16860l abstractC16860l, int i) {
        this.f28782l = i;
        this.f28781l = abstractC16860l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f28782l;
        AbstractC16860l abstractC16860l = this.f28781l;
        switch (i) {
            case 0:
                return Arrays.asList(abstractC16860l.smaato().mo2270l(AbstractC3974l.firebase), abstractC16860l.smaato().mo2270l(AbstractC3974l.remoteconfig), abstractC16860l.smaato().mo2270l(AbstractC3974l.vip), abstractC16860l.smaato().mo2270l(AbstractC3974l.smaato));
            default:
                EnumMap enumMap = new EnumMap(EnumC15893l.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (EnumC15893l enumC15893l : EnumC15893l.values()) {
                    String strLoadAd = enumC15893l.f31171l.loadAd();
                    if (strLoadAd == null) {
                        AbstractC16860l.yandex(47);
                        throw null;
                    }
                    AbstractC15211l abstractC15211lAd = abstractC16860l.firebase(strLoadAd).ad();
                    if (abstractC15211lAd == null) {
                        AbstractC16860l.yandex(48);
                        throw null;
                    }
                    String strLoadAd2 = enumC15893l.f31170l.loadAd();
                    if (strLoadAd2 == null) {
                        AbstractC16860l.yandex(47);
                        throw null;
                    }
                    AbstractC15211l abstractC15211lAd2 = abstractC16860l.firebase(strLoadAd2).ad();
                    if (abstractC15211lAd2 == null) {
                        AbstractC16860l.yandex(48);
                        throw null;
                    }
                    enumMap.put(enumC15893l, abstractC15211lAd2);
                    map.put(abstractC15211lAd, abstractC15211lAd2);
                    map2.put(abstractC15211lAd2, abstractC15211lAd);
                }
                return new C5611l(enumMap, map, map2);
        }
    }
}
