package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٌۣؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8543l {
    public static final C8195l yandex;

    static {
        C2580l c2580l = C2580l.f5619l;
        yandex = new C8195l(c2580l, c2580l);
    }

    public static final void yandex(C3625l c3625l, List list, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-1794596951);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(c3625l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        char c = ' ';
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(list) ? 32 : 16;
        }
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                C15012l c15012l = (C15012l) list.get(i4);
                Function3 function3 = (Function3) c15012l.yandex;
                int i5 = c15012l.loadAd;
                int i6 = c15012l.crashlytics;
                Object objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = C10327l.amazon;
                    c6956l.m2147try(objM2132native);
                }
                InterfaceC10835l interfaceC10835l = (InterfaceC10835l) objM2132native;
                long j = c6956l.f14595continue;
                int i7 = (int) (j ^ (j >>> c));
                InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, C4346l.f8873l);
                InterfaceC8801l.firebase.getClass();
                C16395l c16395l = C3438l.loadAd;
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(c16395l);
                } else {
                    c6956l.m2136protected();
                }
                AbstractC8182l.billing(c6956l, interfaceC10835l, C3438l.mopub);
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                AbstractC8182l.billing(c6956l, Integer.valueOf(i7), C3438l.isPro);
                AbstractC8182l.purchase(c6956l, C3438l.firebase);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                function3.invoke(c3625l.subSequence(i5, i6).f7563l, c6956l, 0);
                c6956l.startapp(true);
                i4++;
                c = ' ';
            }
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(c3625l, list, i, i3);
        }
    }
}
