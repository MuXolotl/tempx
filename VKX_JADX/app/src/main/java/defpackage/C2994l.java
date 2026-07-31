package defpackage;

import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؚۣؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2994l extends AbstractC11801l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f6493l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C8688l f6494l;

    public C2994l() {
        super(0);
        this.f6493l = AbstractC11990l.loadAd();
        this.f6494l = new C8688l(new C13506l(this, 1));
    }

    @Override // defpackage.AbstractC11801l, defpackage.AbstractC2484l, defpackage.AbstractC17777l
    public final void appmetrica() {
        super.appmetrica();
        AbstractC11990l.billing(this, null);
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-642208097);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC15829l interfaceC15829l = (InterfaceC15829l) this.f6494l.getValue();
            C0242l c0242l = C0242l.f1228l;
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = new C17437l(3, null, 1);
                c6956l.m2147try(objM2132native);
            }
            Function3 function3 = (Function3) objM2132native;
            C18454l c18454l = C18454l.f36052l;
            C5073l c5073lCrashlytics = AbstractC8265l.crashlytics(interfaceC15829l, c0242l, function3, C18454l.loadAd(), c6956l, 0);
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-1193872549, new C14601l(c13072lYandex, this, 2), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(1431542960, new Cprotected(c13072lYandex, c5073lCrashlytics, this, 18), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9590l(this, i);
        }
    }

    @Override // defpackage.AbstractC17777l
    public final boolean signatures() {
        return true;
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f6493l.f36440l;
    }
}
