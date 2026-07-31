package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: lًۦۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8421l extends AbstractC13762l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C8149l f17431l;

    public C8421l(InterfaceC12932l interfaceC12932l) {
        super(interfaceC12932l, true);
        this.f17431l = new C8149l(this);
    }

    @Override // defpackage.AbstractC13762l
    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public final void mo2319l(Object obj) {
        this.f17431l.f17030l.smaato(obj);
    }

    @Override // defpackage.AbstractC13762l
    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public final void mo2320l(Throwable th, boolean z) {
        boolean z2 = th instanceof CancellationException;
        C8149l c8149l = this.f17431l;
        C1090l c1090l = c8149l.f17030l;
        if (z2) {
            c1090l.smaato(new C3725l((CancellationException) th));
        } else if (c1090l.remoteconfig(th)) {
            c8149l.f17029l = true;
        }
    }
}
