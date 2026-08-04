package defpackage;

/* JADX INFO: renamed from: lٌؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7136l {
    public final C5616l adcel;
    public final C10086l admob;
    public final C10086l ads;
    public InterfaceC17807l amazon;
    public InterfaceC17807l billing;
    public final C7730l crashlytics;
    public final C10086l firebase;
    public final C10086l isPro;
    public final InterfaceC3685l loadAd;
    public C11925l metrica;
    public boolean mopub;
    public InterfaceC17807l purchase;
    public long remoteconfig;
    public long smaato;
    public final C5616l startapp;
    public final C10086l subs;
    public long vip;
    public final InterfaceC2262l yandex;

    public C7136l(InterfaceC2262l interfaceC2262l, InterfaceC3685l interfaceC3685l, C7730l c7730l) {
        this.yandex = interfaceC2262l;
        this.loadAd = interfaceC3685l;
        this.crashlytics = c7730l;
        Boolean bool = Boolean.FALSE;
        this.admob = AbstractC8020l.smaato(bool);
        this.subs = AbstractC8020l.smaato(bool);
        this.isPro = AbstractC8020l.smaato(bool);
        this.firebase = AbstractC8020l.smaato(bool);
        this.smaato = 9223372034707292159L;
        long j = 0;
        this.remoteconfig = 0L;
        this.vip = 9223372034707292159L;
        Object obj = null;
        this.metrica = interfaceC3685l != null ? interfaceC3685l.crashlytics() : null;
        int i = 12;
        this.startapp = new C5616l(new C5177l(j), AbstractC3483l.firebase, obj, i);
        this.adcel = new C5616l(Float.valueOf(1.0f), AbstractC3483l.purchase, obj, i);
        this.ads = AbstractC8020l.smaato(new C5177l(j));
    }

    public final void admob(long j) {
        this.ads.setValue(new C5177l(j));
    }

    public final void amazon() {
        InterfaceC3685l interfaceC3685l;
        boolean zBooleanValue = ((Boolean) this.admob.getValue()).booleanValue();
        int i = 3;
        InterfaceC2262l interfaceC2262l = this.yandex;
        InterfaceC14029l interfaceC14029l = null;
        if (zBooleanValue) {
            mopub(false);
            AbstractC10999l.mopub(interfaceC2262l, null, 0, new C15170l(this, interfaceC14029l, 2), 3);
        }
        if (((Boolean) this.subs.getValue()).booleanValue()) {
            purchase(false);
            AbstractC10999l.mopub(interfaceC2262l, null, 0, new C15170l(this, interfaceC14029l, i), 3);
        }
        if (crashlytics()) {
            billing(false);
            AbstractC10999l.mopub(interfaceC2262l, null, 0, new C15170l(this, interfaceC14029l, 4), 3);
        }
        this.mopub = false;
        admob(0L);
        this.smaato = 9223372034707292159L;
        C11925l c11925l = this.metrica;
        if (c11925l != null && (interfaceC3685l = this.loadAd) != null) {
            interfaceC3685l.yandex(c11925l);
        }
        this.metrica = null;
        this.amazon = null;
        this.billing = null;
        this.purchase = null;
    }

    public final void billing(boolean z) {
        this.isPro.setValue(Boolean.valueOf(z));
    }

    public final boolean crashlytics() {
        return ((Boolean) this.isPro.getValue()).booleanValue();
    }

    public final void loadAd() {
        if (((Boolean) this.admob.getValue()).booleanValue()) {
            AbstractC10999l.mopub(this.yandex, null, 0, new C15170l(this, null, 1), 3);
        }
    }

    public final void mopub(boolean z) {
        this.admob.setValue(Boolean.valueOf(z));
    }

    public final void purchase(boolean z) {
        this.subs.setValue(Boolean.valueOf(z));
    }

    public final void yandex() {
        C11925l c11925l = this.metrica;
        InterfaceC17807l interfaceC17807l = this.amazon;
        boolean zBooleanValue = ((Boolean) this.subs.getValue()).booleanValue();
        int i = 0;
        InterfaceC2262l interfaceC2262l = this.yandex;
        InterfaceC14029l interfaceC14029l = null;
        if (zBooleanValue || interfaceC17807l == null || c11925l == null) {
            if (crashlytics()) {
                if (c11925l != null) {
                    c11925l.billing(1.0f);
                }
                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C15170l(this, interfaceC14029l, i), 3);
                return;
            }
            return;
        }
        purchase(true);
        boolean zCrashlytics = crashlytics();
        boolean z = !zCrashlytics;
        if (!zCrashlytics) {
            c11925l.billing(0.0f);
        }
        AbstractC10999l.mopub(interfaceC2262l, null, 0, new C18523l(z, this, interfaceC17807l, c11925l, (InterfaceC14029l) null), 3);
    }
}
