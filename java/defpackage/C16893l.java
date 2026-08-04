package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٗؕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16893l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC11519l f32946l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32947l;

    public /* synthetic */ C16893l(AbstractC11519l abstractC11519l, int i) {
        this.f32947l = i;
        this.f32946l = abstractC11519l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f32947l;
        AbstractC11519l abstractC11519l = this.f32946l;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC7876l.yandex(null, AbstractC14566l.amazon(-1767887446, new C16893l(abstractC11519l, i3), c6956l), c6956l, 48, 1);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f);
                    InterfaceC5475l interfaceC5475l = (InterfaceC5475l) abstractC11519l.f23162l.getValue();
                    boolean zBooleanValue = ((Boolean) abstractC11519l.f23169l.getValue()).booleanValue();
                    boolean zAdmob = c6956l2.admob(abstractC11519l);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new C7480l(abstractC11519l, i2);
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC0124l.loadAd(interfaceC5475l, (Function0) objM2132native, interfaceC17242lCrashlytics, zBooleanValue, c6956l2, 384, 0);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
