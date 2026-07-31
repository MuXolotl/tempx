package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: lٌؖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4001l {
    public static final /* synthetic */ int yandex = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static C0332l yandex(C8082l c8082l) {
        C12294l c12294lPremium = C0332l.premium();
        int iInmobi = c8082l.inmobi();
        c12294lPremium.purchase();
        C0332l.signatures((C0332l) c12294lPremium.f19242l, iInmobi);
        for (C3251l c3251l : c8082l.appmetrica()) {
            C16389l c16389lAppmetrica = C3433l.appmetrica();
            String strInmobi = c3251l.appmetrica().inmobi();
            c16389lAppmetrica.purchase();
            C3433l.applovin((C3433l) c16389lAppmetrica.f19242l, strInmobi);
            EnumC8938l enumC8938lM1308package = c3251l.m1308package();
            c16389lAppmetrica.purchase();
            C3433l.premium((C3433l) c16389lAppmetrica.f19242l, enumC8938lM1308package);
            EnumC9483l enumC9483lM1310throws = c3251l.m1310throws();
            c16389lAppmetrica.purchase();
            C3433l.signatures((C3433l) c16389lAppmetrica.f19242l, enumC9483lM1310throws);
            int iInmobi2 = c3251l.inmobi();
            c16389lAppmetrica.purchase();
            C3433l.isVip((C3433l) c16389lAppmetrica.f19242l, iInmobi2);
            C3433l c3433l = (C3433l) c16389lAppmetrica.yandex();
            c12294lPremium.purchase();
            C0332l.isVip((C0332l) c12294lPremium.f19242l, c3433l);
        }
        return (C0332l) c12294lPremium.yandex();
    }
}
