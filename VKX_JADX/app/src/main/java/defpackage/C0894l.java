package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙؒۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0894l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2169l f2549l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2550l;

    public /* synthetic */ C0894l(C2169l c2169l, int i) {
        this.f2550l = 1;
        this.f2549l = c2169l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2550l;
        C2169l c2169l = this.f2549l;
        int i2 = 2;
        boolean z = false;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC18079l.amazon(AbstractC14566l.amazon(-1800301419, new C0894l(c2169l, i2, z ? (byte) 1 : (byte) 0), c6956l), null, AbstractC14566l.amazon(420432723, new C0894l(c2169l, 3, z ? (byte) 1 : (byte) 0), c6956l), null, 0.0f, null, null, null, null, c6956l, 390, 506);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                c2169l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 2:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC13010l.loadAd(c2169l.f4810l.loadAd, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C2169l c2169l2 = this.f2549l;
                    boolean zAdmob = c6956l3.admob(c2169l2);
                    Object objM2132native = c6956l3.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        C5735l c5735l = new C5735l(0, c2169l2, C2169l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 7);
                        c6956l3.m2147try(c5735l);
                        objM2132native = c5735l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC7709l.yandex, c6956l3, 1572864, 62);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C0894l(C2169l c2169l, int i, byte b) {
        this.f2550l = i;
        this.f2549l = c2169l;
    }
}
