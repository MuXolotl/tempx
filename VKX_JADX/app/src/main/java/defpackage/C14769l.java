package defpackage;

/* JADX INFO: renamed from: lٌٌٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14769l extends AbstractC0933l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final transient int f28852l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0933l f28853l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final transient int f28854l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14769l(AbstractC0933l abstractC0933l, int i, int i2) {
        super(2);
        this.f28853l = abstractC0933l;
        this.f28854l = i;
        this.f28852l = i2;
    }

    @Override // defpackage.AbstractC3810l
    public final int admob() {
        return this.f28853l.admob() + this.f28854l;
    }

    @Override // defpackage.AbstractC3810l
    public final int firebase() {
        return this.f28853l.admob() + this.f28854l + this.f28852l;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC4603l.subs(i, this.f28852l);
        return this.f28853l.get(i + this.f28854l);
    }

    @Override // defpackage.AbstractC3810l
    public final Object[] mopub() {
        return this.f28853l.mopub();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28852l;
    }

    @Override // defpackage.AbstractC0933l, java.util.List
    /* JADX INFO: renamed from: vip, reason: merged with bridge method [inline-methods] */
    public final AbstractC0933l subList(int i, int i2) {
        AbstractC4603l.firebase(i, i2, this.f28852l);
        int i3 = this.f28854l;
        return this.f28853l.subList(i + i3, i2 + i3);
    }
}
