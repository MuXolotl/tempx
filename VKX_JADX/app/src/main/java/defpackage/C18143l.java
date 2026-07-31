package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: l٘ۘؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18143l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5766l f35496l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35497l;

    public /* synthetic */ C18143l(C5766l c5766l, int i) {
        this.f35497l = 3;
        this.f35496l = c5766l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f35497l;
        C13863l c13863l = C1867l.yandex;
        C5766l c5766l = this.f35496l;
        boolean z = false;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C5766l c5766l2 = this.f35496l;
                    boolean zAdmob = c6956l.admob(c5766l2);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        C2944l c2944l = new C2944l(0, c5766l2, C5766l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 1);
                        c6956l.m2147try(c2944l);
                        objM2132native = c2944l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC17860l.loadAd, c6956l, 1572864, 62);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC18079l.amazon(AbstractC17860l.yandex, null, AbstractC14566l.amazon(1952978329, new C18143l(c5766l, z ? 1 : 0, z ? (byte) 1 : (byte) 0), c6956l2), null, 0.0f, ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).purchase(c6956l2), null, null, null, c6956l2, 390, 474);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zAdmob2 = c6956l3.admob(c5766l);
                    Object objM2132native2 = c6956l3.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C2942l(c5766l, 1);
                        c6956l3.m2147try(objM2132native2);
                    }
                    AbstractC11184l.yandex((Function0) objM2132native2, null, null, 0L, 0L, null, AbstractC17860l.crashlytics, c6956l3, 12582912, 126);
                } else {
                    c6956l3.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c5766l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C18143l(C5766l c5766l, int i, byte b) {
        this.f35497l = i;
        this.f35496l = c5766l;
    }
}
