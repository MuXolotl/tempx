package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lٌٗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8844l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f18176l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C11761l f18177l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C11761l f18178l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C13218l f18179l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f18180l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public AudioTrack f18181l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8844l(C11761l c11761l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f18177l = c11761l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f18176l = obj;
        this.f18180l |= RecyclerView.UNDEFINED_DURATION;
        return this.f18177l.yandex(null, this);
    }
}
