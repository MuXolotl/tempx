package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍؘؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5429l extends AbstractC18620l {
    public Function1 admob;
    public final boolean billing;
    public final boolean mopub;
    public final AbstractC18620l purchase;
    public final long subs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5429l(AbstractC18620l abstractC18620l, Function1 function1, boolean z, boolean z2) {
        Function1 function1Purchase;
        super(0L, C8739l.f17990l);
        C1698l c1698l = AbstractC9620l.yandex;
        this.purchase = abstractC18620l;
        this.billing = z;
        this.mopub = z2;
        this.admob = AbstractC9620l.firebase(function1, (abstractC18620l == null || (function1Purchase = abstractC18620l.purchase()) == null) ? AbstractC9620l.isPro.purchase : function1Purchase, z);
        this.subs = AbstractC4071l.loadAd();
    }

    @Override // defpackage.AbstractC18620l
    public final AbstractC18620l Signature(Function1 function1) {
        Function1 function1Firebase = AbstractC9620l.firebase(function1, this.admob, true);
        return !this.billing ? AbstractC9620l.mopub(license().Signature(null), function1Firebase, true) : license().Signature(function1Firebase);
    }

    @Override // defpackage.AbstractC18620l
    public final C8739l amazon() {
        return license().amazon();
    }

    @Override // defpackage.AbstractC18620l
    public final boolean billing() {
        return license().billing();
    }

    @Override // defpackage.AbstractC18620l
    public final void crashlytics() {
        AbstractC18620l abstractC18620l;
        this.crashlytics = true;
        if (!this.mopub || (abstractC18620l = this.purchase) == null) {
            return;
        }
        abstractC18620l.crashlytics();
    }

    @Override // defpackage.AbstractC18620l
    public final void firebase() {
        AbstractC15344l.admob();
        throw null;
    }

    public final AbstractC18620l license() {
        AbstractC18620l abstractC18620l = this.purchase;
        return abstractC18620l == null ? AbstractC9620l.isPro : abstractC18620l;
    }

    @Override // defpackage.AbstractC18620l
    public final long mopub() {
        return license().mopub();
    }

    @Override // defpackage.AbstractC18620l
    public final Function1 purchase() {
        return this.admob;
    }

    @Override // defpackage.AbstractC18620l
    public final void remoteconfig() {
        license().remoteconfig();
    }

    @Override // defpackage.AbstractC18620l
    public final void smaato() {
        AbstractC15344l.admob();
        throw null;
    }

    @Override // defpackage.AbstractC18620l
    public final Function1 subs() {
        return null;
    }

    @Override // defpackage.AbstractC18620l
    public final void vip(InterfaceC2763l interfaceC2763l) {
        license().vip(interfaceC2763l);
    }
}
