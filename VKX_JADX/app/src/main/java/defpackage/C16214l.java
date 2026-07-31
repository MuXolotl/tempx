package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: lؘؘٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16214l implements InterfaceC18690l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C14767l f31729l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C16057l f31730l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC18690l f31731l;

    public C16214l(InterfaceC18690l interfaceC18690l, C16057l c16057l) {
        this.f31731l = interfaceC18690l;
        this.f31730l = c16057l;
        InterfaceC13235l interfaceC13235l = c16057l.f31460l;
        InterfaceC10408l interfaceC10408lBilling = interfaceC18690l.billing();
        ((C5138l) interfaceC13235l).m1720public();
        this.f31729l = new C14767l(interfaceC10408lBilling);
    }

    @Override // defpackage.InterfaceC18690l
    public final InterfaceC15879l adcel() {
        return this.f31730l;
    }

    @Override // defpackage.InterfaceC18690l
    public final InterfaceC13235l admob() {
        return this.f31731l.admob();
    }

    @Override // defpackage.InterfaceC8927l
    public final void ads(AbstractC6896l abstractC6896l) {
        this.f31731l.ads(abstractC6896l);
    }

    @Override // defpackage.InterfaceC18690l
    public final boolean amazon() {
        return this.f31731l.amazon();
    }

    @Override // defpackage.InterfaceC18690l
    public final InterfaceC10408l billing() {
        return this.f31729l;
    }

    @Override // defpackage.InterfaceC8927l
    public final void crashlytics(AbstractC6896l abstractC6896l) {
        this.f31731l.crashlytics(abstractC6896l);
    }

    @Override // defpackage.InterfaceC18690l
    public final boolean firebase() {
        return this.f31731l.firebase();
    }

    @Override // defpackage.InterfaceC18690l
    public final void isPro(boolean z) {
        this.f31731l.isPro(z);
    }

    @Override // defpackage.InterfaceC18690l, defpackage.InterfaceC4982l
    public final InterfaceC15879l loadAd() {
        return this.f31730l;
    }

    @Override // defpackage.InterfaceC18690l
    public final boolean metrica() {
        return this.f31731l.metrica();
    }

    @Override // defpackage.InterfaceC8927l
    public final void mopub(AbstractC6896l abstractC6896l) {
        this.f31731l.mopub(abstractC6896l);
    }

    @Override // defpackage.InterfaceC8927l
    public final void purchase(AbstractC6896l abstractC6896l) {
        this.f31731l.purchase(abstractC6896l);
    }

    @Override // defpackage.InterfaceC18690l
    public final ListenableFuture release() {
        return this.f31731l.release();
    }

    @Override // defpackage.InterfaceC18690l
    public final void remoteconfig(ArrayList arrayList) {
        this.f31731l.remoteconfig(arrayList);
    }

    @Override // defpackage.InterfaceC18690l
    public final void smaato(Collection collection) {
        this.f31731l.smaato(collection);
    }

    @Override // defpackage.InterfaceC18690l
    public final void startapp(boolean z) {
        this.f31731l.startapp(z);
    }

    @Override // defpackage.InterfaceC18690l
    public final void subs(InterfaceC13235l interfaceC13235l) {
        this.f31731l.subs(interfaceC13235l);
    }

    @Override // defpackage.InterfaceC18690l
    public final InterfaceC10367l yandex() {
        return this.f31731l.yandex();
    }

    @Override // defpackage.InterfaceC18690l
    public final /* synthetic */ void vip() {
    }
}
