package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.downloader.service.DownloaderService;

/* JADX INFO: renamed from: lؚْؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1687l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f4051l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ DownloaderService f4052l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f4053l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public AudioTrack f4054l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f4055l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public String f4056l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687l(DownloaderService downloaderService, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f4052l = downloaderService;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f4051l = obj;
        this.f4055l |= RecyclerView.UNDEFINED_DURATION;
        int i = DownloaderService.f36647l;
        return this.f4052l.smaato(null, null, this);
    }
}
