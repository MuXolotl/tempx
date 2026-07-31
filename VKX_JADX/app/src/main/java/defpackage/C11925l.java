package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِٙؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11925l {
    public long Signature;
    public int ad;
    public int adcel;
    public int advert;
    public Outline billing;
    public AbstractC15342l firebase;
    public float isPro;
    public long isVip;
    public int license;
    public C13601l metrica;
    public RectF premium;
    public int pro;
    public C9902l remoteconfig;
    public boolean signatures;
    public C9902l smaato;
    public C4480l startapp;
    public boolean subscription;
    public long tapsense;
    public boolean vip;
    public final InterfaceC0285l yandex;
    public InterfaceC13490l loadAd = AbstractC14707l.yandex;
    public EnumC9931l crashlytics = EnumC9931l.f20223l;
    public Function1 amazon = C16274l.f31871l;
    public final C3006l purchase = new C3006l(18, this);
    public boolean mopub = true;
    public long admob = 0;
    public long subs = 9205357640488583168L;
    public final C18480l ads = new C18480l(4);

    static {
        AbstractC8576l.yandex(Build.FINGERPRINT, "robolectric");
    }

    public C11925l(InterfaceC0285l interfaceC0285l) {
        this.yandex = interfaceC0285l;
        interfaceC0285l.inmobi(false);
        this.tapsense = 0L;
        this.Signature = 0L;
        this.isVip = 9205357640488583168L;
    }

    public final void admob(int i) {
        InterfaceC0285l interfaceC0285l = this.yandex;
        if (interfaceC0285l.remoteconfig() == i) {
            return;
        }
        interfaceC0285l.mo400synchronized(i);
    }

    public final AbstractC15342l amazon() {
        AbstractC15342l c13080l;
        AbstractC15342l abstractC15342l = this.firebase;
        C9902l c9902l = this.smaato;
        if (abstractC15342l != null) {
            return abstractC15342l;
        }
        if (c9902l != null) {
            C13616l c13616l = new C13616l(c9902l);
            this.firebase = c13616l;
            return c13616l;
        }
        long jMopub = AbstractC14707l.mopub(this.Signature);
        long j = this.admob;
        long j2 = this.subs;
        if (j2 != 9205357640488583168L) {
            jMopub = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMopub >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMopub & 4294967295L)) + fIntBitsToFloat2;
        float f = this.isPro;
        if (f > 0.0f) {
            c13080l = new C18521l(AbstractC8238l.yandex(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            c13080l = new C13080l(new C8896l(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.firebase = c13080l;
        return c13080l;
    }

    public final void billing(float f) {
        InterfaceC0285l interfaceC0285l = this.yandex;
        if (interfaceC0285l.yandex() == f) {
            return;
        }
        interfaceC0285l.Signature(f);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[LOOP:0: B:20:0x0059->B:30:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[EDGE_INSN: B:34:0x0099->B:31:0x0099 BREAK  A[LOOP:0: B:20:0x0059->B:30:0x0096], SYNTHETIC] */
    public final void crashlytics(InterfaceC13349l interfaceC13349l) {
        C18480l c18480l = this.ads;
        c18480l.f36088l = (C11925l) c18480l.f36084l;
        C6295l c6295l = (C6295l) c18480l.f36087l;
        if (c6295l != null && c6295l.subs()) {
            C6295l c6295l2 = (C6295l) c18480l.f36089l;
            if (c6295l2 == null) {
                C6295l c6295l3 = AbstractC13087l.yandex;
                c6295l2 = new C6295l();
                c18480l.f36089l = c6295l2;
            }
            c6295l2.firebase(c6295l);
            c6295l.loadAd();
        }
        c18480l.f36085l = true;
        this.amazon.invoke(interfaceC13349l);
        c18480l.f36085l = false;
        C11925l c11925l = (C11925l) c18480l.f36088l;
        if (c11925l != null) {
            c11925l.adcel--;
            c11925l.loadAd();
        }
        C6295l c6295l4 = (C6295l) c18480l.f36089l;
        if (c6295l4 == null || !c6295l4.subs()) {
            return;
        }
        Object[] objArr = c6295l4.loadAd;
        long[] jArr = c6295l4.yandex;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            C11925l c11925l2 = (C11925l) objArr[(i << 3) + i3];
                            c11925l2.adcel--;
                            c11925l2.loadAd();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        c6295l4.loadAd();
    }

    public final void isPro(long j, long j2, float f) {
        float f2 = this.license;
        long jSubs = C1187l.subs(j, (((long) Float.floatToRawIntBits(this.pro)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        if (C1187l.loadAd(this.admob, jSubs) && C14174l.loadAd(this.subs, j2) && this.isPro == f && this.smaato == null) {
            return;
        }
        this.firebase = null;
        this.smaato = null;
        this.mopub = true;
        this.vip = false;
        this.admob = jSubs;
        this.subs = j2;
        this.isPro = f;
        yandex();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:0: B:14:0x002d->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:0: B:14:0x002d->B:24:0x006a], SYNTHETIC] */
    public final void loadAd() {
        if (this.subscription && this.adcel == 0) {
            C18480l c18480l = this.ads;
            C11925l c11925l = (C11925l) c18480l.f36084l;
            if (c11925l != null) {
                c11925l.adcel--;
                c11925l.loadAd();
                c18480l.f36084l = null;
            }
            C6295l c6295l = (C6295l) c18480l.f36087l;
            if (c6295l != null) {
                Object[] objArr = c6295l.loadAd;
                long[] jArr = c6295l.yandex;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    C11925l c11925l2 = (C11925l) objArr[(i << 3) + i3];
                                    c11925l2.adcel--;
                                    c11925l2.loadAd();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                c6295l.loadAd();
            }
            this.yandex.isPro();
        }
    }

    public final void mopub(boolean z) {
        if (this.signatures != z) {
            this.signatures = z;
            this.mopub = true;
            yandex();
        }
    }

    public final void purchase(InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l, long j, Function1 function1) {
        boolean zLoadAd = C4999l.loadAd(this.Signature, j);
        InterfaceC0285l interfaceC0285l = this.yandex;
        if (!zLoadAd) {
            this.Signature = j;
            long j2 = this.tapsense;
            interfaceC0285l.firebase((int) (j2 >> 32), j, (int) (j2 & 4294967295L));
            if (this.subs == 9205357640488583168L) {
                this.mopub = true;
                yandex();
            }
        }
        this.loadAd = interfaceC13490l;
        this.crashlytics = enumC9931l;
        this.amazon = function1;
        interfaceC0285l.mo397package(interfaceC13490l, enumC9931l, this, this.purchase);
    }

    public final void subs(C6312l c6312l) {
        InterfaceC0285l interfaceC0285l = this.yandex;
        if (AbstractC8576l.yandex(interfaceC0285l.purchase(), c6312l)) {
            return;
        }
        interfaceC0285l.applovin(c6312l);
    }

    public final void yandex() {
        Outline outline;
        if (this.mopub) {
            boolean z = this.signatures;
            Outline outline2 = null;
            InterfaceC0285l interfaceC0285l = this.yandex;
            if (z || interfaceC0285l.mo394extends() > 0.0f) {
                C9902l c9902l = this.smaato;
                if (c9902l != null) {
                    RectF rectF = this.premium;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.premium = rectF;
                    }
                    boolean z2 = c9902l instanceof C9902l;
                    if (!z2) {
                        C10754l.ads("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = c9902l.yandex;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.billing;
                        if (outline == null) {
                            outline = new Outline();
                            this.billing = outline;
                        }
                        if (i >= 30) {
                            AbstractC5121l.tapsense(outline, c9902l);
                        } else {
                            if (!z2) {
                                C10754l.ads("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        outline.offset(this.license, this.pro);
                        this.vip = !outline.canClip();
                    } else {
                        Outline outline3 = this.billing;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.vip = true;
                        outline = null;
                    }
                    this.smaato = c9902l;
                    if (outline != null) {
                        outline.setAlpha(interfaceC0285l.yandex());
                        outline2 = outline;
                    }
                    interfaceC0285l.admob(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.vip && this.signatures) {
                        interfaceC0285l.inmobi(false);
                        interfaceC0285l.isPro();
                    } else {
                        interfaceC0285l.inmobi(this.signatures);
                    }
                } else {
                    interfaceC0285l.inmobi(this.signatures);
                    Outline outline4 = this.billing;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.billing = outline4;
                    }
                    Outline outline5 = outline4;
                    long jMopub = AbstractC14707l.mopub(this.Signature);
                    long j = this.admob;
                    long j2 = this.subs;
                    long j3 = j2 == 9205357640488583168L ? jMopub : j2;
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3)), this.isPro);
                    outline5.setAlpha(interfaceC0285l.yandex());
                    interfaceC0285l.admob(outline5, AbstractC14707l.purchase(j3));
                }
            } else {
                interfaceC0285l.inmobi(false);
                interfaceC0285l.admob(null, 0L);
            }
        }
        this.mopub = false;
    }
}
