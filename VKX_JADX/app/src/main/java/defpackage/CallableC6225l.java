package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: lؙؚؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC6225l implements Callable {
    public final /* synthetic */ BinderC16593l crashlytics;
    public final /* synthetic */ String loadAd;
    public final /* synthetic */ boolean yandex;

    public /* synthetic */ CallableC6225l(boolean z, String str, BinderC16593l binderC16593l) {
        this.yandex = z;
        this.loadAd = str;
        this.crashlytics = binderC16593l;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z = this.yandex;
        String str = this.loadAd;
        BinderC16593l binderC16593l = this.crashlytics;
        String str2 = (z || !AbstractC17035l.crashlytics(str, binderC16593l, true, false).f17793l) ? "not allowed" : "debug cert rejected";
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    break;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        AbstractC1051l.subs(messageDigest);
        byte[] bArrDigest = messageDigest.digest(binderC16593l.mopub);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b : bArrDigest) {
            char[] cArr2 = AbstractC17344l.loadAd;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            i2 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z + ", ver=12451000.false";
    }
}
