package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import j$.util.Objects;

/* JADX INFO: renamed from: lؔۧۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3071l implements InterfaceC10666l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public long f6602l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f6603l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f6604l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f6605l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f6606l;

    public C3071l(RunnableC11297l runnableC11297l) {
        this.f6606l = new Handler(Looper.getMainLooper());
        this.f6605l = runnableC11297l;
    }

    @Override // defpackage.InterfaceC10666l
    public /* synthetic */ boolean admob() {
        return false;
    }

    public long amazon() {
        if (!this.f6604l) {
            this.f6604l = true;
            C16386l c16386l = (C16386l) this.f6605l;
            this.f6602l = c16386l.m4180l().getLong((String) this.f6606l, this.f6603l);
        }
        return this.f6602l;
    }

    @Override // defpackage.InterfaceC10666l
    public C1372l billing() {
        return (C1372l) this.f6605l;
    }

    public void crashlytics() {
        if (this.f6604l) {
            return;
        }
        ((C18527l) this.f6606l).getClass();
        this.f6602l = SystemClock.elapsedRealtime();
        this.f6604l = true;
    }

    @Override // defpackage.InterfaceC10666l
    public void loadAd(C1372l c1372l) {
        if (this.f6604l) {
            yandex(mopub());
        }
        this.f6605l = c1372l;
    }

    @Override // defpackage.InterfaceC10666l
    public long mopub() {
        long j = this.f6603l;
        if (!this.f6604l) {
            return j;
        }
        ((C18527l) this.f6606l).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f6602l;
        C1372l c1372l = (C1372l) this.f6605l;
        return (c1372l.yandex == 1.0f ? AbstractC15323l.m3962continue(jElapsedRealtime) : jElapsedRealtime * ((long) c1372l.crashlytics)) + j;
    }

    public void purchase(long j) {
        SharedPreferences.Editor editorEdit = ((C16386l) this.f6605l).m4180l().edit();
        editorEdit.putLong((String) this.f6606l, j);
        editorEdit.apply();
        this.f6602l = j;
    }

    public void yandex(long j) {
        this.f6603l = j;
        if (this.f6604l) {
            ((C18527l) this.f6606l).getClass();
            this.f6602l = SystemClock.elapsedRealtime();
        }
    }

    public C3071l(C16386l c16386l, String str, long j) {
        Objects.requireNonNull(c16386l);
        this.f6605l = c16386l;
        AbstractC1051l.billing(str);
        this.f6606l = str;
        this.f6603l = j;
    }

    public C3071l(C18527l c18527l) {
        this.f6606l = c18527l;
        this.f6605l = C1372l.amazon;
    }
}
