package defpackage;

/* JADX INFO: renamed from: lْ۟ؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13691l extends AbstractC12128l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final transient int f26732l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC12128l f26733l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final transient int f26734l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13691l(AbstractC12128l abstractC12128l, int i, int i2) {
        super(1);
        this.f26733l = abstractC12128l;
        this.f26734l = i;
        this.f26732l = i2;
    }

    @Override // defpackage.AbstractC3810l
    public final int admob() {
        return this.f26733l.admob() + this.f26734l;
    }

    @Override // defpackage.AbstractC3810l
    public final int firebase() {
        return this.f26733l.admob() + this.f26734l + this.f26732l;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC13693l.remoteconfig(i, this.f26732l);
        return this.f26733l.get(i + this.f26734l);
    }

    @Override // defpackage.AbstractC12128l, java.util.List
    /* JADX INFO: renamed from: metrica */
    public final AbstractC12128l subList(int i, int i2) {
        AbstractC13693l.vip(i, i2, this.f26732l);
        int i3 = this.f26734l;
        return this.f26733l.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.AbstractC3810l
    public final Object[] mopub() {
        return this.f26733l.mopub();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26732l;
    }
}
