package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕٓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15660l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13888l f30612l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30613l;

    public /* synthetic */ C15660l(C13888l c13888l, int i) {
        this.f30613l = 1;
        this.f30612l = c13888l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f30613l;
        C13888l c13888l = this.f30612l;
        byte b = 0;
        int i2 = 2;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C17253l c17253l = AbstractC0831l.yandex;
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC18079l.amazon(AbstractC17653l.yandex, null, AbstractC14566l.amazon(327174380, new C15660l(c13888l, i2, b == true ? 1 : 0), c6956l), null, 0.0f, null, AbstractC0831l.billing(((C14370l) c6956l.isPro(c10707l)).yandex.startapp, ((C14370l) c6956l.isPro(c10707l)).yandex.ads, 0L, 0L, 0L, c6956l, 60), null, null, c6956l, 390, 442);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                c13888l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C13888l c13888l2 = this.f30612l;
                    boolean zAdmob = c6956l2.admob(c13888l2);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        C10832l c10832l = new C10832l(0, c13888l2, C13888l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 22);
                        c6956l2.m2147try(c10832l);
                        objM2132native = c10832l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC17653l.loadAd, c6956l2, 1572864, 62);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C15660l(C13888l c13888l, int i, byte b) {
        this.f30613l = i;
        this.f30612l = c13888l;
    }
}
