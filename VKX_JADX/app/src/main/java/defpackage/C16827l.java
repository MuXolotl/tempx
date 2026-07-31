package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٗؑؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16827l {
    public final Object admob;
    public int amazon;
    public int billing;
    public int crashlytics;
    public int loadAd;
    public final Object mopub;
    public int purchase;
    public int yandex;

    public C16827l(int i) {
        int i2;
        this.mopub = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        if (i != 2) {
            if (i == 3) {
                this.loadAd = 6;
                this.crashlytics = 5;
                this.amazon = 4;
                this.purchase = 524288;
                this.yandex = 128;
            } else {
                if (i != 5) {
                    C8339l.metrica(AbstractC15560l.tapsense("The mode ", i, "is not supported by Crystals Dilithium!"));
                    throw null;
                }
                this.loadAd = 8;
                this.crashlytics = 7;
                this.amazon = 2;
                this.purchase = 524288;
            }
            this.admob = new C2494l(24);
            this.billing = (this.loadAd * 320) + 32;
            i2 = this.purchase;
            if (i2 == 131072 && i2 != 524288) {
                C18073l.license("Wrong Dilithium Gamma1!");
                throw null;
            }
            return;
        }
        this.loadAd = 4;
        this.crashlytics = 4;
        this.amazon = 2;
        this.purchase = 131072;
        this.yandex = 96;
        this.admob = new C2494l(24);
        this.billing = (this.loadAd * 320) + 32;
        i2 = this.purchase;
        if (i2 == 131072) {
            return;
        }
        C18073l.license("Wrong Dilithium Gamma1!");
        throw null;
    }

    public static boolean yandex(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0196  */
    /* JADX WARN: Code duplicated, block: B:108:0x0198  */
    /* JADX WARN: Code duplicated, block: B:110:0x019b  */
    /* JADX WARN: Code duplicated, block: B:111:0x019d  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01af  */
    /* JADX WARN: Code duplicated, block: B:128:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:135:0x01c9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:136:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:150:0x0206  */
    /* JADX WARN: Code duplicated, block: B:151:0x020b  */
    /* JADX WARN: Code duplicated, block: B:154:0x0210  */
    /* JADX WARN: Code duplicated, block: B:157:0x0218  */
    /* JADX WARN: Code duplicated, block: B:159:0x021f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0225  */
    /* JADX WARN: Code duplicated, block: B:165:0x0232  */
    /* JADX WARN: Code duplicated, block: B:167:0x0236 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x0240 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x0242 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x024d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x0254  */
    /* JADX WARN: Code duplicated, block: B:179:0x0258  */
    /* JADX WARN: Code duplicated, block: B:181:0x025e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0263  */
    /* JADX WARN: Code duplicated, block: B:185:0x0280  */
    /* JADX WARN: Code duplicated, block: B:186:0x0282  */
    /* JADX WARN: Code duplicated, block: B:193:0x028e  */
    /* JADX WARN: Code duplicated, block: B:196:0x0295  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00be  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x0109  */
    /* JADX WARN: Code duplicated, block: B:81:0x0114  */
    /* JADX WARN: Code duplicated, block: B:82:0x011e  */
    public void loadAd(C11338l c11338l, C9379l c9379l) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iInmobi;
        int iMakeMeasureSpec3;
        C10664l c10664l;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C8950l c8950l;
        int i;
        int measuredWidth;
        int measuredHeight;
        int i2;
        int iMin;
        int i3;
        int i4;
        int iMin2;
        int i5;
        int i6;
        int iMakeMeasureSpec4;
        boolean z7;
        int baseline;
        int i7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i8;
        boolean z11;
        int i9;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.admob;
        C14946l c14946l = c11338l.f22873volatile;
        C14946l c14946l2 = c11338l.f22867synchronized;
        if (c11338l.f22862public == 8) {
            c9379l.purchase = 0;
            c9379l.billing = 0;
            c9379l.mopub = 0;
            return;
        }
        if (c11338l.f22866switch == null) {
            return;
        }
        C10209l c10209l = ConstraintLayout.f340l;
        int i10 = c9379l.yandex;
        int i11 = c9379l.loadAd;
        int i12 = c9379l.crashlytics;
        int i13 = c9379l.amazon;
        int i14 = this.yandex + this.loadAd;
        int i15 = this.crashlytics;
        View view = c11338l.f22855instanceof;
        int iInmobi2 = AbstractC5020l.inmobi(i10);
        if (iInmobi2 == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        } else {
            if (iInmobi2 != 1) {
                if (iInmobi2 == 2) {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.purchase, i15, -2);
                    boolean z12 = c11338l.ads == 1;
                    int i16 = c9379l.isPro;
                    if (i16 == 1 || i16 == 2) {
                        boolean z13 = view.getMeasuredHeight() == c11338l.subs();
                        if (c9379l.isPro == 2 || !z12 || ((z12 && z13) || c11338l.advert())) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c11338l.metrica(), 1073741824);
                        }
                    }
                } else if (iInmobi2 != 3) {
                    iMakeMeasureSpec2 = 0;
                } else {
                    int i17 = this.purchase;
                    int i18 = c14946l2 != null ? c14946l2.mopub : 0;
                    if (c14946l != null) {
                        i18 += c14946l.mopub;
                    }
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, i15 + i18, -1);
                }
                iInmobi = AbstractC5020l.inmobi(i11);
                if (iInmobi != 0) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                } else if (iInmobi != 1) {
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.billing, i14, -2);
                } else if (iInmobi != 2) {
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.billing, i14, -2);
                    if (c11338l.subscription == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i8 = c9379l.isPro;
                    if (i8 != 1 || i8 == 2) {
                        if (view.getMeasuredWidth() == c11338l.metrica()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (c9379l.isPro != 2 || !z10 || ((z10 && z11) || c11338l.isVip())) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c11338l.subs(), 1073741824);
                        }
                    }
                } else if (iInmobi != 3) {
                    iMakeMeasureSpec3 = 0;
                } else {
                    int i19 = this.billing;
                    if (c14946l2 != null) {
                        i9 = c11338l.f22864strictfp.mopub;
                    } else {
                        i9 = 0;
                    }
                    if (c14946l != null) {
                        i9 += c11338l.f22857native.mopub;
                    }
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(i19, i14 + i9, -1);
                }
                c10664l = (C10664l) c11338l.f22866switch;
                if (c10664l == null && AbstractC15096l.billing(constraintLayout.f352l, PSKKeyManager.MAX_KEY_LENGTH_BYTES) && view.getMeasuredWidth() == c11338l.metrica() && view.getMeasuredWidth() < c10664l.metrica() && view.getMeasuredHeight() == c11338l.subs() && view.getMeasuredHeight() < c10664l.subs() && view.getBaseline() == c11338l.f22858new && !c11338l.ad() && yandex(c11338l.f22870throws, iMakeMeasureSpec2, c11338l.metrica()) && yandex(c11338l.f22859package, iMakeMeasureSpec3, c11338l.subs())) {
                    c9379l.purchase = c11338l.metrica();
                    c9379l.billing = c11338l.subs();
                    c9379l.mopub = c11338l.f22858new;
                    return;
                }
                if (i10 == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (i11 == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (i11 != 4 || i11 == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i10 != 4 || i10 == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z || c11338l.f22856interface <= 0.0f) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z2 || c11338l.f22856interface <= 0.0f) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (view == null) {
                    return;
                }
                c8950l = (C8950l) view.getLayoutParams();
                i = c9379l.isPro;
                if (i == 1 && i != 2 && z && c11338l.ads == 0 && z2 && c11338l.subscription == 0) {
                    z7 = false;
                    baseline = 0;
                    i7 = -1;
                    iMin = 0;
                    iMin2 = 0;
                } else {
                    view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                    c11338l.f22870throws = iMakeMeasureSpec2;
                    c11338l.f22859package = iMakeMeasureSpec3;
                    c11338l.mopub = false;
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline2 = view.getBaseline();
                    i2 = c11338l.Signature;
                    if (i2 > 0) {
                        iMin = Math.max(i2, measuredWidth);
                    } else {
                        iMin = measuredWidth;
                    }
                    i3 = c11338l.license;
                    if (i3 > 0) {
                        iMin = Math.min(i3, iMin);
                    }
                    i4 = c11338l.ad;
                    if (i4 > 0) {
                        iMin2 = Math.max(i4, measuredHeight);
                    } else {
                        iMin2 = measuredHeight;
                    }
                    i5 = iMakeMeasureSpec3;
                    i6 = c11338l.advert;
                    if (i6 > 0) {
                        iMin2 = Math.min(i6, iMin2);
                    }
                    if (!AbstractC15096l.billing(constraintLayout.f352l, 1)) {
                        if (!z5 && z3) {
                            iMin = (int) ((iMin2 * c11338l.f22856interface) + 0.5f);
                        } else if (z6 && z4) {
                            iMin2 = (int) ((iMin / c11338l.f22856interface) + 0.5f);
                        }
                    }
                    if (measuredWidth == iMin || measuredHeight != iMin2) {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        } else {
                            iMakeMeasureSpec4 = i5;
                        }
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                        c11338l.f22870throws = iMakeMeasureSpec2;
                        c11338l.f22859package = iMakeMeasureSpec4;
                        z7 = false;
                        c11338l.mopub = false;
                        int measuredWidth2 = view.getMeasuredWidth();
                        int measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        iMin = measuredWidth2;
                        iMin2 = measuredHeight2;
                    } else {
                        baseline = baseline2;
                        z7 = false;
                    }
                    i7 = -1;
                }
                if (baseline != i7) {
                    z8 = true;
                } else {
                    z8 = z7;
                }
                if (iMin == c9379l.crashlytics || iMin2 != c9379l.amazon) {
                    z9 = true;
                } else {
                    z9 = z7;
                }
                c9379l.subs = z9;
                if (c8950l.f18444import) {
                    z8 = true;
                }
                if (z8 && baseline != -1 && c11338l.f22858new != baseline) {
                    c9379l.subs = true;
                }
                c9379l.purchase = iMin;
                c9379l.billing = iMin2;
                c9379l.admob = z8;
                c9379l.mopub = baseline;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.purchase, i15, -2);
        }
        iMakeMeasureSpec2 = iMakeMeasureSpec;
        iInmobi = AbstractC5020l.inmobi(i11);
        if (iInmobi != 0) {
            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        } else if (iInmobi != 1) {
            iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.billing, i14, -2);
        } else if (iInmobi != 2) {
            iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.billing, i14, -2);
            if (c11338l.subscription == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            i8 = c9379l.isPro;
            if (i8 != 1) {
                if (view.getMeasuredWidth() == c11338l.metrica()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c9379l.isPro != 2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c11338l.subs(), 1073741824);
                } else {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c11338l.subs(), 1073741824);
                }
            } else {
                if (view.getMeasuredWidth() == c11338l.metrica()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c9379l.isPro != 2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c11338l.subs(), 1073741824);
                } else {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c11338l.subs(), 1073741824);
                }
            }
        } else if (iInmobi != 3) {
            iMakeMeasureSpec3 = 0;
        } else {
            int i110 = this.billing;
            if (c14946l2 != null) {
                i9 = c11338l.f22864strictfp.mopub;
            } else {
                i9 = 0;
            }
            if (c14946l != null) {
                i9 += c11338l.f22857native.mopub;
            }
            iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(i110, i14 + i9, -1);
        }
        c10664l = (C10664l) c11338l.f22866switch;
        if (c10664l == null) {
        }
        if (i10 == 3) {
            z = true;
        } else {
            z = false;
        }
        if (i11 == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i11 != 4) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (i10 != 4) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (z) {
            z5 = false;
        } else {
            z5 = false;
        }
        if (z2) {
            z6 = false;
        } else {
            z6 = false;
        }
        if (view == null) {
            return;
        }
        c8950l = (C8950l) view.getLayoutParams();
        i = c9379l.isPro;
        if (i == 1) {
            view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
            c11338l.f22870throws = iMakeMeasureSpec2;
            c11338l.f22859package = iMakeMeasureSpec3;
            c11338l.mopub = false;
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            int baseline3 = view.getBaseline();
            i2 = c11338l.Signature;
            if (i2 > 0) {
                iMin = Math.max(i2, measuredWidth);
            } else {
                iMin = measuredWidth;
            }
            i3 = c11338l.license;
            if (i3 > 0) {
                iMin = Math.min(i3, iMin);
            }
            i4 = c11338l.ad;
            if (i4 > 0) {
                iMin2 = Math.max(i4, measuredHeight);
            } else {
                iMin2 = measuredHeight;
            }
            i5 = iMakeMeasureSpec3;
            i6 = c11338l.advert;
            if (i6 > 0) {
                iMin2 = Math.min(i6, iMin2);
            }
            if (!AbstractC15096l.billing(constraintLayout.f352l, 1)) {
                if (!z5) {
                    if (z6) {
                        iMin2 = (int) ((iMin / c11338l.f22856interface) + 0.5f);
                    }
                } else if (z6) {
                    iMin2 = (int) ((iMin / c11338l.f22856interface) + 0.5f);
                }
            }
            if (measuredWidth == iMin) {
                if (measuredWidth != iMin) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                if (measuredHeight != iMin2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i5;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                c11338l.f22870throws = iMakeMeasureSpec2;
                c11338l.f22859package = iMakeMeasureSpec4;
                z7 = false;
                c11338l.mopub = false;
                int measuredWidth3 = view.getMeasuredWidth();
                int measuredHeight3 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMin = measuredWidth3;
                iMin2 = measuredHeight3;
            } else {
                if (measuredWidth != iMin) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                if (measuredHeight != iMin2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i5;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                c11338l.f22870throws = iMakeMeasureSpec2;
                c11338l.f22859package = iMakeMeasureSpec4;
                z7 = false;
                c11338l.mopub = false;
                int measuredWidth4 = view.getMeasuredWidth();
                int measuredHeight4 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMin = measuredWidth4;
                iMin2 = measuredHeight4;
            }
            i7 = -1;
        } else {
            view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
            c11338l.f22870throws = iMakeMeasureSpec2;
            c11338l.f22859package = iMakeMeasureSpec3;
            c11338l.mopub = false;
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            int baseline4 = view.getBaseline();
            i2 = c11338l.Signature;
            if (i2 > 0) {
                iMin = Math.max(i2, measuredWidth);
            } else {
                iMin = measuredWidth;
            }
            i3 = c11338l.license;
            if (i3 > 0) {
                iMin = Math.min(i3, iMin);
            }
            i4 = c11338l.ad;
            if (i4 > 0) {
                iMin2 = Math.max(i4, measuredHeight);
            } else {
                iMin2 = measuredHeight;
            }
            i5 = iMakeMeasureSpec3;
            i6 = c11338l.advert;
            if (i6 > 0) {
                iMin2 = Math.min(i6, iMin2);
            }
            if (!AbstractC15096l.billing(constraintLayout.f352l, 1)) {
                if (!z5) {
                    if (z6) {
                        iMin2 = (int) ((iMin / c11338l.f22856interface) + 0.5f);
                    }
                } else if (z6) {
                    iMin2 = (int) ((iMin / c11338l.f22856interface) + 0.5f);
                }
            }
            if (measuredWidth == iMin) {
                if (measuredWidth != iMin) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                if (measuredHeight != iMin2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i5;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                c11338l.f22870throws = iMakeMeasureSpec2;
                c11338l.f22859package = iMakeMeasureSpec4;
                z7 = false;
                c11338l.mopub = false;
                int measuredWidth5 = view.getMeasuredWidth();
                int measuredHeight5 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMin = measuredWidth5;
                iMin2 = measuredHeight5;
            } else {
                if (measuredWidth != iMin) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                if (measuredHeight != iMin2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i5;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                c11338l.f22870throws = iMakeMeasureSpec2;
                c11338l.f22859package = iMakeMeasureSpec4;
                z7 = false;
                c11338l.mopub = false;
                int measuredWidth6 = view.getMeasuredWidth();
                int measuredHeight6 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMin = measuredWidth6;
                iMin2 = measuredHeight6;
            }
            i7 = -1;
        }
        if (baseline != i7) {
            z8 = true;
        } else {
            z8 = z7;
        }
        if (iMin == c9379l.crashlytics) {
            z9 = true;
        } else {
            z9 = true;
        }
        c9379l.subs = z9;
        if (c8950l.f18444import) {
            z8 = true;
        }
        if (z8) {
            c9379l.subs = true;
        }
        c9379l.purchase = iMin;
        c9379l.billing = iMin2;
        c9379l.admob = z8;
        c9379l.mopub = baseline;
    }

    public C16827l(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.admob = constraintLayout;
        this.mopub = constraintLayout2;
    }
}
