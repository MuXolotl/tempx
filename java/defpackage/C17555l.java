package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٗۦۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17555l {
    public final EnumC9931l admob;
    public final int amazon;
    public final int billing;
    public final List crashlytics;
    public final long isPro;
    public final C11090l loadAd;
    public final InterfaceC13490l mopub;
    public final boolean purchase;
    public final InterfaceC16061l subs;
    public final C3625l yandex;

    public C17555l(C3625l c3625l, C11090l c11090l, List list, int i, boolean z, int i2, InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l, InterfaceC16061l interfaceC16061l, long j) {
        this.yandex = c3625l;
        this.loadAd = c11090l;
        this.crashlytics = list;
        this.amazon = i;
        this.purchase = z;
        this.billing = i2;
        this.mopub = interfaceC13490l;
        this.admob = enumC9931l;
        this.subs = interfaceC16061l;
        this.isPro = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17555l)) {
            return false;
        }
        C17555l c17555l = (C17555l) obj;
        return AbstractC8576l.yandex(this.yandex, c17555l.yandex) && AbstractC8576l.yandex(this.loadAd, c17555l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c17555l.crashlytics) && this.amazon == c17555l.amazon && this.purchase == c17555l.purchase && this.billing == c17555l.billing && AbstractC8576l.yandex(this.mopub, c17555l.mopub) && this.admob == c17555l.admob && AbstractC8576l.yandex(this.subs, c17555l.subs) && C15519l.loadAd(this.isPro, c17555l.isPro);
    }

    public final int hashCode() {
        int iHashCode = (this.subs.hashCode() + ((this.admob.hashCode() + ((this.mopub.hashCode() + ((((((AbstractC14814l.admob(AbstractC12589l.isVip(this.loadAd, this.yandex.hashCode() * 31, 31), 31, this.crashlytics) + this.amazon) * 31) + (this.purchase ? 1231 : 1237)) * 31) + this.billing) * 31)) * 31)) * 31)) * 31;
        long j = this.isPro;
        return ((int) ((j >>> 32) ^ j)) + iHashCode;
    }

    public final String toString() {
        String str;
        int i = this.billing;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 5) {
            str = "MiddleEllipsis";
        } else if (i == 3) {
            str = "Visible";
        } else {
            str = i == 4 ? "StartEllipsis" : "Invalid";
        }
        return "TextLayoutInput(text=" + ((Object) this.yandex) + ", style=" + this.loadAd + ", placeholders=" + this.crashlytics + ", maxLines=" + this.amazon + ", softWrap=" + this.purchase + ", overflow=" + str + ", density=" + this.mopub + ", layoutDirection=" + this.admob + ", fontFamilyResolver=" + this.subs + ", constraints=" + C15519l.smaato(this.isPro) + ")";
    }
}
