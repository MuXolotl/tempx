package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙٟؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0892l implements InterfaceC17792l {
    public final int crashlytics;
    public final int loadAd;
    public final /* synthetic */ InterfaceC17792l yandex;

    public C0892l(InterfaceC17792l interfaceC17792l, C9405l c9405l) {
        this.yandex = interfaceC17792l;
        C9789l c9789l = c9405l.f19246l;
        this.loadAd = c9789l.f20592l;
        this.crashlytics = c9789l.f20591l;
    }

    @Override // defpackage.InterfaceC17792l
    public final Function1 amazon() {
        return this.yandex.amazon();
    }

    @Override // defpackage.InterfaceC17792l
    public final Function2 billing() {
        return this.yandex.billing();
    }

    @Override // defpackage.InterfaceC17792l
    public final void crashlytics() {
        this.yandex.crashlytics();
    }

    @Override // defpackage.InterfaceC17792l
    public final int loadAd() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC17792l
    public final Function1 mopub() {
        return this.yandex.mopub();
    }

    @Override // defpackage.InterfaceC17792l
    public final int purchase() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC17792l
    public final Map yandex() {
        return this.yandex.yandex();
    }
}
