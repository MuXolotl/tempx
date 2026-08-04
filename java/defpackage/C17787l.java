package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lٌّ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17787l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ PlaybackService f34648l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ Object f34649l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f34650l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17787l(PlaybackService playbackService, InterfaceC14029l interfaceC14029l) {
        super(interfaceC14029l);
        this.f34648l = playbackService;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f34649l = obj;
        this.f34650l |= RecyclerView.UNDEFINED_DURATION;
        return PlaybackService.adcel(this.f34648l, this);
    }
}
