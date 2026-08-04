package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lِؑٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11548l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ CachedTrack f23220l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23221l;

    public /* synthetic */ C11548l(CachedTrack cachedTrack, int i) {
        this.f23221l = i;
        this.f23220l = cachedTrack;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f23221l;
        int i2 = 2;
        int i3 = 4;
        CachedTrack cachedTrack = this.f23220l;
        int i4 = 1;
        switch (i) {
            case 0:
                InterfaceC15451l interfaceC15451l = (InterfaceC15451l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC15451l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    AbstractC0133l.loadAd(interfaceC15451l, AbstractC14566l.amazon(958423293, new C14219l(cachedTrack, i4), c6956l), AbstractC14566l.amazon(-497989762, new C14219l(cachedTrack, i2), c6956l), c6956l, (iIntValue & 14) | 432);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    if (cachedTrack.m4652throws()) {
                        c6956l2.m2123default(250298471);
                        AbstractC5889l.amazon(null, 0L, c6956l2, 0, 3);
                    } else {
                        c6956l2.m2123default(232916647);
                    }
                    c6956l2.startapp(false);
                    AbstractC5889l.crashlytics(cachedTrack.subs(), false, 0L, c6956l2, 0, 6);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                InterfaceC15451l interfaceC15451l2 = (InterfaceC15451l) obj;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6956l3.billing(interfaceC15451l2) ? 4 : 2;
                }
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    AbstractC0133l.loadAd(interfaceC15451l2, AbstractC14566l.amazon(1683552907, new C14219l(cachedTrack, 3), c6956l3), AbstractC14566l.amazon(682497036, new C14219l(cachedTrack, i3), c6956l3), c6956l3, (iIntValue3 & 14) | 432);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC5889l.crashlytics(cachedTrack.subs(), false, 0L, c6956l4, 0, 6);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                InterfaceC15451l interfaceC15451l3 = (InterfaceC15451l) obj;
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= c6956l5.billing(interfaceC15451l3) ? 4 : 2;
                }
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    AbstractC0133l.loadAd(interfaceC15451l3, AbstractC14566l.amazon(-1380953355, new C14219l(cachedTrack, 7), c6956l5), AbstractC14566l.amazon(1682721398, new C14219l(cachedTrack, 8), c6956l5), c6956l5, (iIntValue5 & 14) | 432);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 5:
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC5889l.crashlytics(cachedTrack.subs(), false, 0L, c6956l6, 0, 6);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 6:
                InterfaceC15451l interfaceC15451l4 = (InterfaceC15451l) obj;
                C6956l c6956l7 = (C6956l) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= c6956l7.billing(interfaceC15451l4) ? 4 : 2;
                }
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    AbstractC0133l.loadAd(interfaceC15451l4, AbstractC14566l.amazon(-922873922, new C14219l(cachedTrack, 10), c6956l7), AbstractC14566l.amazon(-1317277761, new C14219l(cachedTrack, 11), c6956l7), c6956l7, (iIntValue7 & 14) | 432);
                } else {
                    c6956l7.m2124else();
                }
                break;
            case 7:
                InterfaceC15451l interfaceC15451l5 = (InterfaceC15451l) obj;
                C6956l c6956l8 = (C6956l) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= c6956l8.billing(interfaceC15451l5) ? 4 : 2;
                }
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    AbstractC0133l.loadAd(interfaceC15451l5, AbstractC14566l.amazon(1993617209, new C14219l(cachedTrack, 12), c6956l8), AbstractC14566l.amazon(1482605050, new C14219l(cachedTrack, 13), c6956l8), c6956l8, (iIntValue8 & 14) | 432);
                } else {
                    c6956l8.m2124else();
                }
                break;
            default:
                C6956l c6956l9 = (C6956l) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    AbstractC5889l.crashlytics(cachedTrack.subs(), false, 0L, c6956l9, 0, 6);
                } else {
                    c6956l9.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
