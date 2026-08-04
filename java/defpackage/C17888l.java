package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lْ٘ؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17888l implements InterfaceC8215l, InterfaceC12202l, InterfaceC10377l, InterfaceC16369l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC1953l f34842l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Executor f34843l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34844l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C3823l f34845l;

    public /* synthetic */ C17888l(Executor executor, InterfaceC1953l interfaceC1953l, C3823l c3823l, int i) {
        this.f34844l = i;
        this.f34843l = executor;
        this.f34842l = interfaceC1953l;
        this.f34845l = c3823l;
    }

    @Override // defpackage.InterfaceC10377l
    public void adcel(Exception exc) {
        this.f34845l.startapp(exc);
    }

    @Override // defpackage.InterfaceC12202l
    public void amazon(Object obj) {
        this.f34845l.vip(obj);
    }

    @Override // defpackage.InterfaceC16369l
    public void mopub() {
        this.f34845l.adcel();
    }

    @Override // defpackage.InterfaceC8215l
    public final void yandex(C3823l c3823l) {
        switch (this.f34844l) {
            case 0:
                this.f34843l.execute(new RunnableC16301l(this, c3823l, 0));
                break;
            default:
                this.f34843l.execute(new RunnableC16301l(this, c3823l, 1));
                break;
        }
    }
}
