package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.util.Size;
import java.util.List;

/* JADX INFO: renamed from: lٍۛۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC9819l {
    public static /* synthetic */ SessionConfiguration loadAd(int i, List list) {
        return new SessionConfiguration(i, list);
    }

    public static /* synthetic */ OutputConfiguration yandex(int i, Size size) {
        return new OutputConfiguration(i, size);
    }
}
