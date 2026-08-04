package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;

/* JADX INFO: renamed from: lَؖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10083l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f20559l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f20560l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f20561l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C4645l f20562l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C13698l f20563l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C13772l f20564l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C18031l f20565l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10083l(C13772l c13772l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f20564l = c13772l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f20560l = obj;
        this.f20561l |= RecyclerView.UNDEFINED_DURATION;
        Serializable serializableM3757l = this.f20564l.m3757l(null, null, this);
        return serializableM3757l == EnumC9342l.f19165l ? serializableM3757l : new C1171l(serializableM3757l);
    }
}
