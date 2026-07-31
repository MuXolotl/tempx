package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lِ٘ۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17859l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C6523l f34822l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ List f34823l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34824l;

    public /* synthetic */ C17859l(List list, C6523l c6523l, int i) {
        this.f34824l = i;
        this.f34823l = list;
        this.f34822l = c6523l;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.f34824l;
        C6523l c6523l = this.f34822l;
        C4346l c4346l = C4346l.f8873l;
        List list = this.f34823l;
        switch (i3) {
            case 0:
                C7091l c7091l = (C7091l) obj;
                int iIntValue = ((Number) obj2).intValue();
                C6956l c6956l = (C6956l) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (c6956l.billing(c7091l) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= c6956l.amazon(iIntValue) ? 32 : 16;
                }
                if (c6956l.m2127for(i & 1, (i & 147) != 146)) {
                    C1916l c1916l = (C1916l) list.get(iIntValue);
                    c6956l.m2123default(-436381100);
                    c1916l.loadAd.yandex(AbstractC9679l.billing(c4346l, iIntValue == 0, AbstractC9966l.billing(c4346l, c6523l)), c6956l, 0);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C3571l c3571l = (C3571l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C6956l c6956l2 = (C6956l) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (c6956l2.billing(c3571l) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= c6956l2.amazon(iIntValue3) ? 32 : 16;
                }
                if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
                    C1916l c1916l2 = (C1916l) list.get(iIntValue3);
                    c6956l2.m2123default(-1157372667);
                    c1916l2.loadAd.yandex(AbstractC9679l.billing(AbstractC0080l.vip(c4346l, 300.0f), iIntValue3 == 0, AbstractC9966l.billing(c4346l, c6523l)), c6956l2, 0);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
