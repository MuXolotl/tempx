package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌۖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8973l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11749l f18510l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18511l = 1;

    public /* synthetic */ C8973l(C11749l c11749l) {
        this.f18510l = c11749l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18511l) {
            case 0:
                ((Integer) obj2).getClass();
                this.f18510l.license((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C11749l c11749l = this.f18510l;
                    boolean zAdmob = c6956l.admob(c11749l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        C5735l c5735l = new C5735l(0, c11749l, C11749l.class, "dismiss", "dismiss()V", 0, 0, 21);
                        c6956l.m2147try(c5735l);
                        objM2132native = c5735l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC1214l.loadAd, c6956l, 1572864, 62);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C8973l(C11749l c11749l, int i) {
        this.f18510l = c11749l;
    }
}
