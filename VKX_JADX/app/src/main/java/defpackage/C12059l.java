package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِۘؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12059l implements InterfaceC17792l {
    public final /* synthetic */ C16441l admob;
    public final C3006l amazon;
    public final /* synthetic */ int billing;
    public final Map crashlytics;
    public final int loadAd;
    public final /* synthetic */ InterfaceC7448l mopub;
    public final C3956l purchase;
    public final int yandex;

    public C12059l(int i, int i2, C3956l c3956l, C3006l c3006l, C16441l c16441l, InterfaceC7448l interfaceC7448l, Map map) {
        this.billing = i;
        this.mopub = interfaceC7448l;
        this.admob = c16441l;
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = map;
        this.amazon = c3006l;
        this.purchase = c3956l;
    }

    @Override // defpackage.InterfaceC17792l
    public final Function1 amazon() {
        return this.amazon;
    }

    @Override // defpackage.InterfaceC17792l
    public final Function2 billing() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC17792l
    public final void crashlytics() {
        InterfaceC7448l interfaceC7448l = this.mopub;
        boolean z = interfaceC7448l instanceof AbstractC11754l;
        C16441l c16441l = this.admob;
        if (z) {
            c16441l.invoke(((AbstractC11754l) interfaceC7448l).f23546l);
            return;
        }
        c16441l.invoke(new C9848l(this.billing, interfaceC7448l.getLayoutDirection(), interfaceC7448l.loadAd(), interfaceC7448l.mo873super()));
    }

    @Override // defpackage.InterfaceC17792l
    public final int loadAd() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC17792l
    public final /* synthetic */ Function1 mopub() {
        return null;
    }

    @Override // defpackage.InterfaceC17792l
    public final int purchase() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC17792l
    public final Map yandex() {
        return this.crashlytics;
    }
}
