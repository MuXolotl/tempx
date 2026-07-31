package defpackage;

import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٌۤۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9159l implements InterfaceC8782l, InterfaceC2053l, InterfaceC7548l, InterfaceC16681l, InterfaceC15208l {

    /* JADX INFO: renamed from: lؔؕؖ, reason: contains not printable characters */
    public static final C5978l f18812l;

    /* JADX INFO: renamed from: lُؚؓ, reason: contains not printable characters */
    public static final Map f18813l;

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public final long f18814l = Long.MIN_VALUE;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public boolean f18815l;

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public long f18816l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public C15637l[] f18817l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C18449l f18818l;

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public int f18819l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC0729l f18820l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C10743l f18821l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C5928l[] f18822l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C13243l f18823l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final InterfaceC3783l f18824l;

    /* JADX INFO: renamed from: lؕۦؓ, reason: contains not printable characters */
    public long f18825l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public boolean f18826l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final RunnableC12464l f18827l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public boolean f18828l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public boolean f18829l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public boolean f18830l;

    /* JADX INFO: renamed from: lؗ۟ۤ, reason: contains not printable characters */
    public boolean f18831l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC14090l f18832l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Uri f18833l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public InterfaceC2417l f18834l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final RunnableC12464l f18835l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public boolean f18836l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public C12014l f18837l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public boolean f18838l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final long f18839l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public boolean f18840l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C5811l f18841l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C13698l f18842l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C14513l f18843l;

    /* JADX INFO: renamed from: lِِٞ, reason: contains not printable characters */
    public boolean f18844l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public InterfaceC12703l f18845l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public boolean f18846l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public int f18847l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final long f18848l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public int f18849l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final String f18850l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C13281l f18851l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C5978l f18852l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public boolean f18853l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C18449l f18854l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public long f18855l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final Handler f18856l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public C13511l[] f18857l;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f18813l = DesugarCollections.unmodifiableMap(map);
        C12984l c12984l = new C12984l();
        c12984l.yandex = "icy";
        c12984l.vip = AbstractC3825l.vip("application/x-icy");
        f18812l = new C5978l(c12984l);
    }

    public C9159l(Uri uri, InterfaceC14090l interfaceC14090l, C18449l c18449l, InterfaceC0729l interfaceC0729l, C13281l c13281l, C14513l c14513l, C13698l c13698l, C10743l c10743l, InterfaceC3783l interfaceC3783l, String str, int i, C5978l c5978l, long j, ExecutorC13021l executorC13021l) {
        this.f18833l = uri;
        this.f18832l = interfaceC14090l;
        this.f18820l = interfaceC0729l;
        this.f18851l = c13281l;
        this.f18843l = c14513l;
        this.f18842l = c13698l;
        this.f18821l = c10743l;
        this.f18824l = interfaceC3783l;
        this.f18850l = str;
        this.f18839l = i;
        this.f18852l = c5978l;
        this.f18818l = executorC13021l != null ? new C18449l(2, executorC13021l) : new C18449l("ProgressiveMediaPeriod", 2);
        this.f18854l = c18449l;
        this.f18848l = j;
        this.f18841l = new C5811l();
        this.f18827l = new RunnableC12464l(this, 1);
        this.f18835l = new RunnableC12464l(this, 2);
        this.f18856l = AbstractC15323l.ads(null);
        this.f18857l = new C13511l[0];
        this.f18817l = new C15637l[0];
        this.f18822l = new C5928l[0];
        this.f18825l = -9223372036854775807L;
        this.f18849l = 1;
    }

    @Override // defpackage.InterfaceC7548l
    public final C8128l Signature(InterfaceC13131l interfaceC13131l, long j, long j2, IOException iOException, int i) {
        long jMin;
        C8128l c8128l;
        InterfaceC12703l interfaceC12703l;
        C16068l c16068l = (C16068l) interfaceC13131l;
        C13384l c13384l = c16068l.loadAd;
        C13071l c13071l = new C13071l(c16068l.isPro, c13384l.f26265l, c13384l.f26268l, j, j2, c13384l.f26266l);
        String str = AbstractC15323l.yandex;
        C14513l c14513l = this.f18843l;
        c14513l.getClass();
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof C17655l) || (cause instanceof FileNotFoundException) || (cause instanceof C7825l) || (cause instanceof C12971l) || ((cause instanceof C12126l) && ((C12126l) cause).f24145l == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            c8128l = C18449l.f36007l;
        } else {
            int iAd = ad();
            int i2 = iAd > this.f18819l ? 1 : 0;
            if (this.f18826l || !((interfaceC12703l = this.f18845l) == null || interfaceC12703l.mopub() == -9223372036854775807L)) {
                this.f18819l = iAd;
            } else if (!this.f18838l || m2619package()) {
                this.f18829l = this.f18838l;
                this.f18816l = 0L;
                this.f18819l = 0;
                for (C15637l c15637l : this.f18817l) {
                    c15637l.premium(false);
                }
                c16068l.billing.f2761l = 0L;
                c16068l.subs = 0L;
                c16068l.admob = true;
                c16068l.smaato = false;
            } else {
                this.f18828l = true;
                c8128l = C18449l.f36005l;
            }
            c8128l = new C8128l(i2, jMin, false);
        }
        int i3 = c8128l.f16932l;
        boolean z = i3 == 0 || i3 == 1;
        C8128l c8128l2 = c8128l;
        this.f18842l.m3680private(c13071l, 1, -1, null, 0, null, c16068l.subs, this.f18855l, iOException, !z);
        if (!z) {
            c14513l.getClass();
        }
        return c8128l2;
    }

    public final int ad() {
        int i = 0;
        for (C15637l c15637l : this.f18817l) {
            i += c15637l.adcel + c15637l.startapp;
        }
        return i;
    }

    @Override // defpackage.InterfaceC3128l
    public final boolean adcel(C11495l c11495l) {
        if (this.f18831l) {
            return false;
        }
        C18449l c18449l = this.f18818l;
        if (((IOException) c18449l.f36012l) != null || this.f18828l) {
            return false;
        }
        if ((this.f18838l || this.f18852l != null) && this.f18847l == 0) {
            return false;
        }
        boolean zAmazon = this.f18841l.amazon();
        if (c18449l.m4537catch()) {
            return zAmazon;
        }
        m2620throws();
        return true;
    }

    @Override // defpackage.InterfaceC8782l
    public final void admob() throws IOException {
        int iLicense = this.f18843l.license(this.f18849l);
        C18449l c18449l = this.f18818l;
        IOException iOException = (IOException) c18449l.f36012l;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC9564l handlerC9564l = (HandlerC9564l) c18449l.f36009l;
        if (handlerC9564l != null) {
            if (iLicense == Integer.MIN_VALUE) {
                iLicense = handlerC9564l.f19484l;
            }
            IOException iOException2 = handlerC9564l.f19486l;
            if (iOException2 != null && handlerC9564l.f19489l > iLicense) {
                throw iOException2;
            }
        }
        if (this.f18831l && !this.f18838l) {
            throw C17655l.yandex(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // defpackage.InterfaceC3128l
    public final long ads() {
        long jAdvert;
        boolean z;
        pro();
        if (this.f18831l || this.f18847l == 0) {
            return Long.MIN_VALUE;
        }
        if (isVip()) {
            return this.f18825l;
        }
        if (this.f18846l) {
            int length = this.f18817l.length;
            jAdvert = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                C12014l c12014l = this.f18837l;
                if (((boolean[]) c12014l.f23940l)[i] && ((boolean[]) c12014l.f23944l)[i]) {
                    C15637l c15637l = this.f18817l[i];
                    synchronized (c15637l) {
                        z = c15637l.advert;
                    }
                    if (!z) {
                        jAdvert = Math.min(jAdvert, this.f18817l[i].startapp());
                    }
                }
            }
        } else {
            jAdvert = Long.MAX_VALUE;
        }
        if (jAdvert == Long.MAX_VALUE) {
            jAdvert = advert(false);
        }
        return jAdvert == Long.MIN_VALUE ? this.f18816l : jAdvert;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final long advert(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.f18817l.length; i++) {
            if (z) {
                jMax = Math.max(jMax, this.f18817l[i].startapp());
            } else {
                C12014l c12014l = this.f18837l;
                c12014l.getClass();
                if (((boolean[]) c12014l.f23944l)[i]) {
                    jMax = Math.max(jMax, this.f18817l[i].startapp());
                }
            }
        }
        return jMax;
    }

    @Override // defpackage.InterfaceC3128l
    public final boolean amazon() {
        boolean z;
        if (this.f18831l || !this.f18818l.m4537catch()) {
            return false;
        }
        C5811l c5811l = this.f18841l;
        synchronized (c5811l) {
            z = c5811l.loadAd;
        }
        return z;
    }

    public final void applovin(int i) {
        pro();
        if (this.f18828l) {
            if ((!this.f18846l || ((boolean[]) this.f18837l.f23940l)[i]) && !this.f18817l[i].pro(false)) {
                this.f18825l = 0L;
                this.f18828l = false;
                this.f18829l = true;
                this.f18816l = 0L;
                this.f18819l = 0;
                for (C15637l c15637l : this.f18817l) {
                    c15637l.premium(false);
                }
                InterfaceC2417l interfaceC2417l = this.f18834l;
                interfaceC2417l.getClass();
                interfaceC2417l.mo614throws(this);
            }
        }
    }

    public final InterfaceC8979l appmetrica(C13511l c13511l) {
        int length = this.f18817l.length;
        for (int i = 0; i < length; i++) {
            if (c13511l.equals(this.f18857l[i])) {
                return this.f18817l[i];
            }
        }
        if (this.f18830l) {
            AbstractC6427l.vip("ProgressiveMediaPeriod", "Extractor added new track (id=" + c13511l.yandex + ") after finishing tracks.");
            return new C6120l();
        }
        InterfaceC0729l interfaceC0729l = this.f18820l;
        interfaceC0729l.getClass();
        C15637l c15637l = new C15637l(this.f18824l, interfaceC0729l, this.f18851l);
        C5928l c5928l = new C5928l(c15637l);
        c15637l.billing = this;
        int i2 = length + 1;
        C13511l[] c13511lArr = (C13511l[]) Arrays.copyOf(this.f18857l, i2);
        c13511lArr[length] = c13511l;
        this.f18857l = c13511lArr;
        C15637l[] c15637lArr = (C15637l[]) Arrays.copyOf(this.f18817l, i2);
        c15637lArr[length] = c15637l;
        this.f18817l = c15637lArr;
        C5928l[] c5928lArr = (C5928l[]) Arrays.copyOf(this.f18822l, i2);
        c5928lArr[length] = c5928l;
        this.f18822l = c5928lArr;
        return c5928l;
    }

    @Override // defpackage.InterfaceC3128l
    public final long billing() {
        return ads();
    }

    @Override // defpackage.InterfaceC7548l
    public final void crashlytics(InterfaceC13131l interfaceC13131l, long j, long j2) {
        C16068l c16068l = (C16068l) interfaceC13131l;
        if (this.f18855l == -9223372036854775807L && this.f18845l != null) {
            long jAdvert = advert(true);
            long j3 = jAdvert == Long.MIN_VALUE ? 0L : jAdvert + 10000;
            this.f18855l = j3;
            this.f18821l.Signature(j3, this.f18845l, this.f18836l);
        }
        C13384l c13384l = c16068l.loadAd;
        C13071l c13071l = new C13071l(c16068l.isPro, c13384l.f26265l, c13384l.f26268l, j, j2, c13384l.f26266l);
        this.f18843l.getClass();
        this.f18842l.m3677native(c13071l, 1, -1, null, 0, null, c16068l.subs, this.f18855l);
        this.f18831l = true;
        InterfaceC2417l interfaceC2417l = this.f18834l;
        interfaceC2417l.getClass();
        interfaceC2417l.mo614throws(this);
    }

    @Override // defpackage.InterfaceC2053l
    public final void firebase() {
        this.f18830l = true;
        this.f18856l.post(this.f18827l);
    }

    public final void inmobi(InterfaceC12703l interfaceC12703l) {
        this.f18845l = this.f18823l == null ? interfaceC12703l : new C9828l(-9223372036854775807L);
        this.f18855l = interfaceC12703l.mopub();
        boolean z = !this.f18826l && interfaceC12703l.mopub() == -9223372036854775807L;
        this.f18836l = z;
        this.f18849l = z ? 7 : 1;
        if (this.f18838l) {
            this.f18821l.Signature(this.f18855l, interfaceC12703l, z);
        } else {
            signatures();
        }
    }

    @Override // defpackage.InterfaceC8782l
    public final void isPro(long j) throws Throwable {
        if (this.f18815l) {
            return;
        }
        pro();
        if (isVip()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f18837l.f23944l;
        int length = this.f18817l.length;
        for (int i = 0; i < length; i++) {
            this.f18817l[i].isPro(j, zArr[i]);
        }
    }

    public final boolean isVip() {
        return this.f18825l != -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC3128l
    public final void license(long j) {
        boolean z;
        if (this.f18847l <= 0 || isVip()) {
            return;
        }
        boolean z2 = false;
        if (this.f18814l != Long.MIN_VALUE) {
            pro();
            int i = 0;
            boolean z3 = true;
            while (true) {
                C15637l[] c15637lArr = this.f18817l;
                if (i >= c15637lArr.length) {
                    break;
                }
                C12014l c12014l = this.f18837l;
                if (((boolean[]) c12014l.f23944l)[i] && (((boolean[]) c12014l.f23940l)[i] || !this.f18846l)) {
                    C15637l c15637l = c15637lArr[i];
                    synchronized (c15637l) {
                        z = c15637l.ad != -1;
                    }
                    z3 &= z;
                }
                i++;
            }
            z2 = z3;
        }
        if (z2) {
            this.f18831l = true;
        }
    }

    @Override // defpackage.InterfaceC7548l
    public final void loadAd(InterfaceC13131l interfaceC13131l, long j, long j2, boolean z) {
        C16068l c16068l = (C16068l) interfaceC13131l;
        C13384l c13384l = c16068l.loadAd;
        C13071l c13071l = new C13071l(c16068l.isPro, c13384l.f26265l, c13384l.f26268l, j, j2, c13384l.f26266l);
        this.f18843l.getClass();
        this.f18842l.m3685volatile(c13071l, 1, -1, null, 0, null, c16068l.subs, this.f18855l);
        if (z) {
            return;
        }
        for (C15637l c15637l : this.f18817l) {
            c15637l.premium(false);
        }
        if (this.f18847l > 0) {
            InterfaceC2417l interfaceC2417l = this.f18834l;
            interfaceC2417l.getClass();
            interfaceC2417l.mo614throws(this);
        }
    }

    @Override // defpackage.InterfaceC8782l
    public final C8750l metrica() {
        pro();
        return (C8750l) this.f18837l.f23941l;
    }

    @Override // defpackage.InterfaceC8782l
    public final long mopub(long j, C17654l c17654l) {
        pro();
        if (!this.f18845l.loadAd()) {
            return 0L;
        }
        C15528l c15528lPurchase = this.f18845l.purchase(j);
        return c17654l.yandex(j, c15528lPurchase.yandex.yandex, c15528lPurchase.loadAd.yandex);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final boolean m2619package() {
        return this.f18829l || isVip();
    }

    public final void premium(int i) {
        pro();
        C12014l c12014l = this.f18837l;
        boolean[] zArr = (boolean[]) c12014l.f23943l;
        if (zArr[i]) {
            return;
        }
        C5978l c5978l = ((C8750l) c12014l.f23941l).yandex(i).amazon[0];
        C13698l c13698l = this.f18842l;
        c13698l.subscription(new C15263l(c13698l, new C2040l(1, AbstractC3825l.admob(c5978l.metrica), c5978l, 0, null, AbstractC15323l.m3986try(this.f18816l), -9223372036854775807L), 9));
        zArr[i] = true;
    }

    public final void pro() {
        AbstractC12442l.subscription(this.f18838l);
        this.f18837l.getClass();
        this.f18845l.getClass();
    }

    @Override // defpackage.InterfaceC8782l
    public final long purchase(InterfaceC10376l[] interfaceC10376lArr, boolean[] zArr, InterfaceC11759l[] interfaceC11759lArr, boolean[] zArr2, long j) {
        InterfaceC10376l interfaceC10376l;
        pro();
        C12014l c12014l = this.f18837l;
        C8750l c8750l = (C8750l) c12014l.f23941l;
        boolean[] zArr3 = (boolean[]) c12014l.f23944l;
        int i = this.f18847l;
        int i2 = 0;
        for (int i3 = 0; i3 < interfaceC10376lArr.length; i3++) {
            InterfaceC11759l interfaceC11759l = interfaceC11759lArr[i3];
            if (interfaceC11759l != null && (interfaceC10376lArr[i3] == null || !zArr[i3])) {
                int i4 = ((C16871l) interfaceC11759l).f32925l;
                AbstractC12442l.subscription(zArr3[i4]);
                this.f18847l--;
                zArr3[i4] = false;
                interfaceC11759lArr[i3] = null;
            }
        }
        boolean z = !this.f18853l ? j == 0 || this.f18815l : i != 0;
        for (int i5 = 0; i5 < interfaceC10376lArr.length; i5++) {
            if (interfaceC11759lArr[i5] == null && (interfaceC10376l = interfaceC10376lArr[i5]) != null) {
                AbstractC12442l.subscription(interfaceC10376l.length() == 1);
                AbstractC12442l.subscription(interfaceC10376l.adcel(0) == 0);
                int iLoadAd = c8750l.loadAd(interfaceC10376l.firebase());
                AbstractC12442l.subscription(!zArr3[iLoadAd]);
                this.f18847l++;
                zArr3[iLoadAd] = true;
                this.f18840l = interfaceC10376l.tapsense().Signature | this.f18840l;
                interfaceC11759lArr[i5] = new C16871l(this, iLoadAd);
                zArr2[i5] = true;
                if (!z) {
                    C15637l c15637l = this.f18817l[iLoadAd];
                    z = (c15637l.subscription() == 0 || c15637l.inmobi(j, true)) ? false : true;
                }
            }
        }
        if (this.f18847l == 0) {
            this.f18828l = false;
            this.f18829l = false;
            this.f18840l = false;
            C18449l c18449l = this.f18818l;
            if (c18449l.m4537catch()) {
                C15637l[] c15637lArr = this.f18817l;
                int length = c15637lArr.length;
                while (i2 < length) {
                    c15637lArr[i2].firebase();
                    i2++;
                }
                c18449l.isVip();
            } else {
                this.f18831l = false;
                for (C15637l c15637l2 : this.f18817l) {
                    c15637l2.premium(false);
                }
            }
        } else if (z) {
            j = subs(j);
            while (i2 < interfaceC11759lArr.length) {
                if (interfaceC11759lArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f18853l = true;
        return j;
    }

    @Override // defpackage.InterfaceC8782l
    public final long remoteconfig() {
        if (this.f18840l) {
            this.f18840l = false;
            return this.f18816l;
        }
        if (!this.f18829l) {
            return -9223372036854775807L;
        }
        if (!this.f18831l && ad() <= this.f18819l) {
            return -9223372036854775807L;
        }
        this.f18829l = false;
        return this.f18816l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void signatures() {
        C7417l c7417lYandex;
        char c;
        long j = this.f18848l;
        if (this.f18844l || this.f18838l || !this.f18830l || this.f18845l == null) {
            return;
        }
        char c2 = 0;
        for (C15637l c15637l : this.f18817l) {
            if (c15637l.license() == null) {
                return;
            }
        }
        C5811l c5811l = this.f18841l;
        synchronized (c5811l) {
            c5811l.loadAd = false;
        }
        int length = this.f18817l.length;
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            char c3 = 1;
            if (i2 >= length) {
                break;
            }
            C5978l c5978lLicense = this.f18817l[i2].license();
            c5978lLicense.getClass();
            int iAdmob = AbstractC3825l.admob(c5978lLicense.metrica);
            if (iAdmob == 1) {
                c = 3;
            } else if (iAdmob == 2) {
                c = 4;
            } else if (iAdmob != 3) {
                c = iAdmob != 4 ? (char) 0 : (char) 2;
            } else {
                c = 1;
            }
            if (i == 1) {
                c3 = 3;
            } else if (i == 2) {
                c3 = 4;
            } else if (i != 3) {
                c3 = i != 4 ? (char) 0 : (char) 2;
            }
            if (c > c3) {
                i3 = i2;
                i = iAdmob;
            }
            i2++;
        }
        C11916l[] c11916lArr = new C11916l[length];
        boolean[] zArr = new boolean[length];
        int i4 = 0;
        while (i4 < length) {
            C5978l c5978lLicense2 = this.f18817l[i4].license();
            c5978lLicense2.getClass();
            String str = c5978lLicense2.metrica;
            boolean zSubs = AbstractC3825l.subs(str);
            boolean z = (zSubs || AbstractC3825l.remoteconfig(str)) ? true : c2;
            zArr[i4] = z;
            char c4 = c2;
            this.f18846l = (this.f18846l ? 1 : 0) | (z ? 1 : 0);
            this.f18815l = (j != -9223372036854775807L && length == 1 && AbstractC3825l.firebase(str)) ? 1 : c4;
            C13243l c13243l = this.f18823l;
            if (c13243l != null) {
                int i5 = c13243l.yandex;
                if (zSubs || this.f18857l[i4].loadAd) {
                    C7417l c7417l = c5978lLicense2.smaato;
                    if (c7417l == null) {
                        InterfaceC1525l[] interfaceC1525lArr = new InterfaceC1525l[1];
                        interfaceC1525lArr[c4] = c13243l;
                        c7417lYandex = new C7417l(interfaceC1525lArr);
                    } else {
                        InterfaceC1525l[] interfaceC1525lArr2 = new InterfaceC1525l[1];
                        interfaceC1525lArr2[c4] = c13243l;
                        c7417lYandex = c7417l.yandex(interfaceC1525lArr2);
                    }
                    C12984l c12984lYandex = c5978lLicense2.yandex();
                    c12984lYandex.firebase = c7417lYandex;
                    c5978lLicense2 = new C5978l(c12984lYandex);
                }
                if (zSubs && c5978lLicense2.admob == -1 && c5978lLicense2.subs == -1 && i5 != -1) {
                    C12984l c12984lYandex2 = c5978lLicense2.yandex();
                    c12984lYandex2.admob = i5;
                    c5978lLicense2 = new C5978l(c12984lYandex2);
                }
            }
            int iSmaato = this.f18820l.smaato(c5978lLicense2);
            C12984l c12984lYandex3 = c5978lLicense2.yandex();
            c12984lYandex3.f25446throw = iSmaato;
            C5978l c5978l = new C5978l(c12984lYandex3);
            if (i4 != i3) {
                C12984l c12984lYandex4 = c5978l.yandex();
                c12984lYandex4.smaato = Integer.toString(i3);
                c5978l = new C5978l(c12984lYandex4);
            }
            String string = Integer.toString(i4);
            C5978l[] c5978lArr = new C5978l[1];
            c5978lArr[c4] = c5978l;
            c11916lArr[i4] = new C11916l(string, c5978lArr);
            this.f18840l = c5978l.Signature | this.f18840l;
            this.f18817l[i4].m4097throws(this.f18814l);
            i4++;
            c2 = c4;
        }
        this.f18837l = new C12014l(new C8750l(c11916lArr), zArr);
        if (this.f18815l && this.f18855l == -9223372036854775807L) {
            this.f18855l = j;
            this.f18845l = new C14565l(this, this.f18845l);
        }
        this.f18821l.Signature(this.f18855l, this.f18845l, this.f18836l);
        this.f18838l = true;
        InterfaceC2417l interfaceC2417l = this.f18834l;
        interfaceC2417l.getClass();
        interfaceC2417l.crashlytics(this);
    }

    @Override // defpackage.InterfaceC7548l
    public final void smaato(InterfaceC13131l interfaceC13131l, long j, long j2, int i) {
        C16068l c16068l = (C16068l) interfaceC13131l;
        C13384l c13384l = c16068l.loadAd;
        this.f18842l.m3674for(i == 0 ? new C13071l(c16068l.isPro, j) : new C13071l(c16068l.isPro, c13384l.f26265l, c13384l.f26268l, j, j2, c13384l.f26266l), 1, -1, null, 0, null, c16068l.subs, this.f18855l, i);
    }

    @Override // defpackage.InterfaceC2053l
    public final InterfaceC8979l startapp(int i, int i2) {
        return appmetrica(new C13511l(i, false));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094 A[LOOP:1: B:44:0x0092->B:45:0x0094, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9 A[LOOP:2: B:49:0x00a7->B:50:0x00a9, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x008f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00a0, please report this as an issue */
    @Override // defpackage.InterfaceC8782l
    public final long subs(long j) {
        int i;
        pro();
        boolean[] zArr = (boolean[]) this.f18837l.f23940l;
        if (!this.f18845l.loadAd()) {
            j = 0;
        }
        this.f18829l = false;
        boolean z = true;
        boolean z2 = this.f18816l == j;
        this.f18816l = j;
        if (isVip()) {
            this.f18825l = j;
            return j;
        }
        int i2 = this.f18849l;
        C18449l c18449l = this.f18818l;
        if (i2 == 7 || !(this.f18831l || c18449l.m4537catch())) {
            this.f18828l = false;
            this.f18825l = j;
            this.f18831l = false;
            this.f18840l = false;
            if (c18449l.m4537catch()) {
                for (C15637l c15637l : this.f18817l) {
                    c15637l.firebase();
                }
                c18449l.isVip();
                return j;
            }
            c18449l.f36012l = null;
            for (C15637l c15637l2 : this.f18817l) {
                c15637l2.premium(false);
            }
        } else {
            int length = this.f18817l.length;
            for (int i3 = 0; i3 < length; i3++) {
                C15637l c15637l3 = this.f18817l[i3];
                if (this.f18822l[i3].amazon.get() == EnumC8530l.f17622l && (c15637l3.subscription() != 0 || !z2)) {
                    if (!(this.f18815l ? c15637l3.appmetrica(c15637l3.adcel) : c15637l3.inmobi(j, this.f18831l)) && (zArr[i3] || !this.f18846l)) {
                        z = false;
                        break;
                    }
                }
            }
            if (!z) {
                this.f18828l = false;
                this.f18825l = j;
                this.f18831l = false;
                this.f18840l = false;
                if (c18449l.m4537catch()) {
                    while (i < r0) {
                        c15637l.firebase();
                    }
                    c18449l.isVip();
                    return j;
                }
                c18449l.f36012l = null;
                while (i < r0) {
                    c15637l2.premium(false);
                }
            }
        }
        return j;
    }

    @Override // defpackage.InterfaceC15208l
    public final void subscription() {
        this.f18856l.post(this.f18827l);
    }

    @Override // defpackage.InterfaceC2053l
    public final void tapsense(InterfaceC12703l interfaceC12703l) {
        this.f18856l.post(new RunnableC10311l(this, interfaceC12703l, 6));
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void m2620throws() {
        C16068l c16068l = new C16068l(this, this.f18833l, this.f18832l, this.f18854l, this, this.f18841l);
        if (this.f18838l) {
            AbstractC12442l.subscription(isVip());
            long j = this.f18814l;
            if (j == Long.MIN_VALUE) {
                j = this.f18855l;
            }
            if (j != -9223372036854775807L && this.f18825l > j) {
                this.f18831l = true;
                this.f18825l = -9223372036854775807L;
                return;
            }
            InterfaceC12703l interfaceC12703l = this.f18845l;
            interfaceC12703l.getClass();
            long j2 = interfaceC12703l.purchase(this.f18825l).yandex.loadAd;
            long j3 = this.f18825l;
            c16068l.billing.f2761l = j2;
            c16068l.subs = j3;
            c16068l.admob = true;
            c16068l.smaato = false;
            for (C15637l c15637l : this.f18817l) {
                c15637l.tapsense = this.f18825l;
            }
            this.f18825l = -9223372036854775807L;
        }
        this.f18819l = ad();
        this.f18818l.m4552public(c16068l, this, this.f18843l.license(this.f18849l));
    }

    @Override // defpackage.InterfaceC8782l
    public final void vip(InterfaceC2417l interfaceC2417l, long j) {
        this.f18834l = interfaceC2417l;
        C5978l c5978l = this.f18852l;
        if (c5978l == null) {
            this.f18841l.amazon();
            m2620throws();
        } else {
            startapp(0, 3).mopub(c5978l);
            inmobi(new C3762l(-9223372036854775807L, new long[]{0}, new long[]{0}));
            firebase();
            this.f18825l = j;
        }
    }

    @Override // defpackage.InterfaceC16681l
    public final void yandex() {
        for (C15637l c15637l : this.f18817l) {
            c15637l.premium(true);
            InterfaceC9655l interfaceC9655l = c15637l.admob;
            if (interfaceC9655l != null) {
                interfaceC9655l.amazon(c15637l.purchase);
                c15637l.admob = null;
                c15637l.mopub = null;
            }
        }
        C18449l c18449l = this.f18854l;
        InterfaceC14833l interfaceC14833l = (InterfaceC14833l) c18449l.f36009l;
        if (interfaceC14833l != null) {
            interfaceC14833l.release();
            c18449l.f36009l = null;
        }
        c18449l.f36012l = null;
    }
}
