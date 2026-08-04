package defpackage;

/* JADX INFO: renamed from: lَِِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10236l {
    public final C10086l admob;
    public final C10086l amazon;
    public final C10086l billing;
    public final C10086l crashlytics;
    public final C10086l firebase;
    public final C10086l isPro;
    public final C10086l loadAd;
    public final C10086l mopub;
    public final C10086l purchase;
    public final C10086l remoteconfig;
    public final C10086l smaato;
    public final C10086l subs;
    public final C10086l yandex;

    public C10236l(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
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
        this.remoteconfig = new C10086l(Boolean.TRUE, c7472l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Colors(primary=");
        AbstractC11043l.smaato(((C9735l) this.yandex.getValue()).yandex, ", primaryVariant=", sb);
        AbstractC11043l.smaato(((C9735l) this.loadAd.getValue()).yandex, ", secondary=", sb);
        AbstractC11043l.smaato(((C9735l) this.crashlytics.getValue()).yandex, ", secondaryVariant=", sb);
        AbstractC11043l.smaato(((C9735l) this.amazon.getValue()).yandex, ", background=", sb);
        AbstractC11043l.smaato(((C9735l) this.purchase.getValue()).yandex, ", surface=", sb);
        AbstractC11043l.smaato(((C9735l) this.billing.getValue()).yandex, ", error=", sb);
        AbstractC11043l.smaato(((C9735l) this.mopub.getValue()).yandex, ", onPrimary=", sb);
        AbstractC11043l.smaato(((C9735l) this.admob.getValue()).yandex, ", onSecondary=", sb);
        AbstractC11043l.smaato(((C9735l) this.subs.getValue()).yandex, ", onBackground=", sb);
        AbstractC11043l.smaato(((C9735l) this.isPro.getValue()).yandex, ", onSurface=", sb);
        AbstractC11043l.smaato(((C9735l) this.firebase.getValue()).yandex, ", onError=", sb);
        sb.append((Object) C9735l.subs(((C9735l) this.smaato.getValue()).yandex));
        sb.append(", isLight=");
        sb.append(yandex());
        sb.append(')');
        return sb.toString();
    }

    public final boolean yandex() {
        return ((Boolean) this.remoteconfig.getValue()).booleanValue();
    }
}
