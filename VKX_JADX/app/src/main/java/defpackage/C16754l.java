package defpackage;

import java.security.SecureRandom;

/* JADX INFO: renamed from: lٖۤۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16754l extends C13516l {
    @Override // defpackage.C13516l, defpackage.C18017l
    public final void loadAd(C14785l c14785l) {
        this.yandex = (SecureRandom) c14785l.f28907l;
        int i = (c14785l.f28908l + 7) / 8;
        this.loadAd = i;
        if (i == 0 || i == 21) {
            this.loadAd = 24;
        } else if (i == 14) {
            this.loadAd = 16;
        } else if (i != 24 && i != 16) {
            C8339l.metrica("DESede key must be 192 or 128 bits long.");
            return;
        }
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
    }

    @Override // defpackage.C13516l, defpackage.C18017l
    public final byte[] yandex() {
        int i = this.loadAd;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            this.yandex.nextBytes(bArr);
            AbstractC14715l.crashlytics(bArr);
            i2++;
            if (i2 >= 20) {
                break;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= i) {
                    if (!AbstractC14715l.yandex(bArr)) {
                        break;
                    }
                    break;
                }
                if (AbstractC14715l.loadAd(i3, bArr)) {
                    break;
                }
                i3 += 8;
            }
        }
        for (int i4 = 0; i4 < i; i4 += 8) {
            if (AbstractC14715l.loadAd(i4, bArr)) {
                C8339l.smaato("Unable to generate DES-EDE key");
                return null;
            }
        }
        if (AbstractC14715l.yandex(bArr)) {
            return bArr;
        }
        C8339l.smaato("Unable to generate DES-EDE key");
        return null;
    }
}
