package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;

/* JADX INFO: renamed from: lٌِؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8713l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f17928l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f17929l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f17930l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C13698l f17931l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8713l(C13698l c13698l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f17931l = c13698l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f17929l = obj;
        this.f17928l |= RecyclerView.UNDEFINED_DURATION;
        Serializable serializableApplovin = this.f17931l.applovin(this);
        return serializableApplovin == EnumC9342l.f19165l ? serializableApplovin : new C1171l(serializableApplovin);
    }
}
