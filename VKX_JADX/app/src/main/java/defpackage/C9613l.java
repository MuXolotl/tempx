package defpackage;

import android.util.Size;
import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٍٗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9613l extends C7972l {
    @Override // defpackage.C7972l
    /* JADX INFO: renamed from: case */
    public final Size[] mo2222case(int i) {
        if (i != 4101 || AbstractC17919l.yandex(PixelJpegRSupportedQuirk.class) == null) {
            return super.mo2222case(i);
        }
        return null;
    }

    @Override // defpackage.C7972l
    /* JADX INFO: renamed from: catch */
    public final Integer[] mo2223catch() {
        Integer[] numArrMo2223catch = super.mo2223catch();
        if (AbstractC17919l.yandex(PixelJpegRSupportedQuirk.class) == null) {
            return numArrMo2223catch;
        }
        if (numArrMo2223catch == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : numArrMo2223catch) {
            if (num.intValue() != 4101) {
                arrayList.add(num);
            }
        }
        return (Integer[]) arrayList.toArray(new Integer[0]);
    }

    @Override // defpackage.C7972l
    /* JADX INFO: renamed from: else */
    public final long mo2228else(int i, Size size) {
        if (i != 4101 || AbstractC17919l.yandex(PixelJpegRSupportedQuirk.class) == null) {
            return super.mo2228else(i, size);
        }
        return 0L;
    }
}
