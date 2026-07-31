package defpackage;

/* JADX INFO: renamed from: lْۣۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13761l extends AbstractC13674l implements InterfaceC13922l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f26856l;

    public AbstractC13761l(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f26856l = (i & 2) == 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13761l) {
            AbstractC13761l abstractC13761l = (AbstractC13761l) obj;
            return premium().equals(abstractC13761l.premium()) && this.f26701l.equals(abstractC13761l.f26701l) && this.f26700l.equals(abstractC13761l.f26700l) && AbstractC8576l.yandex(this.f26698l, abstractC13761l.f26698l);
        }
        if (obj instanceof InterfaceC13922l) {
            return obj.equals(subs());
        }
        return false;
    }

    public final int hashCode() {
        return this.f26700l.hashCode() + AbstractC12589l.advert(premium().hashCode() * 31, 31, this.f26701l);
    }

    @Override // defpackage.AbstractC13674l
    /* JADX INFO: renamed from: private, reason: not valid java name and merged with bridge method [inline-methods] */
    public final InterfaceC13922l mo965synchronized() {
        if (!this.f26856l) {
            return (InterfaceC13922l) super.mo965synchronized();
        }
        C10754l.ads("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    @Override // defpackage.AbstractC13674l
    public final InterfaceC6902l subs() {
        return this.f26856l ? this : super.subs();
    }

    public final String toString() {
        InterfaceC6902l interfaceC6902lSubs = subs();
        return interfaceC6902lSubs != this ? interfaceC6902lSubs.toString() : AbstractC0653l.ads(new StringBuilder("property "), this.f26701l, " (Kotlin reflection is not available)");
    }
}
