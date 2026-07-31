package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّْۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13815l implements InterfaceC17211l, InterfaceC11730l {
    public final C4384l yandex;

    public C13815l(C4384l c4384l) {
        this.yandex = c4384l;
    }

    @Override // defpackage.InterfaceC11730l
    public final /* synthetic */ void amazon(String str) {
        AbstractC5020l.amazon(this, str);
    }

    @Override // defpackage.InterfaceC17211l
    public final /* synthetic */ void crashlytics(String str, Function1 function1) {
        AbstractC5020l.loadAd(this, str, function1);
    }

    @Override // defpackage.InterfaceC17211l
    public final InterfaceC17211l smaato() {
        return new C13815l(new C4384l());
    }

    @Override // defpackage.InterfaceC17211l
    public final /* synthetic */ void subs(Function1[] function1Arr, Function1 function1) {
        AbstractC5020l.yandex(this, function1Arr, function1);
    }

    @Override // defpackage.InterfaceC17211l
    public final C4384l yandex() {
        return this.yandex;
    }
}
