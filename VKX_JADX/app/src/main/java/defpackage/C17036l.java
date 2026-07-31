package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lَٗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17036l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f33193l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C2836l f33194l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC0582l f33195l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public AudioTrack f33196l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f33197l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f33198l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17036l(C2836l c2836l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f33194l = c2836l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f33193l = obj;
        this.f33197l |= RecyclerView.UNDEFINED_DURATION;
        return this.f33194l.yandex(null, null, this);
    }
}
