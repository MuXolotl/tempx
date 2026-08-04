package defpackage;

import java.io.File;

/* JADX INFO: renamed from: lؗ۠ؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5195l extends AbstractC6082l {
    public int loadAd;

    @Override // defpackage.AbstractC6082l
    public final String amazon() {
        return "Phlogger.java".substring("Phlogger.java".lastIndexOf(File.separatorChar) + 1);
    }

    @Override // defpackage.AbstractC6082l
    public final int crashlytics() {
        return 44;
    }

    public final boolean equals(Object obj) {
        return obj instanceof C5195l;
    }

    public final int hashCode() {
        int i = this.loadAd;
        if (i != 0) {
            return i;
        }
        this.loadAd = -1391114360;
        return -1391114360;
    }

    @Override // defpackage.AbstractC6082l
    public final String loadAd() {
        return "logInternal";
    }

    @Override // defpackage.AbstractC6082l
    public final String purchase() {
        return "Phlogger.java";
    }

    @Override // defpackage.AbstractC6082l
    public final String yandex() {
        return "com/google/android/libraries/phenotype/client/Phlogger".replace('/', '.');
    }
}
