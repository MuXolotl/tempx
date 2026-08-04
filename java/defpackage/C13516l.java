package defpackage;

import java.security.SecureRandom;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lْٜٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C13516l extends C18017l {
    public final /* synthetic */ int crashlytics;

    @Override // defpackage.C18017l
    public void loadAd(C14785l c14785l) {
        switch (this.crashlytics) {
            case 0:
                super.loadAd(c14785l);
                int i = this.loadAd;
                if (i == 0 || i == 7) {
                    this.loadAd = 8;
                } else if (i != 8) {
                    C8339l.metrica("DES key must be 64 bits long.");
                }
                ((C5911l) AbstractC8776l.purchase.get()).getClass();
                break;
            default:
                super.loadAd(new C14785l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, (SecureRandom) c14785l.f28907l));
                break;
        }
    }

    @Override // defpackage.C18017l
    public byte[] yandex() {
        switch (this.crashlytics) {
            case 0:
                byte[] bArr = new byte[8];
                do {
                    this.yandex.nextBytes(bArr);
                    AbstractC14715l.crashlytics(bArr);
                } while (AbstractC14715l.loadAd(0, bArr));
                return bArr;
            default:
                byte[] bArrYandex = super.yandex();
                if (bArrYandex.length != 32) {
                    C8339l.metrica("Poly1305 key must be 256 bits.");
                    return null;
                }
                bArrYandex[3] = (byte) (bArrYandex[3] & 15);
                bArrYandex[7] = (byte) (bArrYandex[7] & 15);
                bArrYandex[11] = (byte) (bArrYandex[11] & 15);
                bArrYandex[15] = (byte) (bArrYandex[15] & 15);
                bArrYandex[4] = (byte) (bArrYandex[4] & (-4));
                bArrYandex[8] = (byte) (bArrYandex[8] & (-4));
                bArrYandex[12] = (byte) (bArrYandex[12] & (-4));
                return bArrYandex;
        }
    }
}
