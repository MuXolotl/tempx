package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: lٜؔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2876l extends AbstractC1091l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public C15173l f6245l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public int f6246l;

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public boolean f6247l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public boolean f6248l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final ArrayDeque f6249l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C4136l f6250l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public int f6251l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public boolean f6252l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public C1964l f6253l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C13161l f6254l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public C4136l f6255l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public int f6256l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public long f6257l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public C9489l f6258l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public C5978l f6259l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public long f6260l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public C9489l f6261l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public C0362l f6262l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public Bitmap f6263l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public C8460l f6264l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public boolean f6265l;

    public C2876l(C13161l c13161l) {
        super(4);
        this.f6254l = c13161l;
        this.f6262l = C0362l.yandex;
        this.f6250l = new C4136l(0);
        this.f6253l = C1964l.crashlytics;
        this.f6249l = new ArrayDeque();
        this.f6260l = -9223372036854775807L;
        this.f6257l = -9223372036854775807L;
        this.f6246l = 0;
        this.f6256l = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // defpackage.AbstractC1091l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Signature(defpackage.C5978l[] r5, long r6, long r8, defpackage.C5019l r10) {
        /*
            r4 = this;
            lُٜؓ r5 = r4.f6253l
            long r5 = r5.loadAd
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.f6249l
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.f6260l
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.f6257l
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            lُٜؓ r6 = new lُٜؓ
            long r0 = r4.f6260l
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            lُٜؓ r5 = new lُٜؓ
            r5.<init>(r0, r8)
            r4.f6253l = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2876l.Signature(lؘۜٔ[], long, long, lٜؗٚ):void");
    }

    @Override // defpackage.AbstractC1091l
    public final void ad(long j, long j2) throws C17361l {
        if (this.f6265l) {
            return;
        }
        if (this.f6259l == null) {
            C10023l c10023l = this.f3008l;
            c10023l.Signature();
            C4136l c4136l = this.f6250l;
            c4136l.remoteconfig();
            int iPro = pro(c10023l, c4136l, 2);
            if (iPro != -5) {
                if (iPro == -4) {
                    AbstractC12442l.subscription(c4136l.crashlytics(4));
                    this.f6248l = true;
                    this.f6265l = true;
                    return;
                }
                return;
            }
            C5978l c5978l = (C5978l) c10023l.f20418l;
            c5978l.getClass();
            this.f6259l = c5978l;
            this.f6247l = true;
        }
        if (this.f6264l == null) {
            m1265package();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (inmobi(j)) {
            }
            while (m1267throws(j)) {
            }
            Trace.endSection();
        } catch (C13029l e) {
            throw crashlytics(e, null, false, 4003);
        }
    }

    @Override // defpackage.AbstractC1091l
    public final void adcel() {
        m1266synchronized();
    }

    @Override // defpackage.AbstractC1091l
    public final void ads() {
        m1266synchronized();
        this.f6256l = Math.min(this.f6256l, 1);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:70:0x0108  */
    /* JADX WARN: Code duplicated, block: B:74:0x0120  */
    /* JADX WARN: Code duplicated, block: B:82:0x0149  */
    /* JADX WARN: Code duplicated, block: B:84:0x0162  */
    public final boolean inmobi(long j) throws C17361l {
        boolean z;
        C9489l c9489l;
        boolean z2;
        int i;
        C15173l c15173l;
        boolean z3;
        C0477l c0477l;
        int i2;
        int i3;
        C5978l c5978l;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap = this.f6263l;
        if ((bitmap == null || this.f6258l != null) && (this.f6256l != 0 || this.f3010l == 2)) {
            ArrayDeque arrayDeque = this.f6249l;
            if (bitmap == null) {
                this.f6264l.getClass();
                C17246l c17246l = (C17246l) this.f6264l.crashlytics();
                if (c17246l != null) {
                    if (!c17246l.crashlytics(4)) {
                        AbstractC12442l.metrica(c17246l.f33469l, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.f6263l = c17246l.f33469l;
                        c17246l.vip();
                        if (this.f6252l && this.f6263l != null && this.f6258l != null) {
                            this.f6259l.getClass();
                            C5978l c5978l2 = this.f6259l;
                            int i4 = c5978l2.f12617for;
                            int i5 = c5978l2.f12623throw;
                            z = ((i4 != 1 && i5 == 1) || i4 == -1 || i5 == -1) ? false : true;
                            c9489l = this.f6258l;
                            if (((Bitmap) c9489l.crashlytics) == null) {
                                if (z) {
                                    int i6 = c9489l.yandex;
                                    this.f6263l.getClass();
                                    int width = this.f6263l.getWidth();
                                    C5978l c5978l3 = this.f6259l;
                                    c5978l3.getClass();
                                    int i7 = width / c5978l3.f12617for;
                                    int height = this.f6263l.getHeight();
                                    C5978l c5978l4 = this.f6259l;
                                    c5978l4.getClass();
                                    int i8 = height / c5978l4.f12623throw;
                                    int i9 = this.f6259l.f12617for;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.f6263l, (i6 % i9) * i7, (i6 / i9) * i8, i7, i8);
                                } else {
                                    bitmapCreateBitmap = this.f6263l;
                                    bitmapCreateBitmap.getClass();
                                }
                                c9489l.crashlytics = bitmapCreateBitmap;
                            }
                            ((Bitmap) this.f6258l.crashlytics).getClass();
                            long j2 = this.f6258l.loadAd - j;
                            if (this.f3010l == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i = this.f6256l;
                            if (i != 0) {
                                if (i != 1) {
                                    z2 = true;
                                } else {
                                    if (i == 3) {
                                        C18073l.admob();
                                        return false;
                                    }
                                    z2 = false;
                                }
                            }
                            if (!z2 || j2 < 30000) {
                                c15173l = this.f6245l;
                                if (c15173l != null) {
                                    long j3 = this.f6253l.loadAd;
                                    this.f6259l.getClass();
                                    c0477l = c15173l.yandex;
                                    if (c0477l.f1761l) {
                                        c0477l.f1746l.yandex(37).loadAd();
                                    }
                                }
                                C0362l c0362l = this.f6262l;
                                long j4 = this.f6253l.loadAd;
                                c0362l.getClass();
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                C9489l c9489l2 = this.f6258l;
                                c9489l2.getClass();
                                long j5 = c9489l2.loadAd;
                                this.f6257l = j5;
                                while (!arrayDeque.isEmpty() && j5 >= ((C1964l) arrayDeque.peek()).yandex) {
                                    this.f6253l = (C1964l) arrayDeque.removeFirst();
                                }
                                this.f6256l = 3;
                                if (z) {
                                    C9489l c9489l3 = this.f6258l;
                                    c9489l3.getClass();
                                    i2 = c9489l3.yandex;
                                    C5978l c5978l5 = this.f6259l;
                                    c5978l5.getClass();
                                    i3 = c5978l5.f12623throw;
                                    c5978l = this.f6259l;
                                    c5978l.getClass();
                                    if (i2 == (i3 * c5978l.f12617for) - 1) {
                                        this.f6263l = null;
                                    }
                                } else {
                                    this.f6263l = null;
                                }
                                this.f6258l = this.f6261l;
                                this.f6261l = null;
                                return true;
                            }
                        }
                    } else {
                        if (this.f6246l == 3) {
                            m1266synchronized();
                            this.f6259l.getClass();
                            m1265package();
                            return false;
                        }
                        c17246l.vip();
                        if (arrayDeque.isEmpty()) {
                            this.f6265l = true;
                            return false;
                        }
                    }
                }
            } else if (this.f6252l) {
                this.f6259l.getClass();
                C5978l c5978l6 = this.f6259l;
                int i10 = c5978l6.f12617for;
                int i11 = c5978l6.f12623throw;
                if (i10 != 1) {
                }
                c9489l = this.f6258l;
                if (((Bitmap) c9489l.crashlytics) == null) {
                    if (z) {
                        int i12 = c9489l.yandex;
                        this.f6263l.getClass();
                        int width2 = this.f6263l.getWidth();
                        C5978l c5978l7 = this.f6259l;
                        c5978l7.getClass();
                        int i13 = width2 / c5978l7.f12617for;
                        int height2 = this.f6263l.getHeight();
                        C5978l c5978l8 = this.f6259l;
                        c5978l8.getClass();
                        int i14 = height2 / c5978l8.f12623throw;
                        int i15 = this.f6259l.f12617for;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.f6263l, (i12 % i15) * i13, (i12 / i15) * i14, i13, i14);
                    } else {
                        bitmapCreateBitmap = this.f6263l;
                        bitmapCreateBitmap.getClass();
                    }
                    c9489l.crashlytics = bitmapCreateBitmap;
                }
                ((Bitmap) this.f6258l.crashlytics).getClass();
                long j6 = this.f6258l.loadAd - j;
                if (this.f3010l == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i = this.f6256l;
                if (i != 0) {
                    if (i != 1) {
                        z2 = true;
                    } else {
                        if (i == 3) {
                            C18073l.admob();
                            return false;
                        }
                        z2 = false;
                    }
                }
                if (z2) {
                    c15173l = this.f6245l;
                    if (c15173l != null) {
                        long j7 = this.f6253l.loadAd;
                        this.f6259l.getClass();
                        c0477l = c15173l.yandex;
                        if (c0477l.f1761l) {
                            c0477l.f1746l.yandex(37).loadAd();
                        }
                    }
                    C0362l c0362l2 = this.f6262l;
                    long j8 = this.f6253l.loadAd;
                    c0362l2.getClass();
                    z3 = true;
                } else {
                    c15173l = this.f6245l;
                    if (c15173l != null) {
                        long j9 = this.f6253l.loadAd;
                        this.f6259l.getClass();
                        c0477l = c15173l.yandex;
                        if (c0477l.f1761l) {
                            c0477l.f1746l.yandex(37).loadAd();
                        }
                    }
                    C0362l c0362l3 = this.f6262l;
                    long j10 = this.f6253l.loadAd;
                    c0362l3.getClass();
                    z3 = true;
                }
                if (z3) {
                    C9489l c9489l4 = this.f6258l;
                    c9489l4.getClass();
                    long j11 = c9489l4.loadAd;
                    this.f6257l = j11;
                    while (!arrayDeque.isEmpty()) {
                        this.f6253l = (C1964l) arrayDeque.removeFirst();
                    }
                    this.f6256l = 3;
                    if (z) {
                        C9489l c9489l5 = this.f6258l;
                        c9489l5.getClass();
                        i2 = c9489l5.yandex;
                        C5978l c5978l9 = this.f6259l;
                        c5978l9.getClass();
                        i3 = c5978l9.f12623throw;
                        c5978l = this.f6259l;
                        c5978l.getClass();
                        if (i2 == (i3 * c5978l.f12617for) - 1) {
                            this.f6263l = null;
                        }
                    } else {
                        this.f6263l = null;
                    }
                    this.f6258l = this.f6261l;
                    this.f6261l = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC1091l
    public final String isPro() {
        return "ImageRenderer";
    }

    @Override // defpackage.AbstractC1091l
    public final void metrica(boolean z, boolean z2) {
        this.f6256l = z2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m1265package() throws C17361l {
        if (this.f6247l) {
            C5978l c5978l = this.f6259l;
            c5978l.getClass();
            C13161l c13161l = this.f6254l;
            int iM3580extends = c13161l.m3580extends(c5978l);
            if (iM3580extends != AbstractC4338l.ads(4, 0, 0, 0) && iM3580extends != AbstractC4338l.ads(3, 0, 0, 0)) {
                throw crashlytics(new C13029l("Provided decoder factory can't create decoder for format."), this.f6259l, false, 4005);
            }
            C8460l c8460l = this.f6264l;
            if (c8460l != null) {
                c8460l.release();
            }
            this.f6264l = new C8460l((Context) c13161l.f25776l);
            this.f6247l = false;
        }
    }

    @Override // defpackage.AbstractC1091l
    public final int premium(C5978l c5978l) {
        return this.f6254l.m3580extends(c5978l);
    }

    @Override // defpackage.AbstractC1091l
    public final boolean remoteconfig() {
        int i = this.f6256l;
        if (i != 3) {
            return i == 0 && this.f6252l;
        }
        return true;
    }

    @Override // defpackage.AbstractC1091l
    public final boolean smaato() {
        return this.f6265l;
    }

    @Override // defpackage.AbstractC1091l
    public final void startapp(long j, boolean z, boolean z2) {
        this.f6256l = Math.min(this.f6256l, 1);
        this.f6265l = false;
        this.f6248l = false;
        this.f6263l = null;
        this.f6258l = null;
        this.f6261l = null;
        this.f6252l = false;
        this.f6255l = null;
        C8460l c8460l = this.f6264l;
        if (c8460l != null) {
            c8460l.flush();
        }
        this.f6249l.clear();
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m1266synchronized() {
        this.f6255l = null;
        this.f6246l = 0;
        this.f6260l = -9223372036854775807L;
        C8460l c8460l = this.f6264l;
        if (c8460l != null) {
            c8460l.release();
            this.f6264l = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:75:0x0105  */
    /* JADX WARN: Code duplicated, block: B:80:0x010d  */
    /* JADX WARN: Code duplicated, block: B:83:0x011e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0123  */
    /* JADX WARN: Code duplicated, block: B:87:0x0134  */
    /* JADX WARN: Code duplicated, block: B:88:0x0137  */
    /* JADX WARN: Code duplicated, block: B:91:0x0143  */
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final boolean m1267throws(long j) {
        int i;
        C4136l c4136l;
        int iPro;
        ByteBuffer byteBuffer;
        C4136l c4136l2;
        boolean z;
        C4136l c4136l3;
        long j2;
        boolean z2;
        C9489l c9489l;
        boolean z3;
        C5978l c5978l;
        boolean z4;
        boolean z5;
        C5978l c5978l2;
        int i2;
        C4136l c4136l4;
        if (!this.f6252l || this.f6258l == null) {
            C10023l c10023l = this.f3008l;
            c10023l.Signature();
            C8460l c8460l = this.f6264l;
            if (c8460l != null && this.f6246l != 3 && !this.f6248l) {
                if (this.f6255l == null) {
                    C4136l c4136l5 = (C4136l) c8460l.amazon();
                    this.f6255l = c4136l5;
                    if (c4136l5 != null) {
                        i = this.f6246l;
                        c4136l = this.f6255l;
                        if (i == 2) {
                            c4136l.getClass();
                            this.f6255l.f16423l = 4;
                            C8460l c8460l2 = this.f6264l;
                            c8460l2.getClass();
                            c8460l2.purchase(this.f6255l);
                            this.f6255l = null;
                            this.f6246l = 3;
                            return false;
                        }
                        iPro = pro(c10023l, c4136l, 0);
                        if (iPro != -5) {
                            C5978l c5978l3 = (C5978l) c10023l.f20418l;
                            c5978l3.getClass();
                            this.f6259l = c5978l3;
                            this.f6247l = true;
                            this.f6246l = 2;
                            return true;
                        }
                        if (iPro != -4) {
                            this.f6255l.adcel();
                            byteBuffer = this.f6255l.f8498l;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                c4136l2 = this.f6255l;
                                c4136l2.getClass();
                                if (c4136l2.crashlytics(4)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                C4136l c4136l6 = this.f6255l;
                                c4136l6.getClass();
                                c4136l6.f8495l = this.f6259l;
                                C8460l c8460l3 = this.f6264l;
                                c8460l3.getClass();
                                C4136l c4136l7 = this.f6255l;
                                c4136l7.getClass();
                                c8460l3.purchase(c4136l7);
                                this.f6251l = 0;
                            }
                            c4136l3 = this.f6255l;
                            c4136l3.getClass();
                            if (c4136l3.crashlytics(4)) {
                                this.f6252l = true;
                            } else {
                                int i3 = this.f6251l;
                                j2 = c4136l3.f8496l;
                                C9489l c9489l2 = new C9489l();
                                c9489l2.yandex = i3;
                                c9489l2.loadAd = j2;
                                this.f6261l = c9489l2;
                                this.f6251l = i3 + 1;
                                if (this.f6252l) {
                                    this.f6258l = this.f6261l;
                                    this.f6261l = null;
                                } else {
                                    if (j2 - 30000 <= j || j > 30000 + j2) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    c9489l = this.f6258l;
                                    if (c9489l != null || c9489l.loadAd > j || j >= j2) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    c5978l = this.f6259l;
                                    c5978l.getClass();
                                    if (c5978l.f12617for != -1 || (i2 = (c5978l2 = this.f6259l).f12623throw) == -1 || i3 == (i2 * c5978l2.f12617for) - 1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (!z2 || z3 || z4) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    this.f6252l = z5;
                                    if (z3 || z2) {
                                        this.f6258l = this.f6261l;
                                        this.f6261l = null;
                                    }
                                }
                            }
                            c4136l4 = this.f6255l;
                            c4136l4.getClass();
                            if (c4136l4.crashlytics(4)) {
                                this.f6248l = true;
                                this.f6255l = null;
                                return false;
                            }
                            long j3 = this.f6260l;
                            C4136l c4136l8 = this.f6255l;
                            c4136l8.getClass();
                            this.f6260l = Math.max(j3, c4136l8.f8496l);
                            if (z) {
                                this.f6255l = null;
                            } else {
                                C4136l c4136l9 = this.f6255l;
                                c4136l9.getClass();
                                c4136l9.remoteconfig();
                            }
                            return !this.f6252l;
                        }
                        if (iPro != -3) {
                            C18073l.admob();
                            return false;
                        }
                    }
                } else {
                    i = this.f6246l;
                    c4136l = this.f6255l;
                    if (i == 2) {
                        c4136l.getClass();
                        this.f6255l.f16423l = 4;
                        C8460l c8460l4 = this.f6264l;
                        c8460l4.getClass();
                        c8460l4.purchase(this.f6255l);
                        this.f6255l = null;
                        this.f6246l = 3;
                        return false;
                    }
                    iPro = pro(c10023l, c4136l, 0);
                    if (iPro != -5) {
                        C5978l c5978l4 = (C5978l) c10023l.f20418l;
                        c5978l4.getClass();
                        this.f6259l = c5978l4;
                        this.f6247l = true;
                        this.f6246l = 2;
                        return true;
                    }
                    if (iPro != -4) {
                        this.f6255l.adcel();
                        byteBuffer = this.f6255l.f8498l;
                        if (byteBuffer != null) {
                            c4136l2 = this.f6255l;
                            c4136l2.getClass();
                            if (c4136l2.crashlytics(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            c4136l2 = this.f6255l;
                            c4136l2.getClass();
                            if (c4136l2.crashlytics(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            C4136l c4136l10 = this.f6255l;
                            c4136l10.getClass();
                            c4136l10.f8495l = this.f6259l;
                            C8460l c8460l5 = this.f6264l;
                            c8460l5.getClass();
                            C4136l c4136l11 = this.f6255l;
                            c4136l11.getClass();
                            c8460l5.purchase(c4136l11);
                            this.f6251l = 0;
                        }
                        c4136l3 = this.f6255l;
                        c4136l3.getClass();
                        if (c4136l3.crashlytics(4)) {
                            this.f6252l = true;
                        } else {
                            int i4 = this.f6251l;
                            j2 = c4136l3.f8496l;
                            C9489l c9489l3 = new C9489l();
                            c9489l3.yandex = i4;
                            c9489l3.loadAd = j2;
                            this.f6261l = c9489l3;
                            this.f6251l = i4 + 1;
                            if (this.f6252l) {
                                this.f6258l = this.f6261l;
                                this.f6261l = null;
                            } else {
                                if (j2 - 30000 <= j) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                c9489l = this.f6258l;
                                if (c9489l != null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                c5978l = this.f6259l;
                                c5978l.getClass();
                                if (c5978l.f12617for != -1) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (z2) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                this.f6252l = z5;
                                if (z3) {
                                    this.f6258l = this.f6261l;
                                    this.f6261l = null;
                                } else {
                                    this.f6258l = this.f6261l;
                                    this.f6261l = null;
                                }
                            }
                        }
                        c4136l4 = this.f6255l;
                        c4136l4.getClass();
                        if (c4136l4.crashlytics(4)) {
                            this.f6248l = true;
                            this.f6255l = null;
                            return false;
                        }
                        long j4 = this.f6260l;
                        C4136l c4136l12 = this.f6255l;
                        c4136l12.getClass();
                        this.f6260l = Math.max(j4, c4136l12.f8496l);
                        if (z) {
                            this.f6255l = null;
                        } else {
                            C4136l c4136l13 = this.f6255l;
                            c4136l13.getClass();
                            c4136l13.remoteconfig();
                        }
                        return !this.f6252l;
                    }
                    if (iPro != -3) {
                        C18073l.admob();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC1091l
    public final void vip() {
        this.f6259l = null;
        this.f6253l = C1964l.crashlytics;
        this.f6249l.clear();
        m1266synchronized();
        this.f6262l.getClass();
    }

    @Override // defpackage.AbstractC1091l, defpackage.InterfaceC3184l
    public final void yandex(int i, Object obj) {
        if (i != 15) {
            if (i != 23) {
                return;
            }
            this.f6245l = (C15173l) obj;
        } else {
            C0362l c0362l = obj instanceof C0362l ? (C0362l) obj : null;
            if (c0362l == null) {
                c0362l = C0362l.yandex;
            }
            this.f6262l = c0362l;
        }
    }
}
