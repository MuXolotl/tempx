package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّ۟ۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12893l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10056l f25350l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25351l;

    public /* synthetic */ C12893l(C10056l c10056l, int i) {
        this.f25351l = 2;
        this.f25350l = c10056l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f25351l;
        C10056l c10056l = this.f25350l;
        Object obj3 = C1867l.yandex;
        boolean z = false;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC18079l.amazon(AbstractC10000l.yandex, null, AbstractC14566l.amazon(1321040347, new C12893l(c10056l, 3, z ? (byte) 1 : (byte) 0), c6956l), null, 0.0f, AbstractC10439l.yandex, null, null, null, c6956l, 196998, 474);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    C10056l c10056l2 = this.f25350l;
                    boolean zBooleanValue = ((Boolean) c10056l2.f20512l.getValue()).booleanValue();
                    boolean zAdmob = c6956l2.admob(c10056l2);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == obj3) {
                        Object c15406l = new C15406l(1, c10056l2, C10056l.class, "setStreamValue", "setStreamValue(Z)V", 0, 0, 21);
                        c6956l2.m2147try(c15406l);
                        objM2132native = c15406l;
                    }
                    AbstractC2021l.yandex(zBooleanValue, (Function1) ((InterfaceC5059l) objM2132native), null, false, null, c6956l2, 0, 124);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                c10056l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C10056l c10056l3 = this.f25350l;
                    boolean zAdmob2 = c6956l3.admob(c10056l3);
                    Object objM2132native2 = c6956l3.m2132native();
                    if (zAdmob2 || objM2132native2 == obj3) {
                        Object c4936l = new C4936l(0, c10056l3, C10056l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 10);
                        c6956l3.m2147try(c4936l);
                        objM2132native2 = c4936l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native2), null, false, null, null, null, AbstractC10000l.loadAd, c6956l3, 1572864, 62);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C12893l(C10056l c10056l, int i, byte b) {
        this.f25351l = i;
        this.f25350l = c10056l;
    }
}
