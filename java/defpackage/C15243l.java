package defpackage;

import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٔۡٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15243l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C8688l f29838l;

    public C15243l() {
        super(0);
        this.f29838l = new C8688l(new C7730l(18, this));
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(2032314124);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            InterfaceC15829l interfaceC15829l = (InterfaceC15829l) this.f29838l.getValue();
            C14323l c14323l = C14323l.f28054l;
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = new C12452l(3, null, 1);
                c6956l.m2147try(objM2132native);
            }
            C18454l c18454l = C18454l.f36052l;
            C5073l c5073lCrashlytics = AbstractC8265l.crashlytics(interfaceC15829l, c14323l, (Function3) objM2132native, C18454l.crashlytics(), c6956l, 0);
            boolean zCrashlytics = c6956l.crashlytics(((C15744l) c5073lCrashlytics.f11086l.getValue()).f30926l);
            Object objM2132native2 = c6956l.m2132native();
            if (zCrashlytics || objM2132native2 == c13863l) {
                objM2132native2 = new C13765l(((C15744l) c5073lCrashlytics.f11086l.getValue()).f30926l);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-1573965624, new C14601l(c13072lYandex, this, 22), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(1033630685, new Cprotected(c13072lYandex, c5073lCrashlytics, (C13765l) objM2132native2, 21), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C7460l(this, i);
        }
    }

    @Override // defpackage.AbstractC17777l
    public final boolean signatures() {
        return true;
    }
}
