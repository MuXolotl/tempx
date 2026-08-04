package defpackage;

import android.content.ClipDescription;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِۤؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12217l {
    public final C10086l Signature;
    public C12951l ad;
    public InterfaceC7948l admob;
    public final C8610l advert;
    public boolean amazon;
    public final InterfaceC2262l billing;
    public InterfaceC13490l crashlytics;
    public InterfaceC1234l firebase;
    public boolean isPro;
    public final C6921l isVip;
    public C2159l license;
    public final C10312l loadAd;
    public final InterfaceC13515l mopub;
    public int pro;
    public final C10715l purchase;
    public Function0 remoteconfig;
    public boolean subs;
    public final C10086l subscription;
    public final C10086l tapsense;
    public Function0 vip;
    public final C16328l yandex;
    public final C10086l smaato = AbstractC8020l.smaato(Boolean.TRUE);
    public final C10086l metrica = AbstractC8020l.smaato(new C1187l(9205357640488583168L));
    public final C10086l startapp = AbstractC8020l.smaato(new C1187l(9205357640488583168L));
    public final C10086l adcel = AbstractC8020l.smaato(null);
    public final C10086l ads = AbstractC8020l.smaato(EnumC11107l.f22312l);

    public C12217l(C16328l c16328l, C10312l c10312l, InterfaceC13490l interfaceC13490l, boolean z, boolean z2, C10715l c10715l, InterfaceC2262l interfaceC2262l, InterfaceC13515l interfaceC13515l, InterfaceC7948l interfaceC7948l) {
        this.yandex = c16328l;
        this.loadAd = c10312l;
        this.crashlytics = interfaceC13490l;
        this.amazon = z2;
        this.purchase = c10715l;
        this.billing = interfaceC2262l;
        this.mopub = interfaceC13515l;
        this.admob = interfaceC7948l;
        this.isPro = z;
        Boolean bool = Boolean.FALSE;
        this.subscription = AbstractC8020l.smaato(bool);
        this.tapsense = AbstractC8020l.smaato(EnumC6775l.f14201l);
        this.Signature = AbstractC8020l.smaato(bool);
        this.pro = -1;
        this.advert = AbstractC8020l.mopub(new C18497l(this, 3));
        this.isVip = new C6921l(2, this.admob);
    }

    public static final void admob(C17078l c17078l, C17078l c17078l2, C12217l c12217l) {
        if ((c17078l.f33243l & 9223372034707292159L) != 9205357640488583168L) {
            c12217l.amazon();
            c17078l.f33243l = 9205357640488583168L;
            c17078l2.f33243l = 0L;
            c12217l.pro = -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00be  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object loadAd(C12217l c12217l, InterfaceC6843l interfaceC6843l, boolean z, AbstractC0283l abstractC0283l) throws Throwable {
        C11490l c11490l;
        C17078l c17078l;
        C17078l c17078l2;
        EnumC1826l enumC1826l;
        C17078l c17078l3;
        C17078l c17078l4;
        C17078l c17078l5;
        if (abstractC0283l instanceof C11490l) {
            c11490l = (C11490l) abstractC0283l;
            int i = c11490l.f23102l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11490l.f23102l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11490l = new C11490l(c12217l, abstractC0283l);
            }
        } else {
            c11490l = new C11490l(c12217l, abstractC0283l);
        }
        C11490l c11490l2 = c11490l;
        Object obj = c11490l2.f23098l;
        int i2 = c11490l2.f23102l;
        if (i2 != 0) {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            enumC1826l = c11490l2.f23103l;
            c17078l3 = c11490l2.f23100l;
            c17078l = c11490l2.f23101l;
            try {
                AbstractC2829l.crashlytics(obj);
                if (c12217l.smaato() == enumC1826l) {
                    admob(c17078l, c17078l3, c12217l);
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                if (c12217l.smaato() == enumC1826l) {
                    admob(c17078l, c17078l3, c12217l);
                }
                throw th;
            }
        }
        AbstractC2829l.crashlytics(obj);
        c17078l = new C17078l();
        c17078l.f33243l = 9205357640488583168L;
        C17078l c17078l6 = new C17078l();
        c17078l6.f33243l = 0L;
        EnumC1826l enumC1826l2 = z ? EnumC1826l.f4234l : EnumC1826l.f4233l;
        try {
            try {
                C18536l c18536l = new C18536l(3, c17078l, c12217l, enumC1826l2, c17078l6, z);
                enumC1826l2 = enumC1826l2;
                c17078l = c17078l;
                try {
                    C3471l c3471l = new C3471l(c17078l, c12217l, c17078l6, 3);
                    C3471l c3471l2 = new C3471l(c17078l, c12217l, c17078l6, 0);
                    c17078l6 = c17078l6;
                    C8076l c8076l = new C8076l(c17078l6, c12217l, enumC1826l2, c17078l, z);
                    c17078l5 = c17078l6;
                    enumC1826l = enumC1826l2;
                    c17078l4 = c17078l;
                    try {
                        c11490l2.f23101l = c17078l4;
                        c11490l2.f23100l = c17078l5;
                        c11490l2.f23103l = enumC1826l;
                        c11490l2.f23102l = 1;
                        Object objPurchase = AbstractC7289l.purchase(interfaceC6843l, c18536l, c3471l, c3471l2, c8076l, c11490l2);
                        EnumC9342l enumC9342l = EnumC9342l.f19165l;
                        if (objPurchase == enumC9342l) {
                            return enumC9342l;
                        }
                        c17078l3 = c17078l5;
                        c17078l = c17078l4;
                        if (c12217l.smaato() == enumC1826l) {
                            admob(c17078l, c17078l3, c12217l);
                        }
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        c17078l3 = c17078l5;
                        c17078l = c17078l4;
                        if (c12217l.smaato() == enumC1826l) {
                            admob(c17078l, c17078l3, c12217l);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    enumC1826l = enumC1826l2;
                    c17078l2 = c17078l6;
                    c17078l3 = c17078l2;
                    if (c12217l.smaato() == enumC1826l) {
                        admob(c17078l, c17078l3, c12217l);
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                c17078l4 = c17078l;
                enumC1826l = enumC1826l2;
                c17078l5 = c17078l6;
            }
        } catch (Throwable th5) {
            th = th5;
            c17078l2 = c17078l6;
            enumC1826l = enumC1826l2;
        }
    }

    public static final void mopub(C17078l c17078l, C17078l c17078l2, C12217l c12217l) {
        if ((c17078l.f33243l & 9223372034707292159L) != 9205357640488583168L) {
            c17078l.f33243l = 9205357640488583168L;
            c17078l2.f33243l = 9205357640488583168L;
            c12217l.amazon();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object yandex(C12217l c12217l, InterfaceC6843l interfaceC6843l, AbstractC0283l abstractC0283l) throws Throwable {
        C14918l c14918l;
        C17078l c17078l;
        Throwable th;
        C17078l c17078l2;
        if (abstractC0283l instanceof C14918l) {
            c14918l = (C14918l) abstractC0283l;
            int i = c14918l.f29366l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14918l.f29366l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14918l = new C14918l(c12217l, abstractC0283l);
            }
        } else {
            c14918l = new C14918l(c12217l, abstractC0283l);
        }
        C14918l c14918l2 = c14918l;
        Object obj = c14918l2.f29369l;
        int i2 = c14918l2.f29366l;
        if (i2 != 0) {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c17078l2 = c14918l2.f29367l;
            c17078l = c14918l2.f29368l;
            try {
                AbstractC2829l.crashlytics(obj);
                mopub(c17078l, c17078l2, c12217l);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                mopub(c17078l, c17078l2, c12217l);
                throw th;
            }
        }
        AbstractC2829l.crashlytics(obj);
        C17078l c17078l3 = new C17078l();
        c17078l3.f33243l = 9205357640488583168L;
        C17078l c17078l4 = new C17078l();
        c17078l4.f33243l = 9205357640488583168L;
        try {
            C6411l c6411l = new C6411l(c17078l3, c12217l, c17078l4, 14);
            C3471l c3471l = new C3471l(c17078l3, c17078l4, c12217l, 1);
            C3471l c3471l2 = new C3471l(c17078l3, c17078l4, c12217l, 2);
            C3411l c3411l = new C3411l(c17078l4, c12217l, c17078l3, 12);
            c14918l2.f29368l = c17078l3;
            c14918l2.f29367l = c17078l4;
            c14918l2.f29366l = 1;
            Object objPurchase = AbstractC7289l.purchase(interfaceC6843l, c6411l, c3471l, c3471l2, c3411l, c14918l2);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objPurchase == enumC9342l) {
                return enumC9342l;
            }
            c17078l = c17078l3;
            c17078l2 = c17078l4;
            mopub(c17078l, c17078l2, c12217l);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            c17078l = c17078l3;
            th = th3;
            c17078l2 = c17078l4;
            mopub(c17078l, c17078l2, c12217l);
            throw th;
        }
    }

    public final boolean Signature(long j) {
        int iMopub;
        int i;
        long j2;
        C0209l c0209l;
        C0327l c0327lCrashlytics = this.loadAd.crashlytics();
        if (c0327lCrashlytics != null && (iMopub = c0327lCrashlytics.loadAd.mopub(j)) != -1) {
            C16328l c16328l = this.yandex;
            C8610l c8610l = c16328l.amazon;
            C10086l c10086l = c16328l.purchase;
            C6644l c6644l = null;
            C16535l c16535l = (c8610l == null || (c0209l = (C0209l) c8610l.getValue()) == null) ? null : c0209l.loadAd;
            long jYandex = c16535l != null ? c16535l.yandex(iMopub, false) : AbstractC2296l.loadAd(iMopub, iMopub);
            long jBilling = c16328l.billing(jYandex);
            if (C12814l.amazon(jYandex) && C12814l.amazon(jBilling)) {
                i = 1;
            } else if (C12814l.amazon(jYandex) || C12814l.amazon(jBilling)) {
                i = (!C12814l.amazon(jYandex) || C12814l.amazon(jBilling)) ? 4 : 2;
            } else {
                i = 3;
            }
            int iInmobi = AbstractC5020l.inmobi(i);
            if (iInmobi == 0) {
                j2 = jYandex >> 32;
            } else {
                if (iInmobi == 1) {
                    C8896l c8896lCrashlytics = c0327lCrashlytics.crashlytics((int) (jBilling >> 32));
                    C8896l c8896lCrashlytics2 = c0327lCrashlytics.crashlytics((int) (jBilling & 4294967295L));
                    float fLoadAd = AbstractC11020l.loadAd(j, c8896lCrashlytics);
                    float fLoadAd2 = AbstractC11020l.loadAd(j, c8896lCrashlytics2);
                    c6644l = (fLoadAd != fLoadAd2 && fLoadAd < fLoadAd2) ? new C6644l(1, 1) : new C6644l(2, 2);
                } else if (iInmobi == 2) {
                    C8896l c8896lCrashlytics3 = c0327lCrashlytics.crashlytics((int) (jBilling >> 32));
                    C8896l c8896lCrashlytics4 = c0327lCrashlytics.crashlytics((int) (jBilling & 4294967295L));
                    float fLoadAd3 = AbstractC11020l.loadAd(j, c8896lCrashlytics3);
                    float fLoadAd4 = AbstractC11020l.loadAd(j, c8896lCrashlytics4);
                    if (fLoadAd3 == fLoadAd4 || fLoadAd3 >= fLoadAd4) {
                        j2 = jYandex & 4294967295L;
                    }
                } else if (iInmobi != 3) {
                    C18725l.billing();
                    return false;
                }
                j2 = jYandex >> 32;
            }
            int i2 = (int) j2;
            long jLoadAd = AbstractC2296l.loadAd(i2, i2);
            if (!C12814l.crashlytics(jLoadAd, c16328l.yandex.loadAd().f12061l) || (c6644l != null && !c6644l.equals((C6644l) c10086l.getValue()))) {
                c16328l.firebase(jLoadAd);
                if (c6644l != null) {
                    c10086l.setValue(c6644l);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ad(AbstractC0283l abstractC0283l) {
        C13759l c13759l;
        C4451l c4451l;
        C7504l c7504l;
        C4451l c4451l2;
        C7504l c7504l2;
        if (abstractC0283l instanceof C13759l) {
            c13759l = (C13759l) abstractC0283l;
            int i = c13759l.f26855l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13759l.f26855l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13759l = new C13759l(this, abstractC0283l);
            }
        } else {
            c13759l = new C13759l(this, abstractC0283l);
        }
        Object objAdmob = c13759l.f26854l;
        int i2 = c13759l.f26855l;
        C10715l c10715l = this.purchase;
        C10086l c10086l = this.tapsense;
        InterfaceC14029l interfaceC14029l = null;
        EnumC6775l enumC6775l = EnumC6775l.f14201l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objAdmob);
                C7864l c7864l = new C7864l(this, interfaceC14029l, 26);
                c13759l.f26855l = 1;
                objAdmob = AbstractC11990l.admob(c7864l, c13759l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objAdmob == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(objAdmob);
            }
            license(false);
            if (((EnumC6775l) c10086l.getValue()) != enumC6775l && (c4451l2 = c10715l.yandex) != null && (c7504l2 = c4451l2.f9058l) != null) {
                c7504l2.ads(null);
                c4451l2.f9058l = null;
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            license(false);
            if (((EnumC6775l) c10086l.getValue()) != enumC6775l && (c4451l = c10715l.yandex) != null && (c7504l = c4451l.f9058l) != null) {
                c7504l.ads(null);
                c4451l.f9058l = null;
            }
            throw th;
        }
    }

    public final InterfaceC18212l adcel() {
        InterfaceC18212l interfaceC18212lPurchase = this.loadAd.purchase();
        if (interfaceC18212lPurchase == null || !interfaceC18212lPurchase.mopub()) {
            return null;
        }
        return interfaceC18212lPurchase;
    }

    public final void ads() {
        InterfaceC13515l interfaceC13515l = this.mopub;
        if (interfaceC13515l == null) {
            return;
        }
        C16328l c16328l = this.yandex;
        CharSequence charSequence = c16328l.amazon().f12057l;
        long j = c16328l.amazon().f12061l;
        if (charSequence.length() <= 0 || C12814l.amazon(j)) {
            return;
        }
        AbstractC10999l.mopub(this.billing, null, 4, new C11287l(interfaceC13515l, charSequence, j, this, null, 8), 1);
    }

    public final Unit advert() {
        ClipDescription primaryClipDescription;
        C6921l c6921l = this.isVip;
        C8231l c8231l = (C8231l) ((InterfaceC7948l) c6921l.f14493l);
        boolean z = false;
        if (c8231l.yandex.yandex().hasPrimaryClip() && (primaryClipDescription = c8231l.yandex.yandex().getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType("text/*")) {
            z = true;
        }
        c6921l.f14494l = z;
        return Unit.INSTANCE;
    }

    public final void amazon() {
        this.adcel.setValue(null);
        this.startapp.setValue(new C1187l(9205357640488583168L));
        this.metrica.setValue(new C1187l(9205357640488583168L));
    }

    public final Unit billing(AbstractC5563l abstractC5563l) {
        C3625l c3625l;
        C16328l c16328l = this.yandex;
        if (C12814l.amazon(c16328l.amazon().f12061l) || !remoteconfig() || this.amazon) {
            c3625l = null;
        } else {
            C5667l c5667lAmazon = c16328l.amazon();
            c3625l = new C3625l(c5667lAmazon.f12057l.subSequence(C12814l.mopub(c5667lAmazon.f12061l), C12814l.billing(c5667lAmazon.f12061l)).toString());
            c16328l.crashlytics();
        }
        if (c3625l == null) {
            return Unit.INSTANCE;
        }
        Unit unitYandex = ((C8231l) this.admob).yandex(AbstractC3124l.amazon(c3625l));
        return unitYandex == EnumC9342l.f19165l ? unitYandex : Unit.INSTANCE;
    }

    public final C8896l crashlytics(C0327l c0327l, C5667l c5667l) {
        float f;
        if (!C12814l.amazon(c5667l.f12061l)) {
            return C8896l.purchase;
        }
        C8896l c8896lCrashlytics = c0327l.crashlytics((int) (c5667l.f12061l >> 32));
        float fFloor = (float) Math.floor(this.crashlytics.mo868instanceof(2.0f));
        if (fFloor < 1.0f) {
            fFloor = 1.0f;
        }
        if (c0327l.yandex.admob == EnumC9931l.f20223l) {
            f = (fFloor / 2.0f) + c8896lCrashlytics.yandex;
        } else {
            f = c8896lCrashlytics.crashlytics - (fFloor / 2.0f);
        }
        float f2 = fFloor / 2.0f;
        float f3 = ((int) (c0327l.crashlytics >> 32)) - f2;
        if (f > f3) {
            f = f3;
        }
        if (f < f2) {
            f = f2;
        }
        float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
        return new C8896l(fFloor2 - f2, c8896lCrashlytics.loadAd, fFloor2 + f2, c8896lCrashlytics.amazon);
    }

    public final C8896l firebase() {
        C0327l c0327lCrashlytics = this.loadAd.crashlytics();
        return c0327lCrashlytics == null ? C8896l.purchase : crashlytics(c0327lCrashlytics, this.yandex.amazon());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    public final C1348l isPro(boolean z) {
        C5667l c5667lAmazon = this.yandex.amazon();
        boolean zBooleanValue = ((Boolean) this.subscription.getValue()).booleanValue();
        boolean z2 = true;
        boolean z3 = ((EnumC11107l) this.ads.getValue()) == EnumC11107l.f22312l;
        EnumC1826l enumC1826lSmaato = smaato();
        if (!zBooleanValue || !z3 || !C12814l.amazon(c5667lAmazon.f12061l) || c5667lAmazon.f12062l != null || c5667lAmazon.f12057l.length() <= 0) {
            z2 = false;
        } else if (enumC1826lSmaato != EnumC1826l.f4235l) {
            AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
            Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
            AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
            try {
                long jCrashlytics = firebase().crashlytics();
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                InterfaceC18212l interfaceC18212lAdcel = adcel();
                if (!(interfaceC18212lAdcel != null ? AbstractC2044l.loadAd(jCrashlytics, AbstractC2044l.admob(interfaceC18212lAdcel)) : false)) {
                    z2 = false;
                }
            } catch (Throwable th) {
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                throw th;
            }
        }
        if (z2) {
            return new C1348l(true, z ? firebase().crashlytics() : 9205357640488583168L, 0.0f, 1, false);
        }
        return C1348l.billing;
    }

    public final void isVip(EnumC1826l enumC1826l, long j) {
        this.adcel.setValue(enumC1826l);
        this.startapp.setValue(new C1187l(j));
    }

    public final void license(boolean z) {
        this.subscription.setValue(Boolean.valueOf(z));
    }

    public final long metrica(boolean z) {
        long j;
        C0327l c0327lCrashlytics = this.loadAd.crashlytics();
        if (c0327lCrashlytics == null) {
            return 0L;
        }
        long j2 = this.yandex.amazon().f12061l;
        if (z) {
            int i = C12814l.crashlytics;
            j = j2 >> 32;
        } else {
            int i2 = C12814l.crashlytics;
            j = 4294967295L & j2;
        }
        return AbstractC8069l.amazon(c0327lCrashlytics, (int) j, z, C12814l.admob(j2));
    }

    public final void pro(EnumC6775l enumC6775l) {
        this.tapsense.setValue(enumC6775l);
    }

    public final Unit purchase(boolean z, AbstractC5563l abstractC5563l) {
        C3625l c3625l;
        C16328l c16328l = this.yandex;
        if (C12814l.amazon(c16328l.amazon().f12061l) || this.amazon) {
            c3625l = null;
        } else {
            C5667l c5667lAmazon = c16328l.amazon();
            c3625l = new C3625l(c5667lAmazon.f12057l.subSequence(C12814l.mopub(c5667lAmazon.f12061l), C12814l.billing(c5667lAmazon.f12061l)).toString());
            if (z) {
                c16328l.yandex();
            }
        }
        if (c3625l == null) {
            return Unit.INSTANCE;
        }
        Unit unitYandex = ((C8231l) this.admob).yandex(AbstractC3124l.amazon(c3625l));
        return unitYandex == EnumC9342l.f19165l ? unitYandex : Unit.INSTANCE;
    }

    public final boolean remoteconfig() {
        return this.isPro;
    }

    public final long signatures(C5667l c5667l, int i, int i2, boolean z, C11379l c11379l, boolean z2, boolean z3, C14797l c14797l) {
        long jLoadAd;
        InterfaceC1234l interfaceC1234l;
        long j = c5667l.f12061l;
        C12814l c12814l = new C12814l(j);
        if (z3 || (!z2 && C12814l.amazon(j))) {
            c12814l = null;
        }
        C0327l c0327lCrashlytics = this.loadAd.crashlytics();
        if (c0327lCrashlytics == null) {
            jLoadAd = C12814l.loadAd;
        } else if (c12814l == null && AbstractC8576l.yandex(c11379l, C1461l.f3664l)) {
            jLoadAd = AbstractC2296l.loadAd(i, i2);
        } else {
            C2159l c2159lLoadAd = AbstractC15450l.loadAd(c0327lCrashlytics, i, i2, this.pro, c12814l != null ? c12814l.yandex : C12814l.loadAd, c12814l == null, z);
            if (c12814l == null || c2159lLoadAd.remoteconfig(this.license)) {
                C3242l c3242lYandex = c11379l.yandex(c2159lLoadAd);
                jLoadAd = AbstractC2296l.loadAd(c3242lYandex.yandex.loadAd, c3242lYandex.loadAd.loadAd);
                this.license = c2159lLoadAd;
                this.pro = z ? i : i2;
            } else {
                jLoadAd = c12814l.yandex;
            }
        }
        if (c14797l != null && ((C12814l.mopub(jLoadAd) != C12814l.mopub(j) || C12814l.billing(jLoadAd) != C12814l.billing(j)) && (interfaceC1234l = this.firebase) != null)) {
            ((C9421l) interfaceC1234l).yandex(c14797l.yandex);
        }
        return jLoadAd;
    }

    public final EnumC1826l smaato() {
        return (EnumC1826l) this.adcel.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    public final C1348l startapp(boolean z, boolean z2) {
        boolean z3;
        EnumC1826l enumC1826l = z ? EnumC1826l.f4234l : EnumC1826l.f4233l;
        C0327l c0327lCrashlytics = this.loadAd.crashlytics();
        if (c0327lCrashlytics != null) {
            C16328l c16328l = this.yandex;
            long j = c16328l.amazon().f12061l;
            if (!C12814l.amazon(j)) {
                long jMetrica = metrica(z);
                if (((EnumC11107l) this.ads.getValue()) != EnumC11107l.f22312l) {
                    z3 = false;
                } else {
                    if (smaato() != enumC1826l) {
                        InterfaceC18212l interfaceC18212lAdcel = adcel();
                        if (!(interfaceC18212lAdcel != null ? AbstractC2044l.loadAd(jMetrica, AbstractC2044l.admob(interfaceC18212lAdcel)) : false)) {
                            z3 = false;
                        }
                    }
                    z3 = true;
                }
                if (z3) {
                    if (c16328l.amazon().f12062l == null) {
                        int iYandex = c0327lCrashlytics.yandex(z ? (int) (j >> 32) : Math.max(((int) (j & 4294967295L)) - 1, 0));
                        boolean zAdmob = C12814l.admob(j);
                        if (z2) {
                            InterfaceC18212l interfaceC18212lAdcel2 = adcel();
                            if (interfaceC18212lAdcel2 != null) {
                                jMetrica = AbstractC3700l.yandex(jMetrica, AbstractC2044l.admob(interfaceC18212lAdcel2));
                            }
                        } else {
                            jMetrica = 9205357640488583168L;
                        }
                        return new C1348l(true, jMetrica, AbstractC11184l.vip(c0327lCrashlytics, (int) (z ? j >> 32 : j & 4294967295L)), iYandex, zAdmob);
                    }
                }
            }
        }
        return C1348l.billing;
    }

    public final Object subs(InterfaceC6843l interfaceC6843l, AbstractC5563l abstractC5563l) {
        Object objM1556l = ((C4566l) interfaceC6843l).m1556l(new C2057l(this, null, 3), abstractC5563l);
        return objM1556l == EnumC9342l.f19165l ? objM1556l : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (tapsense(r0) == r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
    
        if (tapsense(r0) == r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object subscription(defpackage.AbstractC0283l r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C15275l
            if (r0 == 0) goto L13
            r0 = r7
            lۣٔٚ r0 = (defpackage.C15275l) r0
            int r1 = r0.f29876l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29876l = r1
            goto L18
        L13:
            lۣٔٚ r0 = new lۣٔٚ
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f29875l
            int r1 = r0.f29876l
            r2 = 0
            r3 = 1
            lٍؗؐ r4 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L51
            if (r1 == r3) goto L4d
            r3 = 2
            r5 = 3
            if (r1 == r3) goto L34
            if (r1 != r5) goto L2e
            defpackage.AbstractC2829l.crashlytics(r7)
            goto L44
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            return r2
        L34:
            defpackage.AbstractC2829l.crashlytics(r7)
            lِٔۢ r7 = (defpackage.C11848l) r7
            if (r7 != 0) goto L47
            r0.f29876l = r5
            java.lang.Object r6 = r6.tapsense(r0)
            if (r6 != r4) goto L44
            goto L6b
        L44:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L47:
            android.content.ClipData r6 = r7.yandex
            r6.getDescription()
            throw r2
        L4d:
            defpackage.AbstractC2829l.crashlytics(r7)
            goto L6c
        L51:
            defpackage.AbstractC2829l.crashlytics(r7)
            kotlin.jvm.functions.Function0 r7 = r6.vip
            if (r7 == 0) goto L63
            java.lang.Object r7 = r7.invoke()
            if (r7 != 0) goto L5f
            goto L63
        L5f:
            defpackage.C18725l.loadAd()
            return r2
        L63:
            r0.f29876l = r3
            java.lang.Object r6 = r6.tapsense(r0)
            if (r6 != r4) goto L6c
        L6b:
            return r4
        L6c:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12217l.subscription(lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        if (r8 == r6) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object tapsense(defpackage.AbstractC0283l r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.C13245l
            if (r0 == 0) goto L13
            r0 = r8
            lٍْؐ r0 = (defpackage.C13245l) r0
            int r1 = r0.f26020l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26020l = r1
            goto L18
        L13:
            lٍْؐ r0 = new lٍْؐ
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f26019l
            int r1 = r0.f26020l
            r2 = 0
            r3 = 0
            r4 = 2
            r5 = 1
            lٍؗؐ r6 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L36
            if (r1 == r5) goto L32
            if (r1 != r4) goto L2c
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L73
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r7)
            return r3
        L32:
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L56
        L36:
            defpackage.AbstractC2829l.crashlytics(r8)
            lًِ۠ r8 = r7.admob
            r0.f26020l = r5
            lًٍۙ r8 = (defpackage.C8231l) r8
            lؕۚۨ r8 = r8.yandex
            android.content.ClipboardManager r8 = r8.yandex()
            android.content.ClipData r8 = r8.getPrimaryClip()
            if (r8 == 0) goto L52
            lِٔۢ r1 = new lِٔۢ
            r1.<init>(r8)
            r8 = r1
            goto L53
        L52:
            r8 = r3
        L53:
            if (r8 != r6) goto L56
            goto L72
        L56:
            lِٔۢ r8 = (defpackage.C11848l) r8
            if (r8 == 0) goto L82
            r0.f26020l = r4
            android.content.ClipData r8 = r8.yandex
            android.content.ClipData$Item r8 = r8.getItemAt(r2)
            if (r8 == 0) goto L6f
            java.lang.CharSequence r8 = r8.getText()
            if (r8 == 0) goto L6f
            java.lang.String r8 = r8.toString()
            goto L70
        L6f:
            r8 = r3
        L70:
            if (r8 != r6) goto L73
        L72:
            return r6
        L73:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L78
            goto L82
        L78:
            lُٖۘ r7 = r7.yandex
            r0 = 10
            defpackage.C16328l.admob(r7, r8, r2, r0)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L82:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12217l.tapsense(lّؑۧ):java.lang.Object");
    }

    public final long vip() {
        C10086l c10086l = this.startapp;
        if ((((C1187l) c10086l.getValue()).yandex & 9223372034707292159L) == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        C10086l c10086l2 = this.metrica;
        if ((9223372034707292159L & ((C1187l) c10086l2.getValue()).yandex) == 9205357640488583168L) {
            return AbstractC3700l.billing(this.loadAd, ((C1187l) c10086l.getValue()).yandex);
        }
        long j = ((C1187l) c10086l.getValue()).yandex;
        long j2 = ((C1187l) c10086l2.getValue()).yandex;
        InterfaceC18212l interfaceC18212lAdcel = adcel();
        return C1187l.subs(j, C1187l.admob(j2, interfaceC18212lAdcel != null ? interfaceC18212lAdcel.amazon(0L) : 9205357640488583168L));
    }
}
