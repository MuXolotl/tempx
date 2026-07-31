package defpackage;

/* JADX INFO: renamed from: lؚٕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14165l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public AbstractC8939l f27697l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f27698l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C4480l f27699l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public float f27701l = 1.0f;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public EnumC9931l f27700l = EnumC9931l.f20223l;

    public static /* synthetic */ void admob(AbstractC14165l abstractC14165l, InterfaceC13349l interfaceC13349l, long j, C0534l c0534l, int i) {
        if ((i & 4) != 0) {
            c0534l = null;
        }
        abstractC14165l.mopub(interfaceC13349l, j, 1.0f, c0534l);
    }

    public boolean amazon(float f) {
        return false;
    }

    public abstract void isPro(InterfaceC13349l interfaceC13349l);

    public final void mopub(InterfaceC13349l interfaceC13349l, long j, float f, AbstractC8939l abstractC8939l) {
        if (this.f27701l != f) {
            if (!amazon(f)) {
                C4480l c4480lYandex = this.f27699l;
                if (f == 1.0f) {
                    if (c4480lYandex != null) {
                        c4480lYandex.amazon(f);
                    }
                    this.f27698l = false;
                } else {
                    if (c4480lYandex == null) {
                        c4480lYandex = AbstractC4311l.yandex();
                        this.f27699l = c4480lYandex;
                    }
                    c4480lYandex.amazon(f);
                    this.f27698l = true;
                }
            }
            this.f27701l = f;
        }
        if (!AbstractC8576l.yandex(this.f27697l, abstractC8939l)) {
            if (!purchase(abstractC8939l)) {
                C4480l c4480lYandex2 = this.f27699l;
                if (abstractC8939l == null) {
                    if (c4480lYandex2 != null) {
                        c4480lYandex2.mopub(null);
                    }
                    this.f27698l = false;
                } else {
                    if (c4480lYandex2 == null) {
                        c4480lYandex2 = AbstractC4311l.yandex();
                        this.f27699l = c4480lYandex2;
                    }
                    c4480lYandex2.mopub(abstractC8939l);
                    this.f27698l = true;
                }
            }
            this.f27697l = abstractC8939l;
        }
        EnumC9931l layoutDirection = interfaceC13349l.getLayoutDirection();
        if (this.f27700l != layoutDirection) {
            billing(layoutDirection);
            this.f27700l = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((C16543l) interfaceC13349l.mo2065break().f36010l).subscription(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.f27698l) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        C8896l c8896lIsPro = AbstractC7470l.isPro(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        InterfaceC14859l interfaceC14859lM4555synchronized = interfaceC13349l.mo2065break().m4555synchronized();
                        C4480l c4480lYandex3 = this.f27699l;
                        if (c4480lYandex3 == null) {
                            c4480lYandex3 = AbstractC4311l.yandex();
                            this.f27699l = c4480lYandex3;
                        }
                        try {
                            interfaceC14859lM4555synchronized.Signature(c8896lIsPro, c4480lYandex3);
                            isPro(interfaceC13349l);
                            interfaceC14859lM4555synchronized.ads();
                        } catch (Throwable th) {
                            interfaceC14859lM4555synchronized.ads();
                            throw th;
                        }
                    } else {
                        isPro(interfaceC13349l);
                    }
                }
            } catch (Throwable th2) {
                ((C16543l) interfaceC13349l.mo2065break().f36010l).subscription(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        ((C16543l) interfaceC13349l.mo2065break().f36010l).subscription(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public boolean purchase(AbstractC8939l abstractC8939l) {
        return false;
    }

    public abstract long subs();

    public void billing(EnumC9931l enumC9931l) {
    }
}
