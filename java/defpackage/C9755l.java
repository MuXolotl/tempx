package defpackage;

import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: lٍؚۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9755l implements InterfaceC13521l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final WeakReference f19895l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final WeakReference f19896l;

    public C9755l(C3726l c3726l, C18602l c18602l) {
        this.f19896l = new WeakReference(c3726l);
        this.f19895l = new WeakReference(c18602l);
    }

    @Override // defpackage.InterfaceC13521l
    public final void Signature(int i) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        C18602l c18602l = (C18602l) this.f19895l.get();
        if (c18602l == null) {
            return;
        }
        c3726lYandex.subscription = c3726lYandex.subscription.billing(i, c18602l.mo2807switch());
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            C18338l c18338l = c3726lYandex.admob.isPro;
            c18602l.mo2807switch();
            C13350l c13350l = (C13350l) c18338l.f35849l;
            c13350l.m3637instanceof(c13350l.admob.tapsense);
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC13521l
    public final void adcel(float f) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        c3726lYandex.subscription = c3726lYandex.subscription.startapp(f);
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            c3726lYandex.admob.isPro.getClass();
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC13521l
    public final void ads(int i, C2427l c2427l) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        C1908l c1908l = c3726lYandex.subscription;
        C14723l c14723l = c1908l.yandex;
        C9009l c9009l = c1908l.crashlytics;
        C4262l c4262l = c1908l.amazon;
        C4262l c4262l2 = c1908l.purchase;
        int i2 = c1908l.billing;
        C1372l c1372l = c1908l.mopub;
        int i3 = c1908l.admob;
        boolean z = c1908l.subs;
        AbstractC10759l abstractC10759l = c1908l.isPro;
        int i4 = c1908l.firebase;
        C15074l c15074l = c1908l.smaato;
        C3852l c3852l = c1908l.remoteconfig;
        float f = c1908l.vip;
        float f2 = c1908l.metrica;
        int i5 = c1908l.startapp;
        C13736l c13736l = c1908l.adcel;
        C16684l c16684l = c1908l.ads;
        C2848l c2848l = c1908l.subscription;
        int i6 = c1908l.tapsense;
        boolean z2 = c1908l.Signature;
        boolean z3 = c1908l.license;
        int i7 = c1908l.pro;
        boolean z4 = c1908l.ad;
        boolean z5 = c1908l.advert;
        int i8 = c1908l.isVip;
        int i9 = c1908l.signatures;
        C3852l c3852l2 = c1908l.premium;
        long j = c1908l.applovin;
        long j2 = c1908l.appmetrica;
        long j3 = c1908l.inmobi;
        C1047l c1047l = c1908l.f4366throws;
        C4970l c4970l = c1908l.f4365package;
        AbstractC12442l.subscription(abstractC10759l.startapp() || c9009l.yandex.loadAd < abstractC10759l.metrica());
        c3726lYandex.subscription = new C1908l(c14723l, i, c9009l, c4262l, c4262l2, i2, c1372l, i3, z, c15074l, abstractC10759l, i4, c3852l, f, f2, c13736l, i5, c16684l, c2848l, i6, z2, z3, i7, i8, i9, z4, z5, c3852l2, j, j2, j3, c1047l, c4970l);
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            c3726lYandex.admob.isPro.license(c2427l);
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC13521l
    public final void advert(C16684l c16684l) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        C1908l c1908l = c3726lYandex.subscription;
        C14723l c14723l = c1908l.yandex;
        int i = c1908l.loadAd;
        C9009l c9009l = c1908l.crashlytics;
        C4262l c4262l = c1908l.amazon;
        C4262l c4262l2 = c1908l.purchase;
        int i2 = c1908l.billing;
        C1372l c1372l = c1908l.mopub;
        int i3 = c1908l.admob;
        boolean z = c1908l.subs;
        AbstractC10759l abstractC10759l = c1908l.isPro;
        int i4 = c1908l.firebase;
        C15074l c15074l = c1908l.smaato;
        C3852l c3852l = c1908l.remoteconfig;
        float f = c1908l.vip;
        float f2 = c1908l.metrica;
        int i5 = c1908l.startapp;
        C13736l c13736l = c1908l.adcel;
        C2848l c2848l = c1908l.subscription;
        int i6 = c1908l.tapsense;
        boolean z2 = c1908l.Signature;
        boolean z3 = c1908l.license;
        int i7 = c1908l.pro;
        boolean z4 = c1908l.ad;
        boolean z5 = c1908l.advert;
        int i8 = c1908l.isVip;
        int i9 = c1908l.signatures;
        C3852l c3852l2 = c1908l.premium;
        long j = c1908l.applovin;
        long j2 = c1908l.appmetrica;
        long j3 = c1908l.inmobi;
        C1047l c1047l = c1908l.f4366throws;
        C4970l c4970l = c1908l.f4365package;
        AbstractC12442l.subscription(abstractC10759l.startapp() || c9009l.yandex.loadAd < abstractC10759l.metrica());
        c3726lYandex.subscription = new C1908l(c14723l, i, c9009l, c4262l, c4262l2, i2, c1372l, i3, z, c15074l, abstractC10759l, i4, c3852l, f, f2, c13736l, i5, c16684l, c2848l, i6, z2, z3, i7, i8, i9, z4, z5, c3852l2, j, j2, j3, c1047l, c4970l);
        c3726lYandex.crashlytics.yandex(true, true);
    }

    @Override // defpackage.InterfaceC13521l
    public final void billing(C15074l c15074l) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        C1908l c1908l = c3726lYandex.subscription;
        C14723l c14723l = c1908l.yandex;
        int i = c1908l.loadAd;
        C9009l c9009l = c1908l.crashlytics;
        C4262l c4262l = c1908l.amazon;
        C4262l c4262l2 = c1908l.purchase;
        int i2 = c1908l.billing;
        C1372l c1372l = c1908l.mopub;
        int i3 = c1908l.admob;
        boolean z = c1908l.subs;
        AbstractC10759l abstractC10759l = c1908l.isPro;
        int i4 = c1908l.firebase;
        C3852l c3852l = c1908l.remoteconfig;
        float f = c1908l.vip;
        float f2 = c1908l.metrica;
        int i5 = c1908l.startapp;
        C13736l c13736l = c1908l.adcel;
        C16684l c16684l = c1908l.ads;
        C2848l c2848l = c1908l.subscription;
        int i6 = c1908l.tapsense;
        boolean z2 = c1908l.Signature;
        boolean z3 = c1908l.license;
        int i7 = c1908l.pro;
        boolean z4 = c1908l.ad;
        boolean z5 = c1908l.advert;
        int i8 = c1908l.isVip;
        int i9 = c1908l.signatures;
        C3852l c3852l2 = c1908l.premium;
        long j = c1908l.applovin;
        long j2 = c1908l.appmetrica;
        long j3 = c1908l.inmobi;
        C1047l c1047l = c1908l.f4366throws;
        C4970l c4970l = c1908l.f4365package;
        AbstractC12442l.subscription(abstractC10759l.startapp() || c9009l.yandex.loadAd < abstractC10759l.metrica());
        c3726lYandex.subscription = new C1908l(c14723l, i, c9009l, c4262l, c4262l2, i2, c1372l, i3, z, c15074l, abstractC10759l, i4, c3852l, f, f2, c13736l, i5, c16684l, c2848l, i6, z2, z3, i7, i8, i9, z4, z5, c3852l2, j, j2, j3, c1047l, c4970l);
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            c3726lYandex.admob.isPro.getClass();
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final void mo2731case(C2848l c2848l) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        C1908l c1908l = c3726lYandex.subscription;
        C14723l c14723l = c1908l.yandex;
        int i = c1908l.loadAd;
        C9009l c9009l = c1908l.crashlytics;
        C4262l c4262l = c1908l.amazon;
        C4262l c4262l2 = c1908l.purchase;
        int i2 = c1908l.billing;
        C1372l c1372l = c1908l.mopub;
        int i3 = c1908l.admob;
        boolean z = c1908l.subs;
        AbstractC10759l abstractC10759l = c1908l.isPro;
        int i4 = c1908l.firebase;
        C15074l c15074l = c1908l.smaato;
        C3852l c3852l = c1908l.remoteconfig;
        float f = c1908l.vip;
        float f2 = c1908l.metrica;
        int i5 = c1908l.startapp;
        C13736l c13736l = c1908l.adcel;
        C16684l c16684l = c1908l.ads;
        int i6 = c1908l.tapsense;
        boolean z2 = c1908l.Signature;
        boolean z3 = c1908l.license;
        int i7 = c1908l.pro;
        boolean z4 = c1908l.ad;
        boolean z5 = c1908l.advert;
        int i8 = c1908l.isVip;
        int i9 = c1908l.signatures;
        C3852l c3852l2 = c1908l.premium;
        long j = c1908l.applovin;
        long j2 = c1908l.appmetrica;
        long j3 = c1908l.inmobi;
        C1047l c1047l = c1908l.f4366throws;
        C4970l c4970l = c1908l.f4365package;
        AbstractC12442l.subscription(abstractC10759l.startapp() || c9009l.yandex.loadAd < abstractC10759l.metrica());
        c3726lYandex.subscription = new C1908l(c14723l, i, c9009l, c4262l, c4262l2, i2, c1372l, i3, z, c15074l, abstractC10759l, i4, c3852l, f, f2, c13736l, i5, c16684l, c2848l, i6, z2, z3, i7, i8, i9, z4, z5, c3852l2, j, j2, j3, c1047l, c4970l);
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            c3726lYandex.admob.isPro.Signature();
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final void mo2732catch(C1372l c1372l) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        c3726lYandex.subscription = c3726lYandex.subscription.purchase(c1372l);
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            C13350l c13350l = (C13350l) c3726lYandex.admob.isPro.f35849l;
            c13350l.m3637instanceof(c13350l.admob.tapsense);
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final void mo2733continue(int i, int i2) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        c3726lYandex.admob(new C12153l(i, i2, 3));
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final void mo2734else(C16616l c16616l) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        c3726lYandex.firebase(c16616l);
    }

    @Override // defpackage.InterfaceC13521l
    public final void firebase(C4262l c4262l, C4262l c4262l2, int i) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        c3726lYandex.subscription = c3726lYandex.subscription.admob(c4262l, c4262l2, i);
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            C13350l c13350l = (C13350l) c3726lYandex.admob.isPro.f35849l;
            c13350l.m3637instanceof(c13350l.admob.tapsense);
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC13521l
    public final void inmobi(int i, boolean z) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        c3726lYandex.subscription = c3726lYandex.subscription.crashlytics(i, z);
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            C6649l c6649l = ((C13350l) c3726lYandex.admob.isPro.f35849l).adcel;
            if (c6649l != null) {
                if (z) {
                    i = 0;
                }
                c6649l.f13969l = i;
                c6649l.yandex().setCurrentVolume(i);
            }
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final void mo2737interface(boolean z) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        C1908l c1908l = c3726lYandex.subscription;
        C14723l c14723l = c1908l.yandex;
        int i = c1908l.loadAd;
        C9009l c9009l = c1908l.crashlytics;
        C4262l c4262l = c1908l.amazon;
        C4262l c4262l2 = c1908l.purchase;
        int i2 = c1908l.billing;
        C1372l c1372l = c1908l.mopub;
        int i3 = c1908l.admob;
        boolean z2 = c1908l.subs;
        AbstractC10759l abstractC10759l = c1908l.isPro;
        int i4 = c1908l.firebase;
        C15074l c15074l = c1908l.smaato;
        C3852l c3852l = c1908l.remoteconfig;
        float f = c1908l.vip;
        float f2 = c1908l.metrica;
        int i5 = c1908l.startapp;
        C13736l c13736l = c1908l.adcel;
        C16684l c16684l = c1908l.ads;
        C2848l c2848l = c1908l.subscription;
        int i6 = c1908l.tapsense;
        boolean z3 = c1908l.Signature;
        boolean z4 = c1908l.license;
        int i7 = c1908l.pro;
        boolean z5 = c1908l.advert;
        int i8 = c1908l.isVip;
        int i9 = c1908l.signatures;
        C3852l c3852l2 = c1908l.premium;
        long j = c1908l.applovin;
        long j2 = c1908l.appmetrica;
        long j3 = c1908l.inmobi;
        C1047l c1047l = c1908l.f4366throws;
        C4970l c4970l = c1908l.f4365package;
        AbstractC12442l.subscription(abstractC10759l.startapp() || c9009l.yandex.loadAd < abstractC10759l.metrica());
        c3726lYandex.subscription = new C1908l(c14723l, i, c9009l, c4262l, c4262l2, i2, c1372l, i3, z2, c15074l, abstractC10759l, i4, c3852l, f, f2, c13736l, i5, c16684l, c2848l, i6, z3, z4, i7, i8, i9, z, z5, c3852l2, j, j2, j3, c1047l, c4970l);
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            C13350l c13350l = (C13350l) c3726lYandex.admob.isPro.f35849l;
            c13350l.m3637instanceof(c13350l.admob.tapsense);
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
        c3726lYandex.m1416native();
    }

    @Override // defpackage.InterfaceC13521l
    public final void mopub(int i) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        C1908l c1908l = c3726lYandex.subscription;
        c3726lYandex.subscription = c1908l.amazon(c1908l.pro, i, c1908l.license);
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            C13350l c13350l = (C13350l) c3726lYandex.admob.isPro.f35849l;
            c13350l.m3637instanceof(c13350l.admob.tapsense);
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void mo2738native() {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        C12014l c12014l = c3726lYandex.mopub.billing;
        AbstractC1186l abstractC1186lSignature = c12014l.Signature();
        for (int i = 0; i < abstractC1186lSignature.size(); i++) {
            C6499l c6499l = (C6499l) abstractC1186lSignature.get(i);
            c12014l.advert(c6499l);
            c3726lYandex.mopub(c6499l, new C4875l(26));
        }
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void mo2739package(C3852l c3852l) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        C1908l c1908l = c3726lYandex.subscription;
        C14723l c14723l = c1908l.yandex;
        int i = c1908l.loadAd;
        C9009l c9009l = c1908l.crashlytics;
        C4262l c4262l = c1908l.amazon;
        C4262l c4262l2 = c1908l.purchase;
        int i2 = c1908l.billing;
        C1372l c1372l = c1908l.mopub;
        int i3 = c1908l.admob;
        boolean z = c1908l.subs;
        AbstractC10759l abstractC10759l = c1908l.isPro;
        int i4 = c1908l.firebase;
        C15074l c15074l = c1908l.smaato;
        C3852l c3852l2 = c1908l.remoteconfig;
        float f = c1908l.vip;
        float f2 = c1908l.metrica;
        int i5 = c1908l.startapp;
        C13736l c13736l = c1908l.adcel;
        C16684l c16684l = c1908l.ads;
        C2848l c2848l = c1908l.subscription;
        int i6 = c1908l.tapsense;
        boolean z2 = c1908l.Signature;
        boolean z3 = c1908l.license;
        int i7 = c1908l.pro;
        boolean z4 = c1908l.ad;
        boolean z5 = c1908l.advert;
        int i8 = c1908l.isVip;
        int i9 = c1908l.signatures;
        long j = c1908l.applovin;
        long j2 = c1908l.appmetrica;
        long j3 = c1908l.inmobi;
        C1047l c1047l = c1908l.f4366throws;
        C4970l c4970l = c1908l.f4365package;
        AbstractC12442l.subscription(abstractC10759l.startapp() || c9009l.yandex.loadAd < abstractC10759l.metrica());
        c3726lYandex.subscription = new C1908l(c14723l, i, c9009l, c4262l, c4262l2, i2, c1372l, i3, z, c15074l, abstractC10759l, i4, c3852l2, f, f2, c13736l, i5, c16684l, c2848l, i6, z2, z3, i7, i8, i9, z4, z5, c3852l, j, j2, j3, c1047l, c4970l);
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            c3726lYandex.admob.isPro.premium();
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC13521l
    public final void premium(C1047l c1047l) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        c3726lYandex.subscription = c3726lYandex.subscription.loadAd(c1047l);
        c3726lYandex.crashlytics.yandex(true, false);
        c3726lYandex.admob(new C4875l(25, c1047l));
    }

    @Override // defpackage.InterfaceC13521l
    public final void pro(boolean z) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        c3726lYandex.subscription = c3726lYandex.subscription.firebase(z);
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            c3726lYandex.admob.isPro.isVip(z);
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC13521l
    public final void remoteconfig(C4970l c4970l) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        c3726lYandex.subscription = c3726lYandex.subscription.metrica(c4970l);
        c3726lYandex.crashlytics.yandex(true, true);
        c3726lYandex.admob(new C4875l(24, c4970l));
    }

    @Override // defpackage.InterfaceC13521l
    public final void signatures(C14723l c14723l) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        C1908l c1908l = c3726lYandex.subscription;
        int i = c1908l.loadAd;
        C9009l c9009l = c1908l.crashlytics;
        C4262l c4262l = c1908l.amazon;
        C4262l c4262l2 = c1908l.purchase;
        int i2 = c1908l.billing;
        C1372l c1372l = c1908l.mopub;
        int i3 = c1908l.admob;
        boolean z = c1908l.subs;
        AbstractC10759l abstractC10759l = c1908l.isPro;
        int i4 = c1908l.firebase;
        C15074l c15074l = c1908l.smaato;
        C3852l c3852l = c1908l.remoteconfig;
        float f = c1908l.vip;
        float f2 = c1908l.metrica;
        int i5 = c1908l.startapp;
        C13736l c13736l = c1908l.adcel;
        C16684l c16684l = c1908l.ads;
        C2848l c2848l = c1908l.subscription;
        int i6 = c1908l.tapsense;
        boolean z2 = c1908l.Signature;
        boolean z3 = c1908l.license;
        int i7 = c1908l.pro;
        boolean z4 = c1908l.ad;
        boolean z5 = c1908l.advert;
        int i8 = c1908l.isVip;
        int i9 = c1908l.signatures;
        C3852l c3852l2 = c1908l.premium;
        long j = c1908l.applovin;
        long j2 = c1908l.appmetrica;
        long j3 = c1908l.inmobi;
        C1047l c1047l = c1908l.f4366throws;
        C4970l c4970l = c1908l.f4365package;
        AbstractC12442l.subscription(abstractC10759l.startapp() || c9009l.yandex.loadAd < abstractC10759l.metrica());
        c3726lYandex.subscription = new C1908l(c14723l, i, c9009l, c4262l, c4262l2, i2, c1372l, i3, z, c15074l, abstractC10759l, i4, c3852l, f, f2, c13736l, i5, c16684l, c2848l, i6, z2, z3, i7, i8, i9, z4, z5, c3852l2, j, j2, j3, c1047l, c4970l);
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            C13350l c13350l = (C13350l) c3726lYandex.admob.isPro.f35849l;
            c13350l.m3637instanceof(c13350l.admob.tapsense);
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC13521l
    public final void smaato(C13736l c13736l) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        c3726lYandex.subscription = c3726lYandex.subscription.yandex(c13736l);
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            C13350l c13350l = (C13350l) c3726lYandex.admob.isPro.f35849l;
            if (c13350l.admob.tapsense.inmobi().yandex == 0) {
                ((C1139l) c13350l.vip.f1691l).yandex.setPlaybackToLocal(c13736l.crashlytics());
            }
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC13521l
    public final void startapp(int i, boolean z) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        C1908l c1908l = c3726lYandex.subscription;
        c3726lYandex.subscription = c1908l.amazon(i, c1908l.isVip, z);
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            C13350l c13350l = (C13350l) c3726lYandex.admob.isPro.f35849l;
            c13350l.m3637instanceof(c13350l.admob.tapsense);
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final void mo2741strictfp(long j) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        C1908l c1908l = c3726lYandex.subscription;
        C14723l c14723l = c1908l.yandex;
        int i = c1908l.loadAd;
        C9009l c9009l = c1908l.crashlytics;
        C4262l c4262l = c1908l.amazon;
        C4262l c4262l2 = c1908l.purchase;
        int i2 = c1908l.billing;
        C1372l c1372l = c1908l.mopub;
        int i3 = c1908l.admob;
        boolean z = c1908l.subs;
        AbstractC10759l abstractC10759l = c1908l.isPro;
        int i4 = c1908l.firebase;
        C15074l c15074l = c1908l.smaato;
        C3852l c3852l = c1908l.remoteconfig;
        float f = c1908l.vip;
        float f2 = c1908l.metrica;
        int i5 = c1908l.startapp;
        C13736l c13736l = c1908l.adcel;
        C16684l c16684l = c1908l.ads;
        C2848l c2848l = c1908l.subscription;
        int i6 = c1908l.tapsense;
        boolean z2 = c1908l.Signature;
        boolean z3 = c1908l.license;
        int i7 = c1908l.pro;
        boolean z4 = c1908l.ad;
        boolean z5 = c1908l.advert;
        int i8 = c1908l.isVip;
        int i9 = c1908l.signatures;
        C3852l c3852l2 = c1908l.premium;
        long j2 = c1908l.applovin;
        long j3 = c1908l.inmobi;
        C1047l c1047l = c1908l.f4366throws;
        C4970l c4970l = c1908l.f4365package;
        AbstractC12442l.subscription(abstractC10759l.startapp() || c9009l.yandex.loadAd < abstractC10759l.metrica());
        c3726lYandex.subscription = new C1908l(c14723l, i, c9009l, c4262l, c4262l2, i2, c1372l, i3, z, c15074l, abstractC10759l, i4, c3852l, f, f2, c13736l, i5, c16684l, c2848l, i6, z2, z3, i7, i8, i9, z4, z5, c3852l2, j2, j, j3, c1047l, c4970l);
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            c3726lYandex.admob.isPro.getClass();
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC13521l
    public final void subs(int i) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        c3726lYandex.subscription = c3726lYandex.subscription.subs(i);
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            c3726lYandex.admob.isPro.advert(i);
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final void mo2742switch(long j) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        C1908l c1908l = c3726lYandex.subscription;
        C14723l c14723l = c1908l.yandex;
        int i = c1908l.loadAd;
        C9009l c9009l = c1908l.crashlytics;
        C4262l c4262l = c1908l.amazon;
        C4262l c4262l2 = c1908l.purchase;
        int i2 = c1908l.billing;
        C1372l c1372l = c1908l.mopub;
        int i3 = c1908l.admob;
        boolean z = c1908l.subs;
        AbstractC10759l abstractC10759l = c1908l.isPro;
        int i4 = c1908l.firebase;
        C15074l c15074l = c1908l.smaato;
        C3852l c3852l = c1908l.remoteconfig;
        float f = c1908l.vip;
        float f2 = c1908l.metrica;
        int i5 = c1908l.startapp;
        C13736l c13736l = c1908l.adcel;
        C16684l c16684l = c1908l.ads;
        C2848l c2848l = c1908l.subscription;
        int i6 = c1908l.tapsense;
        boolean z2 = c1908l.Signature;
        boolean z3 = c1908l.license;
        int i7 = c1908l.pro;
        boolean z4 = c1908l.ad;
        boolean z5 = c1908l.advert;
        int i8 = c1908l.isVip;
        int i9 = c1908l.signatures;
        C3852l c3852l2 = c1908l.premium;
        long j2 = c1908l.applovin;
        long j3 = c1908l.appmetrica;
        C1047l c1047l = c1908l.f4366throws;
        C4970l c4970l = c1908l.f4365package;
        AbstractC12442l.subscription(abstractC10759l.startapp() || c9009l.yandex.loadAd < abstractC10759l.metrica());
        c3726lYandex.subscription = new C1908l(c14723l, i, c9009l, c4262l, c4262l2, i2, c1372l, i3, z, c15074l, abstractC10759l, i4, c3852l, f, f2, c13736l, i5, c16684l, c2848l, i6, z2, z3, i7, i8, i9, z4, z5, c3852l2, j2, j3, j, c1047l, c4970l);
        c3726lYandex.crashlytics.yandex(true, true);
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void mo2743synchronized(C3852l c3852l) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        c3726lYandex.subscription = c3726lYandex.subscription.mopub(c3852l);
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            c3726lYandex.admob.isPro.ad(c3852l);
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC13521l
    public final void tapsense(int i) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        C1908l c1908l = c3726lYandex.subscription;
        C14723l c14723l = c1908l.yandex;
        int i2 = c1908l.loadAd;
        C9009l c9009l = c1908l.crashlytics;
        C4262l c4262l = c1908l.amazon;
        C4262l c4262l2 = c1908l.purchase;
        int i3 = c1908l.billing;
        C1372l c1372l = c1908l.mopub;
        int i4 = c1908l.admob;
        boolean z = c1908l.subs;
        AbstractC10759l abstractC10759l = c1908l.isPro;
        int i5 = c1908l.firebase;
        C15074l c15074l = c1908l.smaato;
        C3852l c3852l = c1908l.remoteconfig;
        float f = c1908l.vip;
        float f2 = c1908l.metrica;
        C13736l c13736l = c1908l.adcel;
        C16684l c16684l = c1908l.ads;
        C2848l c2848l = c1908l.subscription;
        int i6 = c1908l.tapsense;
        boolean z2 = c1908l.Signature;
        boolean z3 = c1908l.license;
        int i7 = c1908l.pro;
        boolean z4 = c1908l.ad;
        boolean z5 = c1908l.advert;
        int i8 = c1908l.isVip;
        int i9 = c1908l.signatures;
        C3852l c3852l2 = c1908l.premium;
        long j = c1908l.applovin;
        long j2 = c1908l.appmetrica;
        long j3 = c1908l.inmobi;
        C1047l c1047l = c1908l.f4366throws;
        C4970l c4970l = c1908l.f4365package;
        AbstractC12442l.subscription(abstractC10759l.startapp() || c9009l.yandex.loadAd < abstractC10759l.metrica());
        c3726lYandex.subscription = new C1908l(c14723l, i2, c9009l, c4262l, c4262l2, i3, c1372l, i4, z, c15074l, abstractC10759l, i5, c3852l, f, f2, c13736l, i, c16684l, c2848l, i6, z2, z3, i7, i8, i9, z4, z5, c3852l2, j, j2, j3, c1047l, c4970l);
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            c3726lYandex.admob.isPro.getClass();
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void mo2744throws(long j) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        C1908l c1908l = c3726lYandex.subscription;
        C14723l c14723l = c1908l.yandex;
        int i = c1908l.loadAd;
        C9009l c9009l = c1908l.crashlytics;
        C4262l c4262l = c1908l.amazon;
        C4262l c4262l2 = c1908l.purchase;
        int i2 = c1908l.billing;
        C1372l c1372l = c1908l.mopub;
        int i3 = c1908l.admob;
        boolean z = c1908l.subs;
        AbstractC10759l abstractC10759l = c1908l.isPro;
        int i4 = c1908l.firebase;
        C15074l c15074l = c1908l.smaato;
        C3852l c3852l = c1908l.remoteconfig;
        float f = c1908l.vip;
        float f2 = c1908l.metrica;
        int i5 = c1908l.startapp;
        C13736l c13736l = c1908l.adcel;
        C16684l c16684l = c1908l.ads;
        C2848l c2848l = c1908l.subscription;
        int i6 = c1908l.tapsense;
        boolean z2 = c1908l.Signature;
        boolean z3 = c1908l.license;
        int i7 = c1908l.pro;
        boolean z4 = c1908l.ad;
        boolean z5 = c1908l.advert;
        int i8 = c1908l.isVip;
        int i9 = c1908l.signatures;
        C3852l c3852l2 = c1908l.premium;
        long j2 = c1908l.appmetrica;
        long j3 = c1908l.inmobi;
        C1047l c1047l = c1908l.f4366throws;
        C4970l c4970l = c1908l.f4365package;
        AbstractC12442l.subscription(abstractC10759l.startapp() || c9009l.yandex.loadAd < abstractC10759l.metrica());
        c3726lYandex.subscription = new C1908l(c14723l, i, c9009l, c4262l, c4262l2, i2, c1372l, i3, z, c15074l, abstractC10759l, i4, c3852l, f, f2, c13736l, i5, c16684l, c2848l, i6, z2, z3, i7, i8, i9, z4, z5, c3852l2, j, j2, j3, c1047l, c4970l);
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            c3726lYandex.admob.isPro.getClass();
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC13521l
    public final void vip(boolean z) {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        if (((C18602l) this.f19895l.get()) == null) {
            return;
        }
        C1908l c1908l = c3726lYandex.subscription;
        C14723l c14723l = c1908l.yandex;
        int i = c1908l.loadAd;
        C9009l c9009l = c1908l.crashlytics;
        C4262l c4262l = c1908l.amazon;
        C4262l c4262l2 = c1908l.purchase;
        int i2 = c1908l.billing;
        C1372l c1372l = c1908l.mopub;
        int i3 = c1908l.admob;
        boolean z2 = c1908l.subs;
        AbstractC10759l abstractC10759l = c1908l.isPro;
        int i4 = c1908l.firebase;
        C15074l c15074l = c1908l.smaato;
        C3852l c3852l = c1908l.remoteconfig;
        float f = c1908l.vip;
        float f2 = c1908l.metrica;
        int i5 = c1908l.startapp;
        C13736l c13736l = c1908l.adcel;
        C16684l c16684l = c1908l.ads;
        C2848l c2848l = c1908l.subscription;
        int i6 = c1908l.tapsense;
        boolean z3 = c1908l.Signature;
        boolean z4 = c1908l.license;
        int i7 = c1908l.pro;
        boolean z5 = c1908l.ad;
        int i8 = c1908l.isVip;
        int i9 = c1908l.signatures;
        C3852l c3852l2 = c1908l.premium;
        long j = c1908l.applovin;
        long j2 = c1908l.appmetrica;
        long j3 = c1908l.inmobi;
        C1047l c1047l = c1908l.f4366throws;
        C4970l c4970l = c1908l.f4365package;
        AbstractC12442l.subscription(abstractC10759l.startapp() || c9009l.yandex.loadAd < abstractC10759l.metrica());
        c3726lYandex.subscription = new C1908l(c14723l, i, c9009l, c4262l, c4262l2, i2, c1372l, i3, z2, c15074l, abstractC10759l, i4, c3852l, f, f2, c13736l, i5, c16684l, c2848l, i6, z3, z4, i7, i8, i9, z5, z, c3852l2, j, j2, j3, c1047l, c4970l);
        c3726lYandex.crashlytics.yandex(true, true);
        try {
            c3726lYandex.admob.isPro.getClass();
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
        c3726lYandex.m1416native();
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final void mo2745volatile(AbstractC10759l abstractC10759l, int i) throws Throwable {
        C3726l c3726lYandex = yandex();
        if (c3726lYandex == null) {
            return;
        }
        c3726lYandex.m1415extends();
        C18602l c18602l = (C18602l) this.f19895l.get();
        if (c18602l == null) {
            return;
        }
        c3726lYandex.subscription = c3726lYandex.subscription.vip(abstractC10759l, c18602l.m4570l(), i);
        c3726lYandex.crashlytics.yandex(false, true);
        try {
            c3726lYandex.admob.isPro.signatures(abstractC10759l);
        } catch (RemoteException e) {
            AbstractC6427l.subs("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final C3726l yandex() {
        return (C3726l) this.f19896l.get();
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void admob(boolean z) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void appmetrica(C14723l c14723l) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final /* synthetic */ void mo2735extends(List list) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void isPro(int i) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void metrica(C7417l c7417l) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final /* synthetic */ void mo2740private(boolean z) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void applovin(InterfaceC9814l interfaceC9814l, C3895l c3895l) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final /* synthetic */ void mo2736for(int i, boolean z) {
    }
}
