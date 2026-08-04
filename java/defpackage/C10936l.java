package defpackage;

/* JADX INFO: renamed from: lٍُْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10936l {
    public final C10086l Signature;
    public final C10086l ad;
    public final C10086l adcel;
    public final C10086l admob;
    public final C10086l ads;
    public final C10086l advert;
    public final C10086l amazon;
    public final C10086l applovin;
    public final C10086l billing;
    public final C10086l crashlytics;
    public final C10086l firebase;
    public final C10086l isPro;
    public final C10086l isVip;
    public final C10086l license;
    public final C10086l loadAd;
    public final C10086l metrica;
    public final C10086l mopub;
    public final C10086l premium;
    public final C10086l pro;
    public final C10086l purchase;
    public final C10086l remoteconfig;
    public final C10086l signatures;
    public final C10086l smaato;
    public final C10086l startapp;
    public final C10086l subs;
    public final C10086l subscription;
    public final C10086l tapsense;
    public final C10086l vip;
    public final C10086l yandex;

    public C10936l(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        C9735l c9735l = new C9735l(j);
        C7472l c7472l = C7472l.f15463l;
        this.yandex = new C10086l(c9735l, c7472l);
        this.loadAd = new C10086l(new C9735l(j2), c7472l);
        this.crashlytics = new C10086l(new C9735l(j3), c7472l);
        this.amazon = new C10086l(new C9735l(j4), c7472l);
        this.purchase = new C10086l(new C9735l(j5), c7472l);
        this.billing = new C10086l(new C9735l(j6), c7472l);
        this.mopub = new C10086l(new C9735l(j7), c7472l);
        this.admob = new C10086l(new C9735l(j8), c7472l);
        this.subs = new C10086l(new C9735l(j9), c7472l);
        this.isPro = new C10086l(new C9735l(j10), c7472l);
        this.firebase = new C10086l(new C9735l(j11), c7472l);
        this.smaato = new C10086l(new C9735l(j12), c7472l);
        this.remoteconfig = new C10086l(new C9735l(j13), c7472l);
        this.vip = new C10086l(new C9735l(j14), c7472l);
        this.metrica = new C10086l(new C9735l(j15), c7472l);
        this.startapp = new C10086l(new C9735l(j16), c7472l);
        this.adcel = new C10086l(new C9735l(j17), c7472l);
        this.ads = new C10086l(new C9735l(j18), c7472l);
        this.subscription = new C10086l(new C9735l(j19), c7472l);
        this.tapsense = new C10086l(new C9735l(j20), c7472l);
        this.Signature = new C10086l(new C9735l(j21), c7472l);
        this.license = new C10086l(new C9735l(j22), c7472l);
        this.pro = new C10086l(new C9735l(j23), c7472l);
        this.ad = new C10086l(new C9735l(j24), c7472l);
        this.advert = new C10086l(new C9735l(j25), c7472l);
        this.isVip = new C10086l(new C9735l(j26), c7472l);
        this.signatures = new C10086l(new C9735l(j27), c7472l);
        this.premium = new C10086l(new C9735l(j28), c7472l);
        this.applovin = new C10086l(new C9735l(j29), c7472l);
    }

    public final long admob() {
        return ((C9735l) this.admob.getValue()).yandex;
    }

    public final long amazon() {
        return ((C9735l) this.Signature.getValue()).yandex;
    }

    public final long billing() {
        return ((C9735l) this.subscription.getValue()).yandex;
    }

    public final long crashlytics() {
        return ((C9735l) this.license.getValue()).yandex;
    }

    public final long isPro() {
        return ((C9735l) this.ads.getValue()).yandex;
    }

    public final long loadAd() {
        return ((C9735l) this.premium.getValue()).yandex;
    }

    public final long mopub() {
        return ((C9735l) this.yandex.getValue()).yandex;
    }

    public final long purchase() {
        return ((C9735l) this.adcel.getValue()).yandex;
    }

    public final long subs() {
        return ((C9735l) this.startapp.getValue()).yandex;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorScheme(primary=");
        sb.append((Object) C9735l.subs(mopub()));
        sb.append("onPrimary=");
        AbstractC11043l.smaato(((C9735l) this.loadAd.getValue()).yandex, "primaryContainer=", sb);
        AbstractC11043l.smaato(((C9735l) this.crashlytics.getValue()).yandex, "onPrimaryContainer=", sb);
        AbstractC11043l.smaato(((C9735l) this.amazon.getValue()).yandex, "inversePrimary=", sb);
        AbstractC11043l.smaato(((C9735l) this.purchase.getValue()).yandex, "secondary=", sb);
        AbstractC11043l.smaato(((C9735l) this.billing.getValue()).yandex, "onSecondary=", sb);
        sb.append((Object) C9735l.subs(((C9735l) this.mopub.getValue()).yandex));
        sb.append("secondaryContainer=");
        sb.append((Object) C9735l.subs(admob()));
        sb.append("onSecondaryContainer=");
        AbstractC11043l.smaato(((C9735l) this.subs.getValue()).yandex, "tertiary=", sb);
        AbstractC11043l.smaato(((C9735l) this.isPro.getValue()).yandex, "onTertiary=", sb);
        AbstractC11043l.smaato(((C9735l) this.firebase.getValue()).yandex, "tertiaryContainer=", sb);
        AbstractC11043l.smaato(((C9735l) this.smaato.getValue()).yandex, "onTertiaryContainer=", sb);
        AbstractC11043l.smaato(((C9735l) this.remoteconfig.getValue()).yandex, "background=", sb);
        AbstractC11043l.smaato(((C9735l) this.vip.getValue()).yandex, "onBackground=", sb);
        sb.append((Object) C9735l.subs(((C9735l) this.metrica.getValue()).yandex));
        sb.append("surface=");
        sb.append((Object) C9735l.subs(subs()));
        sb.append("onSurface=");
        sb.append((Object) C9735l.subs(purchase()));
        sb.append("surfaceVariant=");
        sb.append((Object) C9735l.subs(isPro()));
        sb.append("onSurfaceVariant=");
        sb.append((Object) C9735l.subs(billing()));
        sb.append("surfaceTint=");
        sb.append((Object) C9735l.subs(((C9735l) this.tapsense.getValue()).yandex));
        sb.append("inverseSurface=");
        sb.append((Object) C9735l.subs(amazon()));
        sb.append("inverseOnSurface=");
        sb.append((Object) C9735l.subs(crashlytics()));
        sb.append("error=");
        AbstractC11043l.smaato(((C9735l) this.pro.getValue()).yandex, "onError=", sb);
        AbstractC11043l.smaato(((C9735l) this.ad.getValue()).yandex, "errorContainer=", sb);
        AbstractC11043l.smaato(((C9735l) this.advert.getValue()).yandex, "onErrorContainer=", sb);
        sb.append((Object) C9735l.subs(((C9735l) this.isVip.getValue()).yandex));
        sb.append("border=");
        sb.append((Object) C9735l.subs(yandex()));
        sb.append("borderVariant=");
        sb.append((Object) C9735l.subs(loadAd()));
        sb.append("scrim=");
        sb.append((Object) C9735l.subs(((C9735l) this.applovin.getValue()).yandex));
        sb.append(')');
        return sb.toString();
    }

    public final long yandex() {
        return ((C9735l) this.signatures.getValue()).yandex;
    }
}
