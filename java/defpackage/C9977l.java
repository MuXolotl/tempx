package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: renamed from: lٍؙۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9977l implements InterfaceC14090l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f20372l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C14726l f20373l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC14090l f20374l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f20375l;

    public C9977l(InterfaceC14090l interfaceC14090l, C14726l c14726l) {
        interfaceC14090l.getClass();
        this.f20374l = interfaceC14090l;
        c14726l.getClass();
        this.f20373l = c14726l;
    }

    @Override // defpackage.InterfaceC14090l
    public final void close() throws C10420l {
        C14726l c14726l = this.f20373l;
        try {
            this.f20374l.close();
            if (this.f20372l) {
                this.f20372l = false;
                if (c14726l.amazon == null) {
                    return;
                }
                try {
                    c14726l.yandex();
                } catch (IOException e) {
                    throw new C10420l(e);
                }
            }
        } catch (Throwable th) {
            if (this.f20372l) {
                this.f20372l = false;
                if (c14726l.amazon != null) {
                    try {
                        c14726l.yandex();
                    } catch (IOException e2) {
                        throw new C10420l(e2);
                    }
                }
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC14090l
    public final long crashlytics(C2432l c2432l) throws C10420l {
        long jCrashlytics = this.f20374l.crashlytics(c2432l);
        this.f20375l = jCrashlytics;
        if (jCrashlytics == 0) {
            return 0L;
        }
        if (c2432l.mopub == -1 && jCrashlytics != -1) {
            c2432l = c2432l.crashlytics(0L, jCrashlytics);
        }
        int i = c2432l.subs;
        this.f20372l = true;
        C14726l c14726l = this.f20373l;
        c14726l.getClass();
        c2432l.admob.getClass();
        if (c2432l.mopub == -1 && (i & 2) == 2) {
            c14726l.amazon = null;
        } else {
            c14726l.amazon = c2432l;
            c14726l.purchase = (i & 4) == 4 ? c14726l.loadAd : Long.MAX_VALUE;
            c14726l.subs = 0L;
            try {
                c14726l.loadAd(c2432l);
            } catch (IOException e) {
                throw new C10420l(e);
            }
        }
        return this.f20375l;
    }

    @Override // defpackage.InterfaceC14090l
    public final Map isPro() {
        return this.f20374l.isPro();
    }

    @Override // defpackage.InterfaceC14090l
    public final void metrica(C7713l c7713l) {
        c7713l.getClass();
        this.f20374l.metrica(c7713l);
    }

    @Override // defpackage.InterfaceC5802l
    public final int read(byte[] bArr, int i, int i2) throws C10420l {
        if (this.f20375l == 0) {
            return -1;
        }
        int i3 = this.f20374l.read(bArr, i, i2);
        if (i3 > 0) {
            C14726l c14726l = this.f20373l;
            C2432l c2432l = c14726l.amazon;
            if (c2432l != null) {
                int i4 = 0;
                while (i4 < i3) {
                    try {
                        if (c14726l.admob == c14726l.purchase) {
                            c14726l.yandex();
                            c14726l.loadAd(c2432l);
                        }
                        int iMin = (int) Math.min(i3 - i4, c14726l.purchase - c14726l.admob);
                        OutputStream outputStream = c14726l.mopub;
                        String str = AbstractC15323l.yandex;
                        outputStream.write(bArr, i + i4, iMin);
                        i4 += iMin;
                        long j = iMin;
                        c14726l.admob += j;
                        c14726l.subs += j;
                    } catch (IOException e) {
                        throw new C10420l(e);
                    }
                }
            }
            long j2 = this.f20375l;
            if (j2 != -1) {
                this.f20375l = j2 - ((long) i3);
            }
        }
        return i3;
    }

    @Override // defpackage.InterfaceC14090l
    public final Uri vip() {
        return this.f20374l.vip();
    }
}
