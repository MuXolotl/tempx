package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lًؘِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5613l implements AutoCloseable {

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C11155l f11916l = new C11155l("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public boolean f11917l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C14025l f11918l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C18662l f11919l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final Object f11920l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public boolean f11921l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f11922l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C14025l f11923l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C0841l f11924l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f11925l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public boolean f11926l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C14025l f11927l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C14025l f11928l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f11929l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public long f11930l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final LinkedHashMap f11931l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C7167l f11932l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public boolean f11933l;

    public C5613l(long j, AbstractC5921l abstractC5921l, C14025l c14025l) {
        this.f11923l = c14025l;
        this.f11922l = j;
        if (j <= 0) {
            C8339l.metrica("maxSize <= 0");
            throw null;
        }
        this.f11918l = c14025l.purchase("journal");
        this.f11928l = c14025l.purchase("journal.tmp");
        this.f11927l = c14025l.purchase("journal.bkp");
        this.f11931l = new LinkedHashMap(0, 0.75f, true);
        C2993l c2993lCrashlytics = AbstractC1295l.crashlytics();
        C11583l c11583l = AbstractC1872l.f4294l;
        C16552l c16552l = AbstractC11463l.yandex;
        this.f11919l = AbstractC11990l.yandex(AbstractC10586l.billing(c2993lCrashlytics, ExecutorC6708l.f14063l.mo1066while(1)));
        this.f11920l = new Object();
        this.f11924l = new C0841l(abstractC5921l);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static void m1833synchronized(String str) {
        if (f11916l.amazon(str)) {
            return;
        }
        C10754l.metrica(AbstractC15560l.Signature("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x010c A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:16:0x0032, B:24:0x0040, B:27:0x005a, B:29:0x0069, B:31:0x0077, B:33:0x007e, B:28:0x005e, B:37:0x009e, B:39:0x00a5, B:42:0x00aa, B:44:0x00b8, B:47:0x00bd, B:52:0x00f8, B:54:0x0103, B:59:0x010f, B:58:0x010c, B:48:0x00d5, B:50:0x00ea, B:51:0x00f5, B:36:0x008e, B:62:0x0113, B:63:0x011a), top: B:66:0x0003 }] */
    public static final void yandex(C5613l c5613l, C11919l c11919l, boolean z) {
        synchronized (c5613l.f11920l) {
            C7976l c7976l = (C7976l) c11919l.f23763l;
            if (!AbstractC8576l.yandex(c7976l.mopub, c11919l)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z || c7976l.billing) {
                for (int i = 0; i < 2; i++) {
                    c5613l.f11924l.adcel((C14025l) c7976l.amazon.get(i), false);
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (((boolean[]) c11919l.f23767l)[i2] && !c5613l.f11924l.isVip((C14025l) c7976l.amazon.get(i2))) {
                        c11919l.amazon(false);
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    C14025l c14025l = (C14025l) c7976l.amazon.get(i3);
                    C14025l c14025l2 = (C14025l) c7976l.crashlytics.get(i3);
                    boolean zIsVip = c5613l.f11924l.isVip(c14025l);
                    C0841l c0841l = c5613l.f11924l;
                    if (zIsVip) {
                        c0841l.billing(c14025l, c14025l2);
                    } else {
                        AbstractC17824l.firebase(c0841l, (C14025l) c7976l.crashlytics.get(i3));
                    }
                    long j = c7976l.loadAd[i3];
                    Long l = c5613l.f11924l.m1876synchronized(c14025l2).amazon;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    c7976l.loadAd[i3] = jLongValue;
                    c5613l.f11930l = (c5613l.f11930l - j) + jLongValue;
                }
            }
            c7976l.mopub = null;
            if (c7976l.billing) {
                c5613l.inmobi(c7976l);
                return;
            }
            c5613l.f11925l++;
            C7167l c7167l = c5613l.f11932l;
            if (z || c7976l.purchase) {
                c7976l.purchase = true;
                c7167l.mo706finally("CLEAN");
                c7167l.writeByte(32);
                c7167l.mo706finally(c7976l.yandex);
                for (long j2 : c7976l.loadAd) {
                    c7167l.writeByte(32);
                    c7167l.billing(j2);
                }
                c7167l.writeByte(10);
            } else {
                c5613l.f11931l.remove(c7976l.yandex);
                c7167l.mo706finally("REMOVE");
                c7167l.writeByte(32);
                c7167l.mo706finally(c7976l.yandex);
                c7167l.writeByte(10);
            }
            c7167l.flush();
            if (c5613l.f11930l > c5613l.f11922l) {
                c5613l.adcel();
            } else if (c5613l.f11925l >= 2000) {
                c5613l.adcel();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void adcel() {
        AbstractC10999l.mopub(this.f11919l, null, 0, new C14951l(this, null, 18), 3);
    }

    public final void ads() {
        Iterator it = this.f11931l.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            C7976l c7976l = (C7976l) it.next();
            if (c7976l.mopub == null) {
                for (int i = 0; i < 2; i++) {
                    j += c7976l.loadAd[i];
                }
            } else {
                c7976l.mopub = null;
                for (int i2 = 0; i2 < 2; i2++) {
                    C14025l c14025l = (C14025l) c7976l.crashlytics.get(i2);
                    C0841l c0841l = this.f11924l;
                    c0841l.adcel(c14025l, false);
                    c0841l.adcel((C14025l) c7976l.amazon.get(i2), false);
                }
                it.remove();
            }
        }
        this.f11930l = j;
    }

    public final C11919l billing(String str) {
        synchronized (this.f11920l) {
            if (this.f11933l) {
                throw new IllegalStateException("cache is closed");
            }
            m1833synchronized(str);
            vip();
            C7976l c7976l = (C7976l) this.f11931l.get(str);
            if ((c7976l != null ? c7976l.mopub : null) != null) {
                return null;
            }
            if (c7976l != null && c7976l.admob != 0) {
                return null;
            }
            if (!this.f11926l && !this.f11921l) {
                C7167l c7167l = this.f11932l;
                c7167l.mo706finally("DIRTY");
                c7167l.writeByte(32);
                c7167l.mo706finally(str);
                c7167l.writeByte(10);
                c7167l.flush();
                if (this.f11929l) {
                    return null;
                }
                if (c7976l == null) {
                    c7976l = new C7976l(this, str);
                    this.f11931l.put(str, c7976l);
                }
                C11919l c11919l = new C11919l(this, c7976l);
                c7976l.mopub = c11919l;
                return c11919l;
            }
            adcel();
            return null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f11920l) {
            try {
                if (this.f11917l && !this.f11933l) {
                    for (C7976l c7976l : (C7976l[]) this.f11931l.values().toArray(new C7976l[0])) {
                        C11919l c11919l = c7976l.mopub;
                        if (c11919l != null) {
                            C7976l c7976l2 = (C7976l) c11919l.f23763l;
                            if (AbstractC8576l.yandex(c7976l2.mopub, c11919l)) {
                                c7976l2.billing = true;
                            }
                        }
                    }
                    m1834package();
                    AbstractC11990l.billing(this.f11919l, null);
                    this.f11932l.close();
                    this.f11932l = null;
                    this.f11933l = true;
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                this.f11933l = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void inmobi(C7976l c7976l) {
        C7167l c7167l;
        int i = c7976l.admob;
        String str = c7976l.yandex;
        if (i > 0 && (c7167l = this.f11932l) != null) {
            c7167l.mo706finally("DIRTY");
            c7167l.writeByte(32);
            c7167l.mo706finally(str);
            c7167l.writeByte(10);
            c7167l.flush();
        }
        if (c7976l.admob > 0 || c7976l.mopub != null) {
            c7976l.billing = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.f11924l.adcel((C14025l) c7976l.crashlytics.get(i2), false);
            long j = this.f11930l;
            long[] jArr = c7976l.loadAd;
            this.f11930l = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.f11925l++;
        C7167l c7167l2 = this.f11932l;
        if (c7167l2 != null) {
            c7167l2.mo706finally("REMOVE");
            c7167l2.writeByte(32);
            c7167l2.mo706finally(str);
            c7167l2.writeByte(10);
            c7167l2.flush();
        }
        this.f11931l.remove(str);
        if (this.f11925l >= 2000) {
            adcel();
        }
    }

    public final void isVip() throws Throwable {
        C0841l c0841l = this.f11924l;
        AbstractC5921l abstractC5921l = c0841l.f2487l;
        C14025l c14025l = this.f11918l;
        C1503l c1503l = new C1503l(abstractC5921l.mo692default(c14025l));
        try {
            String strMo724new = c1503l.mo724new(Long.MAX_VALUE);
            String strMo724new2 = c1503l.mo724new(Long.MAX_VALUE);
            String strMo724new3 = c1503l.mo724new(Long.MAX_VALUE);
            String strMo724new4 = c1503l.mo724new(Long.MAX_VALUE);
            String strMo724new5 = c1503l.mo724new(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strMo724new) || !"1".equals(strMo724new2) || !AbstractC8576l.yandex(String.valueOf(3), strMo724new3) || !AbstractC8576l.yandex(String.valueOf(2), strMo724new4) || strMo724new5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strMo724new + ", " + strMo724new2 + ", " + strMo724new3 + ", " + strMo724new4 + ", " + strMo724new5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    signatures(c1503l.mo724new(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.f11925l = i - this.f11931l.size();
                    if (c1503l.subs()) {
                        this.f11932l = new C7167l(new C2781l(c0841l.f2487l.yandex(c14025l), new C15079l(15, this), 1));
                    } else {
                        m1835private();
                    }
                    Unit unit = Unit.INSTANCE;
                    try {
                        c1503l.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                c1503l.close();
            } catch (Throwable th3) {
                AbstractC11718l.yandex(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final C10946l mopub(String str) {
        C10946l c10946lYandex;
        synchronized (this.f11920l) {
            if (this.f11933l) {
                throw new IllegalStateException("cache is closed");
            }
            m1833synchronized(str);
            vip();
            C7976l c7976l = (C7976l) this.f11931l.get(str);
            if (c7976l != null && (c10946lYandex = c7976l.yandex()) != null) {
                boolean z = true;
                this.f11925l++;
                C7167l c7167l = this.f11932l;
                c7167l.mo706finally("READ");
                c7167l.writeByte(32);
                c7167l.mo706finally(str);
                c7167l.writeByte(10);
                c7167l.flush();
                if (this.f11925l < 2000) {
                    z = false;
                }
                if (z) {
                    adcel();
                }
                return c10946lYandex;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m1834package() {
        while (this.f11930l > this.f11922l) {
            for (C7976l c7976l : this.f11931l.values()) {
                if (!c7976l.billing) {
                    inmobi(c7976l);
                }
            }
            return;
        }
        this.f11926l = false;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void m1835private() {
        synchronized (this.f11920l) {
            try {
                C7167l c7167l = this.f11932l;
                if (c7167l != null) {
                    c7167l.close();
                }
                C7167l c7167l2 = new C7167l(this.f11924l.mo691continue(this.f11928l, false));
                try {
                    c7167l2.mo706finally("libcore.io.DiskLruCache");
                    c7167l2.writeByte(10);
                    c7167l2.mo706finally("1");
                    c7167l2.writeByte(10);
                    c7167l2.billing(3L);
                    c7167l2.writeByte(10);
                    c7167l2.billing(2L);
                    c7167l2.writeByte(10);
                    c7167l2.writeByte(10);
                    for (C7976l c7976l : this.f11931l.values()) {
                        if (c7976l.mopub != null) {
                            c7167l2.mo706finally("DIRTY");
                            c7167l2.writeByte(32);
                            c7167l2.mo706finally(c7976l.yandex);
                            c7167l2.writeByte(10);
                        } else {
                            c7167l2.mo706finally("CLEAN");
                            c7167l2.writeByte(32);
                            c7167l2.mo706finally(c7976l.yandex);
                            for (long j : c7976l.loadAd) {
                                c7167l2.writeByte(32);
                                c7167l2.billing(j);
                            }
                            c7167l2.writeByte(10);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    try {
                        c7167l2.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        c7167l2.close();
                    } catch (Throwable th3) {
                        AbstractC11718l.yandex(th, th3);
                    }
                }
                if (th != null) {
                    throw th;
                }
                boolean zIsVip = this.f11924l.isVip(this.f11918l);
                C0841l c0841l = this.f11924l;
                if (zIsVip) {
                    c0841l.billing(this.f11918l, this.f11927l);
                    this.f11924l.billing(this.f11928l, this.f11918l);
                    this.f11924l.adcel(this.f11927l, false);
                } else {
                    c0841l.billing(this.f11928l, this.f11918l);
                }
                this.f11932l = new C7167l(new C2781l(this.f11924l.f2487l.yandex(this.f11918l), new C15079l(15, this), 1));
                this.f11925l = 0;
                this.f11929l = false;
                this.f11921l = false;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void signatures(String str) throws IOException {
        String strSubstring;
        int iM3321extends = AbstractC12024l.m3321extends(str, ' ', 0, 6);
        if (iM3321extends == -1) {
            C18262l.metrica("unexpected journal line: ".concat(str));
            return;
        }
        int i = iM3321extends + 1;
        int iM3321extends2 = AbstractC12024l.m3321extends(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.f11931l;
        if (iM3321extends2 == -1) {
            strSubstring = str.substring(i);
            if (iM3321extends == 6 && AbstractC16648l.isVip(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iM3321extends2);
        }
        Object c7976l = linkedHashMap.get(strSubstring);
        if (c7976l == null) {
            c7976l = new C7976l(this, strSubstring);
            linkedHashMap.put(strSubstring, c7976l);
        }
        C7976l c7976l2 = (C7976l) c7976l;
        if (iM3321extends2 == -1 || iM3321extends != 5 || !AbstractC16648l.isVip(str, "CLEAN", false)) {
            if (iM3321extends2 == -1 && iM3321extends == 5 && AbstractC16648l.isVip(str, "DIRTY", false)) {
                c7976l2.mopub = new C11919l(this, c7976l2);
                return;
            } else {
                if (iM3321extends2 == -1 && iM3321extends == 4 && AbstractC16648l.isVip(str, "READ", false)) {
                    return;
                }
                C18262l.metrica("unexpected journal line: ".concat(str));
                return;
            }
        }
        List listM3323finally = AbstractC12024l.m3323finally(str.substring(iM3321extends2 + 1), new char[]{' '});
        c7976l2.purchase = true;
        c7976l2.mopub = null;
        if (listM3323finally.size() != 2) {
            C10754l.pro(listM3323finally, "unexpected journal line: ");
            return;
        }
        try {
            int size = listM3323finally.size();
            for (int i2 = 0; i2 < size; i2++) {
                c7976l2.loadAd[i2] = Long.parseLong((String) listM3323finally.get(i2));
            }
        } catch (NumberFormatException unused) {
            C10754l.pro(listM3323finally, "unexpected journal line: ");
        }
    }

    public final void vip() {
        synchronized (this.f11920l) {
            try {
                if (this.f11917l) {
                    return;
                }
                this.f11924l.adcel(this.f11928l, false);
                if (this.f11924l.isVip(this.f11927l)) {
                    boolean zIsVip = this.f11924l.isVip(this.f11918l);
                    C0841l c0841l = this.f11924l;
                    C14025l c14025l = this.f11927l;
                    if (zIsVip) {
                        c0841l.adcel(c14025l, false);
                    } else {
                        c0841l.billing(c14025l, this.f11918l);
                    }
                }
                if (this.f11924l.isVip(this.f11918l)) {
                    try {
                        try {
                            isVip();
                            ads();
                            this.f11917l = true;
                            return;
                        } catch (Throwable th) {
                            this.f11933l = false;
                            throw th;
                        }
                    } catch (IOException unused) {
                        close();
                        AbstractC17824l.smaato(this.f11924l, this.f11923l);
                        this.f11933l = false;
                        m1835private();
                        this.f11917l = true;
                        Unit unit = Unit.INSTANCE;
                    }
                }
                m1835private();
                this.f11917l = true;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
