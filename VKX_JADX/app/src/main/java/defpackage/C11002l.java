package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.downloader.service.DownloaderService;

/* JADX INFO: renamed from: lُّ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11002l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f22158l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public AudioTrack f22159l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public int f22160l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C11002l f22161l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f22162l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final /* synthetic */ DownloaderService f22163l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public int f22164l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f22165l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int f22166l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f22167l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public AbstractC7317l f22168l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f22169l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f22170l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Iterator f22171l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f22172l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public int f22173l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public /* synthetic */ Object f22174l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11002l(DownloaderService downloaderService, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f22163l = downloaderService;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f22174l = obj;
        this.f22160l |= RecyclerView.UNDEFINED_DURATION;
        return this.f22163l.billing(null, this);
    }
}
