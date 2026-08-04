package defpackage;

import java.security.SecureRandom;

/* JADX INFO: renamed from: lّۤۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12963l implements InterfaceC12684l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public SecureRandom f25413l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25414l;

    @Override // defpackage.InterfaceC12684l
    public final int billing(byte[] bArr) throws C10352l {
        switch (this.f25414l) {
            case 0:
                int i = bArr[bArr.length - 1] & 255;
                if ((((bArr.length - i) | (i - 1)) >> 31) == 0) {
                    return i;
                }
                C11467l.remoteconfig("pad block corrupted");
                return 0;
            default:
                int i2 = bArr[bArr.length - 1] & 255;
                if ((((bArr.length - i2) | (i2 - 1)) >> 31) == 0) {
                    return i2;
                }
                C11467l.remoteconfig("pad block corrupted");
                return 0;
        }
    }

    @Override // defpackage.InterfaceC12684l
    public final int crashlytics(int i, byte[] bArr) {
        switch (this.f25414l) {
            case 0:
                byte length = (byte) (bArr.length - i);
                while (i < bArr.length - 1) {
                    bArr[i] = (byte) this.f25413l.nextInt();
                    i++;
                }
                bArr[i] = length;
                return length;
            default:
                byte length2 = (byte) (bArr.length - i);
                while (i < bArr.length - 1) {
                    SecureRandom secureRandom = this.f25413l;
                    if (secureRandom == null) {
                        bArr[i] = 0;
                    } else {
                        bArr[i] = (byte) secureRandom.nextInt();
                    }
                    i++;
                }
                bArr[i] = length2;
                return length2;
        }
    }

    @Override // defpackage.InterfaceC12684l
    public final void smaato(SecureRandom secureRandom) {
        switch (this.f25414l) {
            case 0:
                if (secureRandom == null) {
                    secureRandom = AbstractC8776l.loadAd();
                } else {
                    ThreadLocal threadLocal = AbstractC8776l.yandex;
                }
                this.f25413l = secureRandom;
                break;
            default:
                this.f25413l = secureRandom;
                break;
        }
    }
}
