package defpackage;

import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: lٕۗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15886l {
    public final long amazon;
    public final long crashlytics;
    public final int loadAd;
    public final int yandex;

    public C15886l(int i, int i2, long j, long j2) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = j;
        this.amazon = j2;
    }

    public static C15886l yandex(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C15886l c15886l = new C15886l(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c15886l;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C15886l)) {
            C15886l c15886l = (C15886l) obj;
            if (this.loadAd == c15886l.loadAd && this.crashlytics == c15886l.crashlytics && this.yandex == c15886l.yandex && this.amazon == c15886l.amazon) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.loadAd), Long.valueOf(this.crashlytics), Integer.valueOf(this.yandex), Long.valueOf(this.amazon));
    }

    public final void loadAd(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.yandex);
            dataOutputStream.writeInt(this.loadAd);
            dataOutputStream.writeLong(this.crashlytics);
            dataOutputStream.writeLong(this.amazon);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
