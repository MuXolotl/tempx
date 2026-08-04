package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: lُٖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16316l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C6928l f31911l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f31912l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public List f31913l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f31914l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f31915l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16316l(C6928l c6928l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f31911l = c6928l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f31915l = obj;
        this.f31912l |= RecyclerView.UNDEFINED_DURATION;
        Serializable serializableIsPro = this.f31911l.isPro(false, this);
        return serializableIsPro == EnumC9342l.f19165l ? serializableIsPro : new C16302l((C8195l) serializableIsPro);
    }
}
