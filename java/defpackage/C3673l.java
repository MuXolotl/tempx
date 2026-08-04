package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lؕ۟ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3673l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C3694l f7736l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f7737l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public EnumC9368l f7738l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public AudioTrack f7739l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f7740l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3673l(C3694l c3694l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f7736l = c3694l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f7740l = obj;
        this.f7737l |= RecyclerView.UNDEFINED_DURATION;
        return this.f7736l.loadAd(null, null, this);
    }
}
