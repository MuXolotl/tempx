package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙٛۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6583l extends AbstractC18620l {
    public int billing;
    public final Function1 purchase;

    public C6583l(long j, C8739l c8739l, Function1 function1) {
        super(j, c8739l);
        this.purchase = function1;
        this.billing = 1;
    }

    @Override // defpackage.AbstractC18620l
    public final AbstractC18620l Signature(Function1 function1) {
        AbstractC9620l.crashlytics(this);
        return new C11088l(this.loadAd, this.yandex, AbstractC9620l.firebase(function1, this.purchase, true), this);
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
        smaato();
        super.crashlytics();
    }

    @Override // defpackage.AbstractC18620l
    public final void firebase() {
        this.billing++;
    }

    @Override // defpackage.AbstractC18620l
    public final Function1 purchase() {
        return this.purchase;
    }

    @Override // defpackage.AbstractC18620l
    public final void smaato() {
        int i = this.billing - 1;
        this.billing = i;
        if (i == 0) {
            yandex();
        }
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
