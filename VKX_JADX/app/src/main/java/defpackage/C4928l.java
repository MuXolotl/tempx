package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؗٗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4928l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17003l f10037l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f10038l;

    public /* synthetic */ C4928l(C17003l c17003l, int i) {
        this.f10038l = 1;
        this.f10037l = c17003l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f10038l;
        byte b = 0;
        int i2 = 2;
        C17003l c17003l = this.f10037l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC18079l.amazon(AbstractC3058l.yandex, null, AbstractC14566l.amazon(-289584881, new C4928l(c17003l, i2, b == true ? 1 : 0), c6956l), null, 0.0f, null, null, null, null, c6956l, 390, 506);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                c17003l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zAdmob = c6956l2.admob(c17003l);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new C5767l(11, c17003l);
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC7470l.billing((Function0) objM2132native, null, false, null, null, null, AbstractC3058l.loadAd, c6956l2, 1572864, 62);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C4928l(C17003l c17003l, int i, byte b) {
        this.f10038l = i;
        this.f10037l = c17003l;
    }
}
