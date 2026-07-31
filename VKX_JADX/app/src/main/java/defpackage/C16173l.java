package defpackage;

import android.content.ClipDescription;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖؕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16173l {
    public C2159l Signature;
    public final C10715l ad;
    public final C10086l adcel;
    public InterfaceC2262l admob;
    public final C10086l ads;
    public final C10073l advert;
    public C17812l amazon;
    public Function0 billing;
    public C6523l firebase;
    public InterfaceC1234l isPro;
    public final C8634l isVip;
    public C12814l license;
    public C12814l metrica;
    public InterfaceC7948l mopub;
    public final C10086l pro;
    public final C10086l remoteconfig;
    public boolean signatures;
    public final C10086l smaato;
    public long startapp;
    public InterfaceC13515l subs;
    public int subscription;
    public C0639l tapsense;
    public long vip;
    public final C16399l yandex;
    public InterfaceC4005l loadAd = AbstractC13693l.loadAd;
    public Function1 crashlytics = new C5562l(10);
    public final C10086l purchase = AbstractC8020l.smaato(new C0639l(0, 7, (String) null));

    public C16173l(C16399l c16399l) {
        this.yandex = c16399l;
        Boolean bool = Boolean.TRUE;
        this.smaato = AbstractC8020l.smaato(bool);
        this.remoteconfig = AbstractC8020l.smaato(bool);
        this.vip = 0L;
        this.startapp = 0L;
        this.adcel = AbstractC8020l.smaato(null);
        this.ads = AbstractC8020l.smaato(null);
        this.subscription = -1;
        this.tapsense = new C0639l(0L, 7, (String) null);
        this.pro = AbstractC8020l.smaato(Boolean.FALSE);
        this.ad = new C10715l();
        this.advert = new C10073l(this);
        this.isVip = new C8634l(this);
    }

    public static final long crashlytics(C16173l c16173l, C0639l c0639l, long j, boolean z, boolean z2, C11379l c11379l, boolean z3, C14797l c14797l) {
        C11224l c11224lAmazon;
        char c;
        InterfaceC1234l interfaceC1234l;
        C17812l c17812l = c16173l.amazon;
        if (c17812l == null || (c11224lAmazon = c17812l.amazon()) == null) {
            return C12814l.loadAd;
        }
        InterfaceC4005l interfaceC4005l = c16173l.loadAd;
        long j2 = c0639l.loadAd;
        C3625l c3625l = c0639l.yandex;
        int i = C12814l.crashlytics;
        long jLoadAd = AbstractC2296l.loadAd(interfaceC4005l.admob((int) (j2 >> 32)), c16173l.loadAd.admob((int) (j2 & 4294967295L)));
        boolean z4 = false;
        int iLoadAd = c11224lAmazon.loadAd(j, false);
        int i2 = (z2 || z) ? iLoadAd : (int) (jLoadAd >> 32);
        int i3 = (!z2 || z) ? iLoadAd : (int) (jLoadAd & 4294967295L);
        C2159l c2159l = c16173l.Signature;
        int i4 = -1;
        if (z || c2159l == null) {
            c = ' ';
        } else {
            c = ' ';
            int i5 = c16173l.subscription;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        C2159l c2159lLoadAd = AbstractC15450l.loadAd(c11224lAmazon.yandex, i2, i3, i4, jLoadAd, z, z2);
        if (c2159lLoadAd.remoteconfig(c2159l)) {
            c16173l.Signature = c2159lLoadAd;
            c16173l.subscription = iLoadAd;
            C3242l c3242lYandex = c11379l.yandex(c2159lLoadAd);
            long jLoadAd2 = AbstractC2296l.loadAd(c16173l.loadAd.amazon(c3242lYandex.yandex.loadAd), c16173l.loadAd.amazon(c3242lYandex.loadAd.loadAd));
            if (!C12814l.crashlytics(jLoadAd2, j2)) {
                boolean z5 = C12814l.admob(jLoadAd2) != C12814l.admob(j2) && C12814l.crashlytics(AbstractC2296l.loadAd((int) (4294967295L & jLoadAd2), (int) (jLoadAd2 >> c)), j2);
                boolean z6 = C12814l.amazon(jLoadAd2) && C12814l.amazon(j2);
                if (z3 && c3625l.f7563l.length() > 0 && !z5 && !z6 && c14797l != null && (interfaceC1234l = c16173l.isPro) != null) {
                    ((C9421l) interfaceC1234l).yandex(c14797l.yandex);
                }
                c16173l.crashlytics.invoke(purchase(c3625l, jLoadAd2));
                c16173l.license = new C12814l(jLoadAd2);
                if (!z3) {
                    c16173l.tapsense(!C12814l.amazon(jLoadAd2));
                }
                C17812l c17812l2 = c16173l.amazon;
                if (c17812l2 != null) {
                    c17812l2.adcel.setValue(Boolean.valueOf(z3));
                }
                C17812l c17812l3 = c16173l.amazon;
                if (c17812l3 != null) {
                    c17812l3.remoteconfig.setValue(Boolean.valueOf(!C12814l.amazon(jLoadAd2) && AbstractC9033l.mopub(c16173l, true)));
                }
                C17812l c17812l4 = c16173l.amazon;
                if (c17812l4 != null) {
                    c17812l4.vip.setValue(Boolean.valueOf(!C12814l.amazon(jLoadAd2) && AbstractC9033l.mopub(c16173l, false)));
                }
                C17812l c17812l5 = c16173l.amazon;
                if (c17812l5 != null) {
                    if (C12814l.amazon(jLoadAd2) && AbstractC9033l.mopub(c16173l, true)) {
                        z4 = true;
                    }
                    c17812l5.metrica.setValue(Boolean.valueOf(z4));
                }
                return jLoadAd2;
            }
        }
        return j2;
    }

    public static final void loadAd(C16173l c16173l, C12814l c12814l) {
        C3625l c3625lRemoteconfig;
        String str;
        InterfaceC2262l interfaceC2262l;
        if (c12814l == null) {
            return;
        }
        long j = c12814l.yandex;
        InterfaceC13515l interfaceC13515l = c16173l.subs;
        if (interfaceC13515l == null || (c3625lRemoteconfig = c16173l.remoteconfig()) == null || (str = c3625lRemoteconfig.f7563l) == null) {
            return;
        }
        InterfaceC4005l interfaceC4005l = c16173l.loadAd;
        long jLoadAd = AbstractC2296l.loadAd(interfaceC4005l.admob((int) (j >> 32)), interfaceC4005l.admob((int) (j & 4294967295L)));
        if (str.length() <= 0 || C12814l.amazon(jLoadAd) || (interfaceC2262l = c16173l.admob) == null) {
            return;
        }
        AbstractC10999l.mopub(interfaceC2262l, null, 0, new C7358l(interfaceC13515l, str, jLoadAd, c12814l, c16173l, interfaceC4005l, null), 3);
    }

    public static C0639l purchase(C3625l c3625l, long j) {
        return new C0639l(c3625l, j, (C12814l) null);
    }

    public static final C8195l yandex(C16173l c16173l) {
        String str;
        C12814l c12814l;
        C3625l c3625lRemoteconfig = c16173l.remoteconfig();
        if (c3625lRemoteconfig == null || (str = c3625lRemoteconfig.f7563l) == null || (c12814l = c16173l.license) == null) {
            return null;
        }
        long j = c12814l.yandex;
        return new C8195l(str, new C12814l(AbstractC2296l.loadAd(c16173l.loadAd.admob((int) (j >> 32)), c16173l.loadAd.admob((int) (j & 4294967295L)))));
    }

    public final void adcel(EnumC7170l enumC7170l) {
        C17812l c17812l = this.amazon;
        if (c17812l != null) {
            if (c17812l.yandex() == enumC7170l) {
                c17812l = null;
            }
            if (c17812l != null) {
                c17812l.firebase.setValue(enumC7170l);
            }
        }
    }

    public final void admob(boolean z) {
        C6523l c6523l;
        C17812l c17812l = this.amazon;
        if (c17812l != null && !c17812l.loadAd() && (c6523l = this.firebase) != null) {
            C6523l.loadAd(c6523l);
        }
        this.tapsense = vip();
        tapsense(z);
        adcel(EnumC7170l.f15003l);
    }

    public final void ads() {
        C17812l c17812l;
        AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
        Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
        AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
        try {
            if (firebase() && ((c17812l = this.amazon) == null || ((Boolean) c17812l.adcel.getValue()).booleanValue())) {
                Unit unit = Unit.INSTANCE;
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                this.ad.yandex();
                return;
            }
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
        } catch (Throwable th) {
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
            throw th;
        }
    }

    public final C7504l amazon(boolean z) {
        InterfaceC2262l interfaceC2262l = this.admob;
        InterfaceC14029l interfaceC14029l = null;
        if (interfaceC2262l != null) {
            return AbstractC10999l.mopub(interfaceC2262l, null, 4, new C10291l(this, z, interfaceC14029l, 7), 1);
        }
        return null;
    }

    public final void billing() {
        InterfaceC2262l interfaceC2262l = this.admob;
        if (interfaceC2262l != null) {
            AbstractC10999l.mopub(interfaceC2262l, null, 4, new C17092l(this, null, 1), 1);
        }
    }

    public final boolean firebase() {
        return ((Boolean) this.remoteconfig.getValue()).booleanValue();
    }

    public final boolean isPro() {
        return ((Boolean) this.smaato.getValue()).booleanValue();
    }

    public final void metrica() {
        C7504l c7504l;
        C4451l c4451l = this.ad.yandex;
        if (c4451l == null || (c7504l = c4451l.f9058l) == null) {
            return;
        }
        c7504l.ads(null);
        c4451l.f9058l = null;
    }

    public final void mopub(C1187l c1187l) {
        if (!C12814l.amazon(vip().loadAd)) {
            C17812l c17812l = this.amazon;
            C11224l c11224lAmazon = c17812l != null ? c17812l.amazon() : null;
            int iBilling = (c1187l == null || c11224lAmazon == null) ? C12814l.billing(vip().loadAd) : this.loadAd.amazon(c11224lAmazon.loadAd(c1187l.yandex, true));
            C0639l c0639lYandex = C0639l.yandex(vip(), null, AbstractC2296l.loadAd(iBilling, iBilling), 5);
            this.crashlytics.invoke(c0639lYandex);
            this.license = new C12814l(c0639lYandex.loadAd);
        }
        adcel((c1187l == null || vip().yandex.f7563l.length() <= 0) ? EnumC7170l.f15004l : EnumC7170l.f15002l);
        tapsense(false);
    }

    public final C3625l remoteconfig() {
        C17812l c17812l = this.amazon;
        if (c17812l != null) {
            return c17812l.yandex.yandex;
        }
        return null;
    }

    public final long smaato(boolean z) {
        C11224l c11224lAmazon;
        long j;
        C17812l c17812l = this.amazon;
        if (c17812l == null || (c11224lAmazon = c17812l.amazon()) == null) {
            return 9205357640488583168L;
        }
        C0327l c0327l = c11224lAmazon.yandex;
        C3625l c3625lRemoteconfig = remoteconfig();
        if (c3625lRemoteconfig == null) {
            return 9205357640488583168L;
        }
        if (!AbstractC8576l.yandex(c3625lRemoteconfig.f7563l, c0327l.yandex.yandex.f7563l)) {
            return 9205357640488583168L;
        }
        C0639l c0639lVip = vip();
        if (z) {
            long j2 = c0639lVip.loadAd;
            int i = C12814l.crashlytics;
            j = j2 >> 32;
        } else {
            long j3 = c0639lVip.loadAd;
            int i2 = C12814l.crashlytics;
            j = j3 & 4294967295L;
        }
        return AbstractC8069l.amazon(c0327l, this.loadAd.admob((int) j), z, C12814l.admob(vip().loadAd));
    }

    public final void startapp() {
        InterfaceC2262l interfaceC2262l = this.admob;
        if (interfaceC2262l != null) {
            AbstractC10999l.mopub(interfaceC2262l, null, 4, new C17092l(this, null, 2), 1);
        }
    }

    public final C1187l subs() {
        return (C1187l) this.ads.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object subscription(AbstractC0283l abstractC0283l) {
        C12430l c12430l;
        if (abstractC0283l instanceof C12430l) {
            c12430l = (C12430l) abstractC0283l;
            int i = c12430l.f24541l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12430l.f24541l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12430l = new C12430l(this, abstractC0283l);
            }
        } else {
            c12430l = new C12430l(this, abstractC0283l);
        }
        Object objValueOf = c12430l.f24542l;
        int i2 = c12430l.f24541l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objValueOf);
            InterfaceC7948l interfaceC7948l = this.mopub;
            if (interfaceC7948l != null) {
                c12430l.f24543l = this;
                c12430l.f24541l = 1;
                ClipDescription primaryClipDescription = ((C8231l) interfaceC7948l).yandex.yandex().getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription == null ? false : primaryClipDescription.hasMimeType("text/*"));
                Object obj = EnumC9342l.f19165l;
                if (objValueOf == obj) {
                    return obj;
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = c12430l.f24543l;
        AbstractC2829l.crashlytics(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        this.pro.setValue(bool);
        return Unit.INSTANCE;
    }

    public final void tapsense(boolean z) {
        C17812l c17812l = this.amazon;
        if (c17812l != null) {
            c17812l.smaato.setValue(Boolean.valueOf(z));
        }
        if (z) {
            ads();
        } else {
            metrica();
        }
    }

    public final C0639l vip() {
        return (C0639l) this.purchase.getValue();
    }
}
