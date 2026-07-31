package defpackage;

import android.view.ViewGroup;

/* JADX INFO: renamed from: lٌۣٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8950l extends ViewGroup.MarginLayoutParams {
    public int Signature;

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public boolean f18429abstract;
    public int ad;
    public int adcel;
    public int admob;
    public float ads;
    public int advert;
    public boolean amazon;
    public int applovin;
    public int appmetrica;
    public int billing;

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public int f18430break;

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public float f18431case;

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public int f18432catch;

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public int f18433class;

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public float f18434const;

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public int f18435continue;
    public float crashlytics;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public boolean f18436default;

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public int f18437else;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public int f18438extends;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public String f18439final;

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public int f18440finally;
    public int firebase;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public int f18441for;

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public boolean f18442goto;

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public int f18443implements;

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public boolean f18444import;
    public float inmobi;

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public boolean f18445instanceof;

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public int f18446interface;
    public int isPro;
    public int isVip;
    public int license;
    public int loadAd;
    public int metrica;
    public int mopub;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public int f18447native;

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public int f18448new;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public String f18449package;
    public int premium;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public int f18450private;
    public int pro;

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public float f18451protected;

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public int f18452public;
    public int purchase;
    public int remoteconfig;

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public C11338l f18453return;
    public int signatures;
    public int smaato;
    public int startapp;

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public boolean f18454static;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public float f18455strictfp;
    public int subs;
    public int subscription;

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public boolean f18456super;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public float f18457switch;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public float f18458synchronized;
    public int tapsense;

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public int f18459this;

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public int f18460throw;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public float f18461throws;

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public int f18462transient;

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public int f18463try;
    public int vip;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public int f18464volatile;

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public int f18465while;
    public int yandex;

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z = false;
        boolean z2 = 1 == getLayoutDirection();
        this.f18459this = -1;
        this.f18463try = -1;
        this.f18452public = -1;
        this.f18440finally = -1;
        this.f18430break = this.pro;
        this.f18462transient = this.advert;
        float f = this.inmobi;
        this.f18451protected = f;
        int i8 = this.yandex;
        this.f18465while = i8;
        int i9 = this.loadAd;
        this.f18443implements = i9;
        float f2 = this.crashlytics;
        this.f18434const = f2;
        int i10 = this.subscription;
        if (z2) {
            if (i10 != -1) {
                this.f18459this = i10;
            } else {
                int i11 = this.tapsense;
                if (i11 != -1) {
                    this.f18463try = i11;
                } else {
                    i2 = this.Signature;
                    if (i2 != -1) {
                        this.f18440finally = i2;
                        z = true;
                    }
                    i3 = this.license;
                    if (i3 != -1) {
                        this.f18452public = i3;
                        z = true;
                    }
                    i4 = this.signatures;
                    if (i4 != Integer.MIN_VALUE) {
                        this.f18462transient = i4;
                    }
                    i5 = this.premium;
                    if (i5 != Integer.MIN_VALUE) {
                        this.f18430break = i5;
                    }
                    if (z) {
                        this.f18451protected = 1.0f - f;
                    }
                    if (this.f18429abstract && this.f18446interface == 1 && this.amazon) {
                        if (f2 != -1.0f) {
                            this.f18434const = 1.0f - f2;
                            this.f18465while = -1;
                            this.f18443implements = -1;
                        } else if (i8 != -1) {
                            this.f18443implements = i8;
                            this.f18465while = -1;
                            this.f18434const = -1.0f;
                        } else if (i9 != -1) {
                            this.f18465while = i9;
                            this.f18443implements = -1;
                            this.f18434const = -1.0f;
                        }
                    }
                }
            }
            z = true;
            i2 = this.Signature;
            if (i2 != -1) {
                this.f18440finally = i2;
                z = true;
            }
            i3 = this.license;
            if (i3 != -1) {
                this.f18452public = i3;
                z = true;
            }
            i4 = this.signatures;
            if (i4 != Integer.MIN_VALUE) {
                this.f18462transient = i4;
            }
            i5 = this.premium;
            if (i5 != Integer.MIN_VALUE) {
                this.f18430break = i5;
            }
            if (z) {
                this.f18451protected = 1.0f - f;
            }
            if (this.f18429abstract) {
                if (f2 != -1.0f) {
                    this.f18434const = 1.0f - f2;
                    this.f18465while = -1;
                    this.f18443implements = -1;
                } else if (i8 != -1) {
                    this.f18443implements = i8;
                    this.f18465while = -1;
                    this.f18434const = -1.0f;
                } else if (i9 != -1) {
                    this.f18465while = i9;
                    this.f18443implements = -1;
                    this.f18434const = -1.0f;
                }
            }
        } else {
            if (i10 != -1) {
                this.f18440finally = i10;
            }
            int i12 = this.tapsense;
            if (i12 != -1) {
                this.f18452public = i12;
            }
            int i13 = this.Signature;
            if (i13 != -1) {
                this.f18459this = i13;
            }
            int i14 = this.license;
            if (i14 != -1) {
                this.f18463try = i14;
            }
            int i15 = this.signatures;
            if (i15 != Integer.MIN_VALUE) {
                this.f18430break = i15;
            }
            int i16 = this.premium;
            if (i16 != Integer.MIN_VALUE) {
                this.f18462transient = i16;
            }
        }
        if (this.Signature == -1 && this.license == -1 && this.tapsense == -1 && i10 == -1) {
            int i17 = this.mopub;
            if (i17 != -1) {
                this.f18459this = i17;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i18 = this.admob;
                if (i18 != -1) {
                    this.f18463try = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i19 = this.purchase;
            if (i19 != -1) {
                this.f18452public = i19;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i20 = this.billing;
            if (i20 != -1) {
                this.f18440finally = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }

    public final void yandex() {
        this.f18429abstract = false;
        this.f18442goto = true;
        this.f18456super = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f18454static) {
            this.f18442goto = false;
            if (this.f18450private == 0) {
                this.f18450private = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f18436default) {
            this.f18456super = false;
            if (this.f18438extends == 0) {
                this.f18438extends = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f18442goto = false;
            if (i == 0 && this.f18450private == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f18454static = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f18456super = false;
            if (i2 == 0 && this.f18438extends == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f18436default = true;
            }
        }
        if (this.crashlytics == -1.0f && this.yandex == -1 && this.loadAd == -1) {
            return;
        }
        this.f18429abstract = true;
        this.f18442goto = true;
        this.f18456super = true;
        if (!(this.f18453return instanceof C10526l)) {
            this.f18453return = new C10526l();
        }
        ((C10526l) this.f18453return).m2930throw(this.f18446interface);
    }
}
