package defpackage;

import android.widget.EdgeEffect;

/* JADX INFO: renamed from: lٔ۠ٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15222l {
    public final /* synthetic */ C4154l yandex;

    public C15222l(C4154l c4154l) {
        this.yandex = c4154l;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:104:0x0209  */
    /* JADX WARN: Code duplicated, block: B:106:0x020e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0216  */
    /* JADX WARN: Code duplicated, block: B:109:0x021a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0226  */
    /* JADX WARN: Code duplicated, block: B:114:0x022b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0233  */
    /* JADX WARN: Code duplicated, block: B:117:0x0237  */
    /* JADX WARN: Code duplicated, block: B:119:0x023a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x0240  */
    /* JADX WARN: Code duplicated, block: B:125:0x0248  */
    /* JADX WARN: Code duplicated, block: B:136:0x0283  */
    /* JADX WARN: Code duplicated, block: B:143:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:145:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:152:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:159:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:168:0x0307  */
    /* JADX WARN: Code duplicated, block: B:175:0x0324  */
    /* JADX WARN: Code duplicated, block: B:177:0x0335  */
    /* JADX WARN: Code duplicated, block: B:178:0x0339  */
    /* JADX WARN: Code duplicated, block: B:184:0x0349  */
    /* JADX WARN: Code duplicated, block: B:189:0x0351  */
    /* JADX WARN: Code duplicated, block: B:192:0x0355  */
    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:67:0x013c A[PHI: r8
  0x013c: PHI (r8v9 float) = (r8v8 float), (r8v12 float) binds: [B:76:0x016a, B:65:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x013f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0147  */
    /* JADX WARN: Code duplicated, block: B:80:0x0188  */
    public final long yandex(int i, long j) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fAdmob;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jAdmob;
        long jAdmob2;
        boolean z;
        boolean zBilling;
        boolean z2;
        EdgeEffect edgeEffectLoadAd;
        float fIntBitsToFloat3;
        C16320l c16320l;
        float f;
        EdgeEffect edgeEffectPurchase;
        float fIntBitsToFloat4;
        C16320l c16320l2;
        float f2;
        EdgeEffect edgeEffectAmazon;
        float fIntBitsToFloat5;
        C16320l c16320l3;
        float f3;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        C4154l c4154l = this.yandex;
        c4154l.isPro = i;
        C10306l c10306l = c4154l.loadAd;
        if (c10306l == null || !c4154l.loadAd()) {
            return c4154l.amazon(c4154l.firebase, j, i);
        }
        int i5 = c4154l.isPro;
        C16931l c16931l = c4154l.remoteconfig;
        C11115l c11115l = c10306l.crashlytics;
        if (C14174l.mopub(c10306l.mopub)) {
            return ((C1187l) c16931l.invoke(new C1187l(j))).yandex;
        }
        if (!c10306l.billing) {
            if (C11115l.mopub(c11115l.billing)) {
                c10306l.mopub(0L);
            }
            if (C11115l.mopub(c11115l.mopub)) {
                c10306l.admob(0L);
            }
            if (C11115l.mopub(c11115l.amazon)) {
                c10306l.subs(0L);
            }
            if (C11115l.mopub(c11115l.purchase)) {
                c10306l.billing(0L);
            }
            c10306l.billing = true;
        }
        int i6 = AbstractC8058l.yandex;
        float f4 = i5 == 2 ? 4.0f : 1.0f;
        long jIsPro = C1187l.isPro(f4, j);
        int i7 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i7) != 0.0f) {
            if (!C11115l.mopub(c11115l.amazon) || Float.intBitsToFloat(i7) >= 0.0f) {
                j2 = 4294967295L;
                if (C11115l.mopub(c11115l.purchase) && Float.intBitsToFloat(i7) > 0.0f) {
                    float fBilling = c10306l.billing(jIsPro);
                    if (!C11115l.mopub(c11115l.purchase)) {
                        c11115l.loadAd().finish();
                    }
                    fIntBitsToFloat = fBilling == Float.intBitsToFloat((int) (jIsPro & 4294967295L)) ? Float.intBitsToFloat(i7) : fBilling / f4;
                }
            } else {
                float fSubs = c10306l.subs(jIsPro);
                j2 = 4294967295L;
                if (!C11115l.mopub(c11115l.amazon)) {
                    c11115l.purchase().finish();
                }
                fIntBitsToFloat = fSubs == Float.intBitsToFloat((int) (jIsPro & 4294967295L)) ? Float.intBitsToFloat(i7) : fSubs / f4;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else if (!C11115l.mopub(c11115l.billing) && Float.intBitsToFloat(i2) < 0.0f) {
                fAdmob = c10306l.mopub(jIsPro);
                if (!C11115l.mopub(c11115l.billing)) {
                    c11115l.crashlytics().finish();
                }
                if (fAdmob == Float.intBitsToFloat((int) (jIsPro >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fAdmob / f4;
                }
            } else if (C11115l.mopub(c11115l.mopub) || Float.intBitsToFloat(i2) <= 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fAdmob = c10306l.admob(jIsPro);
                if (!C11115l.mopub(c11115l.mopub)) {
                    c11115l.amazon().finish();
                }
                if (fAdmob == Float.intBitsToFloat((int) (jIsPro >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fAdmob / f4;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!C1187l.loadAd(jFloatToRawIntBits, 0L)) {
                c10306l.amazon();
            }
            jAdmob = C1187l.admob(j, jFloatToRawIntBits);
            long j3 = ((C1187l) c16931l.invoke(new C1187l(jAdmob))).yandex;
            jAdmob2 = C1187l.admob(jAdmob, j3);
            if ((Float.intBitsToFloat((int) (jAdmob >> 32)) == 0.0f || Float.intBitsToFloat((int) (jAdmob & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j3 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j3 & j2)) != 0.0f) && (C11115l.mopub(c11115l.billing) || C11115l.mopub(c11115l.amazon) || C11115l.mopub(c11115l.mopub) || C11115l.mopub(c11115l.purchase)))) {
                c10306l.yandex();
            }
            if (i5 == 1) {
                i3 = (int) (jAdmob2 >> 32);
                if (Float.intBitsToFloat(i3) > 0.5f) {
                    c10306l.mopub(jAdmob2);
                } else {
                    if (Float.intBitsToFloat(i3) < -0.5f) {
                        c10306l.admob(jAdmob2);
                    } else {
                        z3 = false;
                    }
                    i4 = (int) (jAdmob2 & j2);
                    if (Float.intBitsToFloat(i4) > 0.5f) {
                        c10306l.subs(jAdmob2);
                    } else {
                        if (Float.intBitsToFloat(i4) < -0.5f) {
                            c10306l.billing(jAdmob2);
                        } else {
                            z4 = false;
                        }
                        if (!z3 || z4) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    z4 = true;
                    if (z3) {
                    }
                    z = true;
                }
                z3 = true;
                i4 = (int) (jAdmob2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    c10306l.subs(jAdmob2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        c10306l.billing(jAdmob2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            } else {
                z = false;
            }
            if (!C1187l.loadAd(jAdmob, 0L)) {
                if (C11115l.billing(c11115l.billing) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zBilling = false;
                } else {
                    EdgeEffect edgeEffectCrashlytics = c11115l.crashlytics();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    if (edgeEffectCrashlytics instanceof C16320l) {
                        C16320l c16320l4 = (C16320l) edgeEffectCrashlytics;
                        float f5 = c16320l4.loadAd + fIntBitsToFloat6;
                        c16320l4.loadAd = f5;
                        if (Math.abs(f5) > c16320l4.yandex) {
                            c16320l4.onRelease();
                        }
                    } else {
                        edgeEffectCrashlytics.onRelease();
                    }
                    zBilling = C11115l.billing(c11115l.billing);
                }
                if (C11115l.billing(c11115l.mopub) && Float.intBitsToFloat(i2) > 0.0f) {
                    edgeEffectAmazon = c11115l.amazon();
                    fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                    if (edgeEffectAmazon instanceof C16320l) {
                        c16320l3 = (C16320l) edgeEffectAmazon;
                        f3 = c16320l3.loadAd + fIntBitsToFloat5;
                        c16320l3.loadAd = f3;
                        if (Math.abs(f3) > c16320l3.yandex) {
                            c16320l3.onRelease();
                        }
                    } else {
                        edgeEffectAmazon.onRelease();
                    }
                    if (!zBilling || C11115l.billing(c11115l.mopub)) {
                        zBilling = true;
                    } else {
                        zBilling = false;
                    }
                }
                if (C11115l.billing(c11115l.amazon) && Float.intBitsToFloat(i7) < 0.0f) {
                    edgeEffectPurchase = c11115l.purchase();
                    fIntBitsToFloat4 = Float.intBitsToFloat(i7);
                    if (edgeEffectPurchase instanceof C16320l) {
                        c16320l2 = (C16320l) edgeEffectPurchase;
                        f2 = c16320l2.loadAd + fIntBitsToFloat4;
                        c16320l2.loadAd = f2;
                        if (Math.abs(f2) > c16320l2.yandex) {
                            c16320l2.onRelease();
                        }
                    } else {
                        edgeEffectPurchase.onRelease();
                    }
                    if (!zBilling || C11115l.billing(c11115l.amazon)) {
                        zBilling = true;
                    } else {
                        zBilling = false;
                    }
                }
                if (C11115l.billing(c11115l.purchase) && Float.intBitsToFloat(i7) > 0.0f) {
                    edgeEffectLoadAd = c11115l.loadAd();
                    fIntBitsToFloat3 = Float.intBitsToFloat(i7);
                    if (edgeEffectLoadAd instanceof C16320l) {
                        c16320l = (C16320l) edgeEffectLoadAd;
                        f = c16320l.loadAd + fIntBitsToFloat3;
                        c16320l.loadAd = f;
                        if (Math.abs(f) > c16320l.yandex) {
                            c16320l.onRelease();
                        }
                    } else {
                        edgeEffectLoadAd.onRelease();
                    }
                    if (!zBilling || C11115l.billing(c11115l.purchase)) {
                        zBilling = true;
                    } else {
                        zBilling = false;
                    }
                }
                if (!zBilling || z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = z2;
            }
            if (z) {
                c10306l.amazon();
            }
            return C1187l.subs(jFloatToRawIntBits, j3);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (!C11115l.mopub(c11115l.billing)) {
            if (C11115l.mopub(c11115l.mopub)) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        } else if (C11115l.mopub(c11115l.mopub)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fIntBitsToFloat2 = 0.0f;
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!C1187l.loadAd(jFloatToRawIntBits, 0L)) {
            c10306l.amazon();
        }
        jAdmob = C1187l.admob(j, jFloatToRawIntBits);
        long j4 = ((C1187l) c16931l.invoke(new C1187l(jAdmob))).yandex;
        jAdmob2 = C1187l.admob(jAdmob, j4);
        if (Float.intBitsToFloat((int) (jAdmob >> 32)) == 0.0f) {
            c10306l.yandex();
        } else {
            c10306l.yandex();
        }
        if (i5 == 1) {
            i3 = (int) (jAdmob2 >> 32);
            if (Float.intBitsToFloat(i3) > 0.5f) {
                c10306l.mopub(jAdmob2);
            } else {
                if (Float.intBitsToFloat(i3) < -0.5f) {
                    c10306l.admob(jAdmob2);
                } else {
                    z3 = false;
                }
                i4 = (int) (jAdmob2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    c10306l.subs(jAdmob2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        c10306l.billing(jAdmob2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            }
            z3 = true;
            i4 = (int) (jAdmob2 & j2);
            if (Float.intBitsToFloat(i4) > 0.5f) {
                c10306l.subs(jAdmob2);
            } else {
                if (Float.intBitsToFloat(i4) < -0.5f) {
                    c10306l.billing(jAdmob2);
                } else {
                    z4 = false;
                }
                if (z3) {
                }
                z = true;
            }
            z4 = true;
            if (z3) {
            }
            z = true;
        } else {
            z = false;
        }
        if (!C1187l.loadAd(jAdmob, 0L)) {
            if (C11115l.billing(c11115l.billing)) {
                zBilling = false;
            } else {
                zBilling = false;
            }
            if (C11115l.billing(c11115l.mopub)) {
                edgeEffectAmazon = c11115l.amazon();
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                if (edgeEffectAmazon instanceof C16320l) {
                    c16320l3 = (C16320l) edgeEffectAmazon;
                    f3 = c16320l3.loadAd + fIntBitsToFloat5;
                    c16320l3.loadAd = f3;
                    if (Math.abs(f3) > c16320l3.yandex) {
                        c16320l3.onRelease();
                    }
                } else {
                    edgeEffectAmazon.onRelease();
                }
                if (zBilling) {
                    zBilling = true;
                } else {
                    zBilling = true;
                }
            }
            if (C11115l.billing(c11115l.amazon)) {
                edgeEffectPurchase = c11115l.purchase();
                fIntBitsToFloat4 = Float.intBitsToFloat(i7);
                if (edgeEffectPurchase instanceof C16320l) {
                    c16320l2 = (C16320l) edgeEffectPurchase;
                    f2 = c16320l2.loadAd + fIntBitsToFloat4;
                    c16320l2.loadAd = f2;
                    if (Math.abs(f2) > c16320l2.yandex) {
                        c16320l2.onRelease();
                    }
                } else {
                    edgeEffectPurchase.onRelease();
                }
                if (zBilling) {
                    zBilling = true;
                } else {
                    zBilling = true;
                }
            }
            if (C11115l.billing(c11115l.purchase)) {
                edgeEffectLoadAd = c11115l.loadAd();
                fIntBitsToFloat3 = Float.intBitsToFloat(i7);
                if (edgeEffectLoadAd instanceof C16320l) {
                    c16320l = (C16320l) edgeEffectLoadAd;
                    f = c16320l.loadAd + fIntBitsToFloat3;
                    c16320l.loadAd = f;
                    if (Math.abs(f) > c16320l.yandex) {
                        c16320l.onRelease();
                    }
                } else {
                    edgeEffectLoadAd.onRelease();
                }
                if (zBilling) {
                    zBilling = true;
                } else {
                    zBilling = true;
                }
            }
            if (zBilling) {
                z2 = true;
            } else {
                z2 = true;
            }
            z = z2;
        }
        if (z) {
            c10306l.amazon();
        }
        return C1187l.subs(jFloatToRawIntBits, j4);
    }
}
