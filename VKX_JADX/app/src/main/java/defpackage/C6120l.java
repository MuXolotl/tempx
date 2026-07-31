package defpackage;

import java.io.EOFException;

/* JADX INFO: renamed from: lؘّۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6120l implements InterfaceC8979l {
    public final byte[] yandex = new byte[4096];

    @Override // defpackage.InterfaceC8979l
    public final int billing(InterfaceC5802l interfaceC5802l, int i, boolean z) {
        return crashlytics(interfaceC5802l, i, z);
    }

    @Override // defpackage.InterfaceC8979l
    public final int crashlytics(InterfaceC5802l interfaceC5802l, int i, boolean z) throws EOFException {
        byte[] bArr = this.yandex;
        int i2 = interfaceC5802l.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        C8339l.vip();
        return 0;
    }

    @Override // defpackage.InterfaceC8979l
    public final void loadAd(C13143l c13143l, int i, int i2) {
        c13143l.m3568throw(i);
    }

    @Override // defpackage.InterfaceC8979l
    public final void purchase(int i, C13143l c13143l) {
        c13143l.m3568throw(i);
    }

    @Override // defpackage.InterfaceC8979l
    public final /* synthetic */ void amazon(long j) {
    }

    @Override // defpackage.InterfaceC8979l
    public final void mopub(C5978l c5978l) {
    }

    @Override // defpackage.InterfaceC8979l
    public final void yandex(long j, int i, int i2, int i3, C0472l c0472l) {
    }
}
