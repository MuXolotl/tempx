package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: renamed from: lٔؑؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14602l {
    public static final String yandex = C14513l.applovin("NetworkStateTracker");

    /* JADX WARN: Code duplicated, block: B:11:0x0016  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022 A[Catch: SecurityException -> 0x0029, TRY_LEAVE, TryCatch #2 {SecurityException -> 0x0029, blocks: (B:12:0x0018, B:14:0x0022), top: B:40:0x0018, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    public static final C9415l yandex(ConnectivityManager connectivityManager, boolean z) {
        boolean z2;
        SecurityException securityException;
        boolean zHasCapability;
        boolean z3;
        NetworkCapabilities networkCapabilities;
        String str = yandex;
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z4 = true;
            if (activeNetworkInfo == null) {
                z4 = false;
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    zHasCapability = networkCapabilities.hasCapability(16);
                } else {
                    zHasCapability = false;
                }
                boolean zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo != null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                z2 = z;
                return new C9415l(z4, zHasCapability, zIsActiveNetworkMetered, z3, z2);
            }
            try {
                if (!activeNetworkInfo.isConnected()) {
                    z4 = false;
                }
                try {
                    networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                    if (networkCapabilities != null) {
                        zHasCapability = networkCapabilities.hasCapability(16);
                    } else {
                        zHasCapability = false;
                    }
                } catch (SecurityException e) {
                    C14513l.tapsense().ads(str, "Unable to validate active network", e);
                }
                boolean zIsActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                z2 = z;
                try {
                    return new C9415l(z4, zHasCapability, zIsActiveNetworkMetered2, z3, z2);
                } catch (SecurityException e2) {
                    e = e2;
                    securityException = e;
                    C14513l.tapsense().ads(str, "Unable to get active network state", securityException);
                    return new C9415l(false, false, false, true, z2);
                }
            } catch (SecurityException e3) {
                securityException = e3;
                z2 = z;
            }
        } catch (SecurityException e4) {
            e = e4;
            z2 = z;
        }
        C14513l.tapsense().ads(str, "Unable to get active network state", securityException);
        return new C9415l(false, false, false, true, z2);
    }
}
