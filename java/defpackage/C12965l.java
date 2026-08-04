package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّۥؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12965l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ EnumC0442l f25415l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12752l f25416l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f25417l;

    public C12965l(boolean z, C12752l c12752l, EnumC0442l enumC0442l) {
        this.f25417l = z;
        this.f25416l = c12752l;
        this.f25415l = enumC0442l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean z = true;
        if (!c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
            c6956l.m2124else();
        } else if (this.f25417l) {
            c6956l.m2123default(1808014403);
            C12752l c12752l = this.f25416l;
            EnumC0442l enumC0442lM3501abstract = c12752l.m3501abstract();
            EnumC0442l enumC0442l = this.f25415l;
            if (enumC0442lM3501abstract != enumC0442l) {
                z = false;
            }
            boolean zAdmob = c6956l.admob(c12752l) | c6956l.amazon(enumC0442l.ordinal());
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C15961l(c12752l, enumC0442l, 1);
                c6956l.m2147try(objM2132native);
            }
            AbstractC0676l.yandex(z, (Function0) objM2132native, null, false, null, c6956l, 0);
            c6956l.startapp(false);
        } else {
            c6956l.m2123default(1808234968);
            AbstractC4597l.yandex(AbstractC3234l.billing(), null, AbstractC3605l.vip(C4346l.f8873l, 12.0f, 0.0f, 2), 0L, c6956l, 432, 8);
            c6956l.startapp(false);
        }
        return Unit.INSTANCE;
    }
}
