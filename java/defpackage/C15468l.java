package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕؖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15468l implements InterfaceC1389l {
    public C6523l admob;
    public C6523l amazon;
    public C6523l billing;
    public C6523l crashlytics;
    public Function1 firebase;
    public Function1 isPro;
    public C6523l loadAd;
    public C6523l mopub;
    public C6523l purchase;
    public C8896l smaato;
    public C6523l subs;
    public boolean yandex;

    @Override // defpackage.InterfaceC1389l
    public final void amazon(boolean z) {
        this.yandex = z;
    }

    @Override // defpackage.InterfaceC1389l
    public final void billing(Function1 function1) {
        this.isPro = function1;
    }

    @Override // defpackage.InterfaceC1389l
    public final void crashlytics(Function1 function1) {
        this.firebase = function1;
    }

    @Override // defpackage.InterfaceC1389l
    public final boolean loadAd() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC1389l
    public final void purchase(C8896l c8896l) {
        this.smaato = c8896l;
    }

    @Override // defpackage.InterfaceC1389l
    public final void yandex(C6523l c6523l) {
        this.loadAd = c6523l;
    }
}
