package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l٘ۜؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18210l extends AbstractC17328l implements InterfaceC1127l {
    public final InterfaceC17215l vip;

    public C18210l(InterfaceC17215l interfaceC17215l) {
        super(new C1626l[2], new C10563l[2]);
        int i = this.mopub;
        C4136l[] c4136lArr = this.purchase;
        AbstractC12442l.subscription(i == c4136lArr.length);
        for (C4136l c4136l : c4136lArr) {
            c4136l.startapp(1024);
        }
        this.vip = interfaceC17215l;
    }

    @Override // defpackage.AbstractC17328l
    public final AbstractC4008l admob(Throwable th) {
        return new C8995l("Unexpected decode error", th);
    }

    @Override // defpackage.AbstractC17328l
    public final C4136l billing() {
        return new C1626l(1);
    }

    @Override // defpackage.AbstractC17328l
    public final AbstractC11739l mopub() {
        return new C10563l(this);
    }

    @Override // defpackage.AbstractC17328l
    public final AbstractC4008l subs(C4136l c4136l, AbstractC11739l abstractC11739l, boolean z) {
        C1626l c1626l = (C1626l) c4136l;
        C10563l c10563l = (C10563l) abstractC11739l;
        try {
            ByteBuffer byteBuffer = c1626l.f8498l;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            InterfaceC17215l interfaceC17215l = this.vip;
            if (z) {
                interfaceC17215l.reset();
            }
            InterfaceC2743l interfaceC2743lIsPro = interfaceC17215l.isPro(0, iLimit, bArrArray);
            long j = c1626l.f8496l;
            long j2 = c1626l.f3957l;
            c10563l.f23515l = j;
            c10563l.f21476l = interfaceC2743lIsPro;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            c10563l.f21477l = j;
            c10563l.f23516l = false;
            return null;
        } catch (C8995l e) {
            return e;
        }
    }

    @Override // defpackage.InterfaceC1127l
    public final void loadAd(long j) {
    }
}
