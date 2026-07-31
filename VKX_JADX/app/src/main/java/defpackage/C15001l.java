package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٔٛؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15001l implements InterfaceC12703l {
    public final /* synthetic */ C6216l yandex;

    public C15001l(C6216l c6216l) {
        this.yandex = c6216l;
    }

    @Override // defpackage.InterfaceC12703l
    public final /* synthetic */ boolean amazon() {
        return false;
    }

    @Override // defpackage.InterfaceC12703l
    public final boolean loadAd() {
        return true;
    }

    @Override // defpackage.InterfaceC12703l
    public final long mopub() {
        C6216l c6216l = this.yandex;
        return (c6216l.f13146l * 1000000) / ((long) c6216l.f13143l.subs);
    }

    @Override // defpackage.InterfaceC12703l
    public final C15528l purchase(long j) {
        C6216l c6216l = this.yandex;
        long j2 = (((long) c6216l.f13143l.subs) * j) / 1000000;
        long j3 = c6216l.f13139l;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j2);
        long j4 = c6216l.f13136l;
        C4304l c4304l = new C4304l(j, AbstractC15323l.firebase((bigIntegerValueOf.multiply(BigInteger.valueOf(j4 - j3)).divide(BigInteger.valueOf(c6216l.f13146l)).longValue() + j3) - 30000, c6216l.f13139l, j4 - 1));
        return new C15528l(c4304l, c4304l);
    }
}
