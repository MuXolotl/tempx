package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍ٘ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17812l {
    public Function1 Signature;
    public final C10403l ad;
    public final C10086l adcel;
    public InterfaceC18212l admob;
    public final C12026l ads;
    public final C4480l advert;
    public final C18595l amazon;
    public final C10086l billing;
    public final InterfaceC8533l crashlytics;
    public final C10086l firebase;
    public C3625l isPro;
    public long isVip;
    public final C10403l license;
    public final C4224l loadAd;
    public final C10086l metrica;
    public final C10086l mopub;
    public final C10086l premium;
    public final C10403l pro;
    public C12983l purchase;
    public final C10086l remoteconfig;
    public final C10086l signatures;
    public final C10086l smaato;
    public boolean startapp;
    public final C10086l subs;
    public final C10086l subscription;
    public final C10086l tapsense;
    public final C10086l vip;
    public C5065l yandex;

    public C17812l(C5065l c5065l, C4224l c4224l, InterfaceC8533l interfaceC8533l) {
        this.yandex = c5065l;
        this.loadAd = c4224l;
        this.crashlytics = interfaceC8533l;
        C18595l c18595l = new C18595l(19, false);
        C3625l c3625l = AbstractC0255l.yandex;
        long j = C12814l.loadAd;
        C0639l c0639l = new C0639l(c3625l, j, (C12814l) null);
        c18595l.f36317l = c0639l;
        c18595l.f36316l = new C7221l(c3625l, c0639l.loadAd);
        this.amazon = c18595l;
        Boolean bool = Boolean.FALSE;
        this.billing = AbstractC8020l.smaato(bool);
        this.mopub = AbstractC8020l.smaato(new C14467l(0.0f));
        this.subs = AbstractC8020l.smaato(null);
        this.firebase = AbstractC8020l.smaato(EnumC7170l.f15004l);
        this.smaato = AbstractC8020l.smaato(bool);
        this.remoteconfig = AbstractC8020l.smaato(bool);
        this.vip = AbstractC8020l.smaato(bool);
        this.metrica = AbstractC8020l.smaato(bool);
        this.startapp = true;
        this.adcel = AbstractC8020l.smaato(Boolean.TRUE);
        this.ads = new C12026l(interfaceC8533l);
        this.subscription = AbstractC8020l.smaato(bool);
        this.tapsense = AbstractC8020l.smaato(bool);
        this.Signature = new C2613l(28);
        this.license = new C10403l(this, 1);
        this.pro = new C10403l(this, 2);
        this.ad = new C10403l(this, 3);
        this.advert = AbstractC4311l.yandex();
        this.isVip = C9735l.firebase;
        this.signatures = AbstractC8020l.smaato(new C12814l(j));
        this.premium = AbstractC8020l.smaato(new C12814l(j));
    }

    public final C11224l amazon() {
        return (C11224l) this.subs.getValue();
    }

    public final void billing(long j) {
        this.signatures.setValue(new C12814l(j));
    }

    public final InterfaceC18212l crashlytics() {
        InterfaceC18212l interfaceC18212l = this.admob;
        if (interfaceC18212l == null || !interfaceC18212l.mopub()) {
            return null;
        }
        return interfaceC18212l;
    }

    public final boolean loadAd() {
        return ((Boolean) this.billing.getValue()).booleanValue();
    }

    public final void purchase(long j) {
        this.premium.setValue(new C12814l(j));
    }

    public final EnumC7170l yandex() {
        return (EnumC7170l) this.firebase.getValue();
    }
}
