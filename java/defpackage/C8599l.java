package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: lٌؘۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8599l implements InterfaceC18690l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C14258l f17733l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C18705l f17734l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC18690l f17735l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C2091l f17736l;

    public C8599l(InterfaceC18690l interfaceC18690l, C2091l c2091l, C18262l c18262l) {
        this.f17735l = interfaceC18690l;
        this.f17736l = c2091l;
        this.f17734l = new C18705l(interfaceC18690l.billing());
        this.f17733l = new C14258l(interfaceC18690l.adcel());
    }

    @Override // defpackage.InterfaceC18690l
    public final InterfaceC15879l adcel() {
        return this.f17733l;
    }

    @Override // defpackage.InterfaceC18690l
    public final InterfaceC13235l admob() {
        return AbstractC15078l.yandex;
    }

    @Override // defpackage.InterfaceC8927l
    public final void ads(AbstractC6896l abstractC6896l) {
        AbstractC12225l.crashlytics();
        this.f17736l.ads(abstractC6896l);
    }

    @Override // defpackage.InterfaceC18690l
    public final boolean amazon() {
        return ((AbstractC13868l) loadAd()).metrica() == 0;
    }

    @Override // defpackage.InterfaceC18690l
    public final InterfaceC10408l billing() {
        return this.f17734l;
    }

    @Override // defpackage.InterfaceC8927l
    public final void crashlytics(AbstractC6896l abstractC6896l) {
        AbstractC12225l.crashlytics();
        this.f17736l.crashlytics(abstractC6896l);
    }

    @Override // defpackage.InterfaceC18690l
    public final /* synthetic */ boolean firebase() {
        return false;
    }

    @Override // defpackage.InterfaceC18690l, defpackage.InterfaceC4982l
    public final InterfaceC15879l loadAd() {
        return adcel();
    }

    @Override // defpackage.InterfaceC18690l
    public final boolean metrica() {
        return false;
    }

    @Override // defpackage.InterfaceC8927l
    public final void mopub(AbstractC6896l abstractC6896l) {
        AbstractC12225l.crashlytics();
        this.f17736l.mopub(abstractC6896l);
    }

    @Override // defpackage.InterfaceC8927l
    public final void purchase(AbstractC6896l abstractC6896l) {
        AbstractC12225l.crashlytics();
        this.f17736l.purchase(abstractC6896l);
    }

    @Override // defpackage.InterfaceC18690l
    public final ListenableFuture release() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.InterfaceC18690l
    public final void remoteconfig(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.InterfaceC18690l
    public final void smaato(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.InterfaceC18690l
    public final InterfaceC10367l yandex() {
        return this.f17735l.yandex();
    }

    @Override // defpackage.InterfaceC18690l
    public final /* synthetic */ void vip() {
    }

    @Override // defpackage.InterfaceC18690l
    public final /* synthetic */ void isPro(boolean z) {
    }

    @Override // defpackage.InterfaceC18690l
    public final /* synthetic */ void startapp(boolean z) {
    }

    @Override // defpackage.InterfaceC18690l
    public final /* synthetic */ void subs(InterfaceC13235l interfaceC13235l) {
    }
}
