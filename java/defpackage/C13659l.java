package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lْٖۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13659l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C8688l f26685l;

    public C13659l() {
        super(0);
        this.f26685l = new C8688l(new C9636l(17, this));
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-1910953589);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC15829l interfaceC15829l = (InterfaceC15829l) this.f26685l.getValue();
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = new C10351l(7);
                c6956l.m2147try(objM2132native);
            }
            Function1 function1 = (Function1) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C13749l(3, (InterfaceC14029l) null, i3);
                c6956l.m2147try(objM2132native2);
            }
            Function3 function3 = (Function3) objM2132native2;
            C18454l c18454l = C18454l.f36052l;
            C5073l c5073lCrashlytics = AbstractC8265l.crashlytics(interfaceC15829l, function1, function3, new C7315l(true, 0.0f, 0.0f, 36), c6956l, 48);
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(28257351, new Cpublic(c13072lYandex, this, 18), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(-1908946916, new C0822l(c13072lYandex, c5073lCrashlytics, i3), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4345l(this, i);
        }
    }
}
