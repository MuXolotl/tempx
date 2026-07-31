package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lُۚؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11303l implements InterfaceC13490l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f22796l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC11754l f22797l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f22795l = 9223372034707292159L;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public long f22794l = 0;

    public C11303l(AbstractC11754l abstractC11754l) {
        this.f22797l = abstractC11754l;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: case */
    public final long mo866case(float f) {
        return AbstractC2812l.purchase(this, mo867final(f));
    }

    public final void crashlytics(C3384l c3384l, float f) {
        AbstractC11754l abstractC11754l = this.f22797l;
        C1080l c1080l = abstractC11754l.f23547l;
        if (c1080l == null) {
            c1080l = new C1080l(6);
            abstractC11754l.f23547l = c1080l;
        }
        int iM2398catch = AbstractC8669l.m2398catch(c3384l, (C3384l[]) c1080l.f2970l);
        if (iM2398catch >= 0) {
            float[] fArr = (float[]) c1080l.f2975l;
            if (fArr[iM2398catch] != f) {
                fArr[iM2398catch] = f;
                ((byte[]) c1080l.f2976l)[iM2398catch] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) c1080l.f2976l;
                if (bArr[iM2398catch] == 2) {
                    bArr[iM2398catch] = 0;
                    return;
                }
                return;
            }
        }
        int i = c1080l.f2972l;
        C3384l[] c3384lArr = (C3384l[]) c1080l.f2970l;
        if (i == c3384lArr.length) {
            int i2 = i * 2;
            c1080l.f2970l = (C3384l[]) Arrays.copyOf(c3384lArr, i2);
            c1080l.f2975l = Arrays.copyOf((float[]) c1080l.f2975l, i2);
            c1080l.f2976l = Arrays.copyOf((byte[]) c1080l.f2976l, i2);
        }
        ((C3384l[]) c1080l.f2970l)[i] = c3384l;
        ((byte[]) c1080l.f2976l)[i] = 3;
        ((float[]) c1080l.f2975l)[i] = f;
        c1080l.f2972l++;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: final */
    public final float mo867final(float f) {
        return f / loadAd();
    }

    @Override // defpackage.InterfaceC13490l
    public final /* synthetic */ float inmobi(long j) {
        return AbstractC2812l.amazon(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: instanceof */
    public final float mo868instanceof(float f) {
        return loadAd() * f;
    }

    @Override // defpackage.InterfaceC13490l
    public final /* synthetic */ long license(long j) {
        return AbstractC9361l.loadAd(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    public final float loadAd() {
        return this.f22797l.loadAd();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final /* synthetic */ long mo869l(long j) {
        return AbstractC9361l.amazon(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final /* synthetic */ int mo870l(float f) {
        return AbstractC9361l.yandex(this, f);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final /* synthetic */ float mo871l(long j) {
        return AbstractC9361l.crashlytics(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: static */
    public final float mo872static(int i) {
        return i / loadAd();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: super */
    public final float mo873super() {
        return this.f22797l.mo873super();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: transient */
    public final int mo874transient(long j) {
        return Math.round(mo871l(j));
    }

    public final InterfaceC18212l yandex() {
        this.f22796l = true;
        AbstractC11754l abstractC11754l = this.f22797l;
        InterfaceC18212l interfaceC18212lMo1003while = abstractC11754l.mo1003while();
        if (C5177l.loadAd(this.f22795l, 9223372034707292159L)) {
            this.f22795l = AbstractC3383l.isPro(interfaceC18212lMo1003while.startapp(0L));
            this.f22794l = interfaceC18212lMo1003while.smaato();
        }
        abstractC11754l.mo1002return().f7667l.loadAd();
        return interfaceC18212lMo1003while;
    }
}
