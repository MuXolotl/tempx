package defpackage;

import java.security.SecureRandom;

/* JADX INFO: renamed from: l٘ٚٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C18017l {
    public int loadAd;
    public SecureRandom yandex;

    public void loadAd(C14785l c14785l) {
        this.yandex = (SecureRandom) c14785l.f28907l;
        this.loadAd = (c14785l.f28908l + 7) / 8;
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
    }

    public byte[] yandex() {
        byte[] bArr = new byte[this.loadAd];
        this.yandex.nextBytes(bArr);
        return bArr;
    }
}
