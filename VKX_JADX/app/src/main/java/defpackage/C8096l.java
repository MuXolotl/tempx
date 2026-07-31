package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8096l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0483l f16873l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16874l;

    public /* synthetic */ C8096l(C0483l c0483l, int i) {
        this.f16874l = i;
        this.f16873l = c0483l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16874l;
        C0483l c0483l = this.f16873l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0483l.subs(c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                c0483l.subs((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                c0483l.yandex((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C0483l c0483l2 = this.f16873l;
                    C9879l c9879l = c0483l2.yandex;
                    boolean zAdmob = c6956l2.admob(c9879l);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        C2176l c2176l = new C2176l(1, c9879l, C9879l.class, "openEffectConfiguration", "openEffectConfiguration(Z)V", 0, 0, 1);
                        c6956l2.m2147try(c2176l);
                        objM2132native = c2176l;
                    }
                    c0483l2.smaato(false, (Function1) ((InterfaceC5059l) objM2132native), AbstractC15290l.mopub, c6956l2, 390);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C8096l(C0483l c0483l, int i, int i2) {
        this.f16874l = i2;
        this.f16873l = c0483l;
    }
}
