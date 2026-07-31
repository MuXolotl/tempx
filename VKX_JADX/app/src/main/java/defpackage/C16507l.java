package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٖٜۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16507l implements InterfaceC14090l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public long f32256l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C9977l f32257l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f32258l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C8876l f32259l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public C0812l f32260l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC14090l f32261l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C12220l f32262l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public long f32263l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f32264l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C2432l f32265l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public long f32266l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f32267l = false;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC14090l f32268l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public InterfaceC14090l f32269l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Uri f32270l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f32271l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C2432l f32272l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public long f32273l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f32274l;

    public C16507l(C12220l c12220l, InterfaceC14090l interfaceC14090l, InterfaceC14090l interfaceC14090l2, C14726l c14726l, int i, C8876l c8876l) {
        this.f32262l = c12220l;
        this.f32261l = interfaceC14090l2;
        this.f32271l = (i & 2) != 0;
        this.f32258l = false;
        if (interfaceC14090l != null) {
            this.f32268l = interfaceC14090l;
            this.f32257l = c14726l != null ? new C9977l(interfaceC14090l, c14726l) : null;
        } else {
            this.f32268l = C6575l.f13728l;
            this.f32257l = null;
        }
        this.f32259l = c8876l;
    }

    @Override // defpackage.InterfaceC14090l
    public final void close() {
        this.f32265l = null;
        this.f32270l = null;
        this.f32273l = 0L;
        try {
            firebase();
        } catch (Throwable th) {
            if (this.f32269l == this.f32261l || (th instanceof C0322l)) {
                this.f32264l = true;
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC14090l
    public final long crashlytics(C2432l c2432l) {
        long j;
        C12220l c12220l = this.f32262l;
        try {
            String string = c2432l.admob;
            long j2 = c2432l.billing;
            Uri uri = c2432l.yandex;
            long j3 = c2432l.mopub;
            if (string == null) {
                string = uri.toString();
            }
            C3304l c3304lYandex = c2432l.yandex();
            c3304lYandex.admob = string;
            C2432l c2432lYandex = c3304lYandex.yandex();
            this.f32265l = c2432lYandex;
            Uri uri2 = c2432lYandex.yandex;
            byte[] bArr = (byte[]) c12220l.billing(string).loadAd.get("exo_redir");
            Uri uri3 = null;
            String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : null;
            if (str != null) {
                uri3 = Uri.parse(str);
            }
            if (uri3 != null) {
                uri2 = uri3;
            }
            this.f32270l = uri2;
            this.f32273l = j2;
            boolean z = (this.f32271l && this.f32264l) || (this.f32258l && j3 == -1) || (this.f32259l != null && (AbstractC8576l.yandex(c2432l.isPro, 1) || AbstractC8576l.yandex(uri.getScheme(), "file")));
            this.f32274l = z;
            if (z) {
                this.f32266l = -1L;
                j = -1;
            } else {
                j = -1;
                long jLoadAd = AbstractC11043l.loadAd(c12220l.billing(string));
                this.f32266l = jLoadAd;
                if (jLoadAd != -1) {
                    long j4 = jLoadAd - j2;
                    this.f32266l = j4;
                    if (j4 < 0) {
                        throw new C12126l(2008);
                    }
                }
            }
            if (j3 != j) {
                long j5 = this.f32266l;
                this.f32266l = j5 == j ? j3 : Math.min(j5, j3);
            }
            long j6 = this.f32266l;
            if (j6 > 0 || j6 == j) {
                startapp(c2432lYandex, false);
            }
            return j3 != j ? j3 : this.f32266l;
        } catch (Throwable th) {
            if (this.f32269l == this.f32261l || (th instanceof C0322l)) {
                this.f32264l = true;
            }
            throw th;
        }
    }

    public final void firebase() {
        C12220l c12220l = this.f32262l;
        InterfaceC14090l interfaceC14090l = this.f32269l;
        if (interfaceC14090l == null) {
            return;
        }
        try {
            interfaceC14090l.close();
        } finally {
            this.f32272l = null;
            this.f32269l = null;
            C0812l c0812l = this.f32260l;
            if (c0812l != null) {
                c12220l.isPro(c0812l);
                this.f32260l = null;
            }
        }
    }

    @Override // defpackage.InterfaceC14090l
    public final Map isPro() {
        return !(this.f32269l == this.f32261l) ? this.f32268l.isPro() : Collections.EMPTY_MAP;
    }

    @Override // defpackage.InterfaceC14090l
    public final void metrica(C7713l c7713l) {
        c7713l.getClass();
        this.f32261l.metrica(c7713l);
        this.f32268l.metrica(c7713l);
    }

    @Override // defpackage.InterfaceC5802l
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        InterfaceC14090l interfaceC14090l = this.f32261l;
        if (i2 == 0) {
            return 0;
        }
        if (this.f32266l == 0) {
            return -1;
        }
        C2432l c2432l = this.f32265l;
        c2432l.getClass();
        C2432l c2432l2 = this.f32272l;
        c2432l2.getClass();
        try {
            if (this.f32273l >= this.f32263l) {
                startapp(c2432l, true);
            }
            InterfaceC14090l interfaceC14090l2 = this.f32269l;
            interfaceC14090l2.getClass();
            int i4 = interfaceC14090l2.read(bArr, i, i2);
            InterfaceC14090l interfaceC14090l3 = this.f32269l;
            if (i4 != -1) {
                long j2 = i4;
                this.f32273l += j2;
                this.f32256l += j2;
                long j3 = this.f32266l;
                if (j3 == -1) {
                    return i4;
                }
                this.f32266l = j3 - j2;
                return i4;
            }
            if (!(interfaceC14090l3 == interfaceC14090l)) {
                j = -1;
                long j4 = c2432l2.mopub;
                if (j4 != -1) {
                    i3 = i4;
                    if (this.f32256l < j4) {
                    }
                } else {
                    i3 = i4;
                }
                String str = c2432l.admob;
                String str2 = AbstractC15323l.yandex;
                this.f32266l = 0L;
                if (!(interfaceC14090l3 == this.f32257l)) {
                    return i3;
                }
                C0458l c0458l = new C0458l(13);
                c0458l.signatures(Long.valueOf(this.f32273l), "exo_len");
                this.f32262l.crashlytics(str, c0458l);
                return i3;
            }
            i3 = i4;
            j = -1;
            long j5 = this.f32266l;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            firebase();
            startapp(c2432l, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.f32269l == interfaceC14090l || (th instanceof C0322l)) {
                this.f32264l = true;
            }
            throw th;
        }
    }

    public final void startapp(C2432l c2432l, boolean z) throws InterruptedIOException {
        C0812l c0812lRemoteconfig;
        C2432l c2432lYandex;
        InterfaceC14090l interfaceC14090l;
        String str = c2432l.admob;
        String str2 = AbstractC15323l.yandex;
        if (this.f32274l) {
            c0812lRemoteconfig = null;
        } else {
            boolean z2 = this.f32267l;
            C12220l c12220l = this.f32262l;
            long j = this.f32273l;
            if (z2) {
                try {
                    long j2 = this.f32266l;
                    synchronized (c12220l) {
                        c12220l.amazon();
                        while (true) {
                            c0812lRemoteconfig = c12220l.remoteconfig(str, j, j2);
                            if (c0812lRemoteconfig != null) {
                                break;
                            } else {
                                c12220l.wait();
                            }
                        }
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            } else {
                c0812lRemoteconfig = c12220l.remoteconfig(str, j, this.f32266l);
            }
        }
        if (c0812lRemoteconfig == null) {
            interfaceC14090l = this.f32268l;
            C3304l c3304lYandex = c2432l.yandex();
            c3304lYandex.billing = this.f32273l;
            c3304lYandex.mopub = this.f32266l;
            c2432lYandex = c3304lYandex.yandex();
        } else if (c0812lRemoteconfig.f2439l) {
            Uri uriFromFile = Uri.fromFile(c0812lRemoteconfig.f2438l);
            long j3 = c0812lRemoteconfig.f2436l;
            long j4 = this.f32273l - j3;
            long jMin = c0812lRemoteconfig.f2435l - j4;
            long j5 = this.f32266l;
            if (j5 != -1) {
                jMin = Math.min(jMin, j5);
            }
            C3304l c3304lYandex2 = c2432l.yandex();
            c3304lYandex2.yandex = uriFromFile;
            c3304lYandex2.loadAd = j3;
            c3304lYandex2.billing = j4;
            c3304lYandex2.mopub = jMin;
            c2432lYandex = c3304lYandex2.yandex();
            interfaceC14090l = this.f32261l;
        } else {
            long jMin2 = c0812lRemoteconfig.f2435l;
            long j6 = this.f32266l;
            if (jMin2 == -1) {
                jMin2 = j6;
            } else if (j6 != -1) {
                jMin2 = Math.min(jMin2, j6);
            }
            C3304l c3304lYandex3 = c2432l.yandex();
            c3304lYandex3.billing = this.f32273l;
            c3304lYandex3.mopub = jMin2;
            c2432lYandex = c3304lYandex3.yandex();
            interfaceC14090l = this.f32257l;
            if (interfaceC14090l == null) {
                interfaceC14090l = this.f32268l;
                this.f32262l.isPro(c0812lRemoteconfig);
                c0812lRemoteconfig = null;
            }
        }
        this.f32263l = (this.f32274l || interfaceC14090l != this.f32268l) ? Long.MAX_VALUE : this.f32273l + 102400;
        if (z) {
            AbstractC12442l.subscription(this.f32269l == this.f32268l);
            if (interfaceC14090l == this.f32268l) {
                return;
            }
            try {
                firebase();
            } catch (Throwable th) {
                if (!c0812lRemoteconfig.f2439l) {
                    this.f32262l.isPro(c0812lRemoteconfig);
                }
                throw th;
            }
        }
        if (c0812lRemoteconfig != null && !c0812lRemoteconfig.f2439l) {
            this.f32260l = c0812lRemoteconfig;
        }
        this.f32269l = interfaceC14090l;
        this.f32272l = c2432lYandex;
        this.f32256l = 0L;
        long jCrashlytics = interfaceC14090l.crashlytics(c2432lYandex);
        C0458l c0458l = new C0458l(13);
        if (c2432lYandex.mopub == -1 && jCrashlytics != -1) {
            this.f32266l = jCrashlytics;
            c0458l.signatures(Long.valueOf(this.f32273l + jCrashlytics), "exo_len");
        }
        if (!(this.f32269l == this.f32261l)) {
            Uri uriVip = interfaceC14090l.vip();
            this.f32270l = uriVip;
            Uri uri = c2432l.yandex.equals(uriVip) ? null : this.f32270l;
            if (uri == null) {
                ((ArrayList) c0458l.f1690l).add("exo_redir");
                ((HashMap) c0458l.f1691l).remove("exo_redir");
            } else {
                c0458l.signatures(uri.toString(), "exo_redir");
            }
        }
        if (this.f32269l == this.f32257l) {
            this.f32262l.crashlytics(str, c0458l);
        }
    }

    @Override // defpackage.InterfaceC14090l
    public final Uri vip() {
        return this.f32270l;
    }
}
