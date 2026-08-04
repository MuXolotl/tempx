package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import java.util.Arrays;

/* JADX INFO: renamed from: lؚۥؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7634l {
    public static final int loadAd = AbstractC17252l.yandex;
    public final BinderC11373l yandex;

    public C7634l(byte[] bArr) {
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        int length = bArr.length;
        int i = loadAd;
        int iMopub = AbstractC15323l.mopub(length, i);
        for (int i2 = 0; i2 < iMopub; i2++) {
            Bundle bundle = new Bundle();
            int i3 = i2 * i;
            bundle.putByteArray("bytes", Arrays.copyOfRange(bArr, i3, Math.min(i3 + i, bArr.length)));
            c16971lMetrica.crashlytics(bundle);
        }
        this.yandex = new BinderC11373l(c16971lMetrica.mopub());
    }

    public static byte[] yandex(Bundle bundle) {
        IBinder binder = bundle.getBinder(C16523l.mopub);
        if (binder != null) {
            try {
                AbstractC1186l abstractC1186lYandex = BinderC11373l.yandex(binder);
                if (abstractC1186lYandex.isEmpty()) {
                    return AbstractC15323l.loadAd;
                }
                byte[] byteArray = ((Bundle) AbstractC11356l.purchase(abstractC1186lYandex)).getByteArray("bytes");
                if (byteArray != null) {
                    int size = abstractC1186lYandex.size() - 1;
                    int i = loadAd;
                    int i2 = size * i;
                    byte[] bArr = new byte[byteArray.length + i2];
                    System.arraycopy(byteArray, 0, bArr, i2, byteArray.length);
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] byteArray2 = ((Bundle) abstractC1186lYandex.get(i3)).getByteArray("bytes");
                        if (byteArray2 != null && byteArray2.length == i) {
                            System.arraycopy(byteArray2, 0, bArr, i3 * i, i);
                        }
                    }
                    return bArr;
                }
            } catch (RuntimeException e) {
                AbstractC6427l.metrica("BundleableByteArray", "Failed to read byte array from bundle list retriever", e);
                return null;
            }
        }
        return null;
    }
}
