package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import defpackage.C18680l;
import defpackage.InterfaceC15879l;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ReportedVideoQualityNotSupportedQuirk implements VideoQualityQuirk, SurfaceProcessingQuirk {
    public static boolean amazon() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean billing() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList("JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1").contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean mopub() {
        return "OPPO".equalsIgnoreCase(Build.BRAND) && "PHT110".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean purchase() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL);
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public final boolean loadAd() {
        return amazon() || purchase() || billing() || mopub();
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean yandex(InterfaceC15879l interfaceC15879l, C18680l c18680l) {
        if (amazon() || purchase()) {
            if (c18680l != C18680l.admob) {
                return false;
            }
        } else if ("Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) {
            if (c18680l != C18680l.billing && c18680l != C18680l.mopub) {
                return false;
            }
        } else if (billing()) {
            if (interfaceC15879l.metrica() != 0) {
                return false;
            }
            if (c18680l != C18680l.mopub && c18680l != C18680l.billing) {
                return false;
            }
        } else if (!mopub() || interfaceC15879l.metrica() != 1 || c18680l != C18680l.admob) {
            return false;
        }
        return true;
    }
}
