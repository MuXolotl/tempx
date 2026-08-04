package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: lُۜؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C11338l {
    public int Signature;

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public float f22839abstract;
    public int ad;
    public int adcel;
    public int ads;
    public int advert;
    public final int[] applovin;
    public float appmetrica;

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final float[] f22840break;

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final boolean[] f22841case;

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final C14946l[] f22842catch;

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public int f22843class;

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public final int[] f22844const;

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public int f22845continue;
    public C8229l crashlytics;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public int f22846default;

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final ArrayList f22847else;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final C14946l f22848extends;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public int f22849final;

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public String f22850finally;
    public boolean firebase;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final C14946l f22851for;

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public int f22852goto;

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public int f22853implements;

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public float f22854import;
    public boolean inmobi;

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public View f22855instanceof;

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public float f22856interface;
    public String isPro;
    public float isVip;
    public int license;
    public C8229l loadAd;
    public int metrica;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final C14946l f22857native;

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public int f22858new;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public int f22859package;
    public float premium;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final C14946l f22860private;
    public float pro;

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final C11338l[] f22861protected;

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public int f22862public;
    public boolean remoteconfig;
    public int signatures;
    public boolean smaato;
    public int startapp;

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public int f22863static;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final C14946l f22864strictfp;
    public int subscription;

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public int f22865super;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public C11338l f22866switch;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final C14946l f22867synchronized;
    public final int[] tapsense;

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public int f22868this;

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final C14946l f22869throw;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public int f22870throws;

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final C11338l[] f22871transient;

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public int f22872try;
    public boolean vip;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final C14946l f22873volatile;

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public int f22874while;
    public boolean yandex = false;
    public C8431l amazon = null;
    public C3490l purchase = null;
    public final boolean[] billing = {true, true};
    public boolean mopub = true;
    public int admob = -1;
    public int subs = -1;

    public C11338l() {
        new HashMap();
        this.firebase = false;
        this.smaato = false;
        this.remoteconfig = false;
        this.vip = false;
        this.metrica = -1;
        this.startapp = -1;
        this.adcel = 0;
        this.ads = 0;
        this.subscription = 0;
        this.tapsense = new int[2];
        this.Signature = 0;
        this.license = 0;
        this.pro = 1.0f;
        this.ad = 0;
        this.advert = 0;
        this.isVip = 1.0f;
        this.signatures = -1;
        this.premium = 1.0f;
        this.applovin = new int[]{Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY};
        this.appmetrica = Float.NaN;
        this.inmobi = false;
        this.f22870throws = 0;
        this.f22859package = 0;
        C14946l c14946l = new C14946l(this, 2);
        this.f22867synchronized = c14946l;
        C14946l c14946l2 = new C14946l(this, 3);
        this.f22864strictfp = c14946l2;
        C14946l c14946l3 = new C14946l(this, 4);
        this.f22873volatile = c14946l3;
        C14946l c14946l4 = new C14946l(this, 5);
        this.f22857native = c14946l4;
        C14946l c14946l5 = new C14946l(this, 6);
        this.f22860private = c14946l5;
        C14946l c14946l6 = new C14946l(this, 8);
        this.f22848extends = c14946l6;
        C14946l c14946l7 = new C14946l(this, 9);
        this.f22851for = c14946l7;
        C14946l c14946l8 = new C14946l(this, 7);
        this.f22869throw = c14946l8;
        this.f22842catch = new C14946l[]{c14946l, c14946l3, c14946l2, c14946l4, c14946l5, c14946l8};
        ArrayList arrayList = new ArrayList();
        this.f22847else = arrayList;
        this.f22841case = new boolean[2];
        this.f22844const = new int[]{1, 1};
        this.f22866switch = null;
        this.f22845continue = 0;
        this.f22843class = 0;
        this.f22856interface = 0.0f;
        this.f22863static = -1;
        this.f22846default = 0;
        this.f22849final = 0;
        this.f22858new = 0;
        this.f22854import = 0.5f;
        this.f22839abstract = 0.5f;
        this.f22862public = 0;
        this.f22850finally = null;
        this.f22868this = 0;
        this.f22872try = 0;
        this.f22840break = new float[]{-1.0f, -1.0f};
        this.f22871transient = new C11338l[]{null, null};
        this.f22861protected = new C11338l[]{null, null};
        this.f22874while = -1;
        this.f22853implements = -1;
        arrayList.add(c14946l);
        arrayList.add(c14946l2);
        arrayList.add(c14946l3);
        arrayList.add(c14946l4);
        arrayList.add(c14946l6);
        arrayList.add(c14946l7);
        arrayList.add(c14946l8);
        arrayList.add(c14946l5);
    }

    public static void appmetrica(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void inmobi(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void remoteconfig(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, int i6) {
        String str2;
        sb.append(str);
        sb.append(" :  {\n");
        if (i6 == 1) {
            str2 = "FIXED";
        } else if (i6 == 2) {
            str2 = "WRAP_CONTENT";
        } else if (i6 == 3) {
            str2 = "MATCH_CONSTRAINT";
        } else {
            if (i6 != 4) {
                throw null;
            }
            str2 = "MATCH_PARENT";
        }
        if (!"FIXED".equals(str2)) {
            AbstractC9361l.appmetrica(sb, "      behavior", " :   ", str2, ",\n");
        }
        appmetrica(i, 0, "      size", sb);
        appmetrica(i2, 0, "      min", sb);
        appmetrica(i3, Alert.DURATION_SHOW_INDEFINITELY, "      max", sb);
        appmetrica(i4, 0, "      matchMin", sb);
        appmetrica(i5, 0, "      matchDef", sb);
        inmobi(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void vip(StringBuilder sb, String str, C14946l c14946l) {
        if (c14946l.billing == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(c14946l.billing);
        sb.append("'");
        if (c14946l.admob != Integer.MIN_VALUE || c14946l.mopub != 0) {
            sb.append(",");
            sb.append(c14946l.mopub);
            if (c14946l.admob != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(c14946l.admob);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public final boolean Signature(int i) {
        C14946l c14946l;
        C14946l c14946l2;
        int i2 = i * 2;
        C14946l[] c14946lArr = this.f22842catch;
        C14946l c14946l3 = c14946lArr[i2];
        C14946l c14946l4 = c14946l3.billing;
        return (c14946l4 == null || c14946l4.billing == c14946l3 || (c14946l2 = (c14946l = c14946lArr[i2 + 1]).billing) == null || c14946l2.billing != c14946l) ? false : true;
    }

    public final boolean ad() {
        return this.mopub && this.f22862public != 8;
    }

    public final int adcel() {
        C11338l c11338l = this.f22866switch;
        return (c11338l == null || !(c11338l instanceof C10664l)) ? this.f22849final : ((C10664l) c11338l).f21644l + this.f22849final;
    }

    public final int admob(int i) {
        int[] iArr = this.f22844const;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
    public final boolean ads(int i) {
        if (i == 0) {
            if ((this.f22867synchronized.billing != null ? 1 : 0) + (this.f22873volatile.billing != null ? 1 : 0) < 2) {
                return true;
            }
            return false;
        }
        if ((this.f22864strictfp.billing != null ? 1 : 0) + (this.f22857native.billing != null ? 1 : 0) + (this.f22860private.billing != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public boolean advert() {
        if (this.firebase) {
            return true;
        }
        return this.f22867synchronized.crashlytics && this.f22873volatile.crashlytics;
    }

    /* JADX WARN: Code duplicated, block: B:220:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:222:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:229:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:231:0x0402  */
    /* JADX WARN: Code duplicated, block: B:240:0x041f  */
    /* JADX WARN: Code duplicated, block: B:257:0x0452  */
    /* JADX WARN: Code duplicated, block: B:259:0x0458  */
    /* JADX WARN: Code duplicated, block: B:270:0x046d  */
    /* JADX WARN: Code duplicated, block: B:275:0x0477  */
    /* JADX WARN: Code duplicated, block: B:277:0x047b  */
    /* JADX WARN: Code duplicated, block: B:278:0x047d  */
    /* JADX WARN: Code duplicated, block: B:281:0x0485  */
    /* JADX WARN: Code duplicated, block: B:287:0x0493 A[PHI: r0
  0x0493: PHI (r0v15 int) = (r0v14 int), (r0v19 int), (r0v19 int), (r0v19 int) binds: [B:280:0x0483, B:282:0x0489, B:283:0x048b, B:285:0x048f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:290:0x04a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:291:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:292:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:294:0x04af  */
    /* JADX WARN: Code duplicated, block: B:303:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:337:0x0521  */
    public final void amazon(C4847l c4847l, boolean z, boolean z2, boolean z3, boolean z4, C4657l c4657l, C4657l c4657l2, int i, boolean z5, C14946l c14946l, C14946l c14946l2, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
        boolean z12;
        boolean z13;
        int iMin;
        boolean z14;
        int i10;
        int i11;
        boolean z15;
        C4657l c4657lFirebase;
        C4657l c4657lFirebase2;
        C14946l c14946l3;
        C4657l c4657l3;
        int i12;
        int i13;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        C11338l c11338l;
        boolean z20;
        int iMin2;
        boolean z21;
        int i14;
        int iAmazon;
        int i15;
        int i16;
        HashSet hashSet;
        boolean z22;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z23;
        boolean z24;
        int i22;
        c4847l = c4847l;
        int i23 = i8;
        int i24 = i9;
        C4657l c4657lFirebase3 = c4847l.firebase(c14946l);
        C4657l c4657lFirebase4 = c4847l.firebase(c14946l2);
        C4657l c4657lFirebase5 = c4847l.firebase(c14946l.billing);
        C4657l c4657lFirebase6 = c4847l.firebase(c14946l2.billing);
        boolean zBilling = c14946l.billing();
        boolean zBilling2 = c14946l2.billing();
        boolean zBilling3 = this.f22869throw.billing();
        int i25 = zBilling2 ? (zBilling ? 1 : 0) + 1 : zBilling ? 1 : 0;
        if (zBilling3) {
            i25++;
        }
        int i26 = i25;
        int i27 = z6 ? 3 : i6;
        int iInmobi = AbstractC5020l.inmobi(i);
        boolean z25 = (iInmobi == 0 || iInmobi == 1 || iInmobi != 2 || i27 == 4) ? false : true;
        int i28 = this.admob;
        if (i28 == -1 || !z) {
            i28 = i3;
            z12 = z25;
        } else {
            this.admob = -1;
            z12 = false;
        }
        int i29 = this.subs;
        if (i29 == -1 || z) {
            z13 = z12;
        } else {
            this.subs = -1;
            i28 = i29;
            z13 = false;
        }
        boolean z26 = z13;
        if (this.f22862public == 8) {
            z14 = false;
            iMin = 0;
        } else {
            iMin = i28;
            z14 = z26;
        }
        if (z11) {
            if (!zBilling && !zBilling2 && !zBilling3) {
                c4847l.amazon(c4657lFirebase3, i2);
            } else if (zBilling && !zBilling2) {
                i10 = 8;
                c4847l.purchase(c4657lFirebase3, c4657lFirebase5, c14946l.amazon(), 8);
            }
            i10 = 8;
        } else {
            i10 = 8;
        }
        if (z14 != 0) {
            if (i26 == 2 || z6 || !(i27 == 1 || i27 == 0)) {
                if (i23 == -2) {
                    i23 = iMin;
                }
                if (i24 == -2) {
                    i24 = iMin;
                }
                if (iMin > 0 && i27 != 1) {
                    iMin = 0;
                }
                if (i23 > 0) {
                    c4847l.billing(c4657lFirebase4, c4657lFirebase3, i23, 8);
                    iMin = Math.max(iMin, i23);
                }
                if (i24 > 0) {
                    if (!z2 || i27 != 1) {
                        c4847l.mopub(c4657lFirebase4, c4657lFirebase3, i24, 8);
                    }
                    iMin = Math.min(iMin, i24);
                }
                if (i27 == 1) {
                    if (z2) {
                        c4847l.purchase(c4657lFirebase4, c4657lFirebase3, iMin, 8);
                    } else if (z8) {
                        c4847l.purchase(c4657lFirebase4, c4657lFirebase3, iMin, 5);
                        c4847l.mopub(c4657lFirebase4, c4657lFirebase3, iMin, 8);
                    } else {
                        c4847l.purchase(c4657lFirebase4, c4657lFirebase3, iMin, 5);
                        c4847l.mopub(c4657lFirebase4, c4657lFirebase3, iMin, 8);
                    }
                } else if (i27 == 2) {
                    int i30 = c14946l.purchase;
                    if (i30 == 3 || i30 == 5) {
                        c4657lFirebase = c4847l.firebase(this.f22866switch.mopub(3));
                        c4657lFirebase2 = c4847l.firebase(this.f22866switch.mopub(5));
                    } else {
                        c4657lFirebase = c4847l.firebase(this.f22866switch.mopub(2));
                        c4657lFirebase2 = c4847l.firebase(this.f22866switch.mopub(4));
                    }
                    C1846l c1846lSmaato = c4847l.smaato();
                    int i31 = i23;
                    c1846lSmaato.amazon.mopub(c4657lFirebase4, -1.0f);
                    c1846lSmaato.amazon.mopub(c4657lFirebase3, 1.0f);
                    c1846lSmaato.amazon.mopub(c4657lFirebase2, f2);
                    c1846lSmaato.amazon.mopub(c4657lFirebase, -f2);
                    c4847l.crashlytics(c1846lSmaato);
                    if (z2) {
                        z14 = false;
                    }
                    z15 = z4;
                    i11 = i31;
                } else {
                    i11 = i23;
                    z15 = true;
                }
            } else {
                int iMax = Math.max(i23, iMin);
                if (i24 > 0) {
                    iMax = Math.min(i24, iMax);
                }
                c4847l.purchase(c4657lFirebase4, c4657lFirebase3, iMax, 8);
                z15 = z4;
                i11 = i23;
                z14 = false;
            }
            if (z11 || z8) {
                boolean z27 = z15;
                if (i26 >= 2 && z2 && z27) {
                    c4847l.billing(c4657lFirebase3, c4657l, 0, 8);
                    C14946l c14946l4 = this.f22860private;
                    boolean z28 = z || c14946l4.billing == null;
                    if (!z && (c14946l3 = c14946l4.billing) != null) {
                        C11338l c11338l2 = c14946l3.amazon;
                        if (c11338l2.f22856interface != 0.0f) {
                            int[] iArr = c11338l2.f22844const;
                            if (iArr[0] == 3 && iArr[1] == 3) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                        } else {
                            z28 = false;
                        }
                    }
                    if (z28) {
                        c4847l.billing(c4657l2, c4657lFirebase4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (zBilling || zBilling2 || zBilling3) {
                if (zBilling && !zBilling2) {
                    c14946l2 = c14946l2;
                    c4657lFirebase4 = c4657lFirebase4;
                    z15 = z15;
                    c4657l3 = c4657lFirebase6;
                    z20 = z2;
                    i22 = (z2 && (c14946l.billing.amazon instanceof C0051l)) ? 8 : 5;
                } else if (zBilling || !zBilling2) {
                    c4657l3 = c4657lFirebase6;
                    if (zBilling && zBilling2) {
                        C11338l c11338l3 = c14946l.billing.amazon;
                        C11338l c11338l4 = c14946l2.billing.amazon;
                        z15 = z15;
                        C11338l c11338l5 = this.f22866switch;
                        int i32 = 6;
                        if (z14) {
                            if (i27 == 0) {
                                if (i24 != 0 || i11 != 0) {
                                    i20 = 5;
                                    i21 = 5;
                                    z23 = true;
                                    z24 = false;
                                    z17 = true;
                                } else if (c4657lFirebase5.f9484l && c4657l3.f9484l) {
                                    c4847l.purchase(c4657lFirebase3, c4657lFirebase5, c14946l.amazon(), 8);
                                    c4847l.purchase(c4657lFirebase4, c4657l3, -c14946l2.amazon(), 8);
                                    return;
                                } else {
                                    i20 = 8;
                                    i21 = 8;
                                    z23 = false;
                                    z24 = true;
                                    z17 = false;
                                }
                                if ((c11338l3 instanceof C0051l) || (c11338l4 instanceof C0051l)) {
                                    c4847l = c4847l;
                                    i27 = i27;
                                    c4657lFirebase3 = c4657lFirebase3;
                                    c4657lFirebase4 = c4657lFirebase4;
                                    z18 = z24;
                                    c4657l2 = c4657l2;
                                    i12 = i20;
                                    c4657lFirebase5 = c4657lFirebase5;
                                    i32 = 6;
                                    z16 = z23;
                                    i13 = 4;
                                } else {
                                    c4847l = c4847l;
                                    c4657lFirebase3 = c4657lFirebase3;
                                    c4657lFirebase4 = c4657lFirebase4;
                                    z18 = z24;
                                    i12 = i20;
                                    c4657lFirebase5 = c4657lFirebase5;
                                    i32 = 6;
                                    z16 = z23;
                                    i13 = i21;
                                    i27 = i27;
                                    c4657l2 = c4657l2;
                                }
                            } else {
                                if (i27 == 2) {
                                    if ((c11338l3 instanceof C0051l) || (c11338l4 instanceof C0051l)) {
                                        i12 = 5;
                                    } else {
                                        c4847l = c4847l;
                                        i27 = i27;
                                        c4657lFirebase3 = c4657lFirebase3;
                                        c4657lFirebase4 = c4657lFirebase4;
                                        c4657lFirebase5 = c4657lFirebase5;
                                        i32 = 6;
                                        i12 = 5;
                                        i13 = 5;
                                    }
                                    z16 = true;
                                    z17 = true;
                                    z18 = false;
                                    c4657l2 = c4657l2;
                                } else if (i27 == 1) {
                                    i12 = 8;
                                } else if (i27 == 3) {
                                    i27 = i27;
                                    if (this.signatures != -1) {
                                        if (z6) {
                                            if (i7 == 2 || i7 == 1) {
                                                i18 = 5;
                                                i19 = 4;
                                            } else {
                                                i18 = 8;
                                                i19 = 5;
                                            }
                                            i13 = i19;
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                        } else {
                                            if (i24 > 0) {
                                                c4847l = c4847l;
                                                c4657l2 = c4657l2;
                                                c4657lFirebase3 = c4657lFirebase3;
                                                c4657lFirebase4 = c4657lFirebase4;
                                                c4657lFirebase5 = c4657lFirebase5;
                                                i32 = 6;
                                                i12 = 5;
                                            } else if (i24 != 0 || i11 != 0) {
                                                c4847l = c4847l;
                                                c4657l2 = c4657l2;
                                                c4657lFirebase3 = c4657lFirebase3;
                                                c4657lFirebase4 = c4657lFirebase4;
                                                c4657lFirebase5 = c4657lFirebase5;
                                                i32 = 6;
                                                i12 = 5;
                                                i13 = 4;
                                            } else if (z9) {
                                                i18 = (c11338l3 == c11338l5 || c11338l4 == c11338l5) ? 5 : 4;
                                                i13 = 4;
                                                z16 = true;
                                                z17 = true;
                                                z18 = true;
                                            } else {
                                                c4847l = c4847l;
                                                c4657l2 = c4657l2;
                                                c4657lFirebase3 = c4657lFirebase3;
                                                c4657lFirebase4 = c4657lFirebase4;
                                                c4657lFirebase5 = c4657lFirebase5;
                                                i32 = 6;
                                                i12 = 5;
                                                i13 = 8;
                                            }
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                        }
                                        i12 = i18;
                                        c4847l = c4847l;
                                    } else if (z9) {
                                        c4847l = c4847l;
                                        c4657l2 = c4657l2;
                                        c4657lFirebase3 = c4657lFirebase3;
                                        c4657lFirebase4 = c4657lFirebase4;
                                        c4657lFirebase5 = c4657lFirebase5;
                                        i12 = 8;
                                        i32 = z2 ? 5 : 4;
                                    } else {
                                        c4847l = c4847l;
                                        c4657l2 = c4657l2;
                                        c4657lFirebase3 = c4657lFirebase3;
                                        c4657lFirebase4 = c4657lFirebase4;
                                        c4657lFirebase5 = c4657lFirebase5;
                                        i12 = 8;
                                        i32 = 8;
                                    }
                                    i13 = 5;
                                    z16 = true;
                                    z17 = true;
                                    z18 = true;
                                } else {
                                    i12 = 5;
                                    i13 = 4;
                                    z16 = false;
                                    z17 = false;
                                }
                                i13 = 4;
                                z16 = true;
                                z17 = true;
                                z18 = false;
                                c4657l2 = c4657l2;
                            }
                            if (z17 || c4657lFirebase5 != c4657l3 || c11338l3 == c11338l5) {
                                z19 = true;
                            } else {
                                z17 = false;
                                z19 = false;
                            }
                            if (z16) {
                                if (z14 && !z7 && !z9 && c4657lFirebase5 == c4657l && c4657l3 == c4657l2) {
                                    i32 = 8;
                                    z20 = false;
                                    i17 = 8;
                                    z22 = false;
                                } else {
                                    z20 = z2;
                                    z22 = z19;
                                    i17 = i12;
                                }
                                C4657l c4657l4 = c4657lFirebase5;
                                c11338l = c11338l4;
                                c4847l.loadAd(c4657lFirebase3, c4657l4, c14946l.amazon(), f, c4657l3, c4657lFirebase4, c14946l2.amazon(), i32);
                                c4657lFirebase5 = c4657l4;
                                i12 = i17;
                                z19 = z22;
                            } else {
                                c11338l = c11338l4;
                                z20 = z2;
                            }
                            if (this.f22862public != 8 && ((hashSet = c14946l2.yandex) == null || hashSet.size() <= 0)) {
                                return;
                            }
                            if (z17) {
                                if (z20 && c4657lFirebase5 != c4657l3 && !z14 && ((c11338l3 instanceof C0051l) || (c11338l instanceof C0051l))) {
                                    i12 = 6;
                                }
                                c4847l.billing(c4657lFirebase3, c4657lFirebase5, c14946l.amazon(), i12);
                                c4847l.mopub(c4657lFirebase4, c4657l3, -c14946l2.amazon(), i12);
                            }
                            if (z20 || !z10 || (c11338l3 instanceof C0051l) || (c11338l instanceof C0051l) || c11338l == c11338l5) {
                                iMin2 = i13;
                                z21 = z19;
                            } else {
                                iMin2 = 6;
                                i12 = 6;
                                z21 = true;
                            }
                            if (z21) {
                                if (z18 && (!z9 || z3)) {
                                    if (c11338l3 != c11338l5 && c11338l != c11338l5) {
                                        i32 = iMin2;
                                    }
                                    if ((c11338l3 instanceof C10526l) || (c11338l instanceof C10526l)) {
                                        i32 = 5;
                                    }
                                    if ((c11338l3 instanceof C0051l) || (c11338l instanceof C0051l)) {
                                        i32 = 5;
                                    }
                                    if (z9) {
                                        i16 = 5;
                                    } else {
                                        i16 = i32;
                                    }
                                    iMin2 = Math.max(i16, iMin2);
                                }
                                if (z20) {
                                    iMin2 = Math.min(i12, iMin2);
                                    if (z6 || z9 || !(c11338l3 == c11338l5 || c11338l == c11338l5)) {
                                        i15 = iMin2;
                                    } else {
                                        i15 = 4;
                                    }
                                } else {
                                    i15 = iMin2;
                                }
                                c4847l.purchase(c4657lFirebase3, c4657lFirebase5, c14946l.amazon(), i15);
                                c4847l.purchase(c4657lFirebase4, c4657l3, -c14946l2.amazon(), i15);
                            }
                            if (z20) {
                                if (c4657l == c4657lFirebase5) {
                                    iAmazon = c14946l.amazon();
                                } else {
                                    iAmazon = 0;
                                }
                                if (c4657lFirebase5 != c4657l) {
                                    c4847l.billing(c4657lFirebase3, c4657l, iAmazon, 5);
                                }
                            }
                            if (z20 || !z14 || i4 != 0 || i11 != 0) {
                                i14 = 5;
                            } else if (z14 && i27 == 3) {
                                c4847l.billing(c4657lFirebase4, c4657lFirebase3, 0, 8);
                                i14 = 5;
                            } else {
                                i14 = 5;
                                c4847l.billing(c4657lFirebase4, c4657lFirebase3, 0, 5);
                            }
                        } else {
                            if (c4657lFirebase5.f9484l && c4657l3.f9484l) {
                                c4847l.loadAd(c4657lFirebase3, c4657lFirebase5, c14946l.amazon(), f, c4657l3, c4657lFirebase4, c14946l2.amazon(), 8);
                                if (z2 && z15) {
                                    int iAmazon2 = c14946l2.billing != null ? c14946l2.amazon() : 0;
                                    if (c4657l3 != c4657l2) {
                                        c4847l.billing(c4657l2, c4657lFirebase4, iAmazon2, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i12 = 5;
                            i13 = 4;
                            z16 = true;
                            z17 = true;
                        }
                        z18 = false;
                        if (z17) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (z16) {
                            if (z14) {
                                z20 = z2;
                                z22 = z19;
                                i17 = i12;
                            } else {
                                z20 = z2;
                                z22 = z19;
                                i17 = i12;
                            }
                            C4657l c4657l5 = c4657lFirebase5;
                            c11338l = c11338l4;
                            c4847l.loadAd(c4657lFirebase3, c4657l5, c14946l.amazon(), f, c4657l3, c4657lFirebase4, c14946l2.amazon(), i32);
                            c4657lFirebase5 = c4657l5;
                            i12 = i17;
                            z19 = z22;
                        } else {
                            c11338l = c11338l4;
                            z20 = z2;
                        }
                        if (this.f22862public != 8) {
                        }
                        if (z17) {
                            if (z20) {
                                i12 = 6;
                            }
                            c4847l.billing(c4657lFirebase3, c4657lFirebase5, c14946l.amazon(), i12);
                            c4847l.mopub(c4657lFirebase4, c4657l3, -c14946l2.amazon(), i12);
                        }
                        if (z20) {
                            iMin2 = i13;
                            z21 = z19;
                        } else {
                            iMin2 = i13;
                            z21 = z19;
                        }
                        if (z21) {
                            if (z18) {
                                if (c11338l3 != c11338l5) {
                                    i32 = iMin2;
                                }
                                if (c11338l3 instanceof C10526l) {
                                    i32 = 5;
                                } else {
                                    i32 = 5;
                                }
                                if (c11338l3 instanceof C0051l) {
                                    i32 = 5;
                                } else {
                                    i32 = 5;
                                }
                                if (z9) {
                                    i16 = 5;
                                } else {
                                    i16 = i32;
                                }
                                iMin2 = Math.max(i16, iMin2);
                            }
                            if (z20) {
                                iMin2 = Math.min(i12, iMin2);
                                if (z6) {
                                    i15 = iMin2;
                                } else {
                                    i15 = iMin2;
                                }
                            } else {
                                i15 = iMin2;
                            }
                            c4847l.purchase(c4657lFirebase3, c4657lFirebase5, c14946l.amazon(), i15);
                            c4847l.purchase(c4657lFirebase4, c4657l3, -c14946l2.amazon(), i15);
                        }
                        if (z20) {
                            if (c4657l == c4657lFirebase5) {
                                iAmazon = c14946l.amazon();
                            } else {
                                iAmazon = 0;
                            }
                            if (c4657lFirebase5 != c4657l) {
                                c4847l.billing(c4657lFirebase3, c4657l, iAmazon, 5);
                            }
                        }
                        if (z20) {
                            i14 = 5;
                        } else {
                            i14 = 5;
                        }
                    }
                    i22 = i14;
                } else {
                    c4657l3 = c4657lFirebase6;
                    c4847l.purchase(c4657lFirebase4, c4657l3, -c14946l2.amazon(), 8);
                    if (z2) {
                        c4847l.billing(c4657lFirebase3, c4657l, 0, 5);
                        c14946l2 = c14946l2;
                        i14 = 5;
                        c4657lFirebase4 = c4657lFirebase4;
                        z15 = z15;
                    }
                    z20 = z2;
                    i22 = i14;
                }
                if (z20 || !z15) {
                    return;
                }
                int iAmazon3 = c14946l2.billing != null ? c14946l2.amazon() : 0;
                if (c4657l3 != c4657l2) {
                    c4847l.billing(c4657l2, c4657lFirebase4, iAmazon3, i22);
                    return;
                }
                return;
            }
            c4657l3 = c4657lFirebase6;
            i14 = 5;
            z20 = z2;
            i22 = i14;
            if (z20) {
                return;
            } else {
                return;
            }
        }
        if (z5) {
            c4847l.purchase(c4657lFirebase4, c4657lFirebase3, 0, 3);
            if (i4 > 0) {
                c4847l.billing(c4657lFirebase4, c4657lFirebase3, i4, i10);
            }
            if (i5 < Integer.MAX_VALUE) {
                c4847l.mopub(c4657lFirebase4, c4657lFirebase3, i5, i10);
            }
        } else {
            c4847l.purchase(c4657lFirebase4, c4657lFirebase3, iMin, i10);
        }
        z15 = z4;
        i11 = i23;
        if (z11) {
        }
        boolean z29 = z15;
        if (i26 >= 2) {
        }
    }

    public void applovin(C0554l c0554l) {
        this.f22867synchronized.admob();
        this.f22864strictfp.admob();
        this.f22873volatile.admob();
        this.f22857native.admob();
        this.f22860private.admob();
        this.f22869throw.admob();
        this.f22848extends.admob();
        this.f22851for.admob();
    }

    public final void billing() {
        if (this.amazon == null) {
            C8431l c8431l = new C8431l(this);
            c8431l.admob.purchase = 4;
            c8431l.subs.purchase = 5;
            c8431l.billing = 0;
            this.amazon = c8431l;
        }
        if (this.purchase == null) {
            C3490l c3490l = new C3490l(this);
            C7265l c7265l = new C7265l(c3490l);
            c3490l.firebase = c7265l;
            c3490l.smaato = null;
            c3490l.admob.purchase = 6;
            c3490l.subs.purchase = 7;
            c7265l.purchase = 8;
            c3490l.billing = 1;
            this.purchase = c3490l;
        }
    }

    public boolean crashlytics() {
        return this.f22862public != 8;
    }

    /* JADX INFO: renamed from: extends */
    public void mo2928extends(C4847l c4847l, boolean z) {
        int i;
        int i2;
        C3490l c3490l;
        C8431l c8431l;
        c4847l.getClass();
        int iVip = C4847l.vip(this.f22867synchronized);
        int iVip2 = C4847l.vip(this.f22864strictfp);
        int iVip3 = C4847l.vip(this.f22873volatile);
        int iVip4 = C4847l.vip(this.f22857native);
        if (z && (c8431l = this.amazon) != null) {
            C7265l c7265l = c8431l.admob;
            if (c7265l.isPro) {
                C7265l c7265l2 = c8431l.subs;
                if (c7265l2.isPro) {
                    iVip = c7265l.mopub;
                    iVip3 = c7265l2.mopub;
                }
            }
        }
        if (z && (c3490l = this.purchase) != null) {
            C7265l c7265l3 = c3490l.admob;
            if (c7265l3.isPro) {
                C7265l c7265l4 = c3490l.subs;
                if (c7265l4.isPro) {
                    iVip2 = c7265l3.mopub;
                    iVip4 = c7265l4.mopub;
                }
            }
        }
        int i3 = iVip4 - iVip2;
        if (iVip3 - iVip < 0 || i3 < 0 || iVip == Integer.MIN_VALUE || iVip == Integer.MAX_VALUE || iVip2 == Integer.MIN_VALUE || iVip2 == Integer.MAX_VALUE || iVip3 == Integer.MIN_VALUE || iVip3 == Integer.MAX_VALUE || iVip4 == Integer.MIN_VALUE || iVip4 == Integer.MAX_VALUE) {
            iVip = 0;
            iVip2 = 0;
            iVip3 = 0;
            iVip4 = 0;
        }
        int i4 = iVip3 - iVip;
        int i5 = iVip4 - iVip2;
        this.f22846default = iVip;
        this.f22849final = iVip2;
        if (this.f22862public == 8) {
            this.f22845continue = 0;
            this.f22843class = 0;
            return;
        }
        int[] iArr = this.f22844const;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.f22845continue)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.f22843class)) {
            i5 = i;
        }
        this.f22845continue = i4;
        this.f22843class = i5;
        int i7 = this.f22865super;
        if (i5 < i7) {
            this.f22843class = i7;
        }
        int i8 = this.f22852goto;
        if (i4 < i8) {
            this.f22845continue = i8;
        }
        int i9 = this.license;
        if (i9 > 0 && i6 == 3) {
            this.f22845continue = Math.min(this.f22845continue, i9);
        }
        int i10 = this.advert;
        if (i10 > 0 && iArr[1] == 3) {
            this.f22843class = Math.min(this.f22843class, i10);
        }
        int i11 = this.f22845continue;
        if (i4 != i11) {
            this.admob = i11;
        }
        int i12 = this.f22843class;
        if (i5 != i12) {
            this.subs = i12;
        }
    }

    public final C11338l firebase(int i) {
        C14946l c14946l;
        C14946l c14946l2;
        if (i != 0) {
            if (i == 1 && (c14946l2 = (c14946l = this.f22864strictfp).billing) != null && c14946l2.billing == c14946l) {
                return c14946l2.amazon;
            }
            return null;
        }
        C14946l c14946l3 = this.f22867synchronized;
        C14946l c14946l4 = c14946l3.billing;
        if (c14946l4 == null || c14946l4.billing != c14946l3) {
            return null;
        }
        return c14946l4.amazon;
    }

    public final C11338l isPro(int i) {
        C14946l c14946l;
        C14946l c14946l2;
        if (i != 0) {
            if (i == 1 && (c14946l2 = (c14946l = this.f22857native).billing) != null && c14946l2.billing == c14946l) {
                return c14946l2.amazon;
            }
            return null;
        }
        C14946l c14946l3 = this.f22873volatile;
        C14946l c14946l4 = c14946l3.billing;
        if (c14946l4 == null || c14946l4.billing != c14946l3) {
            return null;
        }
        return c14946l4.amazon;
    }

    public boolean isVip() {
        if (this.smaato) {
            return true;
        }
        return this.f22864strictfp.crashlytics && this.f22857native.crashlytics;
    }

    public final boolean license() {
        C14946l c14946l = this.f22867synchronized;
        C14946l c14946l2 = c14946l.billing;
        if (c14946l2 != null && c14946l2.billing == c14946l) {
            return true;
        }
        C14946l c14946l3 = this.f22873volatile;
        C14946l c14946l4 = c14946l3.billing;
        return c14946l4 != null && c14946l4.billing == c14946l3;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0204  */
    /* JADX WARN: Code duplicated, block: B:125:0x020c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0215  */
    /* JADX WARN: Code duplicated, block: B:130:0x021b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0226  */
    /* JADX WARN: Code duplicated, block: B:134:0x0232  */
    /* JADX WARN: Code duplicated, block: B:135:0x023b  */
    /* JADX WARN: Code duplicated, block: B:145:0x0261  */
    /* JADX WARN: Code duplicated, block: B:157:0x028b  */
    /* JADX WARN: Code duplicated, block: B:161:0x029a  */
    /* JADX WARN: Code duplicated, block: B:164:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:170:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:174:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:177:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:179:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:187:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:249:0x03ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:250:0x03b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:255:0x03c7 A[PHI: r13
  0x03c7: PHI (r13v37 int) = (r13v22 int), (r13v22 int), (r13v34 int), (r13v22 int), (r13v22 int), (r13v22 int), (r13v22 int), (r13v22 int) binds: [B:257:0x03cf, B:258:0x03d1, B:252:0x03bb, B:239:0x0390, B:245:0x039e, B:247:0x03a2, B:248:0x03a4, B:244:0x039a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:257:0x03cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:258:0x03d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:268:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:272:0x040d  */
    /* JADX WARN: Code duplicated, block: B:274:0x0412 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:276:0x0416  */
    /* JADX WARN: Code duplicated, block: B:279:0x041a  */
    /* JADX WARN: Code duplicated, block: B:284:0x0426  */
    /* JADX WARN: Code duplicated, block: B:287:0x042e  */
    /* JADX WARN: Code duplicated, block: B:290:0x0434  */
    /* JADX WARN: Code duplicated, block: B:292:0x0437  */
    /* JADX WARN: Code duplicated, block: B:295:0x0453  */
    /* JADX WARN: Code duplicated, block: B:314:0x049a  */
    /* JADX WARN: Code duplicated, block: B:330:0x0537  */
    /* JADX WARN: Code duplicated, block: B:346:0x058a  */
    /* JADX WARN: Code duplicated, block: B:349:0x059c  */
    /* JADX WARN: Code duplicated, block: B:352:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:389:0x0661  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:391:0x0667  */
    /* JADX WARN: Code duplicated, block: B:393:0x0670  */
    /* JADX WARN: Code duplicated, block: B:394:0x0697  */
    /* JADX WARN: Code duplicated, block: B:397:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:400:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x010f  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0129  */
    /* JADX WARN: Code duplicated, block: B:79:0x0141  */
    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0164  */
    /* JADX WARN: Code duplicated, block: B:89:0x016f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r58v0, types: [lُۜؒ] */
    public void loadAd(C4847l c4847l, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean[] zArr;
        int i5;
        int i6;
        boolean z2;
        HashSet hashSet;
        C11338l c11338l;
        C10664l c10664l;
        WeakReference weakReference;
        WeakReference weakReference2;
        C11338l c11338l2;
        C10664l c10664l2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        boolean[] zArr2;
        C14946l c14946l;
        boolean[] zArr3;
        boolean z3;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        boolean z5;
        int i13;
        boolean z6;
        float f;
        int i14;
        int i15;
        C14946l c14946l2;
        int i16;
        int i17;
        int i18;
        boolean z7;
        int i19;
        boolean z8;
        boolean z9;
        C14946l c14946l3;
        int i20;
        C14946l c14946l4;
        C4657l c4657l;
        C4657l c4657l2;
        C4657l c4657l3;
        boolean z10;
        ?? r3;
        ?? r4;
        int i21;
        C4657l c4657l4;
        C4657l c4657l5;
        C4657l c4657l6;
        int i22;
        int i23;
        boolean z11;
        int i24;
        C4657l c4657l7;
        int i25;
        float f2;
        ?? r27;
        C3490l c3490l;
        boolean z12;
        C8431l c8431l;
        int i26;
        int i27;
        boolean zLicense;
        int i28;
        boolean zPro;
        C8431l c8431l2;
        C3490l c3490l2;
        boolean z13;
        ArrayList arrayList;
        int size;
        int i29;
        HashSet hashSet2;
        C4847l c4847l2 = c4847l;
        C14946l c14946l5 = this.f22867synchronized;
        C4657l c4657lFirebase = c4847l2.firebase(c14946l5);
        C14946l c14946l6 = this.f22873volatile;
        C4657l c4657lFirebase2 = c4847l2.firebase(c14946l6);
        C14946l c14946l7 = this.f22864strictfp;
        C4657l c4657lFirebase3 = c4847l2.firebase(c14946l7);
        C14946l c14946l8 = this.f22857native;
        C4657l c4657lFirebase4 = c4847l2.firebase(c14946l8);
        C14946l c14946l9 = this.f22860private;
        C4657l c4657lFirebase5 = c4847l2.firebase(c14946l9);
        C11338l c11338l3 = this.f22866switch;
        if (c11338l3 != null) {
            int[] iArr2 = c11338l3.f22844const;
            i = 0;
            i3 = iArr2[0] == 2 ? 1 : 0;
            int i30 = iArr2[1] == 2 ? 1 : 0;
            int i31 = this.adcel;
            if (i31 != 1) {
                if (i31 == 2) {
                    i3 = 0;
                } else if (i31 != 3) {
                }
                i2 = i30;
            } else {
                i2 = 0;
            }
            i4 = this.f22862public;
            zArr = this.f22841case;
            i5 = i2;
            if (i4 == 8) {
                arrayList = this.f22847else;
                size = arrayList.size();
                i6 = i3;
                i29 = i;
                while (true) {
                    if (i29 < size) {
                        if (!zArr[i] || zArr[1]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i32 = size;
                    hashSet2 = ((C14946l) arrayList.get(i29)).yandex;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i29++;
                    size = i32;
                }
            } else {
                i6 = i3;
            }
            z2 = this.firebase;
            if (z2 || this.smaato) {
                if (z2) {
                    c4847l2.amazon(c4657lFirebase, this.f22846default);
                    c4847l2.amazon(c4657lFirebase2, this.f22846default + this.f22845continue);
                    if (i6 != 0 && (c11338l2 = this.f22866switch) != null) {
                        c10664l2 = (C10664l) c11338l2;
                        weakReference3 = c10664l2.f21638l;
                        if (weakReference3 != null || weakReference3.get() == null || c14946l5.crashlytics() > ((C14946l) c10664l2.f21638l.get()).crashlytics()) {
                            c10664l2.f21638l = new WeakReference(c14946l5);
                        }
                        weakReference4 = c10664l2.f21647l;
                        if (weakReference4 != null || weakReference4.get() == null || c14946l6.crashlytics() > ((C14946l) c10664l2.f21647l.get()).crashlytics()) {
                            c10664l2.f21647l = new WeakReference(c14946l6);
                        }
                    }
                }
                if (this.smaato) {
                    c4847l2.amazon(c4657lFirebase3, this.f22849final);
                    c4847l2.amazon(c4657lFirebase4, this.f22849final + this.f22843class);
                    hashSet = c14946l9.yandex;
                    if (hashSet != null && hashSet.size() > 0) {
                        c4847l2.amazon(c4657lFirebase5, this.f22849final + this.f22858new);
                    }
                    if (i5 != 0 && (c11338l = this.f22866switch) != null) {
                        c10664l = (C10664l) c11338l;
                        weakReference = c10664l.f21642l;
                        if (weakReference != null || weakReference.get() == null || c14946l7.crashlytics() > ((C14946l) c10664l.f21642l.get()).crashlytics()) {
                            c10664l.f21642l = new WeakReference(c14946l7);
                        }
                        weakReference2 = c10664l.f21646l;
                        if (weakReference2 != null || weakReference2.get() == null || c14946l8.crashlytics() > ((C14946l) c10664l.f21646l.get()).crashlytics()) {
                            c10664l.f21646l = new WeakReference(c14946l8);
                        }
                    }
                }
                if (this.firebase && this.smaato) {
                    ?? r12 = i;
                    this.firebase = r12;
                    this.smaato = r12;
                    return;
                }
            }
            zArr2 = this.billing;
            if (z || (c8431l2 = this.amazon) == null || (c3490l2 = this.purchase) == null) {
                c14946l = c14946l9;
                zArr3 = zArr2;
            } else {
                c14946l = c14946l9;
                C7265l c7265l = c8431l2.admob;
                zArr3 = zArr2;
                if (c7265l.isPro && c8431l2.subs.isPro && c3490l2.admob.isPro && c3490l2.subs.isPro) {
                    c4847l2.amazon(c4657lFirebase, c7265l.mopub);
                    c4847l2.amazon(c4657lFirebase2, this.amazon.subs.mopub);
                    c4847l2.amazon(c4657lFirebase3, this.purchase.admob.mopub);
                    c4847l2.amazon(c4657lFirebase4, this.purchase.subs.mopub);
                    c4847l2.amazon(c4657lFirebase5, this.purchase.firebase.mopub);
                    if (this.f22866switch == null) {
                        z13 = false;
                    } else {
                        if (i6 != 0 && zArr3[0] && !license()) {
                            c4847l2.billing(c4847l2.firebase(this.f22866switch.f22873volatile), c4657lFirebase2, 0, 8);
                        }
                        if (i5 == 0 || !zArr3[1] || pro()) {
                            z13 = false;
                        } else {
                            z13 = false;
                            c4847l2.billing(c4847l2.firebase(this.f22866switch.f22857native), c4657lFirebase4, 0, 8);
                        }
                    }
                    this.firebase = z13;
                    this.smaato = z13;
                    return;
                }
            }
            if (this.f22866switch != null) {
                if (Signature(0)) {
                    ((C10664l) this.f22866switch).m2939for(this, 0);
                    zLicense = true;
                    i28 = 1;
                } else {
                    zLicense = license();
                    i28 = 1;
                }
                if (Signature(i28)) {
                    ((C10664l) this.f22866switch).m2939for(this, i28);
                    zPro = true;
                } else {
                    zPro = pro();
                }
                if (zLicense && i6 != 0 && this.f22862public != 8 && c14946l5.billing == null && c14946l6.billing == null) {
                    c4847l2.billing(c4847l2.firebase(this.f22866switch.f22873volatile), c4657lFirebase2, 0, 1);
                }
                if (!zPro && i5 != 0 && this.f22862public != 8 && c14946l7.billing == null && c14946l8.billing == null && c14946l == null) {
                    c4847l2.billing(c4847l2.firebase(this.f22866switch.f22857native), c4657lFirebase4, 0, 1);
                }
                z4 = zPro;
                z3 = zLicense;
            } else {
                c14946l5 = c14946l5;
                z3 = false;
                z4 = false;
            }
            i7 = this.f22845continue;
            i8 = this.f22852goto;
            if (i7 >= i8) {
                i8 = i7;
            }
            i9 = this.f22843class;
            i10 = this.f22865super;
            if (i9 < i10) {
                i11 = i10;
            } else {
                i11 = i9;
            }
            iArr = this.f22844const;
            i12 = iArr[0];
            if (i12 != 3) {
                z5 = true;
            } else {
                z5 = false;
            }
            i13 = iArr[1];
            if (i13 != 3) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i33 = this.f22863static;
            this.signatures = i33;
            f = this.f22856interface;
            this.premium = f;
            i14 = this.ads;
            i15 = this.subscription;
            if (f > 0.0f) {
                c14946l2 = c14946l8;
                if (this.f22862public != 8) {
                    if (i12 == 3 || i14 != 0) {
                        i17 = i14;
                    } else {
                        i17 = 3;
                    }
                    if (i13 == 3 || i15 != 0) {
                        i27 = i15;
                    } else {
                        i27 = 3;
                    }
                    if (i12 == 3 || i13 != 3 || i17 != 3 || i27 != 3) {
                        if (i12 != 3 && i17 == 3) {
                            this.signatures = 0;
                            i8 = (int) (f * i9);
                            if (i13 != 3) {
                                c14946l = c14946l;
                                i16 = i11;
                                i17 = 4;
                                z7 = false;
                            }
                            i18 = i27;
                            int[] iArr3 = this.tapsense;
                            iArr3[0] = i17;
                            iArr3[1] = i18;
                            if (z7) {
                                int i34 = this.signatures;
                                i19 = -1;
                                if (i34 != 0) {
                                }
                                if (z7) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                if (iArr[0] == 2) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                if (z9) {
                                    i8 = 0;
                                }
                                c14946l3 = this.f22869throw;
                                boolean z14 = !c14946l3.billing();
                                char c = '\b';
                                boolean z15 = zArr[0];
                                boolean z16 = zArr[1];
                                i20 = this.metrica;
                                int[] iArr4 = this.applovin;
                                if (i20 != 2) {
                                    c14946l4 = c14946l;
                                    c4657l = c4657lFirebase;
                                    c4657l2 = c4657lFirebase2;
                                    c4657l3 = c4657lFirebase5;
                                    z10 = z3;
                                    r3 = i6;
                                    r4 = i5;
                                    i21 = i17;
                                } else {
                                    c14946l4 = c14946l;
                                    c4657l = c4657lFirebase;
                                    c4657l2 = c4657lFirebase2;
                                    c4657l3 = c4657lFirebase5;
                                    z10 = z3;
                                    r3 = i6;
                                    r4 = i5;
                                    i21 = i17;
                                }
                                if (z) {
                                    c4657l4 = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x058a: MOVE (r5v1 'c4657l4' l￘ﾗ￘ﾕￛﾨ) = (r33v0 l￘ﾗ￘ﾕￛﾨ) (LINE:1419) in method: l￙ﾏￛﾜ￘ﾒ.loadAd(l￘ﾗ￙ﾑￛﾙ, boolean):void, file: classes.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                        	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r33v0 l￘ﾗ￘ﾕￛﾨ
                                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                        */
                                    /*
                                        Method dump skipped, instruction units count: 1910
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.C11338l.loadAd(lّؗۙ, boolean):void");
                                }

                                public final int metrica() {
                                    if (this.f22862public == 8) {
                                        return 0;
                                    }
                                    return this.f22845continue;
                                }

                                public C14946l mopub(int i) {
                                    switch (AbstractC5020l.inmobi(i)) {
                                        case 0:
                                            return null;
                                        case 1:
                                            return this.f22867synchronized;
                                        case 2:
                                            return this.f22864strictfp;
                                        case 3:
                                            return this.f22873volatile;
                                        case 4:
                                            return this.f22857native;
                                        case 5:
                                            return this.f22860private;
                                        case 6:
                                            return this.f22869throw;
                                        case 7:
                                            return this.f22848extends;
                                        case 8:
                                            return this.f22851for;
                                        default:
                                            C8339l.subs(AbstractC11043l.tapsense(i));
                                            return null;
                                    }
                                }

                                /* JADX INFO: renamed from: native, reason: not valid java name */
                                public final void m3059native(int i) {
                                    this.f22845continue = i;
                                    int i2 = this.f22852goto;
                                    if (i < i2) {
                                        this.f22845continue = i2;
                                    }
                                }

                                /* JADX INFO: renamed from: package, reason: not valid java name */
                                public final void m3060package(int i, int i2) {
                                    if (this.smaato) {
                                        return;
                                    }
                                    this.f22864strictfp.subs(i);
                                    this.f22857native.subs(i2);
                                    this.f22849final = i;
                                    this.f22843class = i2 - i;
                                    if (this.inmobi) {
                                        this.f22860private.subs(i + this.f22858new);
                                    }
                                    this.smaato = true;
                                }

                                public final void premium() {
                                    this.firebase = false;
                                    this.smaato = false;
                                    this.remoteconfig = false;
                                    this.vip = false;
                                    ArrayList arrayList = this.f22847else;
                                    int size = arrayList.size();
                                    for (int i = 0; i < size; i++) {
                                        C14946l c14946l = (C14946l) arrayList.get(i);
                                        c14946l.crashlytics = false;
                                        c14946l.loadAd = 0;
                                    }
                                }

                                /* JADX INFO: renamed from: private */
                                public void mo2940private(boolean z, boolean z2) {
                                    int i;
                                    int i2;
                                    C8431l c8431l = this.amazon;
                                    boolean z3 = z & c8431l.mopub;
                                    C3490l c3490l = this.purchase;
                                    boolean z4 = z2 & c3490l.mopub;
                                    int i3 = c8431l.admob.mopub;
                                    int i4 = c3490l.admob.mopub;
                                    int i5 = c8431l.subs.mopub;
                                    int i6 = c3490l.subs.mopub;
                                    int i7 = i6 - i4;
                                    if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
                                        i5 = 0;
                                        i6 = 0;
                                        i3 = 0;
                                        i4 = 0;
                                    }
                                    int i8 = i5 - i3;
                                    int i9 = i6 - i4;
                                    if (z3) {
                                        this.f22846default = i3;
                                    }
                                    if (z4) {
                                        this.f22849final = i4;
                                    }
                                    if (this.f22862public == 8) {
                                        this.f22845continue = 0;
                                        this.f22843class = 0;
                                        return;
                                    }
                                    int[] iArr = this.f22844const;
                                    if (z3) {
                                        if (iArr[0] == 1 && i8 < (i2 = this.f22845continue)) {
                                            i8 = i2;
                                        }
                                        this.f22845continue = i8;
                                        int i10 = this.f22852goto;
                                        if (i8 < i10) {
                                            this.f22845continue = i10;
                                        }
                                    }
                                    if (z4) {
                                        if (iArr[1] == 1 && i9 < (i = this.f22843class)) {
                                            i9 = i;
                                        }
                                        this.f22843class = i9;
                                        int i11 = this.f22865super;
                                        if (i9 < i11) {
                                            this.f22843class = i11;
                                        }
                                    }
                                }

                                public final boolean pro() {
                                    C14946l c14946l = this.f22864strictfp;
                                    C14946l c14946l2 = c14946l.billing;
                                    if (c14946l2 != null && c14946l2.billing == c14946l) {
                                        return true;
                                    }
                                    C14946l c14946l3 = this.f22857native;
                                    C14946l c14946l4 = c14946l3.billing;
                                    return c14946l4 != null && c14946l4.billing == c14946l3;
                                }

                                public final void purchase(C4847l c4847l) {
                                    c4847l.firebase(this.f22867synchronized);
                                    c4847l.firebase(this.f22864strictfp);
                                    c4847l.firebase(this.f22873volatile);
                                    c4847l.firebase(this.f22857native);
                                    if (this.f22858new > 0) {
                                        c4847l.firebase(this.f22860private);
                                    }
                                }

                                public void signatures() {
                                    this.f22867synchronized.mopub();
                                    this.f22864strictfp.mopub();
                                    this.f22873volatile.mopub();
                                    this.f22857native.mopub();
                                    this.f22860private.mopub();
                                    this.f22848extends.mopub();
                                    this.f22851for.mopub();
                                    this.f22869throw.mopub();
                                    this.f22866switch = null;
                                    this.appmetrica = Float.NaN;
                                    this.f22845continue = 0;
                                    this.f22843class = 0;
                                    this.f22856interface = 0.0f;
                                    this.f22863static = -1;
                                    this.f22846default = 0;
                                    this.f22849final = 0;
                                    this.f22858new = 0;
                                    this.f22852goto = 0;
                                    this.f22865super = 0;
                                    this.f22854import = 0.5f;
                                    this.f22839abstract = 0.5f;
                                    int[] iArr = this.f22844const;
                                    iArr[0] = 1;
                                    iArr[1] = 1;
                                    this.f22855instanceof = null;
                                    this.f22862public = 0;
                                    this.f22868this = 0;
                                    this.f22872try = 0;
                                    float[] fArr = this.f22840break;
                                    fArr[0] = -1.0f;
                                    fArr[1] = -1.0f;
                                    this.metrica = -1;
                                    this.startapp = -1;
                                    int[] iArr2 = this.applovin;
                                    iArr2[0] = Integer.MAX_VALUE;
                                    iArr2[1] = Integer.MAX_VALUE;
                                    this.ads = 0;
                                    this.subscription = 0;
                                    this.pro = 1.0f;
                                    this.isVip = 1.0f;
                                    this.license = Alert.DURATION_SHOW_INDEFINITELY;
                                    this.advert = Alert.DURATION_SHOW_INDEFINITELY;
                                    this.Signature = 0;
                                    this.ad = 0;
                                    this.signatures = -1;
                                    this.premium = 1.0f;
                                    boolean[] zArr = this.billing;
                                    zArr[0] = true;
                                    zArr[1] = true;
                                    boolean[] zArr2 = this.f22841case;
                                    zArr2[0] = false;
                                    zArr2[1] = false;
                                    this.mopub = true;
                                    int[] iArr3 = this.tapsense;
                                    iArr3[0] = 0;
                                    iArr3[1] = 0;
                                    this.admob = -1;
                                    this.subs = -1;
                                }

                                public void smaato(StringBuilder sb) {
                                    sb.append("  " + this.isPro + ":{\n");
                                    StringBuilder sb2 = new StringBuilder("    actualWidth:");
                                    sb2.append(this.f22845continue);
                                    sb.append(sb2.toString());
                                    sb.append("\n");
                                    sb.append("    actualHeight:" + this.f22843class);
                                    sb.append("\n");
                                    sb.append("    actualLeft:" + this.f22846default);
                                    sb.append("\n");
                                    sb.append("    actualTop:" + this.f22849final);
                                    sb.append("\n");
                                    vip(sb, "left", this.f22867synchronized);
                                    vip(sb, "top", this.f22864strictfp);
                                    vip(sb, "right", this.f22873volatile);
                                    vip(sb, "bottom", this.f22857native);
                                    vip(sb, "baseline", this.f22860private);
                                    vip(sb, "centerX", this.f22848extends);
                                    vip(sb, "centerY", this.f22851for);
                                    int i = this.f22845continue;
                                    int i2 = this.f22852goto;
                                    int[] iArr = this.applovin;
                                    int i3 = iArr[0];
                                    int i4 = this.Signature;
                                    int i5 = this.ads;
                                    float f = this.pro;
                                    int[] iArr2 = this.f22844const;
                                    int i6 = iArr2[0];
                                    float[] fArr = this.f22840break;
                                    float f2 = fArr[0];
                                    remoteconfig(sb, "    width", i, i2, i3, i4, i5, f, i6);
                                    int i7 = this.f22843class;
                                    int i8 = this.f22865super;
                                    int i9 = iArr[1];
                                    int i10 = this.ad;
                                    int i11 = this.subscription;
                                    float f3 = this.isVip;
                                    int i12 = iArr2[1];
                                    float f4 = fArr[1];
                                    remoteconfig(sb, "    height", i7, i8, i9, i10, i11, f3, i12);
                                    float f5 = this.f22856interface;
                                    int i13 = this.f22863static;
                                    if (f5 != 0.0f) {
                                        sb.append("    dimensionRatio");
                                        sb.append(" :  [");
                                        sb.append(f5);
                                        sb.append(",");
                                        sb.append(i13);
                                        sb.append("");
                                        sb.append("],\n");
                                    }
                                    inmobi(sb, "    horizontalBias", this.f22854import, 0.5f);
                                    inmobi(sb, "    verticalBias", this.f22839abstract, 0.5f);
                                    appmetrica(this.f22868this, 0, "    horizontalChainStyle", sb);
                                    appmetrica(this.f22872try, 0, "    verticalChainStyle", sb);
                                    sb.append("  }");
                                }

                                public final int startapp() {
                                    C11338l c11338l = this.f22866switch;
                                    return (c11338l == null || !(c11338l instanceof C10664l)) ? this.f22846default : ((C10664l) c11338l).f21651l + this.f22846default;
                                }

                                /* JADX INFO: renamed from: strictfp, reason: not valid java name */
                                public final void m3061strictfp(int i) {
                                    this.f22844const[0] = i;
                                }

                                public final int subs() {
                                    if (this.f22862public == 8) {
                                        return 0;
                                    }
                                    return this.f22843class;
                                }

                                public final boolean subscription(int i, int i2) {
                                    C14946l c14946l;
                                    C14946l c14946l2;
                                    C14946l c14946l3;
                                    C14946l c14946l4;
                                    if (i == 0) {
                                        C14946l c14946l5 = this.f22867synchronized;
                                        C14946l c14946l6 = c14946l5.billing;
                                        if (c14946l6 == null || !c14946l6.crashlytics || (c14946l4 = (c14946l3 = this.f22873volatile).billing) == null || !c14946l4.crashlytics) {
                                            return false;
                                        }
                                        return (c14946l4.crashlytics() - c14946l3.amazon()) - (c14946l5.amazon() + c14946l5.billing.crashlytics()) >= i2;
                                    }
                                    C14946l c14946l7 = this.f22864strictfp;
                                    C14946l c14946l8 = c14946l7.billing;
                                    if (c14946l8 == null || !c14946l8.crashlytics || (c14946l2 = (c14946l = this.f22857native).billing) == null || !c14946l2.crashlytics) {
                                        return false;
                                    }
                                    return (c14946l2.crashlytics() - c14946l.amazon()) - (c14946l7.amazon() + c14946l7.billing.crashlytics()) >= i2;
                                }

                                /* JADX INFO: renamed from: synchronized, reason: not valid java name */
                                public final void m3062synchronized(int i) {
                                    this.f22843class = i;
                                    int i2 = this.f22865super;
                                    if (i < i2) {
                                        this.f22843class = i2;
                                    }
                                }

                                public final void tapsense(int i, int i2, int i3, int i4, C11338l c11338l) {
                                    mopub(i).yandex(c11338l.mopub(i2), i3, i4);
                                }

                                /* JADX INFO: renamed from: throws, reason: not valid java name */
                                public final void m3063throws(int i, int i2) {
                                    if (this.firebase) {
                                        return;
                                    }
                                    this.f22867synchronized.subs(i);
                                    this.f22873volatile.subs(i2);
                                    this.f22846default = i;
                                    this.f22845continue = i2 - i;
                                    this.firebase = true;
                                }

                                public String toString() {
                                    StringBuilder sbAd = AbstractC5020l.ad("");
                                    sbAd.append(this.f22850finally != null ? AbstractC0653l.ads(new StringBuilder("id: "), this.f22850finally, " ") : "");
                                    sbAd.append("(");
                                    sbAd.append(this.f22846default);
                                    sbAd.append(", ");
                                    sbAd.append(this.f22849final);
                                    sbAd.append(") - (");
                                    sbAd.append(this.f22845continue);
                                    sbAd.append(" x ");
                                    return AbstractC14814l.remoteconfig(this.f22843class, ")", sbAd);
                                }

                                /* JADX INFO: renamed from: volatile, reason: not valid java name */
                                public final void m3064volatile(int i) {
                                    this.f22844const[1] = i;
                                }

                                public final void yandex(C10664l c10664l, C4847l c4847l, HashSet hashSet, int i, boolean z) {
                                    if (z) {
                                        if (!hashSet.contains(this)) {
                                            return;
                                        }
                                        AbstractC15096l.crashlytics(c10664l, c4847l, this);
                                        hashSet.remove(this);
                                        loadAd(c4847l, c10664l.m2941switch(64));
                                    }
                                    if (i == 0) {
                                        HashSet hashSet2 = this.f22867synchronized.yandex;
                                        if (hashSet2 != null) {
                                            Iterator it = hashSet2.iterator();
                                            while (it.hasNext()) {
                                                ((C14946l) it.next()).amazon.yandex(c10664l, c4847l, hashSet, i, true);
                                            }
                                        }
                                        HashSet hashSet3 = this.f22873volatile.yandex;
                                        if (hashSet3 != null) {
                                            Iterator it2 = hashSet3.iterator();
                                            while (it2.hasNext()) {
                                                ((C14946l) it2.next()).amazon.yandex(c10664l, c4847l, hashSet, i, true);
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    HashSet hashSet4 = this.f22864strictfp.yandex;
                                    if (hashSet4 != null) {
                                        Iterator it3 = hashSet4.iterator();
                                        while (it3.hasNext()) {
                                            ((C14946l) it3.next()).amazon.yandex(c10664l, c4847l, hashSet, i, true);
                                        }
                                    }
                                    HashSet hashSet5 = this.f22857native.yandex;
                                    if (hashSet5 != null) {
                                        Iterator it4 = hashSet5.iterator();
                                        while (it4.hasNext()) {
                                            ((C14946l) it4.next()).amazon.yandex(c10664l, c4847l, hashSet, i, true);
                                        }
                                    }
                                    HashSet hashSet6 = this.f22860private.yandex;
                                    if (hashSet6 != null) {
                                        Iterator it5 = hashSet6.iterator();
                                        while (it5.hasNext()) {
                                            ((C14946l) it5.next()).amazon.yandex(c10664l, c4847l, hashSet, i, true);
                                        }
                                    }
                                }
                            }
