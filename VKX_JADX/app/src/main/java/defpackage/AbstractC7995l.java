package defpackage;

/* JADX INFO: renamed from: lًٓۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7995l implements InterfaceC13131l {
    public final long admob;
    public final C5978l amazon;
    public final Object billing;
    public final int crashlytics;
    public final C2432l loadAd;
    public final long mopub;
    public final int purchase;
    public final C13384l subs;
    public final long yandex = C13071l.mopub.getAndIncrement();

    public AbstractC7995l(InterfaceC14090l interfaceC14090l, C2432l c2432l, int i, C5978l c5978l, int i2, Object obj, long j, long j2) {
        this.subs = new C13384l(interfaceC14090l);
        this.loadAd = c2432l;
        this.crashlytics = i;
        this.amazon = c5978l;
        this.purchase = i2;
        this.billing = obj;
        this.mopub = j;
        this.admob = j2;
    }
}
