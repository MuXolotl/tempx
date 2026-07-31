package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: renamed from: lؚْؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6958l implements InterfaceC9708l {
    public C12373l loadAd;
    public String yandex = "";
    public int crashlytics = Alert.DURATION_SHOW_INDEFINITELY;
    public InterfaceC12001l amazon = C9885l.yandex;

    @Override // defpackage.InterfaceC9708l
    public final void crashlytics(InterfaceC12001l interfaceC12001l) {
        this.amazon = interfaceC12001l;
    }

    @Override // defpackage.InterfaceC9708l
    public final InterfaceC12001l loadAd() {
        return this.amazon;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmittableText(");
        sb.append(this.yandex);
        sb.append(", style=");
        sb.append(this.loadAd);
        sb.append(", modifier=");
        sb.append(this.amazon);
        sb.append(", maxLines=");
        return AbstractC0653l.adcel(sb, this.crashlytics, ')');
    }

    @Override // defpackage.InterfaceC9708l
    public final InterfaceC9708l yandex() {
        C6958l c6958l = new C6958l();
        c6958l.amazon = this.amazon;
        c6958l.yandex = this.yandex;
        c6958l.loadAd = this.loadAd;
        c6958l.crashlytics = this.crashlytics;
        return c6958l;
    }
}
