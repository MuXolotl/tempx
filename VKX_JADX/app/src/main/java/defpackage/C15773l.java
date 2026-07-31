package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍٕٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15773l implements InterfaceC17211l, InterfaceC2933l, InterfaceC2794l, InterfaceC7669l {
    public final C4384l yandex;

    public C15773l(C4384l c4384l) {
        this.yandex = c4384l;
    }

    @Override // defpackage.InterfaceC7669l
    public final void admob(int i) {
        metrica(new C9695l(new C1355l(i)));
    }

    @Override // defpackage.InterfaceC11730l
    public final /* synthetic */ void amazon(String str) {
        AbstractC5020l.amazon(this, str);
    }

    @Override // defpackage.InterfaceC11872l
    public final void billing() {
        remoteconfig(new C9695l(new C0388l()));
    }

    @Override // defpackage.InterfaceC17211l
    public final /* synthetic */ void crashlytics(String str, Function1 function1) {
        AbstractC5020l.loadAd(this, str, function1);
    }

    @Override // defpackage.InterfaceC7669l
    public final void firebase(int i) {
        metrica(new C9695l(new C6214l(i)));
    }

    @Override // defpackage.InterfaceC7669l
    public final void isPro(int i) {
        metrica(new C9695l(new C7479l(i)));
    }

    @Override // defpackage.InterfaceC2794l
    public final void loadAd() {
        vip(new C9695l(new C16658l()));
    }

    public final void metrica(InterfaceC16243l interfaceC16243l) {
        this.yandex.yandex(interfaceC16243l);
    }

    @Override // defpackage.InterfaceC7669l
    public final void mopub() {
        metrica(new C9695l(new C3099l()));
    }

    @Override // defpackage.InterfaceC11872l
    public final /* synthetic */ void purchase() {
        AbstractC5020l.billing(this);
    }

    @Override // defpackage.InterfaceC2933l
    public final void remoteconfig(C9695l c9695l) {
        vip(c9695l);
    }

    @Override // defpackage.InterfaceC17211l
    public final InterfaceC17211l smaato() {
        return new C15773l(new C4384l());
    }

    @Override // defpackage.InterfaceC17211l
    public final /* synthetic */ void subs(Function1[] function1Arr, Function1 function1) {
        AbstractC5020l.yandex(this, function1Arr, function1);
    }

    public final void vip(InterfaceC16243l interfaceC16243l) {
        this.yandex.yandex(interfaceC16243l);
    }

    @Override // defpackage.InterfaceC17211l
    public final C4384l yandex() {
        return this.yandex;
    }
}
