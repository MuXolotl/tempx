package defpackage;

import androidx.recyclerview.widget.metrica;

/* JADX INFO: renamed from: lًؖۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3989l {
    public int amazon;
    public int billing;
    public int crashlytics;
    public metrica loadAd;
    public int purchase;
    public metrica yandex;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
        sb.append(this.yandex);
        sb.append(", newHolder=");
        sb.append(this.loadAd);
        sb.append(", fromX=");
        sb.append(this.crashlytics);
        sb.append(", fromY=");
        sb.append(this.amazon);
        sb.append(", toX=");
        sb.append(this.purchase);
        sb.append(", toY=");
        return AbstractC0653l.adcel(sb, this.billing, '}');
    }
}
