package defpackage;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: renamed from: lٕؑٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15376l extends AbstractC15992l {
    public static final C4421l[] amazon = {C4421l.subs};

    @Override // defpackage.AbstractC15992l
    public final AbstractC2058l crashlytics(long j, BigInteger bigInteger, C16045l c16045l) throws IOException {
        AbstractC3848l.amazon(c16045l);
        c16045l.read();
        c16045l.read();
        AbstractC3848l.purchase(c16045l);
        return new C17217l(C4421l.subs, j, bigInteger);
    }

    @Override // defpackage.InterfaceC11455l
    public final C4421l[] yandex() {
        return (C4421l[]) amazon.clone();
    }
}
