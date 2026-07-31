package defpackage;

/* JADX INFO: renamed from: lؙؚؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6160l implements InterfaceC5960l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C10141l f12961l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C5321l f12962l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C3253l f12963l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C12218l f12964l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC12586l f12965l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C14785l f12966l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C14129l f12967l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C18190l f12968l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C14785l f12969l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public AbstractC15185l f12970l;

    public C6160l(AbstractC12586l abstractC12586l) {
        this.f12965l = abstractC12586l;
        char c = 0;
        C14785l c14785l = new C14785l(c, 7);
        c14785l.f28907l = new C12463l();
        this.f12969l = c14785l;
        C14785l c14785l2 = new C14785l(c, 17);
        c14785l2.f28907l = new C9571l();
        this.f12966l = c14785l2;
    }

    public static void crashlytics(C6160l c6160l, C14153l c14153l, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        AbstractC12586l abstractC12586l = c6160l.f12965l;
        C18190l c18190l = c6160l.f12968l;
        if (c18190l == null) {
            c18190l = new C18190l();
            c18190l.loadAd = null;
            c18190l.crashlytics = Long.MAX_VALUE;
            c18190l.amazon = false;
            c6160l.f12968l = c18190l;
        }
        c18190l.loadAd = c14153l;
        c18190l.crashlytics = j;
        C3253l c3253l = c6160l.f12963l;
        EnumC7283l enumC7283l = abstractC12586l.f24782l;
        if (c3253l == null) {
            c6160l.f12963l = new C3253l(enumC7283l, 2);
        } else {
            c3253l.f6947l = enumC7283l;
            c3253l.f6948l = j2;
        }
        c18190l.amazon = false;
        c6160l.f12970l = c18190l;
    }

    public final C5321l amazon() {
        C5321l c5321l = this.f12962l;
        if (c5321l != null) {
            return c5321l;
        }
        C8339l.metrica("Velocity Tracker not initialized.");
        return null;
    }

    public final void billing(C14153l c14153l, C14153l c14153l2, C3272l c3272l, long j) {
        char c;
        long j2;
        float f;
        float fIntBitsToFloat;
        if (this.f12962l == null) {
            this.f12962l = new C5321l(0);
        }
        C5321l c5321lAmazon = amazon();
        AbstractC12586l abstractC12586l = this.f12965l;
        EnumC7283l enumC7283l = abstractC12586l.f24782l;
        C14785l c14785l = this.f12969l;
        C12463l c12463l = (C12463l) c14785l.f28907l;
        char c2 = ' ';
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c14153l.crashlytics >> 32));
        long j3 = 4294967295L;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c14153l.crashlytics & 4294967295L));
        if (AbstractC17764l.loadAd(c14153l)) {
            c14785l.f28908l = 0;
            c12463l.billing();
        }
        if (AbstractC17764l.yandex(c14153l) || AbstractC17764l.loadAd(c14153l)) {
            c = ' ';
            j2 = 4294967295L;
            f = 0.0f;
        } else {
            if (c12463l.loadAd == 3) {
                int i = c14785l.f28908l;
                c14785l.f28908l = i + 1;
                c12463l.startapp(i, c14153l);
            } else {
                c12463l.yandex(c14153l);
            }
            if (c14785l.f28908l == 3) {
                c14785l.f28908l = 0;
            }
            Object[] objArr = c12463l.yandex;
            int i2 = c12463l.loadAd;
            int i3 = 0;
            float fIntBitsToFloat4 = 0.0f;
            while (i3 < i2) {
                char c3 = c2;
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((C14153l) objArr[i3]).crashlytics >> c3));
                i3++;
                c2 = c3;
                j3 = j3;
            }
            c = c2;
            j2 = j3;
            f = 0.0f;
            int i4 = c12463l.loadAd;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = c12463l.yandex;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((C14153l) objArr2[i5]).crashlytics & j2));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / c12463l.loadAd;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2);
        if (enumC7283l != null) {
            int i6 = c3272l.yandex;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
            }
            jFloatToRawIntBits = enumC7283l == EnumC7283l.f15125l ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) | (((long) Float.floatToRawIntBits(f)) & j2) : (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2) | (Float.floatToRawIntBits(f) << c);
        }
        ((C8043l) c5321lAmazon.f11449l).billing(c14153l.loadAd, jFloatToRawIntBits);
        long jAdmob = C1187l.admob(AbstractC17764l.billing(c14153l2, abstractC12586l.f24782l, c3272l), j);
        if (((Boolean) abstractC12586l.f24791l.invoke(new C10829l(1))).booleanValue()) {
            abstractC12586l.m3417l(new C1917l(jAdmob));
        }
        C14785l c14785l2 = this.f12966l;
        c14785l2.f28908l = 0;
        ((C9571l) c14785l2.f28907l).loadAd = 0;
    }

    @Override // defpackage.InterfaceC5960l
    /* JADX INFO: renamed from: goto */
    public final EnumC7283l mo1916goto() {
        return this.f12965l.f24782l;
    }

    @Override // defpackage.InterfaceC0421l
    /* JADX INFO: renamed from: interface */
    public final String mo531interface() {
        AbstractC15185l abstractC15185l = this.f12970l;
        if (abstractC15185l instanceof C12218l) {
            return ((C12218l) abstractC15185l).amazon ? "waiting" : "idle";
        }
        if ((abstractC15185l instanceof C18190l) || (abstractC15185l instanceof C14129l)) {
            return "waiting";
        }
        return abstractC15185l instanceof C10141l ? "recognized" : "idle";
    }

    public final void loadAd(C14153l c14153l, long j, C3253l c3253l) {
        C14129l c14129l = this.f12967l;
        if (c14129l == null) {
            c14129l = new C14129l();
            c14129l.loadAd = null;
            c14129l.crashlytics = Long.MAX_VALUE;
            this.f12967l = c14129l;
        }
        c14129l.loadAd = c14153l;
        c14129l.crashlytics = j;
        c3253l.f6948l = 0L;
        this.f12970l = c14129l;
    }

    public final void purchase(C14153l c14153l, C3272l c3272l, long j) {
        long j2;
        float fIntBitsToFloat;
        long j3 = c14153l.crashlytics;
        AbstractC12586l abstractC12586l = this.f12965l;
        EnumC7283l enumC7283l = abstractC12586l.f24782l;
        C12349l c12349l = AbstractC16318l.yandex;
        long j4 = 4294967295L;
        if (Math.abs(Float.intBitsToFloat((int) (enumC7283l == EnumC7283l.f15126l ? j & 4294967295L : j >> 32))) > 2.0f) {
            C5321l c5321lAmazon = amazon();
            EnumC7283l enumC7283l2 = abstractC12586l.f24782l;
            C14785l c14785l = this.f12969l;
            C12463l c12463l = (C12463l) c14785l.f28907l;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            if (AbstractC17764l.loadAd(c14153l)) {
                c14785l.f28908l = 0;
                c12463l.billing();
            }
            float fIntBitsToFloat4 = 0.0f;
            if (AbstractC17764l.yandex(c14153l) || AbstractC17764l.loadAd(c14153l)) {
                j2 = 4294967295L;
            } else {
                if (c12463l.loadAd == 3) {
                    int i = c14785l.f28908l;
                    c14785l.f28908l = i + 1;
                    c12463l.startapp(i, c14153l);
                } else {
                    c12463l.yandex(c14153l);
                }
                if (c14785l.f28908l == 3) {
                    c14785l.f28908l = 0;
                }
                Object[] objArr = c12463l.yandex;
                int i2 = c12463l.loadAd;
                int i3 = 0;
                float fIntBitsToFloat5 = 0.0f;
                while (i3 < i2) {
                    fIntBitsToFloat5 += Float.intBitsToFloat((int) (((C14153l) objArr[i3]).crashlytics >> 32));
                    i3++;
                    j4 = j4;
                }
                j2 = j4;
                int i4 = c12463l.loadAd;
                fIntBitsToFloat2 = fIntBitsToFloat5 / i4;
                Object[] objArr2 = c12463l.yandex;
                float fIntBitsToFloat6 = 0.0f;
                for (int i5 = 0; i5 < i4; i5++) {
                    fIntBitsToFloat6 += Float.intBitsToFloat((int) (((C14153l) objArr2[i5]).crashlytics & j2));
                }
                fIntBitsToFloat3 = fIntBitsToFloat6 / c12463l.loadAd;
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
            if (enumC7283l2 != null) {
                int i6 = c3272l.yandex;
                if (i6 == 1) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                } else if (i6 == 2) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
                }
                jFloatToRawIntBits = enumC7283l2 == EnumC7283l.f15125l ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
            }
            ((C8043l) c5321lAmazon.f11449l).billing(c14153l.loadAd, jFloatToRawIntBits);
            C14785l c14785l2 = this.f12966l;
            C9571l c9571l = (C9571l) c14785l2.f28907l;
            if (c9571l.loadAd == 3) {
                int i7 = c14785l2.f28908l;
                c14785l2.f28908l = i7 + 1;
                c9571l.billing(i7, j);
            } else {
                c9571l.yandex(j);
            }
            if (c14785l2.f28908l == 3) {
                c14785l2.f28908l = 0;
            }
            long[] jArr = c9571l.yandex;
            int i8 = c9571l.loadAd;
            float fIntBitsToFloat7 = 0.0f;
            for (int i9 = 0; i9 < i8; i9++) {
                fIntBitsToFloat7 += Float.intBitsToFloat((int) (jArr[i9] >> 32));
            }
            int i10 = c9571l.loadAd;
            float f = fIntBitsToFloat7 / i10;
            long[] jArr2 = c9571l.yandex;
            for (int i11 = 0; i11 < i10; i11++) {
                fIntBitsToFloat4 = Float.intBitsToFloat((int) (jArr2[i11] & j2)) + fIntBitsToFloat4;
            }
            abstractC12586l.m3417l(new C3995l((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4 / c9571l.loadAd)) & j2), true));
        }
    }

    public final void yandex() {
        C12218l c12218l = this.f12964l;
        if (c12218l == null) {
            c12218l = new C12218l();
            c12218l.loadAd = 3;
            c12218l.crashlytics = false;
            c12218l.amazon = false;
            this.f12964l = c12218l;
        }
        c12218l.loadAd = 3;
        c12218l.crashlytics = false;
        c12218l.amazon = false;
        this.f12970l = c12218l;
    }
}
