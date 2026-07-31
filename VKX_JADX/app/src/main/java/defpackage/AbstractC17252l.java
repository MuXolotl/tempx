package defpackage;

import android.os.Build;
import android.os.IBinder;
import java.util.UUID;

/* JADX INFO: renamed from: lٜٗؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17252l {
    public static final UUID amazon;
    public static final UUID billing;
    public static final UUID crashlytics;
    public static final UUID loadAd;
    public static final UUID purchase;
    public static final int yandex;

    static {
        yandex = Build.VERSION.SDK_INT >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
        loadAd = new UUID(0L, 0L);
        crashlytics = new UUID(1186680826959645954L, -5988876978535335093L);
        amazon = new UUID(-2129748144642739255L, 8654423357094679310L);
        purchase = new UUID(-1301668207276963122L, -6645017420763422227L);
        billing = new UUID(-7348484286925749626L, -6083546864340672619L);
    }
}
