package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.github.luben.zstd.ZstdDecompressCtx;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lؚٞٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7414l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f15345l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public ByteBuffer f15346l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public ByteBuffer f15347l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f15348l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC8639l f15349l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public InterfaceC9354l f15350l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ C16936l f15351l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public ZstdDecompressCtx f15352l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public InterfaceC7987l f15353l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public /* synthetic */ Object f15354l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7414l(C16936l c16936l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f15351l = c16936l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f15354l = obj;
        this.f15345l |= RecyclerView.UNDEFINED_DURATION;
        return this.f15351l.billing(null, null, null, this);
    }
}
