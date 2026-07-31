package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٖؔٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2615l implements InterfaceC8782l, InterfaceC7548l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public byte[] f5678l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C7713l f5679l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final ArrayList f5680l = new ArrayList();

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final long f5681l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC0587l f5682l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2432l f5683l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C5978l f5684l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C13698l f5685l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C14513l f5686l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f5687l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C18449l f5688l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C8750l f5689l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final boolean f5690l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public int f5691l;

    public C2615l(C2432l c2432l, InterfaceC0587l interfaceC0587l, C7713l c7713l, C5978l c5978l, long j, C14513l c14513l, C13698l c13698l, boolean z, ExecutorC13021l executorC13021l) {
        this.f5683l = c2432l;
        this.f5682l = interfaceC0587l;
        this.f5679l = c7713l;
        this.f5684l = c5978l;
        this.f5681l = j;
        this.f5686l = c14513l;
        this.f5685l = c13698l;
        this.f5690l = z;
        this.f5689l = new C8750l(new C11916l("", c5978l));
        this.f5688l = executorC13021l != null ? new C18449l(2, executorC13021l) : new C18449l("SingleSampleMediaPeriod", 2);
    }

    @Override // defpackage.InterfaceC7548l
    public final C8128l Signature(InterfaceC13131l interfaceC13131l, long j, long j2, IOException iOException, int i) {
        long jMin;
        IOException iOException2;
        C8128l c8128l;
        C7786l c7786l = (C7786l) interfaceC13131l;
        C13384l c13384l = c7786l.loadAd;
        C13071l c13071l = new C13071l(c7786l.yandex, c13384l.f26265l, c13384l.f26268l, j, j2, c13384l.f26266l);
        String str = AbstractC15323l.yandex;
        C14513l c14513l = this.f5686l;
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
        boolean z = jMin == -9223372036854775807L || i >= c14513l.license(1);
        if (this.f5690l && z) {
            iOException2 = iOException;
            AbstractC6427l.metrica("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException2);
            this.f5687l = true;
            c8128l = C18449l.f36005l;
        } else {
            iOException2 = iOException;
            c8128l = jMin != -9223372036854775807L ? new C8128l(0, jMin, false) : C18449l.f36007l;
        }
        int i2 = c8128l.f16932l;
        boolean z2 = i2 == 0 || i2 == 1;
        this.f5685l.m3680private(c13071l, 1, -1, this.f5684l, 0, null, 0L, this.f5681l, iOException2, !z2);
        if (!z2) {
            c14513l.getClass();
        }
        return c8128l;
    }

    @Override // defpackage.InterfaceC3128l
    public final boolean adcel(C11495l c11495l) {
        if (this.f5687l) {
            return false;
        }
        C18449l c18449l = this.f5688l;
        if (c18449l.m4537catch() || ((IOException) c18449l.f36012l) != null) {
            return false;
        }
        InterfaceC14090l interfaceC14090lPro = this.f5682l.pro();
        C7713l c7713l = this.f5679l;
        if (c7713l != null) {
            interfaceC14090lPro.metrica(c7713l);
        }
        c18449l.m4552public(new C7786l(interfaceC14090lPro, this.f5683l), this, this.f5686l.license(1));
        return true;
    }

    @Override // defpackage.InterfaceC3128l
    public final long ads() {
        return this.f5687l ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.InterfaceC3128l
    public final boolean amazon() {
        return this.f5688l.m4537catch();
    }

    @Override // defpackage.InterfaceC3128l
    public final long billing() {
        return (this.f5687l || this.f5688l.m4537catch()) ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.InterfaceC7548l
    public final void crashlytics(InterfaceC13131l interfaceC13131l, long j, long j2) {
        C7786l c7786l = (C7786l) interfaceC13131l;
        this.f5691l = (int) c7786l.loadAd.f26266l;
        byte[] bArr = c7786l.crashlytics;
        bArr.getClass();
        this.f5678l = bArr;
        this.f5687l = true;
        C13384l c13384l = c7786l.loadAd;
        C13071l c13071l = new C13071l(c7786l.yandex, c13384l.f26265l, c13384l.f26268l, j, j2, this.f5691l);
        this.f5686l.getClass();
        this.f5685l.m3677native(c13071l, 1, -1, this.f5684l, 0, null, 0L, this.f5681l);
    }

    @Override // defpackage.InterfaceC7548l
    public final void loadAd(InterfaceC13131l interfaceC13131l, long j, long j2, boolean z) {
        C7786l c7786l = (C7786l) interfaceC13131l;
        C13384l c13384l = c7786l.loadAd;
        C13071l c13071l = new C13071l(c7786l.yandex, c13384l.f26265l, c13384l.f26268l, j, j2, c13384l.f26266l);
        this.f5686l.getClass();
        this.f5685l.m3685volatile(c13071l, 1, -1, null, 0, null, 0L, this.f5681l);
    }

    @Override // defpackage.InterfaceC8782l
    public final C8750l metrica() {
        return this.f5689l;
    }

    @Override // defpackage.InterfaceC8782l
    public final long purchase(InterfaceC10376l[] interfaceC10376lArr, boolean[] zArr, InterfaceC11759l[] interfaceC11759lArr, boolean[] zArr2, long j) {
        for (int i = 0; i < interfaceC10376lArr.length; i++) {
            InterfaceC11759l interfaceC11759l = interfaceC11759lArr[i];
            ArrayList arrayList = this.f5680l;
            if (interfaceC11759l != null && (interfaceC10376lArr[i] == null || !zArr[i])) {
                arrayList.remove(interfaceC11759l);
                interfaceC11759lArr[i] = null;
            }
            if (interfaceC11759lArr[i] == null && interfaceC10376lArr[i] != null) {
                C15117l c15117l = new C15117l(this);
                arrayList.add(c15117l);
                interfaceC11759lArr[i] = c15117l;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // defpackage.InterfaceC8782l
    public final long remoteconfig() {
        return -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC7548l
    public final void smaato(InterfaceC13131l interfaceC13131l, long j, long j2, int i) {
        C7786l c7786l = (C7786l) interfaceC13131l;
        C13384l c13384l = c7786l.loadAd;
        this.f5685l.m3674for(i == 0 ? new C13071l(c7786l.yandex, j) : new C13071l(c7786l.yandex, c13384l.f26265l, c13384l.f26268l, j, j2, c13384l.f26266l), 1, -1, this.f5684l, 0, null, 0L, this.f5681l, i);
    }

    @Override // defpackage.InterfaceC8782l
    public final long subs(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5680l;
            if (i >= arrayList.size()) {
                return j;
            }
            C15117l c15117l = (C15117l) arrayList.get(i);
            if (c15117l.f29657l == 2) {
                c15117l.f29657l = 1;
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC8782l
    public final void vip(InterfaceC2417l interfaceC2417l, long j) {
        interfaceC2417l.crashlytics(this);
    }

    @Override // defpackage.InterfaceC8782l
    public final void admob() {
    }

    @Override // defpackage.InterfaceC8782l
    public final void isPro(long j) {
    }

    @Override // defpackage.InterfaceC3128l
    public final void license(long j) {
    }

    @Override // defpackage.InterfaceC8782l
    public final long mopub(long j, C17654l c17654l) {
        return j;
    }
}
