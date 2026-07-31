package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: renamed from: lٟؗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5065l {
    public final InterfaceC16061l admob;
    public EnumC9931l firebase;
    public C11644l isPro;
    public final C11090l loadAd;
    public final InterfaceC13490l mopub;
    public final boolean purchase;
    public final C3625l yandex;
    public final int crashlytics = Alert.DURATION_SHOW_INDEFINITELY;
    public final int amazon = 1;
    public final int billing = 1;
    public final List subs = C2580l.f5619l;

    public C5065l(C3625l c3625l, C11090l c11090l, boolean z, InterfaceC13490l interfaceC13490l, InterfaceC16061l interfaceC16061l, int i) {
        this.yandex = c3625l;
        this.loadAd = c11090l;
        this.purchase = z;
        this.mopub = interfaceC13490l;
        this.admob = interfaceC16061l;
    }

    public final void yandex(EnumC9931l enumC9931l) {
        C11644l c11644l = this.isPro;
        if (c11644l == null || enumC9931l != this.firebase || c11644l.mo1545l()) {
            this.firebase = enumC9931l;
            c11644l = new C11644l(this.yandex, AbstractC7709l.crashlytics(this.loadAd, enumC9931l), this.subs, this.mopub, this.admob);
        }
        this.isPro = c11644l;
    }
}
