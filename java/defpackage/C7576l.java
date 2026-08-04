package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lؚٖۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7576l extends C17312l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f15585l;

    public C7576l(int i, int i2, boolean z, Cstatic cstatic) {
        super(i, i2, cstatic);
        this.f15585l = z;
    }

    @Override // defpackage.C17312l, defpackage.InterfaceC12254l
    public final Ccase smaato() throws IOException {
        boolean z = this.f15585l;
        Cstatic cstatic = this.f33578l;
        int i = this.f33580l;
        int i2 = this.f33579l;
        if (!z) {
            return new C7332l(4, i, i2, new C11327l(((C9774l) ((AbstractC10410l) cstatic.amazon)).billing()));
        }
        appmetrica appmetricaVarPurchase = cstatic.purchase();
        return appmetricaVarPurchase.f489l == 1 ? new C7332l(3, i, i2, appmetricaVarPurchase.smaato(0)) : new C7332l(4, i, i2, AbstractC16315l.yandex(appmetricaVarPurchase));
    }
}
