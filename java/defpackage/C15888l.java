package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٕۗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15888l extends AbstractC4957l {
    public static final C3498l purchase = C3498l.purchase("clone");

    @Override // defpackage.AbstractC4957l
    public final List admob() {
        C6162l c6162l = InterfaceC5706l.f12087l;
        AbstractC10170l abstractC10170l = this.loadAd;
        C17134l c17134lM4263l = C17134l.m4263l(abstractC10170l, purchase, 1, c6162l);
        C7073l c7073lMo2892l = abstractC10170l.mo2892l();
        AbstractC15211l abstractC15211lPurchase = AbstractC3759l.purchase(abstractC10170l).purchase();
        C6561l c6561l = AbstractC6004l.crashlytics;
        C2580l c2580l = C2580l.f5619l;
        c17134lM4263l.mo2896l(null, c7073lMo2892l, c2580l, c2580l, c2580l, abstractC15211lPurchase, 3, c6561l);
        return Collections.singletonList(c17134lM4263l);
    }
}
