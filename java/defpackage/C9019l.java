package defpackage;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: lٌۙۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9019l {
    public static final C9019l crashlytics;
    public final AtomicLong loadAd;
    public final UUID yandex;

    static {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            crashlytics = new C9019l(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public C9019l(UUID uuid, long j) {
        this.yandex = uuid;
        this.loadAd = new AtomicLong((j ^ 25214903917L) & 281474976710655L);
    }

    public final UUID loadAd() {
        long jYandex = yandex() & (-61441);
        long jYandex2 = yandex() >>> 2;
        UUID uuid = this.yandex;
        return new UUID(jYandex ^ uuid.getMostSignificantBits(), jYandex2 ^ uuid.getLeastSignificantBits());
    }

    public final long yandex() {
        AtomicLong atomicLong;
        long j;
        long j2;
        long j3;
        do {
            atomicLong = this.loadAd;
            j = atomicLong.get();
            j2 = ((j * 25214903917L) + 11) & 281474976710655L;
            j3 = ((25214903917L * j2) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j, j3));
        return (((long) ((int) (j2 >>> 16))) << 32) + ((long) ((int) (j3 >>> 16)));
    }
}
