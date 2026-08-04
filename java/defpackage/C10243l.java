package defpackage;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: lَِۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10243l implements InterfaceC14026l, InterfaceC13521l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C9716l f20866l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C13572l f20867l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractServiceC3639l f20868l;

    public C10243l(C9716l c9716l, AbstractServiceC3639l abstractServiceC3639l, C13572l c13572l) {
        this.f20866l = c9716l;
        this.f20868l = abstractServiceC3639l;
        this.f20867l = c13572l;
    }

    @Override // defpackage.InterfaceC14026l
    public final C5113l ad(C16811l c16811l, List list) {
        return AbstractC7151l.purchase(new C5159l(-6));
    }

    @Override // defpackage.InterfaceC14026l
    public final void amazon() {
        this.f20868l.firebase(this.f20867l, false);
    }

    @Override // defpackage.InterfaceC13521l
    public final void applovin(InterfaceC9814l interfaceC9814l, C3895l c3895l) {
        if (c3895l.yandex.yandex(4, 5, 14, 0)) {
            this.f20868l.firebase(this.f20867l, false);
        }
    }

    @Override // defpackage.InterfaceC14026l
    public final void isVip() {
        this.f20868l.firebase(this.f20867l, false);
    }

    @Override // defpackage.InterfaceC14026l
    public final C5113l subscription(C16811l c16811l, C12417l c12417l, Bundle bundle) {
        int i;
        if (c12417l.loadAd.equals("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY")) {
            C4806l c4806l = (C4806l) this.f20866l.f19802l.get(this.f20867l);
            if (c4806l != null) {
                c4806l.loadAd = true;
            }
            i = 0;
        } else {
            i = -6;
        }
        return AbstractC7151l.purchase(new C5159l(i));
    }

    @Override // defpackage.InterfaceC14026l
    public final void yandex() {
        AbstractServiceC3639l abstractServiceC3639l = this.f20868l;
        C13572l c13572l = this.f20867l;
        if (abstractServiceC3639l.admob(c13572l)) {
            abstractServiceC3639l.remoteconfig(c13572l);
        }
        abstractServiceC3639l.firebase(c13572l, false);
    }

    @Override // defpackage.InterfaceC14026l
    public final /* synthetic */ void license() {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: native */
    public final /* synthetic */ void mo2738native() {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void Signature(int i) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void adcel(float f) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void admob(boolean z) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void advert(C16684l c16684l) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void appmetrica(C14723l c14723l) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void billing(C15074l c15074l) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: case */
    public final /* synthetic */ void mo2731case(C2848l c2848l) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: catch */
    public final /* synthetic */ void mo2732catch(C1372l c1372l) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: else */
    public final /* synthetic */ void mo2734else(C16616l c16616l) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: extends */
    public final /* synthetic */ void mo2735extends(List list) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: interface */
    public final /* synthetic */ void mo2737interface(boolean z) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void isPro(int i) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void metrica(C7417l c7417l) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void mopub(int i) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: package */
    public final /* synthetic */ void mo2739package(C3852l c3852l) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void premium(C1047l c1047l) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: private */
    public final /* synthetic */ void mo2740private(boolean z) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void pro(boolean z) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void remoteconfig(C4970l c4970l) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void signatures(C14723l c14723l) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void smaato(C13736l c13736l) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: strictfp */
    public final /* synthetic */ void mo2741strictfp(long j) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void subs(int i) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: switch */
    public final /* synthetic */ void mo2742switch(long j) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: synchronized */
    public final /* synthetic */ void mo2743synchronized(C3852l c3852l) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void tapsense(int i) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: throws */
    public final /* synthetic */ void mo2744throws(long j) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void vip(boolean z) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void ads(int i, C2427l c2427l) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: continue */
    public final /* synthetic */ void mo2733continue(int i, int i2) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: for */
    public final /* synthetic */ void mo2736for(int i, boolean z) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void inmobi(int i, boolean z) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void startapp(int i, boolean z) {
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: volatile */
    public final /* synthetic */ void mo2745volatile(AbstractC10759l abstractC10759l, int i) {
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void firebase(C4262l c4262l, C4262l c4262l2, int i) {
    }
}
