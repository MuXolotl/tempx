package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lّٓۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12593l extends AbstractC7498l {
    public boolean admob;
    public List amazon;
    public C11090l billing;
    public CharSequence crashlytics;
    public EnumC9931l firebase;
    public float isPro;
    public boolean mopub;
    public C12814l purchase;
    public long remoteconfig;
    public InterfaceC16061l smaato;
    public float subs;
    public C0327l vip;

    public C12593l() {
        super(AbstractC9620l.isPro().mopub());
        this.subs = Float.NaN;
        this.isPro = Float.NaN;
        this.remoteconfig = AbstractC7563l.loadAd(0, 0, 0, 0, 15);
    }

    @Override // defpackage.AbstractC7498l
    public final AbstractC7498l loadAd() {
        return new C12593l();
    }

    public final String toString() {
        CharSequence charSequence = this.crashlytics;
        return "CacheRecord(visualText=" + ((Object) charSequence) + ", annotations=" + this.amazon + ", composition=" + this.purchase + ", textStyle=" + this.billing + ", singleLine=" + this.mopub + ", softWrap=" + this.admob + ", densityValue=" + this.subs + ", fontScale=" + this.isPro + ", layoutDirection=" + this.firebase + ", fontFamilyResolver=" + this.smaato + ", constraints=" + C15519l.smaato(this.remoteconfig) + ", layoutResult=" + this.vip + ")";
    }

    @Override // defpackage.AbstractC7498l
    public final void yandex(AbstractC7498l abstractC7498l) {
        C12593l c12593l = (C12593l) abstractC7498l;
        this.crashlytics = c12593l.crashlytics;
        this.amazon = c12593l.amazon;
        this.purchase = c12593l.purchase;
        this.billing = c12593l.billing;
        this.mopub = c12593l.mopub;
        this.admob = c12593l.admob;
        this.subs = c12593l.subs;
        this.isPro = c12593l.isPro;
        this.firebase = c12593l.firebase;
        this.smaato = c12593l.smaato;
        this.remoteconfig = c12593l.remoteconfig;
        this.vip = c12593l.vip;
    }
}
