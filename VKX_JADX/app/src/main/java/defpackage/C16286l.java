package defpackage;

/* JADX INFO: renamed from: lٍٖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16286l extends AbstractC3343l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final transient int f31887l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3343l f31888l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final transient int f31889l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16286l(AbstractC3343l abstractC3343l, int i, int i2) {
        super(0);
        this.f31888l = abstractC3343l;
        this.f31889l = i;
        this.f31887l = i2;
    }

    @Override // defpackage.AbstractC3810l
    public final int admob() {
        return this.f31888l.admob() + this.f31889l;
    }

    @Override // defpackage.AbstractC3810l
    public final int billing() {
        return this.f31888l.admob() + this.f31889l + this.f31887l;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC3105l.vip(i, this.f31887l);
        return this.f31888l.get(i + this.f31889l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31887l;
    }

    @Override // defpackage.AbstractC3810l
    public final Object[] smaato() {
        return this.f31888l.smaato();
    }

    @Override // defpackage.AbstractC3343l, java.util.List
    /* JADX INFO: renamed from: vip, reason: merged with bridge method [inline-methods] */
    public final AbstractC3343l subList(int i, int i2) {
        AbstractC3105l.startapp(i, i2, this.f31887l);
        int i3 = this.f31889l;
        return this.f31888l.subList(i + i3, i2 + i3);
    }
}
