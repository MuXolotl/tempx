package defpackage;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: lؙؔۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C6237l implements Closeable {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final HashMap f13169l = new HashMap();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public long f13170l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f13171l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f13172l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f13174l = 2147483647L;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f13173l = -2147483648L;

    public C6237l(String str) {
    }

    public void billing(long j) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j2 = this.f13170l;
        if (j2 != 0 && jElapsedRealtimeNanos - j2 >= 1000000) {
            this.f13172l = 0;
            this.f13171l = 0L;
            this.f13174l = 2147483647L;
            this.f13173l = -2147483648L;
        }
        this.f13170l = jElapsedRealtimeNanos;
        this.f13172l++;
        this.f13174l = Math.min(this.f13174l, j);
        this.f13173l = Math.max(this.f13173l, j);
        if (this.f13172l % 50 == 0) {
            Locale locale = Locale.US;
            C8565l.isVip();
        }
        if (this.f13172l % 500 == 0) {
            this.f13172l = 0;
            this.f13171l = 0L;
            this.f13174l = 2147483647L;
            this.f13173l = -2147483648L;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.f13171l;
        if (j != 0) {
            mopub(j);
        } else {
            C8339l.smaato("Did you forget to call start()?");
        }
    }

    public void mopub(long j) {
        billing((SystemClock.elapsedRealtimeNanos() / 1000) - j);
    }

    public void yandex() {
        this.f13171l = SystemClock.elapsedRealtimeNanos() / 1000;
    }
}
