package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؙؕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6246l implements InterfaceC3481l {
    public int loadAd = 0;
    public InterfaceC9330l yandex;

    @Override // defpackage.InterfaceC3481l
    public final int getFieldSize() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC3481l
    public final void init(InterfaceC9719l interfaceC9719l) {
        InterfaceC9330l c17190l;
        if (interfaceC9719l instanceof C16244l) {
            this.loadAd = 32;
            c17190l = new C15714l();
        } else if (!(interfaceC9719l instanceof C16638l)) {
            C8339l.metrica("key is neither X25519 nor X448");
            return;
        } else {
            this.loadAd = 56;
            c17190l = new C17190l(0);
        }
        this.yandex = c17190l;
        this.yandex.init(interfaceC9719l);
    }

    @Override // defpackage.InterfaceC3481l
    public final BigInteger yandex(InterfaceC9719l interfaceC9719l) {
        byte[] bArr = new byte[this.loadAd];
        this.yandex.firebase(interfaceC9719l, bArr, 0);
        return new BigInteger(1, bArr);
    }
}
