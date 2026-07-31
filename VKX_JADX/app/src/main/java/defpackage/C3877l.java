package defpackage;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: renamed from: lؖؔؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Llؖؔؖ;", "Llَّؓ;", "Llّٗؔ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C3877l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C9426l f8010l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C16873l f8011l;

    @Override // defpackage.AbstractC12338l
    public final /* bridge */ /* synthetic */ void admob(AbstractC14971l abstractC14971l) {
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 234;
    }

    public final Object isPro(AbstractC0283l abstractC0283l) {
        C9426l c9426l = this.f8010l;
        if (c9426l == null) {
            c9426l = new C9426l();
            this.f8010l = c9426l;
            C16873l c16873l = this.f8011l;
            if (c16873l != null && c16873l.f29462l) {
                c16873l.f32929l = AbstractC9498l.mopub(c16873l, 0L, 0L, new C0464l(c16873l, c16873l.f32928l, 12));
            }
        }
        Object objFirebase = c9426l.firebase(abstractC0283l);
        return objFirebase == EnumC9342l.f19165l ? objFirebase : Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C16873l(this);
    }
}
