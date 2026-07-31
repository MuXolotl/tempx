package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;

/* JADX INFO: renamed from: lؚۡٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7578l {
    public boolean amazon;
    public final long crashlytics;
    public boolean isPro;
    public final C7048l loadAd;
    public long mopub;
    public boolean remoteconfig;
    public boolean vip;
    public final C11727l yandex;
    public int purchase = 0;
    public long billing = -9223372036854775807L;
    public long admob = -9223372036854775807L;
    public long subs = -9223372036854775807L;
    public float firebase = 1.0f;
    public C18527l smaato = C18527l.yandex;
    public final boolean metrica = true;

    public C7578l(Context context, C11727l c11727l, long j) {
        this.yandex = c11727l;
        this.crashlytics = j;
        this.loadAd = new C7048l(context);
    }

    public final void admob(float f) {
        AbstractC12442l.admob(f > 0.0f);
        if (f == this.firebase) {
            return;
        }
        this.firebase = f;
        C7048l c7048l = this.loadAd;
        c7048l.subs = f;
        c7048l.amazon(false);
    }

    public final void amazon() {
        this.amazon = true;
        this.smaato.getClass();
        this.mopub = AbstractC15323l.m3962continue(SystemClock.elapsedRealtime());
        C7048l c7048l = this.loadAd;
        c7048l.amazon = true;
        c7048l.loadAd();
        DisplayManager displayManager = (DisplayManager) c7048l.loadAd.getSystemService("display");
        AbstractC16097l choreographerVsyncCallbackC16680l = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                choreographerVsyncCallbackC16680l = Build.VERSION.SDK_INT >= 33 ? new ChoreographerVsyncCallbackC16680l(choreographer, displayManager) : new ChoreographerFrameCallbackC18361l(choreographer, displayManager);
            } catch (RuntimeException e) {
                AbstractC6427l.metrica("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }
        c7048l.crashlytics = choreographerVsyncCallbackC16680l;
        if (choreographerVsyncCallbackC16680l != null) {
            choreographerVsyncCallbackC16680l.yandex();
        }
        c7048l.amazon(false);
    }

    public final void billing(float f) {
        C7048l c7048l = this.loadAd;
        c7048l.billing = f;
        C6544l c6544l = c7048l.yandex;
        ((C3812l) c6544l.f13665l).crashlytics();
        ((C3812l) c6544l.f13664l).crashlytics();
        c6544l.f13661l = false;
        c6544l.f13662l = -9223372036854775807L;
        c6544l.f13663l = 0;
        c7048l.crashlytics();
    }

    public final void crashlytics(boolean z) {
        long jElapsedRealtime;
        this.isPro = z;
        long j = this.crashlytics;
        if (j > 0) {
            this.smaato.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.subs = jElapsedRealtime;
    }

    public final boolean loadAd(boolean z) {
        if (z && (this.purchase == 3 || (this.vip && (!this.remoteconfig || !this.metrica)))) {
            this.subs = -9223372036854775807L;
            return true;
        }
        if (this.subs == -9223372036854775807L) {
            return false;
        }
        this.smaato.getClass();
        if (SystemClock.elapsedRealtime() < this.subs) {
            return true;
        }
        this.subs = -9223372036854775807L;
        return false;
    }

    public final void mopub(Surface surface) {
        this.remoteconfig = surface != null;
        this.vip = false;
        C7048l c7048l = this.loadAd;
        if (c7048l.purchase != surface) {
            c7048l.yandex();
            c7048l.purchase = surface;
            c7048l.amazon(true);
        }
        this.purchase = Math.min(this.purchase, 1);
    }

    public final void purchase(int i) {
        if (i == 0) {
            this.purchase = 1;
        } else if (i == 1) {
            this.purchase = 0;
        } else {
            if (i != 2) {
                C18073l.admob();
                return;
            }
            this.purchase = Math.min(this.purchase, 2);
        }
        this.loadAd.loadAd();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:110:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:113:0x021e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0220  */
    /* JADX WARN: Code duplicated, block: B:115:0x0224  */
    /* JADX WARN: Code duplicated, block: B:119:0x0238  */
    /* JADX WARN: Code duplicated, block: B:126:0x0251  */
    /* JADX WARN: Code duplicated, block: B:127:0x0254  */
    /* JADX WARN: Code duplicated, block: B:130:0x026c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0276  */
    /* JADX WARN: Code duplicated, block: B:134:0x027e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0281  */
    /* JADX WARN: Code duplicated, block: B:137:0x0285  */
    /* JADX WARN: Code duplicated, block: B:139:0x0289  */
    /* JADX WARN: Code duplicated, block: B:140:0x0290  */
    /* JADX WARN: Code duplicated, block: B:144:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:151:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:154:0x02cc A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:156:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:162:0x02dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x02df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:165:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:168:0x02e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:91:0x0196 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x0197  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int yandex(long j, long j2, long j3, long j4, boolean z, boolean z2, C3535l c3535l) {
        long j5;
        long j6;
        long j7;
        int i;
        int i2;
        boolean z3;
        C7048l c7048l;
        long j8;
        int i3;
        long j9;
        AbstractC16097l abstractC16097l;
        long j10;
        boolean z4;
        long j11;
        int i4;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long jAbs;
        long j18;
        long j19;
        long j20;
        long j21;
        float f;
        float f2;
        long j22;
        C6544l c6544l;
        long j23;
        C3812l c3812l;
        long j24;
        c3535l.yandex = -9223372036854775807L;
        c3535l.loadAd = -9223372036854775807L;
        if (this.amazon && this.billing == -9223372036854775807L) {
            this.billing = j2;
        }
        if (this.admob != j) {
            C7048l c7048l2 = this.loadAd;
            j5 = -9223372036854775807L;
            long j25 = c7048l2.vip;
            if (j25 != -1) {
                c7048l2.adcel = j25;
                c7048l2.ads = c7048l2.metrica;
                c7048l2.subscription = c7048l2.startapp;
                c7048l2.firebase = c7048l2.smaato;
            }
            c7048l2.remoteconfig++;
            C6544l c6544l2 = c7048l2.yandex;
            j6 = 1000;
            long j26 = j * 1000;
            ((C3812l) c6544l2.f13665l).loadAd(j26);
            if (((C3812l) c6544l2.f13665l).yandex()) {
                c6544l2.f13661l = false;
                j7 = 0;
            } else {
                j7 = 0;
                if (c6544l2.f13662l != -9223372036854775807L) {
                    if (c6544l2.f13661l) {
                        C3812l c3812l2 = (C3812l) c6544l2.f13664l;
                        long j27 = c3812l2.amazon;
                        if (j27 == 0 ? false : c3812l2.mopub[(int) ((j27 - 1) % 15)]) {
                            ((C3812l) c6544l2.f13664l).crashlytics();
                            ((C3812l) c6544l2.f13664l).loadAd(c6544l2.f13662l);
                        }
                    } else {
                        ((C3812l) c6544l2.f13664l).crashlytics();
                        ((C3812l) c6544l2.f13664l).loadAd(c6544l2.f13662l);
                    }
                    c6544l2.f13661l = true;
                    ((C3812l) c6544l2.f13664l).loadAd(j26);
                }
            }
            if (c6544l2.f13661l && ((C3812l) c6544l2.f13664l).yandex()) {
                C3812l c3812l3 = (C3812l) c6544l2.f13665l;
                c6544l2.f13665l = (C3812l) c6544l2.f13664l;
                c6544l2.f13664l = c3812l3;
                c6544l2.f13661l = false;
            }
            c6544l2.f13662l = j26;
            c6544l2.f13663l = ((C3812l) c6544l2.f13665l).yandex() ? 0 : c6544l2.f13663l + 1;
            c7048l2.crashlytics();
            this.admob = j;
        } else {
            j5 = -9223372036854775807L;
            j6 = 1000;
            j7 = 0;
        }
        long jM3962continue = (long) ((j - j2) / ((double) this.firebase));
        if (this.amazon) {
            this.smaato.getClass();
            jM3962continue -= AbstractC15323l.m3962continue(SystemClock.elapsedRealtime()) - j3;
        }
        c3535l.yandex = jM3962continue;
        if (!z || z2) {
            if (this.remoteconfig || !this.metrica) {
                if (!this.metrica) {
                    this.vip = true;
                }
                int i5 = 2;
                if (this.subs == j5 || this.isPro) {
                    int i6 = this.purchase;
                    if (i6 != 0) {
                        if (i6 == 1) {
                            i = 3;
                            i2 = 5;
                        } else if (i6 == 2) {
                            i = 3;
                            i2 = 5;
                            if (j2 >= j4) {
                            }
                        } else {
                            if (i6 != 3) {
                                C18073l.admob();
                                return 0;
                            }
                            this.smaato.getClass();
                            i = 3;
                            i2 = 5;
                            long jM3962continue2 = AbstractC15323l.m3962continue(SystemClock.elapsedRealtime()) - this.mopub;
                            if (this.amazon) {
                                long j28 = this.billing;
                                if (j28 == j5 || j28 == j2 || jM3962continue >= -30000 || jM3962continue2 <= 100000) {
                                }
                            }
                        }
                        z3 = true;
                    } else {
                        i = 3;
                        i2 = 5;
                        z3 = this.amazon;
                    }
                    if (z3) {
                        return 0;
                    }
                    if (this.amazon && j2 != this.billing) {
                        this.smaato.getClass();
                        long jNanoTime = System.nanoTime();
                        c7048l = this.loadAd;
                        j8 = (c3535l.yandex * j6) + jNanoTime;
                        if (c7048l.adcel != -1) {
                            if (((C3812l) c7048l.yandex.f13665l).yandex()) {
                                c6544l = c7048l.yandex;
                                if (((C3812l) c6544l.f13665l).yandex()) {
                                    c3812l = (C3812l) c6544l.f13665l;
                                    j9 = -30000;
                                    j24 = c3812l.purchase;
                                    i3 = 1;
                                    if (j24 == j7) {
                                        j23 = j7;
                                    } else {
                                        j23 = c3812l.billing / j24;
                                    }
                                } else {
                                    i3 = 1;
                                    j9 = -30000;
                                    j23 = j5;
                                }
                                f = (c7048l.remoteconfig - c7048l.adcel) * j23;
                                f2 = c7048l.subs;
                            } else {
                                i3 = 1;
                                j9 = -30000;
                                f = (j - c7048l.subscription) * j6;
                                f2 = c7048l.subs;
                            }
                            j22 = c7048l.ads + ((long) (f / f2));
                            if (Math.abs(j8 - j22) <= 20000000) {
                                j8 = j22;
                            } else {
                                c7048l.loadAd();
                            }
                        } else {
                            i3 = 1;
                            j9 = -30000;
                            i5 = 2;
                        }
                        c7048l.vip = c7048l.remoteconfig;
                        c7048l.metrica = j8;
                        c7048l.startapp = j;
                        abstractC16097l = c7048l.crashlytics;
                        if (abstractC16097l != null) {
                            j12 = abstractC16097l.f31552l;
                            j13 = c7048l.crashlytics.f31555l;
                            if (j12 != j5 && j13 != j5) {
                                j14 = (((j8 - j12) / j13) * j13) + j12;
                                if (j8 <= j14) {
                                    j15 = j14 - j13;
                                } else {
                                    j14 += j13;
                                    j15 = j14;
                                }
                                j16 = j14 - j8;
                                j17 = j8 - j15;
                                jAbs = Math.abs(j16 - j17);
                                if (jAbs < j13 / 2) {
                                    j19 = j13;
                                    j20 = j19 / 4;
                                    if (jAbs < j20) {
                                        j18 = j15;
                                        j21 = c7048l.firebase;
                                        if (j21 != j7) {
                                            c7048l.smaato = j21;
                                        } else {
                                            if (j16 < j17) {
                                                j20 = -j20;
                                            }
                                            c7048l.smaato = j20;
                                        }
                                    } else {
                                        j18 = j15;
                                        c7048l.smaato = j7;
                                    }
                                } else {
                                    j18 = j15;
                                    j19 = j13;
                                    c7048l.smaato = c7048l.firebase;
                                }
                                if (j16 + c7048l.smaato >= j17) {
                                    j14 = j18;
                                }
                                j8 = j14 - ((j19 * 80) / 100);
                            }
                        }
                        c3535l.loadAd = j8;
                        j10 = (j8 - jNanoTime) / j6;
                        c3535l.yandex = j10;
                        if (this.subs != j5 || this.isPro) {
                            z4 = 0;
                        } else {
                            z4 = i3;
                        }
                        if (this.yandex.m3232l(j10, j2, z2, z4)) {
                            return 4;
                        }
                        j11 = c3535l.yandex;
                        if (j11 < j9 || z2) {
                            i4 = 0;
                        } else {
                            i4 = i3;
                        }
                        if (i4 != 0) {
                            if (z4 != 0) {
                                return i;
                            }
                            return i5;
                        }
                        if (j11 > 50000) {
                            return i3;
                        }
                    }
                    return i2;
                }
                i = 3;
                i2 = 5;
                z3 = false;
                if (z3) {
                    return 0;
                }
                if (this.amazon) {
                    this.smaato.getClass();
                    long jNanoTime2 = System.nanoTime();
                    c7048l = this.loadAd;
                    j8 = (c3535l.yandex * j6) + jNanoTime2;
                    if (c7048l.adcel != -1) {
                        if (((C3812l) c7048l.yandex.f13665l).yandex()) {
                            c6544l = c7048l.yandex;
                            if (((C3812l) c6544l.f13665l).yandex()) {
                                c3812l = (C3812l) c6544l.f13665l;
                                j9 = -30000;
                                j24 = c3812l.purchase;
                                i3 = 1;
                                if (j24 == j7) {
                                    j23 = j7;
                                } else {
                                    j23 = c3812l.billing / j24;
                                }
                            } else {
                                i3 = 1;
                                j9 = -30000;
                                j23 = j5;
                            }
                            f = (c7048l.remoteconfig - c7048l.adcel) * j23;
                            f2 = c7048l.subs;
                        } else {
                            i3 = 1;
                            j9 = -30000;
                            f = (j - c7048l.subscription) * j6;
                            f2 = c7048l.subs;
                        }
                        j22 = c7048l.ads + ((long) (f / f2));
                        if (Math.abs(j8 - j22) <= 20000000) {
                            j8 = j22;
                        } else {
                            c7048l.loadAd();
                        }
                    } else {
                        i3 = 1;
                        j9 = -30000;
                        i5 = 2;
                    }
                    c7048l.vip = c7048l.remoteconfig;
                    c7048l.metrica = j8;
                    c7048l.startapp = j;
                    abstractC16097l = c7048l.crashlytics;
                    if (abstractC16097l != null) {
                        j12 = abstractC16097l.f31552l;
                        j13 = c7048l.crashlytics.f31555l;
                        if (j12 != j5) {
                            j14 = (((j8 - j12) / j13) * j13) + j12;
                            if (j8 <= j14) {
                                j15 = j14 - j13;
                            } else {
                                j14 += j13;
                                j15 = j14;
                            }
                            j16 = j14 - j8;
                            j17 = j8 - j15;
                            jAbs = Math.abs(j16 - j17);
                            if (jAbs < j13 / 2) {
                                j19 = j13;
                                j20 = j19 / 4;
                                if (jAbs < j20) {
                                    j18 = j15;
                                    j21 = c7048l.firebase;
                                    if (j21 != j7) {
                                        c7048l.smaato = j21;
                                    } else {
                                        if (j16 < j17) {
                                            j20 = -j20;
                                        }
                                        c7048l.smaato = j20;
                                    }
                                } else {
                                    j18 = j15;
                                    c7048l.smaato = j7;
                                }
                            } else {
                                j18 = j15;
                                j19 = j13;
                                c7048l.smaato = c7048l.firebase;
                            }
                            if (j16 + c7048l.smaato >= j17) {
                                j14 = j18;
                            }
                            j8 = j14 - ((j19 * 80) / 100);
                        }
                    }
                    c3535l.loadAd = j8;
                    j10 = (j8 - jNanoTime2) / j6;
                    c3535l.yandex = j10;
                    if (this.subs != j5) {
                        z4 = 0;
                    } else {
                        z4 = 0;
                    }
                    if (this.yandex.m3232l(j10, j2, z2, z4)) {
                        return 4;
                    }
                    j11 = c3535l.yandex;
                    if (j11 < j9) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                    }
                    if (i4 != 0) {
                        if (z4 != 0) {
                            return i;
                        }
                        return i5;
                    }
                    if (j11 > 50000) {
                        return i3;
                    }
                }
                return i2;
            }
            if (this.yandex.m3232l(jM3962continue, j2, z2, true)) {
                return 4;
            }
            if (!this.amazon || c3535l.yandex >= 30000) {
                this.vip = true;
                return 5;
            }
        }
        return 3;
    }
}
