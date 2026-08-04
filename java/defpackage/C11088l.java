package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُٗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11088l extends AbstractC18620l {
    public final AbstractC18620l billing;
    public final Function1 purchase;

    public C11088l(long j, C8739l c8739l, Function1 function1, AbstractC18620l abstractC18620l) {
        super(j, c8739l);
        this.purchase = function1;
        this.billing = abstractC18620l;
        abstractC18620l.firebase();
    }

    @Override // defpackage.AbstractC18620l
    public final AbstractC18620l Signature(Function1 function1) {
        return new C11088l(this.loadAd, this.yandex, AbstractC9620l.firebase(function1, this.purchase, true), this.billing);
    }

    @Override // defpackage.AbstractC18620l
    public final boolean billing() {
        return true;
    }

    @Override // defpackage.AbstractC18620l
    public final void crashlytics() {
        if (this.crashlytics) {
            return;
        }
        long j = this.loadAd;
        AbstractC18620l abstractC18620l = this.billing;
        if (j != abstractC18620l.mopub()) {
            yandex();
        }
        abstractC18620l.smaato();
        super.crashlytics();
    }

    @Override // defpackage.AbstractC18620l
    public final void firebase() {
        AbstractC15344l.admob();
        throw null;
    }

    @Override // defpackage.AbstractC18620l
    public final Function1 purchase() {
        return this.purchase;
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
        C1698l c1698l = AbstractC9620l.yandex;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.AbstractC18620l
    public final void remoteconfig() {
    }
}
