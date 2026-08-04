package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* JADX INFO: renamed from: lَۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10677l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f21665l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C13270l f21666l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public AudioPlaylist f21667l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public File f21668l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f21669l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public InterfaceC11185l f21670l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10677l(C13270l c13270l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f21666l = c13270l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f21665l = obj;
        this.f21669l |= RecyclerView.UNDEFINED_DURATION;
        return this.f21666l.m3626l(null, null, null, this);
    }
}
